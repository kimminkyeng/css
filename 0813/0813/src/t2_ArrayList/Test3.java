package t2_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test3 {
  public static void main(String[] args) {
    //고정객체의 처리. Arrays.asList()메소드
    List<String> list1 = Arrays.asList("홍길동","김말숙","이기자");
    
    for(String name : list1) {
      System.out.println("성명 : " + name);
    }
    List<Integer> list2 = Arrays.asList(10,20,30,40,50); //앞에 List<Integer>는 List<Int>로 적으면 절대 안됨. 객체화 하는거라서.
    for(int value : list2) {
      System.out.println("값 : " + value);
    }
  }
}
