import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class NewProblem04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		Map<String, Map<String, Long>> weightLifting = new TreeMap<>();
//		we take the input
		for (int i = 0; i < n; i++) {
			String[] line = scanner.nextLine().split("[\\s]+");
			String name = line[0];
			String tipe = line[1];
			
			long kg = Integer.parseInt(line[2]);
			
//			we add it to the MAP
			if(weightLifting.get(name)==null){
				weightLifting.put(name,new TreeMap<String,Long>());
				weightLifting.get(name).put(tipe, kg);
			}else{
				if(weightLifting.get(name).get(tipe)==null){
					weightLifting.get(name).put(tipe, kg);
				}else{
					long oldLift = weightLifting.get(name).get(tipe);
					weightLifting.get(name).put(tipe, oldLift + kg);
				}
			}
		}
//		we print the shit
		for (String key: weightLifting.keySet()) {
			String result = key + " : ";
			Map<String, Long> innerMap = weightLifting.get(key);
			for (String innerKey : innerMap.keySet()) {
				result += String.format("%s - %d kg, ", innerKey, innerMap.get(innerKey));
			}
			System.out.print(result.substring(0, result.length()-2) + "\n");
			
		}
	}

}
