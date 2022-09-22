package Testing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
	
	int id;
	String name;
	float price;
	public Product (int id ,String name , float price) {
		this.id = id;
		this.name = name;
		this.price =  price;
		
		
	}
	
}


public class JavaStreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		List <Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"HP laptop",25000f));
		productList.add(new Product(2,"Dell laptop",30000f));
		productList.add(new Product(3,"Lenevo laptop",28000f));
		productList.add(new Product(4,"Sony laptop",28000f));
		productList.add(new Product(5,"Apple laptop",90000f));
		List<Float>productPriceList2= productList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(productPriceList2);
		
		
		
		
	}

}
