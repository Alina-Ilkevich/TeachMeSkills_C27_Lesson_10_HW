package fabric;

import card.Card;

/**
 * this class is used to create cards
 */
public class Fabric {
    public static Card[] createCards() {
        Card card1 = new Card(123, 123, 120);
        Card card2 = new Card(123, 456, 1200);
        Card card3 = new Card(345, 123, 50);
        Card card4 = new Card(345, 123, 100);
        Card[] cards = new Card[]{card1, card2, card3, card4};
        return cards;
    }
}
