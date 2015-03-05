package JavaForChildren.MyFirstProject.Chapter4;

public class PetMaster {
    public static void main(String args[]) {
        String petReaction;
        Pet myPet = new Pet();
        myPet.eat();
        petReaction = myPet.say("knok knok");
        System.out.println(petReaction);
        myPet.sleep();
    }
}
