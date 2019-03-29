
/**
 * Starting point for your implementation of the class Deck.
 *
 * @author Marcel Turcotte (marcel.turcotte@uottawa.ca)
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    /**
     * A constructor for the class <code>Deck</code>. It creates the initial
     * <code>ArrayList</code> that will be used to store the cards of Otherwise
     * deck.
     */

    public Deck() {

        cards = new ArrayList<Card>();

    }

    /**
     * A constructor for the class <code>Deck</code>. It creates the initial
     * <code>ArrayList</code> that will be used to store the cards of Otherwise
     * deck. The parameter specifies the number of ranks for the cards. Finally,
     * it also initializes this deck to contain 4 x n cards, where n is the value
     * of the parameter.
     *
     * @param range the number of ranks for the cards
     */


    public Deck(int range) {

        // Complete the implementation of this constructor
        cards = new ArrayList<Card>(4 * range);

    }

    // Add all the necessary methods here

    public int size(){

        return cards.size();

    }

    public boolean hasCards(){

        return (!(cards.isEmpty()));

    }

    public Card get(int pos){

        return cards.get(pos);

    }

    public void add(Card card){

        cards.add(card);

    }

    public void	addAll(Deck other){

        for(int i = 0; i < other.size(); i++){

            cards.add(other.get(i));
            other.removeFirst();
        }


    }

    public Card removeLast(){

        
        cards.remove((cards.size()-1));
		return	cards.get((cards.size()-1));
    }

    public Card removeFirst(){

        cards.remove(0);
		return	cards.get(0);


    }

    public boolean remove(Card card){
        int a = 1;
        for(int i = 0; i < cards.size(); i++){
            if(a > 1){
                if(cards.get(i) == card){
                    cards.remove(i);
                    a = a - 1;
                    return true;
                }
            }
        }
        return false;
    }

    public void removeAll(Deck other){

        for(int i = 0; i < other.size(); i++){

            other.removeLast();

        }


    }

    public void shuffle(){

        Collections.shuffle(cards);

    }

    public Deck deal(int n){
        Deck deal;
        deal = new Deck();
        for(int i = 0; i < n; i++){
			
            if(cards.size()>1){

                deal.add(cards.get((cards.size()-1)));
                cards.remove((cards.size()-1));

            }

        }
        return deal;
    }

    public boolean contains(Card card){

        if(cards.contains(card)){

            return true;

        }

        return false;
    }

    public boolean isKind(){

        if(cards.size() >= 2){

            int countrank = 0;
            for(int i = 0; i < (cards.size() - 1); i++){

                if(cards.get(i).getRank() == cards.get((i+1)).getRank()){
                    countrank = countrank + 1;


                }
            if(countrank == (cards.size()-1)){

                return true;

                }
            }


        }

        return false;
    }

    public boolean isSeq(){

        if(cards.size() >= 3){

            int countsuit = 0;
            int countseq  = 0;
            for(int i = 0; i < (cards.size() - 1); i++){

                if(cards.get(i).getSuit() == cards.get((i+1)).getSuit()){

                    countsuit = countsuit + 1;

                }


            }
            for(int i = 0; i < (cards.size() - 1); i++){

                if(cards.get(i + 1).getRank() == (cards.get(i).getRank() + 1) ){

                    countseq = countseq + 1;

                }

            }

            if((countsuit == (cards.size() - 1)) && (countseq == (cards.size() - 1))){

                return true;

            }


        }

       return false;
    }

    public void sortBySuit(){

        for(int i = 0; i < cards.size(); i++){

            for(int j = 1; j < cards.size() - 1; j++){

                if(cards.get(i).getSuit() < cards.get(j).getSuit()){

                    Card tmp = get(i);
                    cards.set(i, get(i));
                    cards.set(j,tmp);


                }

            }
        }

    }
    public void sortByRank(){

        for(int i = 0; i < cards.size(); i++){

            for(int j = 1; j < cards.size() - 1; j++){

                if(cards.get(i).getRank() < cards.get(j).getRank()){

                    Card tmp = get(i);
                    cards.set(i, get(i));
                    cards.set(j,tmp);


                }

            }
        }

    }
    public void print(){
		
		System.out.println("Ici est votre main");
        for(int i = 0; i < cards.size(); i++){

            for(int j = 1; j < cards.size() - 1; j++){

                if(cards.get(i).getSuit() < cards.get(j).getSuit()){

                    Card tmp = get(i);
                    cards.set(i, get(i));
                    cards.set(j,tmp);


                }

            }
        }
        
		String deck = "";

        for(int i = 0; i < cards.size(); i++){
			
			deck = cards.get(i) + deck ;
		
		}
		System.out.println(deck);
        
		for(int i = 0; i < cards.size(); i++){

            for(int j = 1; j < cards.size() - 1; j++){

                if(cards.get(i).getRank() < cards.get(j).getRank()){

                    Card tmp = get(i);
                    cards.set(i, get(i));
                    cards.set(j,tmp);


                }

            }
        }

        deck = "";

        for(int i = 0; i < cards.size(); i++){
			
			deck = cards.get(i) + deck ;
		
		}
		System.out.println(deck);

    }
    public String toString(){
		
		String deck;
		deck = "Votre cartes sont: ";

        for(int i = 0; i < cards.size(); i++){
			
			deck = (cards.get(i)).toString() + deck ;
		
		}
		return deck;
    }
}