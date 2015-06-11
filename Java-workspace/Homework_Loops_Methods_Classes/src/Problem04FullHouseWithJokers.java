
public class Problem04FullHouseWithJokers {

	public static void main(String[] args) {
		String[] faces = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		char[] suits = {'\u2660','\u2663','\u2666','\u2665'};
		int count = 0;
		
		for (int i = 0; i < faces.length; i++) { 									//for the first cards faces
			for (int j = 0; j < faces.length; j++) {					 			//for the second cards faces
				for (int j2 = 0; j2 < suits.length; j2++) { 						//for the 1 suits
					for (int k = j2 + 1; k < suits.length; k++) {					//for the 2 suits
						for (int k2 = k + 1; k2 < suits.length; k2++) {				//for the 3 suits
							for (int l = 0; l < suits.length; l++) {				//for the 4 suits
								for (int l2 = l + 1; l2 < suits.length; l2++) {		//for the 5 suits
									if (i!=j) {
										//System.out.printf("%s%c %s%c %s%c %s%c %s%c\n",faces[i],suits[j2],faces[i],suits[k],faces[i],
											//	suits[k2],faces[j],suits[l],faces[j],suits[l2]);
										//count++;
										String firstHand = faces[i]+suits[j2];
										String secondHand = faces[i]+suits[k];
										String thirdHand = faces[i]+suits[k2];
										String fourthHand = faces[j]+suits[l];
										String fifthHand = faces[j]+suits[l2];
										String[] hands ={firstHand,secondHand,thirdHand,fourthHand,fifthHand};
										for (int combinations = 0; combinations < 31; combinations++) {
											int checker = combinations;
											for (int joker = 0; joker < 5; joker++) {
												if (checker % 2 == 1) {
													hands[joker] = "* ";
													checker/=2;
												}
											}
											System.out.println(hands[0]+hands[1]+hands[2]+hands[3]+hands[4]);
											count++;
										}
									}
									
								}
								
							}
							
						}
						
					}
					
				}
				
			}
		}
		System.out.println(count + " full houses");
	}

}
