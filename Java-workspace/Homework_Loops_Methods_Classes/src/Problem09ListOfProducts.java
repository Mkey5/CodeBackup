
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Problem09ListOfProducts {

	public static void main(String[] args) {
		ArrayList<Product> Products  = new ArrayList<Product>();
		
		try{
			BufferedReader reader = new BufferedReader(new FileReader("_09_Input.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("_09_Output.txt"));
			String input;
			while ((input = reader.readLine()) != null) {
				String[] splited = input.split(" ");
				Products.add(new Product(splited[0], Double.parseDouble(splited[1])));
			}
			
			Collections.sort(Products);
			for (Product product : Products) {
				writer.write(product.getPrice() + " " + product.getName() +"\r\n");
			}
			reader.close();
			writer.close();
		} catch (Exception exeption) {
			System.out.println("Error");
		}	
	}

}
