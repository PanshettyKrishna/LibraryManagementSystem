package Library;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Book> books =new ArrayList<>();
	private ArrayList<User> users=new ArrayList<>();
	
	public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }
    
//    public void displayBooks() {
//        for (Book book : books) {
//            System.out.println(book);
//        }
//    }
    
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }
    
    public void issueBook(String bookTitle, int userId) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book issued to User ID: " + userId);
                    return;
                } else {
                    System.out.println("Book already issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }
    
    public void returnBook(String bookTitle) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(bookTitle)) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned.");
                    return;
                } else {
                    System.out.println("Book was not issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found.");
    }

}
