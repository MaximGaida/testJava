import static org.junit.jupiter.api.Assertions.*;

class Testing {

    @org.junit.jupiter.api.Test
    void testGetDogNameMethod() {
        Dog dog = new Dog("Alberts", 2);
        assertEquals("Alberts",dog.getName());

    }

    @org.junit.jupiter.api.Test
    void setName() {
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}