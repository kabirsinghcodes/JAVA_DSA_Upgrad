abstract class Animal{
    public abstract void animalsound();
    public void sleep(){
        System.out.println("Zzzz!");
    }
}

class Cow extends Animal{
public void animalsound(){
    System.out.println("This is a cow sound");
}
}

class abstractclasses{
    public static void main(String[] args) {
        Cow mycow = new Cow();
        mycow.animalsound();
        mycow.sleep();
    }
}