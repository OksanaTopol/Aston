package lesson_1;
public class Lesson_1{
    public static void main(String[] args){
        System.out.println("\nTask 1");
        printThreeWords();
        System.out.println("\nTask 2");
        checkSumSign();
        System.out.println("\nTask 3");
        printColor();
        System.out.println("\nTask 4");
        compareNumbers();
        System.out.println("\nTask 5");
        System.out.println(sumBetweenTenAndTwenty(2,4));
        System.out.println("\nTask 6");
        isPositive(5);
        System.out.println("\nTask 7");
        System.out.println(isNegative(6));
        System.out.println("\nTask 8");
        printText("Hello, world", 3);
        System.out.println("\nTask 9");
        System.out.println(leapYear(2014));
        System.out.println("\nTask 10");
        changeArray();
        System.out.println("\nTask 11");
        changeLargeArray();
        System.out.println("\nTask 12");
        multiplyArray();
        System.out.println("\nTask 13");
        fillSquareArray();
        System.out.println("\nTask 14");
        returnArray(5,7);
    }

    // task 1
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // task 2
    public static void checkSumSign(){
        int a = 2;
        int b = 3;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");       
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // task 3
    public static void printColor(){
        int value = 5;
        if (value <=0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }    
    }

    // task 4
    public static void compareNumbers(){
        int a = 2;
        int b = 3;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // task 5
    public static boolean sumBetweenTenAndTwenty(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // task 6
    public static void isPositive(int a){
        if (a >=0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // task 7
    public static boolean isNegative(int a){
        return a < 0;
    }

    //task 8
    public static void printText(String text, int number){
        for (int i = 1; i <= number; i++) {
            System.out.println(text);
        }
    }

    // task 9
    public static boolean leapYear(int year){
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
    
    // task 10
    public static void changeArray(){
        int[] array = {0,1,0,1,0,1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        printArray(array);
    }

    // task 11
    public static void changeLargeArray(){
        int[] largeArray = new int[100];
        for (int i = 0; i < largeArray.length; i++) {
            largeArray[i] = i + 1;
        }
        printArray(largeArray);
    }

    // task 12
    public static void multiplyArray(){
        int[] array = {1,5,3,2,11,4,5,2,4,8,9,1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        printArray(array);
    }
      
    // task 13
    public static void fillSquareArray(){
        int n = 5;
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            array[i][i] = 1;
        }
        printArray(array);
    }

    // task 14
    public static void returnArray(int len, int initialValue){
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        printArray(array);
    }

    public static void printArray(int[][] array){
        int n = array.length;
        for (int i = 0; i < n; i++) {
            printArray(array[i]);
            System.out.println();
        }
    }
    public static void printArray(int[] array){
        int m = array.length;
        for (int j = 0; j < m; j++) {
            System.out.print(array[j] + " ");
        }
    }
}


