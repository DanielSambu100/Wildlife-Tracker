import java.util.Objects;

public class Animal {
    private Integer animalId;
    private String animalName;

    public Animal(int animalId, String animalName) {
        this.animalId = animalId;
        this.animalName = animalName;
    }

    public Integer getAnimalId() {
        return animalId;
    }

    public void setAnimalId(Integer animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

//    @Override
//    public boolean equals(Object otherAnimal){
//        if (!(otherAnimal instanceof Animal)) {
//            return false;
//        } else {
//            Animal newAnimal = (Animal) otherAnimal;
//            return this.getAnimalName().equals(newAnimal.getAnimalName()) &&
//                    this.getAnimalId().equals(newAnimal.getAnimalId());
//        }
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return animalId.equals(animal.animalId) && animalName.equals(animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalId, animalName);
    }
}
