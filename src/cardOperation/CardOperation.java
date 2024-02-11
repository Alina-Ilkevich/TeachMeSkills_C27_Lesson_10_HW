package cardOperation;

import card.Card;

/**
 * This class is used to  create methods for working with cards
 */
public class CardOperation {
    public static void compareCard(Card[] cards) {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int k = i + 1; k < cards.length; k++) {
                if (cards[i].equals(cards[k])) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("The client does not have the same cards");
        } else {
            System.out.println("The number of identical cards: " + count);
        }
    }
    public static void countCard(Card[] cards) {
        int numberOfCard = 0;
        for (int i = 0; i < cards.length; i++) {
            numberOfCard++;
        }
        if (numberOfCard == 0){
            System.out.println("The client does not have cards");
        }
        System.out.println("The client has " + numberOfCard + " cards");
    }
}
