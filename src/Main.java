import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        System.out.println("Задача1");
        int[] number = new int [3];
        number[0] = 1;
        int numberOne = number[0];
        System.out.println(numberOne);
        number[1] = 2;
        int numberTwo = number[1];
        System.out.println(numberTwo);
        number[2] = 3;
        int numberThree = number[2];
        System.out.println(numberThree);

        double [] fraction = {1.57, 7.654, 9.986};
        System.out.println(fraction[0]);
        System.out.println(fraction[1]);
        System.out.println(fraction[2]);

        double [] numberPi = {1};
        numberPi [0] = 3.1415926535;
        System.out.println(numberPi[0]);
    }
    public static void task2(){
        System.out.println("Задача2");
        int[] number = new int [3];
        number[0] = 1;
        int numberOne = number[0];
        number[1] = 2;
        int numberTwo = number[1];
        number[2] = 3;
        int numberThree = number[2];
        System.out.println(numberOne+ ", " +numberTwo+ ", " +numberThree);

        double [] fraction = {1.57, 7.654, 9.986};
        System.out.println(fraction[0] +", "+ fraction[1] +", "+ fraction[2]);

        double [] numberPi = {1};
        numberPi [0] = 3.1415926535;
        System.out.println(numberPi[0]);
        
    }
    public static void task3(){
        System.out.println("Задача3");
        int[] number = new int [3];
        number[2] = 1;
        int numberOne = number[2];
        number[1] = 2;
        int numberTwo = number[1];
        number[0] = 3;
        int numberThree = number[0];
        System.out.println(numberThree+ ", " +numberTwo+ ", " +numberOne);

        double [] fraction = {1.57, 7.654, 9.986};
        System.out.println(fraction[2] +", "+ fraction[1] +", "+ fraction[0]);

        double [] numberPi = {1};
        numberPi [0] = 3.1415926535;
        System.out.println(numberPi[0]);
    }
    public static void task4(){
        System.out.println("Задача4");
        int [] numbers = {1, 2, 3};
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] != 2){
            numbers[i]=numbers[i]+1;
            System.out.println(numbers[i]);}
        }
    }
}