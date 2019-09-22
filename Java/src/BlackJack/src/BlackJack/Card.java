package BlackJack;

public class Card
{
    String Suit;
    int Value;
    String Face;

    public Card(String suit, int value, String face)
    {
        Suit = suit;
        Value = value;
        Face = face;
    }

    public Card() {

    }

    @Override
    public String toString()
    {
        return "Card{" +
                "Suit='" + Suit + '\'' +
                ", Value=" + Value +
                ", Face='" + Face + '\'' +
                '}';
    }
}
