package T1_Array;

public class T3_Copy {
  public static void main(String[] args) {
    T2_Book[] vos1 = new T2_Book[3];
    T2_Book[] vos2 = new T2_Book[3];
    
    vos1[0] = new T2_Book("노인과바다","헤밍웨이"); // 객체를 생성해야해서 new를 붙인다.
    vos1[1] = new T2_Book("태백산맥","조정래");
    vos1[2] = new T2_Book("삼국지","이문열");
    
    // vos1의 배열객체 출력
    System.out.println("vos1배열 원본자료");
    for(int i=0; i<vos1.length; i++) {
      vos1[i].printBookInfo();
    }
    System.out.println();
    
    //배열복사(얕은복사) (원본, 원본의첫번째배열, 복사본, 복사본의첫번째배열, 배열갯수(vos[0],vos[1],vos[2]. 총 3개))
    System.arraycopy(vos1, 0, vos2, 0, 3);
    
    //복사를 받은 vos2 배열 객체 출력 (위에 필드에 선언했던 vos1필드의 결과와 같은 결과로 나옴)
    System.out.println("vos2배열 복사자료");
    for(int i=0; i<vos2.length; i++) {
      vos2[i].printBookInfo();
    }
    System.out.println();
    
    //원본인 vos1번의 0번째 값을 변경시켜본다.
    vos1[0].setBookName("해리포터");
    vos1[0].setAuthor("조앤K롤링");
    
    //원본자료 먼저 출력(0번째 값 변경되었는지 확인)
    System.out.println("vos1배열 원본자료");
    for(int i=0; i<vos1.length; i++) {
      vos1[i].printBookInfo();
    }
    System.out.println();
    
    //복사를 받은 vos2배열객체 출력 (원본 주소를 넘겨받다보니, 원본이 변경된것대로 결과가 나옴. 서로 주소를 공유중이라는것.)
    System.out.println("vos2배열 복사자료");
    for(int i=0; i<vos2.length; i++) {
      vos2[i].printBookInfo();
    }
    System.out.println();
    
    //vos2 객체배열의 [1]번방의 내용을 변경시켜보자
    vos2[1].setBookName("소나기");
    vos2[1].setAuthor("황순원");
    
    //수정한 vos2배열객체 출력
    System.out.println("vos2배열 복사자료");
    for(int i=0; i<vos2.length; i++) {
      vos2[i].printBookInfo();
    }
    System.out.println();
    
    //원본자료가 들어있는 vos1배열객체 출력 (vos2[1]번방의 내용이 변경된것 그대로 결과가 출력됨.)
    System.out.println("수정한 vos1배열 원본자료");
    for(int i=0; i<vos1.length; i++) {
      vos1[i].printBookInfo();
    }
    System.out.println();
    
  }
}
