
class Animal {

    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}


class Mammal extends Animal {

    private String furColor;


    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }


    @Override
    public void makeSound() {
        System.out.println("Mammal makes a mammal-specific sound");
    }


    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }
}

class Bird extends Animal {

    private double wingSpan;


    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }


    @Override
    public void makeSound() {
        System.out.println("Bird makes a bird-specific sound");
    }


    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan;
    }
}

class Dog extends Mammal {

    private String breed;


    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Dog makes a dog-specific sound");
    }


    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}


 class Main {
    public static void main(String[] args) {

        Animal genericAnimal = new Animal("Generic Animal", 5);
        Mammal lion = new Mammal("Lion", 10, "Golden");
        Bird eagle = new Bird("Eagle", 7, 6.2);
        Dog goldenRetriever = new Dog("Buddy", 3, "Golden", "Golden Retriever");


        genericAnimal.makeSound();
        lion.makeSound();
        eagle.makeSound();
        goldenRetriever.makeSound();


        System.out.println("\nGeneric Animal: " + genericAnimal);
        System.out.println("Lion: " + lion);
        System.out.println("Eagle: " + eagle);
        System.out.println("Golden Retriever: " + goldenRetriever);
    }
}

