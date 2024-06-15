package SaleInfoSystem;

import java.util.Scanner;
import java.util.InputMismatchException;


public class SaleView implements ViewInterface {
	
	Scanner sc = new Scanner(System.in); 
	
	public void view() {
		AdminProductOp adminProductOp = new AdminProductOp();
		adminProductOp.currentProduct();
		System.out.println("-------------------------------");
		System.out.println("	Main Menu	");
		System.out.println("-------------------------------");
		System.out.println("1: Admin View");
		System.out.println("2: Customer View");
		System.out.println("3: Exit");
		System.out.println("-------------------------------");

        try {
            System.out.print("Choose Option: ");
            int number = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (number == 1) {
                adminView();
            } else if (number == 2) {
                customerView();
            } else if (number == 3) {
                exitInterface();
            } else {
                System.out.println("Invalid option. Please choose a valid option.");
            }
            view(); // Restart the method after handling input
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.next(); // Consume the invalid input to prevent an infinite loop
            view(); // Restart the method after catching the exception
        }
    }
	
	@Override
	public void adminView() {
		
		final int MAX_ATTEMPTS = 3;
	    int attempts = 0;
	    boolean success = false;

	    while (attempts < MAX_ATTEMPTS) {
	         // Consume newline left from previous input
	        System.out.print("Enter your password: ");
	        String password = sc.nextLine();

	        if (password.equals("admin123")) {
	            // Admin Operation
	        	AdminMenu admin = new AdminMenu();
	            admin.adminMainMenu();
	            success = true;
	            break; // Exit the loop if the password is correct
	        } else {
	            attempts++;
	            int remainingAttempts = MAX_ATTEMPTS - attempts;
	            System.out.println("Incorrect password. Remaining attempts: " + remainingAttempts);
	        }
	    }

	    if (!success) {
	        System.out.println("Maximum number of attempts reached. Exiting this view...\n");
	        view();
	    }
		
	}
	
	
	@Override
	public void customerView() {
	    CustomerOp cust = new CustomerOp();
	    System.out.println("-------------------------------");
	    System.out.println("    Customer Panel        ");
	    System.out.println("-------------------------------");
	    System.out.println("1: Search Product Name");
	    System.out.println("2: Confirm Order");
	    System.out.println("3: Display Product");
	    System.out.println("4: BackToMain");
	    System.out.println("5: Exit");
	    System.out.println("-------------------------------");

	    try {
	        System.out.print("Choose Option: ");
	        int choice = sc.nextInt();
	        sc.nextLine(); // Consume newline

	        switch (choice) {
	            case 1:
	                cust.searchProduct();
	                break;
	            case 2:
	                cust.confirmOrder();
	                break;
	            case 3:
	                cust.displayAllProudcts();
	                break;
	            case 4:
	                cust.backToMain();
	                break;
	            case 5:
	                cust.exitInterface();
	                break;
	            default:
	                System.out.println("Invalid option. Please choose a valid option.");
	        }
	    } catch (InputMismatchException e) {
	        System.out.println("Invalid input. Please enter a valid number.");
	        sc.next(); // Consume the invalid input to prevent an infinite loop
	    }
	    customerView(); // Restart the method
	}


	@Override
	public void exitInterface() {
		
			System.out.println("Exiting the program...");
			System.exit(0);
		
		
	}

}


class AdminMenu implements AdminMainInterface{
	
	Scanner sc = new Scanner(System.in);
	
	public void adminMainMenu() {
		    
			AdminMenu admin = new AdminMenu();
		    System.out.println("-------------------------------");
		    System.out.println("	Admin Panel		");
		    System.out.println("-------------------------------");
		    System.out.println("1: ProductManger");
		    System.out.println("2: OrderManager");
		    System.out.println("3: BackToMain");
		    System.out.println("4: Exit");
		    System.out.println("-------------------------------");
		    try {
		        System.out.print("Choose Option: ");
		        int num = sc.nextInt();
	
		        switch (num) {
		            case 1:
		            	admin.productManagerMenu();
		                break;
		            case 2:
		            	admin.orderManagerMenu();
		                break;
		            case 3:
		            	admin.backToMain();
		                break;
		            case 4:
		            	admin.exitInterface();
		                break;
		              
		            default:
		                System.out.println("Invalid option. Please choose a valid option.");
		        }
		    } catch (InputMismatchException e) {
		        System.out.println("Invalid input. Please enter a valid number.");
		        sc.next(); // Consume the invalid input to prevent an infinite loop
		    }
		    adminMainMenu();

		}

	@Override
	public void productManagerMenu() {
		
		
		AdminProductOp admin = new AdminProductOp();
		

	    System.out.println("-------------------------------");
		System.out.println("	WelcomeToProductManager	  ");
		System.out.println("1: Add");
	    System.out.println("2: Alter");
	    System.out.println("3: Remove");
	    System.out.println("4: DisplayAll");
	    System.out.println("5: SortByName");
	    System.out.println("6: SearchItem");
	    System.out.println("7: BackToAdminMenu");
	    System.out.println("8: Exit");
	    System.out.println("-------------------------------");
	    
	    try {
	        System.out.print("Choose Option: ");
	        int num = sc.nextInt();

	        switch (num) {
	            case 1:
	                admin.addProduct();
	                break;
	            case 2:
	                admin.alterProduct();
	                break;
	            case 3:
	                admin.removeProduct();
	                break;
	            case 4:
	                admin.displayProduct();
	                break;
	            case 5: 
	            	admin.sortByName();
	                break;
	            case 6: 
	            	admin.searchProduct();
	                break;
	            case 7:
	            	admin.BackToAdminMenu();
	            case 8:
	                admin.exitInterface();
	                break;           
	            default:
	                System.out.println("Invalid option. Please choose a valid option.");
	        }
	    } catch (InputMismatchException e) {
	        System.out.println("Invalid input. Please enter a valid number.");
	        sc.next(); // Consume the invalid input to prevent an infinite loop
	    }
	    productManagerMenu();
	  
		
	}

	@Override
	public void orderManagerMenu() {
		
		AdminOrderOp order = new AdminOrderOp();
		
	    System.out.println("-------------------------------");
		System.out.println("	WelcomeToOrderManager 	");
	    System.out.println("1: Remove");
	    System.out.println("2: DisplayAllOrders");
	    System.out.println("3: SortByCustomerName");
	    System.out.println("4: SearchCustomer");
	    System.out.println("5: BackToAdminMenu");
	    System.out.println("6: Exit");
	    System.out.println("-------------------------------");
	    
	    try {
	        System.out.print("Choose Option: ");
	        int num = sc.nextInt();

	        switch (num) {
	            case 1:
	                order.removeOrder();
	                break;
	            case 2:
	                order.displayOrder();
	                break;
	            case 3: 
	            	order.sortByName();
	                break;
	            case 4: 
	            	order.searchOrder();
	                break;
	            case 5:
	            	order.BackToAdminMenu();
	            case 6:
	                order.exitInterface();
	                break;
	              
	            default:
	                System.out.println("Invalid option. Please choose a valid option.");
	        }
	    } catch (InputMismatchException e) {
	        System.out.println("Invalid input. Please enter a valid number.");
	        sc.next(); // Consume the invalid input to prevent an infinite loop
	    }
	    orderManagerMenu();
	   
		
	}

	@Override
	public void backToMain() {
		SaleView sv = new SaleView();
		sv.view();
		
	}

	@Override
	public void exitInterface() {
		System.out.println("Exiting the program...");
        System.exit(0);
		
	}
	

	
}