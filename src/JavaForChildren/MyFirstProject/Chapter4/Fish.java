package JavaForChildren.MyFirstProject.Chapter4;

public class Fish extends Pet {

    int currentDepth;
    Fish(int startingPosition) {
        this.currentDepth = startingPosition;
    }
    Fish(){};
    public int Dive(int howDeep) {
        currentDepth = currentDepth +howDeep;
        if (currentDepth > 100){
            System.out.println("Im a small fish" + "i cant swim under 100 m");
            currentDepth = currentDepth - howDeep;
        }
        else {
            System.out.println("Dive more on " + howDeep + "meters");
            System.out.println("Im on depth " + currentDepth + "meters");
        }
        //System.out.println("Dive on depth " + howDeep + "foots");
        //System.out.println("I`m on depth " + currentDepth + "foots below sea level");
        return currentDepth;
    }
    @Override
    public String say(String something) {
        //System.out.println("Fishes are silent!!!!!!!!!!!!");
        return "Fishes are silent";
    }

}
