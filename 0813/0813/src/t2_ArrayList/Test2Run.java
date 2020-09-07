package t2_ArrayList;

import java.util.ArrayList;

public class Test2Run {
  public static void main(String[] args) {
    ArrayList<Test2> vos = new ArrayList<Test2>();
    
    Test2 t1 = new Test2();
    t1.setMid("kms2222");
    t1.setPwd("2222");
    vos.add(t1);
    
    Test2 t2 = new Test2("hkd1234","1234");
    vos.add(t2);
    t2 = new Test2("lkj3333","3434");
    vos.add(t2);
    
    for(Test2 vo : vos) {
      System.out.println("vo = " + vo);
    }
    System.out.println("vos=" + vos);
  }
}
