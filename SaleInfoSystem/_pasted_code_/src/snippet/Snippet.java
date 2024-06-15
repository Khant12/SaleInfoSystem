package snippet;

public class Snippet {
	// Print the list of products
	System.out.println("List of products:");
	Iterator<Product> itr = productList.iterator();
	System.out.println("------------------------------------------------------");
	System.out.println("| ID |   Name   |  Price  |  Quantity  |  Category  |");
	System.out.println("------------------------------------------------------");
	while(itr.hasNext()) {
	    Product pro = itr.next(); // return changed object value
	    System.out.printf("| %-3s| %-9s| %-8s| %-11s| %-11s|\n", pro.id, pro.name, pro.price, pro.quantity, pro.category);
	}
	System.out.println("------------------------------------------------------");
	
}

