package cards;

import java.util.List;

public class PlayingCardDeck {
    private List<PlayingCard> cards;

    public PlayingCardDeck () {}

    public List<PlayingCard> getCards() {
        return cards;
    }

    public void setCards(List<PlayingCard> cards) {
        this.cards = cards;
    }
}
