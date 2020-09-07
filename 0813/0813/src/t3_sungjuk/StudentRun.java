package t3_sungjuk;

public class StudentRun {
  public static void main(String[] args) {
    Student student1 = new Student(101, "홍길동"); //홍길동 객체
    student1.addSubject("국어", 100);
    student1.addSubject("영어", 90);
    student1.printStudentinfo();
    System.out.println();
    
    Student student2 = new Student(102, "김말숙"); //김말숙 객체
    student2.addSubject("국어", 90);
    student2.addSubject("영어", 70);
    student2.addSubject("수학", 100);
    student2.printStudentinfo();
    System.out.println();
    
  }
}
