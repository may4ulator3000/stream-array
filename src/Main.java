import java.util.Arrays;
import java.util.stream.Stream;

//1 дан массив целых чисел. Определить
//    количество четных элементов
//    сумму массива
//    сумму первых трех элементов
//    сумму первых трех элементов которые делятя на 3

public class Main {
    public static void main(String[] args) {
        int[] arr = {6, 9, 8, 4, 3, 16, 456, 45};

        long even = Arrays.stream(arr).filter(n -> n % 2 == 0).count();
        System.out.println("***\n" + "количество четных элементов = " + even);

        int sum = Arrays.stream(arr).sum();
        System.out.println("***\n" + "сумма массива = " + sum);

        int sumFirst3 = Arrays.stream(arr).limit(3).sum();
        System.out.println("***\n" + "сумма певых трех элементов = " + sumFirst3);

        int sumDivisible3 = Arrays.stream(arr).filter(n -> n % 3 == 0).limit(3).sum();
        System.out.println("***\n" + "сумма певых трех элементов %3 = " + sumDivisible3);
    }
}