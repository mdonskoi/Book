package reusing;

//Перегрузка имени метода из базового класса
//в производном классе не скроет базовую версию метода

public class Homer {
    char doh(char c) {
        System.out.println("doh(char)");
        return 'd';
    }
    float doh(float f) {
        System.out.println("doh(float)");
        return 1.0f;
    }
}
