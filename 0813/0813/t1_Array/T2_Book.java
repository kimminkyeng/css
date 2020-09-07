package t1_Array;

// 책의 정보를 기록하는 객체(책이름, 저자) 
public class T2_Book {
  private String bookName;
  private String author;
  
  public T2_Book(String bookName, String author) {
    this.bookName = bookName;
    this.author = author;
  }

  public String getBookName() {
    return bookName;
  }

  public void setBookName(String bookName) {
    this.bookName = bookName;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void printBookInfo() {
    System.out.println("책명 : " + bookName + " , 저자 : " + author);
  }
  
//  @Override
//  public String toString() {
//    return "T2_Book [bookName=" + bookName + ", author=" + author + "]";
//  }
}
