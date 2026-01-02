package BasicPrograms;

public class FactorialRecusrion {

    public static void main(String[] args) {
        int num=15;
        System.out.println("Factorial is "+factorial(num));

    }

    public static int factorial(int n){
        if( n==0 ||n==1) {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
}
