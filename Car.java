public class Car {
    int wheels = 4;
    String color = "black";
    int average = 35;
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("hii please start the car");
        System.out.println("color : "+c.color);
        System.out.println("No of wheels :"+ c.wheels);
        System.out.println("average :"+c.average);
        c.start(true);
    }
    public void start(boolean b){
        System.out.println("car is ready to launch");
    }
}