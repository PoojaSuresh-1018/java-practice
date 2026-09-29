public class CountDigits {
    public static void main (String[] args){
        int number = -2065784768;
        int digits = 1;
        while(number/10 != 0){
            digits +=  1;
            number /= 10;
        }
        System.out.println("The numder of digits is " + digits);
    
    }
  
}
