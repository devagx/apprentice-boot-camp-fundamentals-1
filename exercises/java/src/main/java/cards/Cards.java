package cards;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for (String card : deckInOrder) {
            System.out.println(card);
        }
    }

    String[] getCards() {
        String[] result = new String[52];
        PlayingCard[] deck = new PlayingCard[52];
        int suitCount = 0;

        for (Suit suit : Suit.values()) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                PlayingCard playingCard = new PlayingCard();

                playingCard.setFaceValue(faceValue);
                playingCard.setSuit(suit);
                deck[suitCount * 13 + faceValue] = playingCard;
            }
            suitCount = suitCount +1;
        }

        int cardNumber = 0;
        for (PlayingCard card : deck) {
            String faceValueName;
            switch (card.getFaceValue()) {
                case 0:
                    faceValueName = "ace";
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    faceValueName = Integer.toString(card.getFaceValue() + 1);
                    break;
                case 10:
                    faceValueName = "jack";
                    break;
                case 11:
                    faceValueName = "queen";
                    break;
                case 12:
                    faceValueName = "king";
                    break;
                default:
                    throw new IllegalArgumentException("Something went wrong " + card.getFaceValue() + "is not a valid faceValue!");
            }
            result[cardNumber] = faceValueName + " of " + card.getSuit().name().toLowerCase();
            cardNumber++;
        }

        return result;
    }
}
