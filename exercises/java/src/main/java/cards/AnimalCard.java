package cards;

public class AnimalCard implements Card{

    private final Animal animal;

    public AnimalCard(Animal animal) {
        this.animal = animal;
    }

    public boolean snap( AnimalCard otherCard ){
        return otherCard != null && this.animal.equals(otherCard.animal);
    }

    @Override
    public String toString() {
        return animal.toString();
    }

    @Override
    public boolean snap() {
        return false;
    }
}
