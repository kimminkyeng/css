package t4_Vector;

import java.util.Vector;

public class Test1 {
  public static void main(String[] args) {
    Vector<String> vector = new Vector<String>(3); // 기본크기(용량)가 3으로 지정
    
    System.out.println("vector의 크기 : " + vector.size()); //결과는 0.
    System.out.println("vector의 용량 : " + vector.capacity()); //결과는 3.
    
    vector.addElement("홍길동");
    vector.addElement("김말숙");
    vector.addElement("이기자");
    vector.addElement("소나무");
    
    System.out.println("저장후 vector의 크기 : " + vector.size());
    System.out.println("저장후 vector의 용량 : " + vector.capacity()); //기본크기(용량)가 3이고, 홍길동 김말숙 이기자 소나무 4개 이기때문에 1개 더 추가되어, 용량이 6이다.(기본크기 3 + 추가 1칸이라 3 = 6)
    System.out.println();
    
    for(int i=0; i<vector.size(); i++) {
      System.out.println("vector의 "+i+"번째= " + vector.elementAt(i));
    }
    System.out.println();
    
    vector.remove(2); //이기자 삭제.
    for(int i=0; i<vector.size(); i++) {
      System.out.println("vector의 "+i+"번째= " + vector.elementAt(i)); //결과는 이기자 가 삭제되어 3개(홍길동, 김말숙, 소나무) 나옴.
    }
    System.out.println();
    
    System.out.println("저장후 vector의 크기 : " + vector.size());
    //System.out.println("저장후 vector의 용량 : " + vector.capacity());
    System.out.println();
    
    vector.removeAll(vector);
    for(int i=0; i<vector.size(); i++) {
      System.out.println("vector의 "+i+"번째= " + vector.elementAt(i)); //결과는 이기자 가 삭제되어 3개(홍길동, 김말숙, 소나무) 나옴.
    }
    System.out.println();
    System.out.println("저장후 vector의 크기 : " + vector.size());
    //System.out.println("저장후 vector의 용량 : " + vector.capacity()); //기본크기(용량)가 3이고, 홍길동 김말숙 이기자 소나무 4개 이기때문에 1개 더 추가되어, 용량이 6이다.(기본크기 3 + 추가 1칸이라 3 = 6)
    System.out.println();
  }
}
