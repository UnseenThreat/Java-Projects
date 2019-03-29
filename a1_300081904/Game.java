import java.util.Scanner;
public class Game{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String change;
		int num;
		boolean start = false;
		String choice;

		System.out.println("Bienvenue au jeu de rami");
		System.out.println("Le paquet a 52 cartes: 13 valeurs x 4 couleurs. Voulez-vous changer le nombre des valeurs?: ");
		
		change = sc.nextLine();
		num = 13;

		int manche = 1;
		while((change.equals("oui") || change.equals("non"))!=true){
			
			System.out.println("Le paquet a 52 cartes: 13 valeurs x 4 couleurs. Voulez-vous changer le nombre des valeurs?: ");
			change = sc.nextLine();
			if(change.equals("oui") || change.equals("non")){
			
				start = true;
			
			}
		
		}

		if (change.equals("oui")){
			
			System.out.println("Entrez un nombre de 3 à 13, pour le nombre des valeurs: ");
			num = sc.nextInt();
			while(num < 3 || num >13){
				
				System.out.println("Entrez un nombre de 3 à 13, pour le nombre des valeurs: ");
			
				num = sc.nextInt();

			}
		
		}
		
		if (change.equals("non")){
			
			num = 13;
		
		}

		System.out.println("Vous jouez avec un paquet de " + (num * 4) + "cartes");
		Deck deck = new Deck(num*4);
		Card c;
		for (int i = 0; i < 4; i++){
			
			for(int j = 0; j < num; j ++){
				System.out.println(i);
				System.out.println(j);
				c = new Card(i, j);
				deck.add(c);
			
			}
		
		
		}
		Deck hand = new Deck();
		Deck deal;
		deck.shuffle();
		deal = deck.deal(7);
		hand.addAll(deal);
		hand.print();
		
		
		while(hand.size() > 0){
		
			System.out.println("Bienvenue à la manche " + manche + ".");
			System.out.println("Lancez le dé");
			Die die = new Die();

			if(deck.size() > 0){
			
				System.out.println("La valeur du dé a été: " + die.getValue());

			}
			else{
			
				System.out.println("Le paquet est vide. Le dé va donner la valeur 1");
				//die = 1
			}
			
			if((die.getValue() > 1)&&(deck.size() > 0 )){
			
				if(deck.size() < die.getValue()){
				
					System.out.println("On vous donne " + die.getValue() + " cartes");
					System.out.println("Ou" + deck.size() + "cartes (parce que le paquet contient moins que 6 cartes)");
					hand.print();

				}
				else{

					System.out.println("On vous donne " + die.getValue() + " cartes");
						hand.print();

				}
			deal = deck.deal(die.getValue());
			hand.addAll(deal);
			System.out.println("Avez-vous une séquence de 3+ cartes de même couleur ou une combinaison de 2+ cartes de même valeur? (oui ou non):");
			choice = sc.nextLine();
			while((choice.equals("oui")||choice.equals("non")) != true){
			
				System.out.println("Avez-vous une séquence de 3+ cartes de même couleur ou une combinaison de 2+ cartes de même valeur? (oui ou non):");
			choice = sc.nextLine();

			}
			if(choice.equals("oui")){
				Deck check;
				System.out.println("Quelle séquence de 3+ ou combinaison de 2+ carte de même valeur voulez-vous défausser? Entrez les cartes séparées par des espaces: ");
				
					
			}

			}
		}



	}
}