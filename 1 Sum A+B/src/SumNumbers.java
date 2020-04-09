import java.util.ArrayList;
import java.util.Scanner;

public class SumNumbers {

    public static void main(String args[]){
        Integer num1 = 0;
        Integer num2 = 0;
        Integer sumRes = 0;
        num1 = GetNumber("A", num1);
        num2 = GetNumber("B", num2);
        sumRes = SumNumbers(num1, num2, sumRes);
        System.out.println("Your answer");
        System.out.println(sumRes);
    }

    static Integer GetNumber(String nameNum, Integer num){
        System.out.println("Please, input number " + nameNum + " and press \"Enter\"");
        Scanner scanner = new Scanner(System.in);
        try{
            num = scanner.nextInt();
        }catch (Exception e){
            scanner.close();
            e.printStackTrace();
        }

        return num;
    }

    static Integer SumNumbers(Integer num1, Integer num2, Integer sumRes){
        try{
            sumRes = num1 + num2;
        }catch (Exception e){
            e.printStackTrace();
        }
        return sumRes;
    }

}
