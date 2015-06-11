import java.util.Scanner;


public class NewProblem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] cards = scanner.nextLine().split("[\\s]+");
		String oddOrEven = scanner.nextLine();
		String magicCard = scanner.nextLine();
		String magicSuit = magicCard.substring(1,2);
		String magicFace = magicCard.substring(0, 1);
		if(magicCard.length()==3){
			magicSuit = magicCard.substring(2, 3);
			magicFace = magicCard.substring(0,2);
		}
		int endCounter = 0;
		boolean even = (oddOrEven.equals("even")) ? true : false;
		
		if(even){

			for (int i = 0; i < cards.length; i+=2) {
				int counter = 0;
				String card = cards[i];
				String cardFace = card.substring(0,1);
				String cardSuit = card.substring(1,2);
				if(card.length()==3){
					cardFace = card.substring(0, 2);
					cardSuit = card.substring(2, 3);
				}
				
				if(cardFace.equals("2")){
					counter+=20;
					if(cardSuit.equals(magicSuit)){
						counter+=20;
					}
					if(cardFace.equals(magicFace)){
						counter+=40;
					}
				}else if(cardFace.equals("3")){
					counter+=30;
					if(cardSuit.equals(magicSuit)){
						counter+=30;
					}
					if(cardFace.equals(magicFace)){
						counter+=60;
					}
				}else if(cardFace.equals("4")){
					counter+=40;
					if(cardSuit.equals(magicSuit)){
						counter+=40;
					}
					if(cardFace.equals(magicFace)){
						counter+=80;
					}
				}else if(cardFace.equals("5")){
					counter+=50;
					if(cardSuit.equals(magicSuit)){
						counter+=50;
					}
					if(cardFace.equals(magicFace)){
						counter+=100;
					}
				}else if(cardFace.equals("6")){
					counter+=60;
					if(cardSuit.equals(magicSuit)){
						counter+=60;
					}
					if(cardFace.equals(magicFace)){
						counter+=120;
					}
				}else if(cardFace.equals("7")){
					counter+=70;
					if(cardSuit.equals(magicSuit)){
						counter+=70;
					}
					if(cardFace.equals(magicFace)){
						counter+=140;
					}
				}else if(cardFace.equals("8")){
					counter+=80;
					if(cardSuit.equals(magicSuit)){
						counter+=80;
					}
					if(cardFace.equals(magicFace)){
						counter+=160;
					}
				}else if(cardFace.equals("9")){
					counter+=90;
					if(cardSuit.equals(magicSuit)){
						counter+=90;
					}
					if(cardFace.equals(magicFace)){
						counter+=180;
					}
				}else if(cardFace.equals("10")){
					counter+=100;
					if(cardSuit.equals(magicSuit)){
						counter+=100;
					}
					if(cardFace.equals(magicFace)){
						counter+=200;
					}
				}else if(cardFace.equals("J")){
					counter+=120;
					if(cardSuit.equals(magicSuit)){
						counter+=120;
					}
					if(cardFace.equals(magicFace)){
						counter+=240;
					}
				}else if(cardFace.equals("Q")){
					counter+=130;
					if(cardSuit.equals(magicSuit)){
						counter+=130;
					}
					if(cardFace.equals(magicFace)){
						counter+=260;
					}
				}else if(cardFace.equals("K")){
					counter+=140;
					if(cardSuit.equals(magicSuit)){
						counter+=140;
					}
					if(cardFace.equals(magicFace)){
						counter+=280;
					}
				}else if(cardFace.equals("A")){
					counter+=150;
					if(cardSuit.equals(magicSuit)){
						counter+=150;
					}
					if(cardFace.equals(magicFace)){
						counter+=300;
					}
				}
			endCounter+=counter;
			}
		}else{

			for (int j = 1; j < cards.length; j+=2) {
				int counter = 0;
				String card = cards[j];
				
				String cardFace = card.substring(0,1);
				String cardSuit = card.substring(1,2);
				if(card.length()==3){
					cardFace = card.substring(0, 2);
					cardSuit = card.substring(2, 3);
				}
				
				if(cardFace.equals("2")){
					counter+=20;
					if(cardSuit.equals(magicSuit)){
						counter+=20;
					}
					if(cardFace.equals(magicFace)){
						counter+=40;
					}
				}else if(cardFace.equals("3")){
					counter+=30;
					if(cardSuit.equals(magicSuit)){
						counter+=30;
					}
					if(cardFace.equals(magicFace)){
						counter+=60;
					}
				}else if(cardFace.equals("4")){
					counter+=40;
					if(cardSuit.equals(magicSuit)){
						counter+=40;
					}
					if(cardFace.equals(magicFace)){
						counter+=80;
					}
				}else if(cardFace.equals("5")){
					counter+=50;
					if(cardSuit.equals(magicSuit)){
						counter+=50;
					}
					if(cardFace.equals(magicFace)){
						counter+=100;
					}
				}else if(cardFace.equals("6")){
					counter+=60;
					if(cardSuit.equals(magicSuit)){
						counter+=60;
					}
					if(cardFace.equals(magicFace)){
						counter+=120;
					}
				}else if(cardFace.equals("7")){
					counter+=70;
					if(cardSuit.equals(magicSuit)){
						counter+=70;
					}
					if(cardFace.equals(magicFace)){
						counter+=140;
					}
				}else if(cardFace.equals("8")){
					counter+=80;
					if(cardSuit.equals(magicSuit)){
						counter+=80;
					}
					if(cardFace.equals(magicFace)){
						counter+=160;
					}
				}else if(cardFace.equals("9")){
					counter+=90;
					if(cardSuit.equals(magicSuit)){
						counter+=90;
					}
					if(cardFace.equals(magicFace)){
						counter+=180;
					}
				}else if(cardFace.equals("10")){
					counter+=100;
					if(cardSuit.equals(magicSuit)){
						counter+=100;
					}
					if(cardFace.equals(magicFace)){
						counter+=200;
					}
				}else if(cardFace.equals("J")){
					counter+=120;
					if(cardSuit.equals(magicSuit)){
						counter+=120;
					}
					if(cardFace.equals(magicFace)){
						counter+=240;
					}
				}else if(cardFace.equals("Q")){
					counter+=130;
					if(cardSuit.equals(magicSuit)){
						counter+=130;
					}
					if(cardFace.equals(magicFace)){
						counter+=260;
					}
				}else if(cardFace.equals("K")){
					counter+=140;
					if(cardSuit.equals(magicSuit)){
						counter+=140;
					}
					if(cardFace.equals(magicFace)){
						counter+=280;
					}
				}else if(cardFace.equals("A")){
					counter+=150;
					if(cardSuit.equals(magicSuit)){
						counter+=150;
					}
					if(cardFace.equals(magicFace)){
						counter+=300;
					}
				}
			endCounter+=counter;
			
			}
		}
		
		System.out.println(endCounter);

	}

}
