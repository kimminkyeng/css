package T1_Array;

public class Test1 {
  public static void main(String[] args) {
    int[] atom = new int[10];
    
    // atom배열의 초기값?
    for(int i=1; i<atom.length; i++) {
      System.out.println(i+ ".초기값 :" + atom[i]);
    }
    System.out.println();
    
    atom[0] = 10;
    for(int i=1; i<atom.length; i++) {
      atom[i] = i * 10 + 10;
    }
    
    int cnt=0;
    for(int aa : atom) {
      System.out.println(cnt + " : atom["+cnt+"]=" + aa);
      cnt++;
    }
  }
}
