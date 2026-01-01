public class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
    public static void main(String[] args) {

        Animal a = new Dog();   
        a.sound();              
    }
}
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}