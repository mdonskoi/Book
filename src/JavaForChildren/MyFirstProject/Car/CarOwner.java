package JavaForChildren.MyFirstProject.Car;

public class CarOwner {

    public static void main(String[] args){
        Car c = new Car();
        JamesBondCar j = new JamesBondCar();
        c.start();
        c.stop();
        System.out.println(c.drive(10));
        System.out.println(j.drive(1));
    }
}
