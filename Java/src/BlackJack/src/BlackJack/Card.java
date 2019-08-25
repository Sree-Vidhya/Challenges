package BlackJack;

public class Card {
    String Suit;
    String Value;

    public Card(String suit, String value) {
        Suit = suit;
        Value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "Suit='" + Suit + '\'' +
                ", Value='" + Value + '\'' +
                '}';
    }
}
