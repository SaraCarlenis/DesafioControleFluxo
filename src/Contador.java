import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o primeiro parãmetro: ");
        int parametroUm = terminal.nextInt();
        
        System.out.println("Digite o segundo parãmetro: ");
        int parametroDois = terminal.nextInt();
        
        terminal.close();
        
        try {
            if(parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parãmetro deve ser maior que o primeiro.");
            } 
            
            for (int i=1; i <= parametroDois - parametroUm; i++) {
                System.out.println("Imprimindo número " + i);
            }

        } catch(ParametrosInvalidosException exception) {

            System.out.println(exception.getMessage());
        }

    }
}