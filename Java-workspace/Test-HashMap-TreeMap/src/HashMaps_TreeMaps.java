import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;


public class HashMaps_TreeMaps {

	public static void main(String[] args) {
//		HashMap<String, Integer> students = new HashMap<String, Integer>();
//		students.put("Todor", 20);
//		students.put("Delcho", 30);
//		students.put("Todor", 35);
//		
//		System.out.println(students.keySet()+" " +students.get("Todor"));
		
//		TreeMap<String, Integer> students = new TreeMap<String, Integer>();
//        //Add Key/Value pairs
//        students.put("Ed", 47);
//        students.put("Alan", 34);
//        students.put("Sheila", 65);
//        students.put("Becca", 44);
// 
//        //Iterate over HashMap
//        for(String key: students.keySet()){
//            System.out.println(key  +" :: "+ students.get(key));
//        }
		
		String marek = "Marek";
//		Every letter in ASCII
		for (int i = 0; i < marek.length(); i++) {
			char letter = marek.charAt(i);
			int inASCII = letter;
			System.out.println(inASCII);
		}
		String niki;
		niki = "Niki";
		System.out.println(niki);

		String mStringArray[] = { "String1", "String2" };

		System.out.println(Arrays.asList(mStringArray));
		
		ArrayList<String> bobi = new ArrayList<String>();
		bobi.add("Markuch");
		bobi.add("Basi");
		bobi.add("Golemite RUCKI , CHUEK!");
		bobi.addAll(new ArrayList<Integer>)
	}

}
