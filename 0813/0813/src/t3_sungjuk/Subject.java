package t3_sungjuk;

//시험점수관리 클래스
public class Subject {
  private String name; //과목명
  private int score;   //해당과목점수
  
  public Subject () {} //원래 자바에서는 기본생성자가 자동으로 생성되기 때문에 안씀. (우리는 연습하기 위해서...)

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getScore() {
    return score;
  }

  public void setScore(int score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Subject [name=" + name + ", score=" + score + ", getName()=" + getName() + ", getScore()=" + getScore()
        + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
  }
  
}
