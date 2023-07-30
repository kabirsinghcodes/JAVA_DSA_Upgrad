class Vehicle{
    protected String brand = "Ford";
    
    public void honk() {
        System.out.println("hoo hoo!");
    }
}

class Car extends Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args) {
        
        Car mycar = new Car();

        mycar.honk();

        System.out.println(mycar.brand + " " + mycar.modelName);

    }
}