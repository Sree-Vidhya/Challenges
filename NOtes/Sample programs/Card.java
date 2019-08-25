package com.myob;

public class Card {
    enum suits {
        Hearts("red"),Clubs("black"),Spade("black"),Diamond("red");
        String color;

        suits(String color) {
            this.color = color;
        }
    }

    enum CardNumber {
        ace,two, three, four, five, six, seven, eight, nine, ten, jack, queen, king;
    }

    suits suit = null;
    CardNumber cnum = null;

    private Card(suits suit, CardNumber name) {
        this.suit = suit;
        this.cnum = name;
    }

    public final static Card[] getPackOfCards() {
        Card[] pack = new Card[52];
        int i=0;
        for(suits suit:suits.values()) {
            for(CardNumber cnum: CardNumber.values()) {
                pack[i++] = new Card(suit,cnum);
            }
        }

        return pack;
    }

    @Override
    public String toString() {
        return  suit +
                " " + cnum;
    }

    public static void main(String[] args) {
        for(Card p : getPackOfCards()) {
            System.out.println(p);
        }
    }

}
