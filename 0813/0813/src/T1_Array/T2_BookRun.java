package T1_Array;
//게시판 만들기.
public class T2_BookRun {
  public static void main(String[] args) {
    // 책의 정보를 저장하기 위한 객체 생성
    T2_Book[] vos = new T2_Book[5]; //vo에 s를 붙이는이유는 여러개 객체로 표현.
    
    // 객체배열의 초기값은?
    for(int i=0; i<vos.length; i++) {
      System.out.println(i + " = " + vos[i]);
    }
    
    // 각각의 객체 개별방에 자료 입력(도서명/저자)
    vos[0] = new T2_Book("노인과바다","헤밍웨이"); // 객체를 생성해야해서 new를 붙인다.
    vos[1] = new T2_Book("태백산맥","조정래");
    vos[2] = new T2_Book("삼국지","이문열");
    vos[3] = new T2_Book("토지","박경리");
    vos[4] = new T2_Book("동의보감","허준");
    
    //toString(override) 결과 찍은것.
    for(int i=0; i<vos.length; i++) {
      // System.out.println(vos[i]); 힙영역의 주소로 나온다.(오버라이드 주석 해제 전)
      System.out.println(vos[i]);
    }
    
    for(int i=0; i<vos.length; i++) {
      vos[i].printBookInfo(); //T2_Book 클래스의 29~30번줄에 System.out.println("책명 : " + bookName + " , 저자 : " + author); 으로 이미 작성하여, 결과가 바로 나옴.
    }
    
  }
}
