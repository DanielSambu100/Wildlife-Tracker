public class Animal {
    private String animalId;
    private String animalName;

    public Animal(String animalId, String animalName) {
        this.animalId = animalId;
        this.animalName = animalName;
    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
