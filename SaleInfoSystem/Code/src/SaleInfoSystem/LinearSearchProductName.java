//package SaleInfoSystem;
//
//import java.util.List;
//
//public class LinearSearchProductName {
//	
//
//	
//	public static void linearSearchProduct(List<Product> productList, String name) {
//		
//	    boolean found = false;
//
//	    long startTime = System.currentTimeMillis(); // Start time function
//	    for (Product product : productList) {
//	        if (product.getName().equalsIgnoreCase(name)) {
//	            System.out.println("\nProduct found: ");
//	            printOrderDetails(product);
//	            found = true;
//	            break; // Exit the loop once the product is found
//	        }
//	    }
//
//	    if (!found) {
//	        System.out.println("Orders not found.");
//	    }
//
//	    long endTime = System.currentTimeMillis();
//	    long totalTime = endTime - startTime;
//
//	    System.out.println("Linear Search Total time: " + totalTime + "ms");
//	    
//	    
//	    Runtime runtime = Runtime.getRuntime();
//		runtime.gc();
//		long total = runtime.totalMemory();
//		long free = runtime.freeMemory();
//		long usedMemory = total -free;
//		System.out.println("Total Memory: " + usedMemory + "bytes");
//		long megabytes = usedMemory / (1024L * 1024L);
//		System.out.println("Total Memory: " + megabytes + "MB");
//	}
//
//
//		private static void printOrderDetails(Product product) {
//		    System.out.println("-------------------------------");
//		    System.out.println("ID: " + product.getId());
//		    System.out.println("Name: " + product.getName());
//		    System.out.println("Price: " + product.getPrice());
//		    System.out.println("Quantity: " + product.getQuantity());
//		    System.out.println("Category: " + product.getCategory());
//		    System.out.println("-------------------------------\n");
//		    
//		
//	}
//
//
//}
