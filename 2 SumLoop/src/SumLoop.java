import java.util.ArrayList;
import java.util.Scanner;

public class SumLoop {
    static Integer numCount = 0;
    static Integer sumRes = 0;
    static ArrayList<Integer> numbersList = new ArrayList<>();

    public static void main(String args[]){
        //Получаем количество чисел, которые необходимо сложить
        numCount = GetNumber(0, 0, null);
        //Наполняем массив
        numbersList = FillArrayNumbers();
        //Суммируем все элементы
        sumRes = SumNumbers();
        //Выводим результат на экран
        PrintRes();
    }

    //Метод заполнения цифрами массива для подсчёта чисел
    static ArrayList<Integer> FillArrayNumbers(){
        ArrayList<Integer> numList = new ArrayList<>();
        Integer number = 0;
        for (int i =0; i < numCount; i++){
            number = GetNumber(1, number, i);
            numList.add(number);
        }
        return numList;
    }




    //Метод для считывания числа с клавиатуры
    static Integer GetNumber(Integer mode,Integer num, Integer idNum){
        if (mode == 0){
            System.out.println("Please, input count of array number and press \"Enter\"");
        }else{
            idNum++;
            System.out.println("Please, input number " + idNum + " of " + numCount + " and press \"Enter\"");
        }
        Scanner scanner = new Scanner(System.in);
        try{
            num = scanner.nextInt();
        }catch (Exception e){
            scanner.close();
            e.printStackTrace();
        }
        return num;
    }



    static Integer SumNumbers(){
        try{
            for (int i = 0; i < numbersList.size(); i++){
                sumRes += numbersList.get(i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return sumRes;
    }

    static void PrintRes(){
        System.out.print("Your answer: ");
        System.out.println(sumRes);
    }
}
