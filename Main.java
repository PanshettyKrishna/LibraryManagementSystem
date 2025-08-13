package Library;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Library library=new Library();
		
		// Adding some default books and users
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Wings of Fire", "A.P.J. Abdul Kalam"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));
        library.registerUser(new User(101, "Alice"));
        library.registerUser(new User(102, "Bob"));
        
        int choice;
        
        while(true)
        {
        	System.out.println("--- Library Management System ---");
        	System.out.println("1.Display Books   \n2.Issue Book   \n3.Return Book   \n4.Add Book (Optional Feature)   \n5.Exit");
        	System.out.println("Enter your choice:");
        	choice=scanner.nextInt();
        	scanner.nextLine();
        	
        	switch(choice) 
        	{
        	    case 1:
        	    	library.displayBooks();
        	    	break;
        	    case 2:
        	    	System.out.print("Enter Book Title to Issue: ");
                    String issueTitle = scanner.nextLine();
                    System.out.print("Enter Your User ID: ");
                    int userId = scanner.nextInt();
                    library.issueBook(issueTitle, userId);
                    break;
        	    case 3:
        	    	 System.out.print("Enter Book Title to Return: ");
                     String returnTitle = scanner.nextLine();
                     library.returnBook(returnTitle);
                     break;
        	    case 4:
        	    	 // Optional feature for testing
                    System.out.print("Enter Book Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String newAuthor = scanner.nextLine();
                    library.addBook(new Book(newTitle, newAuthor));
                    System.out.println("Book added successfully.");
                    break;
        	    case 5:
        	    	System.out.println("End of the Program...Thank You!");
				    System.exit(0);
			    default:
				     System.out.println("Invalid choice!Enter the Valid choice"); 	    	      	             	
        	}
        }

	}

}
