package JavaForChildren.MyFirstProject.Chapter4;

public class Pet {
    int age;
    float weight;
    float height;
    String color;
    public void sleep() {
        System.out.println("sleep");
    }

    public void eat() {
        System.out.println("eat");
    }
    public String say(String aWord) {
        String petResponse = "Ok!! " + aWord;
        return petResponse;
    }
}
