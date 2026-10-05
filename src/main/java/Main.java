
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] lista;
        String linha;
        int controle, num, total = 0, totalc = 0, totalr = 0, totals = 0;
        double cemc, cemr, cems;
        char tipocobaia;
        
        controle = leia.nextInt();
        leia.nextLine();

        for (int i = 0; i < controle; i++) {
            linha = leia.nextLine();
            lista = linha.split(" ");
            num = Integer.parseInt(lista[0]);
            tipocobaia = lista[1].charAt(0);
            
            total += num;
            
            if (tipocobaia == 'C') {
                totalc += num;
            } else if (tipocobaia == 'R') {
                totalr += num;
            } else if (tipocobaia == 'S') {
                totals += num;
            }
        }
        
        cemc = ((double) totalc / total ) * 100;
        cemr = ((double) totalr / total) * 100;
        cems = ((double) totals / total) * 100;
        
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + totalc);
        System.out.println("Total de ratos: " + totalr);
        System.out.println("Total de sapos: " + totals);
        System.out.printf("Percentual de coelhos: %.2f %%\n", cemc);
        System.out.printf("Percentual de ratos: %.2f %%\n", cemr);
        System.out.printf("Percentual de sapos: %.2f %%\n", cems);
        
    }
}
