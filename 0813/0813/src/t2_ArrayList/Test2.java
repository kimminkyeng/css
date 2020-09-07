package t2_ArrayList;

public class Test2 {
  private String mid;
  private String pwd;
  
  public Test2() {} //기본생성자

  public Test2(String mid, String pwd) {
    this.mid = mid;
    this.pwd = pwd;
  }

  public String getMid() {
    return mid;
  }
  public void setMid(String mid) {
    this.mid = mid;
  }
  public String getPwd() {
    return pwd;
  }
  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    return "Test2 [mid=" + mid + ", pwd=" + pwd + "]";
  }
}
