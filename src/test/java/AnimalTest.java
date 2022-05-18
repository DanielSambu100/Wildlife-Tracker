import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void Animal_instantiatesCorrectly_true() {
        Animal testAnimal=new Animal(6,"Gazelle");
        assertEquals(true, true);
    }

    @Test
    void getName_animalInstantiatesWithId_6() {
        Animal testAnimal=new Animal(6,"Gazelle");
        assertEquals(6,testAnimal.getAnimalId());
    }
    @Test
    public void equals_returnsTrueIfNameAndIdAreSame_true() {
        Animal firstAnimal = new Animal(6, "Gazelle");
        Animal anotherAnimal = new Animal(6, "Gazelle");
        assertTrue(firstAnimal.equals(anotherAnimal));
    }
    @Test
    public void save_insertsObjectIntoDatabase_Person() {
        Animal testAnimal = new Animal(6, "Gazelle");
        testAnimal.save();
        assertTrue(Animal.all().get(0).equals(testAnimal));
    }
}