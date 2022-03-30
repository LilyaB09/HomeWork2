public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(theTask1(2, 21));
        theTask2(9);
        System.out.println(theTask3(-17));
        theTask4("Liliya", 4);
        System.out.println(theTask5(2003));
    }

    static boolean theTask1(int a, int b) {
        return a + b >= 10 && a + b <= 20;
        }
    static void theTask2(int a) {
        System.out.println(a >= 0? "Положительное" : "Отрицательное");
    }
    static boolean theTask3(int a) {
        return a < 0;
    }
    static void theTask4(String str, int count) {
        for (int i = 1; i <= count; i++) {
            System.out.println(str);
        }
    }
    static boolean theTask5(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }
}
