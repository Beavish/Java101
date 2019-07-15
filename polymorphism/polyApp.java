public class polyApp{
    public static void main(String [] args) {
        /*
        Each class has the same method "animalSound()".
        dog and cat extend animal.
        However as we Decare animal as a dog and cat respectively we can call their unique method for animalSound();
        */
        Animal myAnimal = new Animal ();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();

        // here because there is a sit method in the animal class we can still call its sit method. This could be overridden 
        // in the dog/cat class if we choose -> THIS IS POLYMORPHISM <- 
        myDog.animalSit();
        myCat.animalSit();
        
    }
}