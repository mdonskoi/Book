package JavaForChildren.MyFirstProject.Car;

public class Car {
    public void start(){
        System.out.println("start");};
    public void stop(){
        System.out.println("stop");};
    public int drive(int howLong){
        int distance = howLong*60;
        return distance;
    };
}
