import java.util.Scanner;

public class contaLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe uma string para contagem: ");
        String sc = scanner.nextLine();
        
        int count = 0;
        
        String minSc = sc.toLowerCase();
        
        for (int i = 0; i < minSc.length(); i++) {
            if (minSc.charAt(i) == 'a') {
                count++;
            }
        }
        
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
        
        scanner.close();
    }
}
