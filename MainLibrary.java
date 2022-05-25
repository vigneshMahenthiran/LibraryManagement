package library;
import java.util.*;

public class MainLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome to the library ");
		System.out.println("select the action you want to do  ");
		System.out.println("1.Search book by book name\n"+"2.search book by author name\n"+"3.search book by both book and author name\n"+"4.return book");
		Scanner obj = new Scanner(System.in);
		int userInput = obj.nextInt();
		Library user1 = new Library();
		switch(userInput) {
		
		case 1: 
			System.out.println("enter book name ");
			String bookName= obj.next();
			user1.findByBookName(bookName);
			break;
		case 2: 
			System.out.println("enter author name ");
			String authorName = obj.next();
			user1.findByAuthorName(authorName);
			break;
		case 3:
			System.out.println("enter author name ");
			String authorName1 = obj.next();
			System.out.println("enter book name ");
			String bookName1 = obj.next();
			user1.findByAuthorAndBookName(authorName1, bookName1);
			break;
			
		case 4:
			System.out.println("enter book name to be returned ");
			String returnBookName = obj.next();
			user1.returnBook(returnBookName);
			break;
			
		default:
			System.out.println("enter correct option");
		}

	}

}
