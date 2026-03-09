class Animal {
    void sound() {
        System.out.println("Some animal sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Mianhe {
    public static void main(String[] args) throws Exception{
        Animal a = new Cat();
        a.sound();
    }
}