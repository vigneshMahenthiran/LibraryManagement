package library;

public class Library {
	static int[] bookAvailable = {2,2,2,2,2};
	static String[] bookName= {"maths", "science", "socialscience" ,"tamil", "english"};
	static String[] authorName = {"tom" , "jerry", "jack", "sparrow", "vaali"};
	
	public void findByBookName(String givenBookName) {
		givenBookName = givenBookName.toLowerCase();
		for(int count = 0; count<5; count++) {
			if(givenBookName.equals(bookName[count])) {
				if(bookAvailable[count]>0) {
					System.out.println("entered book is available ");
					System.out.println(bookName[count]+" is issued to you");
					bookAvailable[count]--;
					break;
				}
				else {
					System.out.println("the book "+givenBookName+" is not available , come back after some days");
				}
			}
			else if(count == 4){
				System.out.println("the book "+givenBookName+" is not present in the library");
				System.out.println("sorry! we will add the book soon.");
			}
		}
	}
	public void findByAuthorName(String givenAuthorName) {
		
		givenAuthorName= givenAuthorName.toLowerCase();
		for(int count =0; count<5; count++) {
			if(givenAuthorName.equals(authorName[count])) {
				if(bookAvailable[count]> 0) {
					System.out.println("the book with given author name is available");
					System.out.println("the book by "+givenAuthorName+"  "+bookName[count]+" is issued to you");
					bookAvailable[count]--;
					break;
				}
				else {
					System.out.println("book by author "+givenAuthorName+" is not available , come back after some days");
				}
			}
			else if(count == 4) {
				System.out.println("book by "+givenAuthorName+" is not present in the library ");
				System.out.println("sorry! we will add the book soon.");
			}
		}
	}
	
	public void findByAuthorAndBookName(String givenAuthorName , String givenBookName) {
		givenAuthorName = givenAuthorName.toLowerCase();
		givenBookName = givenBookName.toLowerCase();
		for(int count=0; count <5; count++) {
			if(givenAuthorName.equals(authorName[count]) && givenBookName.equals(bookName[count])) {
				if(bookAvailable[count]>0) {
					System.out.println("the book by author "+givenAuthorName+" and book name "+givenBookName+" is available");
					System.out.println("the book "+givenBookName+" is issued to you");
					bookAvailable[count]--;
					break;
				}
				else {
					System.out.println("book by author "+givenAuthorName+" and book name "+givenBookName+" is not available , come back after some days");
				}
			}
			else if(count==4) {
				System.out.println("book by "+givenAuthorName+" and book name "+givenBookName+" is not present in the library");
				System.out.println("sorry! we will add the book soon ");
			}
		}
	}
	public void returnBook(String givenBookName) {
		givenBookName = givenBookName.toLowerCase();
		for(int count = 0; count <5; count++) {
			if(givenBookName.equals(bookName[count])) {
				bookAvailable[count]++;
				System.out.println("book "+givenBookName+" is returned to the library");
				break;
			}
			else if(count ==4) {
				System.out.println("enter correct book name");
			}

		}
	}
}
