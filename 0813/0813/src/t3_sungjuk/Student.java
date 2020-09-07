package t3_sungjuk;

import java.util.ArrayList;

public class Student {
  private int studentId; //학번
  private String studentName; //학생 성명
  private ArrayList<Subject> subjectList;
  
  //객체 생성시 학번/이름을 지정해주고, 점수 배열을 생성만 한것.
  public Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
    
    // 학생 한명이 생성되었다면, 해당 학생의 점수 배열도 함께 생성시켜줘야 된다.
    // 시험과목은 학생당 과목이 일정하지 않기에 ArrayList 객체로 생성한다. 
    subjectList = new ArrayList<Subject>();
  }
  //점수를 동적으로 저장시키는 메소드
  public void addSubject(String name, int score) {
    Subject subject = new Subject();
    subject.setName(name);    //과목명
    subject.setScore(score); //점수
    
    subjectList.add(subject);
  }
  
  //저장된 자료를 출력해보자.
  public void printStudentinfo() {
    int total = 0;
    for(Subject putsubject : subjectList) {
      total += putsubject.getScore();
      System.out.println("학생 : " + studentName + "님의" + putsubject.getName() + " 과목의 점수는" + putsubject.getScore() + " 입니다.");
    }
    System.out.println("학생 : " + studentName + "님의 총점은 " + total + "입니다.");
  }
}
