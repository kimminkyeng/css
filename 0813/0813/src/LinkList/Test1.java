package LinkList;

import java.util.LinkedList;

public class Test1 {
  public static void main(String[] args) {
    LinkedList<String> linkList = new LinkedList<String>();
    
    linkList.add("홍길동");
    linkList.add("김말숙");
    linkList.add("이기자");
    
    System.out.println("전체크기 : " + linkList.size()); //결과는 3.
    System.out.println("전체자료 : " + linkList); //결과는 [홍길동, 김말숙, 이기자].
    System.out.println();
    
    linkList.set(2, "소나무"); //이기자를 소나무로 변경.
    System.out.println("전체크기 : " + linkList.size()); //결과는 3.
    System.out.println("전체자료 : " + linkList); //결과는 [홍길동, 김말숙, 소나무].
    System.out.println();
    
    linkList.remove(1);
    System.out.println("전체크기 : " + linkList.size()); //결과는 2.
    System.out.println("전체자료 : " + linkList); //결과는 [홍길동, 소나무].
    System.out.println();
    
    linkList.clear(); //LinkedList 에서는 clear가 전부 지워지는것.
    System.out.println("전체크기 : " + linkList.size()); //결과는 0.
    System.out.println("전체자료 : " + linkList); //결과는 [].
    System.out.println();
  }
}
