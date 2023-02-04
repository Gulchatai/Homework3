public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }
    public static  void task1() {
        System.out.println("Задача 1");
        int a = 1000000;
        System.out.println("Значение переменной " + "a" + " с типом " + "int" + " равно " + a);
        byte b = 100;
        System.out.println("Значение переменной " + "b" + " с типом " + "byte" + " равно " + b);
        short c = 10000;
        System.out.println("Значение переменной " + "c" + " с типом " + "short" + " равно " + c);
        long d = 100000000000L;
        System.out.println("Значение переменной " + "d" + " с типом " + "long" + " равно " + d);
        float e = 100.123456789f;
        System.out.println("Значение переменной " + "e" + " с типом " + "float" + " равно " + e);
        double h = 100.12345678999;
        System.out.println("Значение переменной " + "h" + " с типом " + "double" + " равно " + h);
    }
    public static  void task2() {
        System.out.println("Задача 2");
        float firstNumber = 27.12f;
        System.out.println(firstNumber);
        long secondNumber = 987678965549L;
        System.out.println(secondNumber);
        double thirdNumber = 2.786;
        System.out.println(thirdNumber);
        int fourthNumber = 569;
        System.out.println(fourthNumber);
        int fifthNumber = -159;
        System.out.println(fifthNumber);
        short sixthNumber = 27897;
        System.out.println(sixthNumber);
        byte seventhNumber = 67;
        System.out.println(seventhNumber);
    }
    public static  void task3() {
        System.out.println("Задача 3");
        short totalList = 480;
        byte klassLudmilaPavlovna = 23;
        byte klassAnnaSergeevna = 27;
        byte klassEkaterinaAndreevna = 30;
        int quantityPerStudent = totalList / (klassEkaterinaAndreevna + klassAnnaSergeevna + klassLudmilaPavlovna);
        System.out.println("На каждого ученика рассчитано " + quantityPerStudent + " листов бумаги");
    }
    public static  void task4() {
        System.out.println("Задача 4");
        byte machinePerformance = 16 / 2;
        var n = "20 минут";
        int machinePerformance20Minutes = machinePerformance * 20;
        System.out.println("За " + n + " машина произвела " + machinePerformance20Minutes +
                " штук бутылок.");
        var v = "сутки";
        int machinePerformanceDay = machinePerformance * 60 * 24;
        System.out.println("За " + v + " машина произвела " + machinePerformanceDay +
                " штук бутылок.");
        var s = "3 дня";
        int machinePerformanceFreeDays = machinePerformance * 60 * 24 * 3;
        System.out.println("За " + s + " машина произвела " + machinePerformanceFreeDays +
                " штук бутылок.");
        var p = "месяц";
        int machinePerformanceMonth = machinePerformance * 60 * 24 * 30;
        System.out.println("За " + p + " машина произвела " + machinePerformanceMonth +
                " штук бутылок.");
    }
    public static  void task5() {
        System.out.println("Задача 5");
        byte ratio  = 120/6;
        int white = ratio * 2;
        int black = ratio * 4;
        System.out.println("В школе, где " + ratio + " классов, нужно " + white + " банок белой краски и "
                + black + " банок коричневой краски");
    }
    public static  void task6() {
        System.out.println("Задача 6");
        short wholeBanana  = 80 * 5;
        short wholeMilk  = 105 * 2;
        short wholeIceCream  = 100 * 2;
        short wholeEggs = 70 * 4;
        float wholeGrams = wholeBanana + wholeMilk + wholeIceCream + wholeEggs;
        float wholeKilograms = wholeGrams / 1000;
        System.out.println("Общий вес завтрака " + wholeGrams + " грамм, что составляет " + wholeKilograms +
                " килограмм.");
    }
}