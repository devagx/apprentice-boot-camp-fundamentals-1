package cards;

import java.util.Collections;

public class PlayingCardDeck implements Deck {

    private PlayingCard[] cards = new PlayingCard[52];

    public PlayingCardDeck() {
        for (Suit suit : Suit.values()) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                cards[suit.ordinal() * 13 + faceValue] = new PlayingCard(suit, faceValue);
            }
        }
    }

    public void shuffle() {

    }

    public String[] getCards() {
        String[] result = new String[cards.length];
        int cardNumber = 0;
        for (PlayingCard card : cards) {
            result[cardNumber] = card.toString();
            cardNumber++;
        }
        return result;
    }

    public PlayingCard deal() {
        return null;
    }

    public static void main(String[] args) {
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();
        String[] deckInOrder = playingCardDeck.getCards();
        for (String card : deckInOrder) {
            System.out.println(card);
        }
    }
}
