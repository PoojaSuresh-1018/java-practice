import java.util.Arrays;

public class MinMaxLoop {
    public static void main (String[] args){
        int[] arr = {-10, 20, 30, 40, 50, 60, 70, 80, 90, -100};
        System.out.println(Arrays.toString(arr));
        int size = arr.length;
        int minimum = arr[0]; int maximum = arr[0]; int num; int i = 0;
        
            do {
                num = arr[i];
                if(num < minimum){
                    minimum = num;
                }
                if (num > maximum) {
                    maximum = num;
                }
                i++;
            } while (i < size);
            System.out.println("Minimum = "+ minimum +"\nMaximum = "+maximum);
        }
        
    }

