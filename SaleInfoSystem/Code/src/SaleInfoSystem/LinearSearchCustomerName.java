package SaleInfoSystem;

import java.util.List;

public class LinearSearchCustomerName {
	
	public static void linearSearchProduct(List<Order> orderList, String name) {
	    boolean found = false;

	    long startTime = System.currentTimeMillis(); // Start time function
	    for (Order order : orderList) {
	        if (order.getCustomerName().equalsIgnoreCase(name)) {
	            System.out.println("\nOrder found: ");
	            printOrderDetails(order);
	            found = true;
	            break; // Exit the loop once the product is found
	        }
	    }

	    if (!found) {
	        System.out.println("Orders not found.");
	    }

	    long endTime = System.currentTimeMillis();
	    long totalTime = endTime - startTime;

	    System.out.println("Linear Search Total time: " + totalTime + "ms");
	    
	    
	    Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		long total = runtime.totalMemory();
		long free = runtime.freeMemory();
		long usedMemory = total -free;
		System.out.println("Total Memory: " + usedMemory + "bytes");
		long megabytes = usedMemory / (1024L * 1024L);
		System.out.println("Total Memory: " + megabytes + "MB");
	}

	
	private static void printOrderDetails(Order order) {
	    System.out.println("-------------------------------");
        System.out.println("Order Number: " + order.getOrderNumber());
        System.out.println("Product ID: " + order.getProductId());
        System.out.println("Product Name: " + order.getProductName());
        System.out.println("Total Price: " + order.getTotalPrice());
        System.out.println("Quantity: " + order.getQuantity());
        System.out.println("Customer Name: " + order.getCustomerName());
        System.out.println("Customer Address: " + order.getCustomerAddress());
        System.out.println("Customer Phone: " + order.getCustomerPhone());
        System.out.println("-------------------------------\n");
    }
//	

}



