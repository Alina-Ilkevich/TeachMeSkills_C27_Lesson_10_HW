package card;

import java.util.Objects;

/**
 *This class is used to describe the card
 */
public class Card {
    private int cvv;
    private long cardNumber;
    private int amount;

    public Card(int cvv, long cardNumber, int amount) {
        this.cvv = cvv;
        this.cardNumber = cardNumber;
        this.amount = amount;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        if (cvv >=100 && cvv <= 999) {
            this.cvv = cvv;
        }
        else {
            System.out.println("Incorrect svv code");
        }
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount >= 0){
            this.amount = amount;
        }
        else {
            System.out.println("Incorrect amount");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cvv == card.cvv && cardNumber == card.cardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvv, cardNumber);
    }
}
