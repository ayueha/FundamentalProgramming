package practice8.CardGame;
import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    public static void main(String[] args) {

        ArrayList<Card> deckOfCards = new ArrayList<>();

        for (CardRank rank:CardRank.values()){

            for (CardSuit suite:CardSuit.values()){

                deckOfCards.add(new Card(suite,rank));

            }
        }

        int amountOfcard=4;
        //print the deck;
        Collections.shuffle(deckOfCards);

        ArrayList<Card> hand = new ArrayList<>();

        for (int index=0; index<=amountOfcard; index++){

            hand.add(deckOfCards.remove(0));

        }

        for (Card card:hand){
            System.out.println(card);
        }

        /*
        public void checkForPorkerHands(){
            int sumOfCards =0;
            for (CardRank rank: CardRank.values()){

            }
    }*/


    }

}
