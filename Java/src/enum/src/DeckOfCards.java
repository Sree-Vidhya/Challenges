
public enum DeckOfCards {
    AHEART("A","RED","HEART"),

    HEART1("1","RED","HEART"),
    HEART2("2","RED","HEART"),
    HEART3("3","RED","HEART"),
    HEART4("4","RED","HEART"),
    HEART5("5","RED","HEART"),
    HEART6("6","RED","HEART"),
    HEART7("7","RED","HEART"),
    HEART8("8","RED","HEART"),
    HEART9("9","RED","HEART"),
    HEART10("10","RED","HEART"),
    HEARTJ("J","RED","HEART"),
    HEARTK("K","RED","HEART");

    String name;
    String color;
    String symbol;
    DeckOfCards(String name, String color, String symbol) {
        this.name=name;
        this.color= color;
        this.symbol =symbol;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getSymbol() {
        return symbol;
    }


}
