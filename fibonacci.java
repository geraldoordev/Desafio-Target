import java.util.Scanner;

public class fibonacci {

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe um numero: ");
    int num = sc.nextInt();
    
    if(verificaFibonacci(num)){
        System.out.println("Pertence a sequencia Fibonacci");
    } else{
        System.out.println("Não pertence a sequencia Fibonacci");
    }
 }

 public static boolean verificaFibonacci(int num){
    if (num == 0 || num == 1) {
        return true; 
    }
    
    int a = 0, b = 1;
    int fib = a + b;
    
    while (fib <= num) {
        if (fib == num) {
            return true; 
        }
        a = b;
        b = fib;
        fib = a + b;
    }
    
    return false; 
 }
    
 } 