import java.sql.Array;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Problem04 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		Map<String, Map<String, Integer>> ordersMap = new TreeMap<>();
		
		while(true){
			String[] string = scanner.nextLine().split("[\\s]+");
			if(string[0].equals("end")){
				break;
			}
			
			String ip = string[0].substring(3);
			String user = string[2].substring(5);
			
			// here we check if this user is in the MAP and if it's not, we add user as KEY and we make LinkedMap as VALUE
			// to the MAP
			if(ordersMap.get(user) == null){
				ordersMap.put(user, new LinkedHashMap<String, Integer>());
			// here we take the KEY user and we add in his VALUE /the LinkedMap/ the ip as KEY and the "counter" 1				
				ordersMap.get(user).put(ip, 1);
			}else{
			// here we check if only the ip is in the MAP				
				if(ordersMap.get(user).get(ip) == null){
			// here we add the ip to the LinkedMap				
					ordersMap.get(user).put(ip, 1);
				}else{
			// this is the counter , if the ip is repeating we add + to the counter					
					int oldIpCount = ordersMap.get(user).get(ip);
					ordersMap.get(user).put(ip, oldIpCount + 1);
				}
			}
		}
		
		for (String key: ordersMap.keySet()) {
			String result = key + ":\n";
			Map<String, Integer> innerMap = ordersMap.get(key);
			for (String innerKey : innerMap.keySet()) {
				result += String.format("%s => %d, ", innerKey, innerMap.get(innerKey));
			}
			System.out.print(result.substring(0, result.length()-2) + ".\n");
		}
		
		

	}

}

//IP=192.23.30.40 message='Hello&derps.' user=destroyer
//IP=192.23.30.41 message='Hello&yall.' user=destroyer
//IP=192.23.30.40 message='Hello&hi.' user=destroyer
//IP=192.23.30.42 message='Hello&Dudes.' user=destroyer
//end

//destroyer: 
//192.23.30.40 => 2, 
//192.23.30.41 => 1, 
//192.23.30.42 => 1.


