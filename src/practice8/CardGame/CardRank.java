package practice8.CardGame;

public enum CardRank {
    Two(2),
    Three(3),
    Four(4),
    FIVE(5),
    SIX(6),
    Seven(7),
    Eight(8),
    Nine(9),
    Ten(10),
    Jack(11),
    Queen(12),
    King(13),
    Ace(14);

    int value;

    CardRank(int value){
        this.value =value;
    }

}
