class Animal{
    public void AnimalSound(){
        System.out.println("This is an animal Sound");
    }
}
class dog extends Animal{
    public void AnimalSound(){
        System.out.println("This is a dog sound");
    }
}
class cow extends Animal{
    public void AnimalSound(){
        System.out.println("This is a cow sound");
    }
}
class polymorphism{
    public static void main(String[] args) {
        Animal myaAnimal = new Animal();
        Animal mydog  = new dog();
        Animal mycow = new cow();

        myaAnimal.AnimalSound();
        mycow.AnimalSound();
        mydog.AnimalSound();

    }
}