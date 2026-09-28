import java.util.Arrays;

public class ArraySum {
    public static void main (String[] args){
    int [] numbers = {39, 44, 2, 89 , 60};
    System.out.println("Array elements "+Arrays.toString(numbers));
    int size = numbers.length;
    int sum = 0;
    int i = 0;
    while(i<size){
        sum = sum + numbers[i];
        i++;
    }
    System.out.println("The sum of array is "+ sum);
    }
}
