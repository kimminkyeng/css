package t2_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
  public static void main(String[] args) {
    //ArrayList<String> arrayList1 = new ArrayList<String>();
    //ArrayList<String> arrayList2 = new ArrayList<>(); //type 생략가능
    //List<String> arrayList3 = new ArrayList<String>(); //앞에 List 는 java.util.List;.
    //List<String> arrayList4 = new ArrayList<>();
    
    List<String> vos = new ArrayList<String>(); // 앞에 List<String>는 ArrayList<String> 로 작성해도 됨.
    
    vos.add("Java"); //add는... 표로 구성해서 따져보면, 제일 밑에부분이 추가되는것.
    vos.add("JSP");
    vos.add("HTML5");
    vos.add("CSS3");
    vos.add("Javascript");
    System.out.println("2번지 값은? " + vos.get(2)); //결과는 HTML5.
    System.out.println("전체자료는? " + vos.toString()); //결과는 [Java, JSP, HTML5, CSS3, Javascript]. (전체 자료가 나옴).
    System.out.println("vos 객체의 크기는? " + vos.size()); //결과는 5.
    System.out.println();
    
    // 3번지내용을 jQuery로 변경시켜보자.
    vos.set(3, "jQuery");
    System.out.println("전체자료는? " + vos.toString()); //결과는 [Java, JSP, HTML5, jQuery, Javascript]. (전체 자료가 나옴).
    System.out.println("vos 객체의 크기는? " + vos.size()); //결과는 5.
    System.out.println();
    
    // 3번지 자료를 삭제해보자.
    vos.remove(3);
    System.out.println("전체자료는? " + vos.toString()); //결과는 [Java, JSP, HTML5, Javascript].
    System.out.println("vos 객체의 크기는? " + vos.size()); //결과는 4.
    System.out.println();
    
    // 새로운 자료 추가해보자.
    vos.add("aJax");
    System.out.println("전체자료는? " + vos.toString()); //결과는 [Java, JSP, HTML5, Javascript, aJax].
    System.out.println("vos 객체의 크기는? " + vos.size()); //결과는 5.
    System.out.println();
    
    // 변수를 이용하여 출력해보자.
    String temp = vos.get(2); //vos 2번지를 읽어들임.
    System.out.println("vos의 2번지 값은? " + temp); //결과는 HTML5.
    System.out.println();
    
    for(int i=0; i<vos.size(); i++) {
      // System.out.println("vos= " + vos[i]); 이렇게 출력하면 안된다.
      System.out.println("vos= " + vos.get(i));
    }
    
    // vos 객체 배열의 2번지에 'css3' 문자열을 추가해보자.
    vos.add(2,"CSS3");
    
    // 향상된 for문을 이용해서 출력해보자.
    // int i=0;
    for(String vo : vos) {
      System.out.println("vos = " + vos); //toString 생략가능
      // System.out.println("vos = " + vos[i]); 이렇게 출력하면 안된다.
    }
    System.out.println();
    
    //vos객체의 모든 내용을 삭제해보자.clear는 아직 주소가 살아있음.
    vos.clear();
    System.out.println("vos의 크기는? " + vos.size()); //결과는 0.
    System.out.println("vos= " + vos); //toString 생략가능. 결과는 vos= [].
    
    // vos객체 배열과의 인연을 단절해보자.
    vos = null;
    System.out.println("vos = " + vos); //결과는 vos = null.
   // System.out.println("vos의 크기는? " + vos.size()); 결과는 에러남.(Exception in thread "main" java.lang.NullPointerException at t2_ArrayList.Test1.main(Test1.java:72)
  }
}
