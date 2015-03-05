package JavaForChildren.MyFirstProject.Chapter4;

/**
 * Created by а on 16.01.2015.
 */
public class ReportCard {

    public static char convertGrades(int testResult) {
        char grade;
        if (testResult >= 90) {
            grade = 'A';
        } else if (testResult >= 80 && testResult < 90) {
            grade = 'B';
        } else if (testResult >= 70 && testResult < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

    public static void main(String[] args) {
        //ReportCard rc = new ReportCard();
        System.out.println(ReportCard.convertGrades(88));
        //char yourGrade = rc.convertGrades(88);
        //System.out.println("Your first grade is " + yourGrade);
        //yourGrade = rc.convertGrades(79);
        System.out.println(ReportCard.convertGrades(79));
       // System.out.println("Your second grade is " + yourGrade);
        System.out.println("----------------------------------------------------------");

        switch (ReportCard.convertGrades(79)) {
            case 'A':
                System.out.println("excellent");
                break;
            case 'B':
                System.out.println("good");
                break;
            case 'C':
                System.out.println("need to work");
                break;
            case 'D':
                System.out.println("be seriously");
        }
    }

}
