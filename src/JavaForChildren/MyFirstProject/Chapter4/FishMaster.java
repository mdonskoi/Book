package JavaForChildren.MyFirstProject.Chapter4;

import JavaForChildren.MyFirstProject.Chapter4.Fish;

public class FishMaster {
    public static void main(String[] args) {
        Fish myFish = new Fish(20);
        Fish ffish = new Fish(); // empty constructor
        myFish.Dive(2);
        myFish.Dive(97);
        myFish.Dive(3);
        myFish.sleep();
        System.out.println(myFish.say("dfg"));
    }
}
