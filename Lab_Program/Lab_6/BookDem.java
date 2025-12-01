package Lab_Program.Lab_6;

import java.util.ArrayList;
class Book{
	int bookId;
	String bookName;
	String authorName;
	//Parameterized constructor
	Book(int bookId, String bookName,  String authorName){
		this.bookId= bookId;
		this.bookName  = bookName;
		this.authorName = authorName;
	}
	public String toString() {
		  return "[bookId=" + bookId + ", bookName=" + bookName +
	               ", authorName=" + authorName + "]";
		  }
}
public class BookDem {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		
        books.add(new Book(1, "Java", "James Gosling"));
        books.add(new Book(2, "Python", "Guido Van Rossum"));
        books.add(new Book(3, "Data Structures", "Mark J. S"));
        
        System.out.println("Display details of all Books: ");
        
        for(Object i: books) {
        	System.out.println(i);
        }
	}	
}

