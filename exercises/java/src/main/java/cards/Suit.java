package cards;

public enum Suit {
    CLUBS("clubs"),
    DIAMONDS("diamonds"),
    HEARTS("hearts"),
    SPADES("spades");
    private String name;

    Suit(String name) {
        this.name = name;
    }
}
