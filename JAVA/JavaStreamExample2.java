package Testing;

import java.util.ArrayList;
import java.util.List;

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


public class JavaStreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List <Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"HP laptop",25000f));
		productList.add(new Product(2,"Dell laptop",30000f));
		productList.add(new Product(3,"Lenevo laptop",28000f));
		productList.add(new Product(4,"Sony laptop",28000f));
		productList.add(new Product(5,"Apple laptop",90000f));
		
		Float totalprice = productList.stream().map(product->product.price).reduce(0.0f, (sum,price)->sum+price);
		System.out.println(totalprice);
		float totalprice2 = productList.stream().map(product->product.price).reduce(0.0f, Float::sum);
		System.out.println(totalprice2);
		
		
	}

}
