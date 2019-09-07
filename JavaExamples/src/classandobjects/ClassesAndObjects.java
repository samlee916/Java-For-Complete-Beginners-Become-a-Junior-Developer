package classandobjects;
//A Java example about classes and objects
public class ClassesAndObjects {

    public static void main(String[] args) {
        Dog myFirstDog = new Dog("Ben", 4);
        Dog mySecondDog = new Dog();
        
        System.out.println(myFirstDog.name + " is " + myFirstDog.getAge() + " years old");
        System.out.println(mySecondDog.getName() + " is " + mySecondDog.age + " years old");
        
        myFirstDog.makeSound();
    }
    
}