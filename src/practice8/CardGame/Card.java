package practice8.CardGame;

public class Card {


    private  CardSuit cardSuit;
    private  CardRank cardRank;


    public Card(CardSuit cardSuit, CardRank cardRank){
        this.cardSuit=cardSuit;
        this.cardRank=cardRank;

    }

    public CardRank getvalue(){
        return  cardRank;
    }

    @Override
    public String toString(){
        return cardRank + " + "+ cardSuit;
    }
}
