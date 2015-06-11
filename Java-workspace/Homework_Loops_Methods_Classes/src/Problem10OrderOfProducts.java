import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Locale;

public class Problem10OrderOfProducts {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		ArrayList<Product> Products = new ArrayList<Product>();

		try {
			BufferedReader reader = new BufferedReader(new FileReader("_10_Products.txt"));
			BufferedReader order = new BufferedReader(new FileReader("_10_Order.txt"));
			BufferedWriter output = new BufferedWriter(new FileWriter("_10_Output.txt"));

			String input;
			while ((input = reader.readLine()) != null) {
				String[] splited = input.split(" ");
				Products.add(new Product(splited[0], 
						Double.parseDouble(splited[1])));
			}
			String orders;
			double sum = 0;
			while ((orders = order.readLine()) != null) {
				String[] ordersSplited = orders.split(" ");
				
				String orderedProduct = ordersSplited[1];
				double oroductQuanty = Double.parseDouble(ordersSplited[0]);
				
				for (Product product : Products) {
					if (orderedProduct.equals(product.getName())) {
						sum += oroductQuanty * product.getPrice();
					}
				}
			}
			output.write(String.format("%.2f", sum));
			reader.close();
			order.close();
			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}