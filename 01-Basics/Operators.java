public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
      
        System.out.println("Arithmetic Operators:");
        System.out.println(a + b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("Comparison Operators:");
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a!=b);

        System.out.println("Logical Operators:");
        System.out.println(a<b && a!=b);
        System.out.println(a>b && a!=b);
        System.out.println(a>=b || a>=5);

        System.out.println("Unary Operators:");
        System.out.println(a++);
        System.out.println("a = " + a);
        System.out.println("b = " + --b);
        
        System.out.println("Assignment Operators:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + 10 = " + (a+=10));
        System.out.println("b * 2 = " + (b*=2));
        System.out.println("b = "+ b +"\nb - 2 = " + (b-=2));
        
        System.out.println("Ternary Operator:");
        int age = 18;
        String result = age>=18 ? "You are an adult." : "You are not an adult.";
        System.out.println(result);
    }
    
}
