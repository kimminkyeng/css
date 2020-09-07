package T1_Array;

//깊은복사
public class T4_Copy2 {
  public static void main(String[] args) {
    T2_Book[] vos1 = new T2_Book[3]; // 원본 객체배열
    T2_Book[] vos2 = new T2_Book[3]; // 복사받을(타겟) 객체배열
    
    vos1[0] = new T2_Book("노인과바다","헤밍웨이"); // 객체를 생성해야해서 new를 붙인다.
    vos1[1] = new T2_Book("태백산맥","조정래");
    vos1[2] = new T2_Book("삼국지","이문열");
    
    //원본 vos1을 출력해본다.
    for(int i=0;i<vos1.length;i++) {
      System.out.println("vos1="+vos1[i]);
    }
    System.out.println();
    
    //복사받을 vos2에서도 새로운 인스턴스(새객체)를 생성해야 한다.
    vos2[0] = new T2_Book();
    vos2[1] = new T2_Book();
    vos2[2] = new T2_Book();
    
    // vos1객체의 내용을 vos2객체에 저장시켜준다.(깊은복사)
    for(int i=0;i<vos1.length;i++) {
      vos2[i].setBookName(vos1[i].getBookName());
      vos2[i].setAuthor(vos1[i].getAuthor());
    }
    
    //복사받은 vos2를 출력해본다.
    for(int i=0;i<vos2.length;i++) {
      System.out.println("vos2="+vos2[i]);
      //vos2[i].toString();
      //vos2[i].printBookInfo();
    }
    System.out.println();
    //vos1의 1번째 방의 내용을 변경시켜본다.
    vos1[1].setBookName("소나기");
    vos1[1].setAuthor("황순원");
    
    //값을 변경시킨 vos1을 출력해본다.
    for(int i=0;i<vos1.length;i++) {
      System.out.println("vos1=" + vos1[i]);
      //vos2[i].printBookInfo();
    }
    System.out.println();
    
    //복사받은 vos2를 찍어본다(vos1[1]은 수정이 되었으나, vos2[1]은 수정이 되어 있지 않다.)
    for(int i=0;i<vos2.length;i++) {
      System.out.println("vos2=" + vos2[i]);
      //vos2[i].printBookInfo();
    }
    System.out.println();
  }
}
