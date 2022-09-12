package prjatividade1;
import java.util.Scanner;
 /* @author Mateus */
 
public class prjEx1 {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int qtdeVend, tipoPgto;
        double precUnit, valPagar;
        System.out.print("Digite a quantidade vendida do produto: ");
        qtdeVend = entrada.nextInt();//scanf("%d", &qtdeVend);
        System.out.print("Digite o preço unitário: ");
        precUnit = entrada.nextDouble();//scanf("%1f", &precUnit);
        System.out.print("Digite o tipo de pagamento: ");
        tipoPgto = entrada.nextInt();
        switch(tipoPgto)
        {
            case 1:
               precUnit = precUnit - (precUnit * 0.1);
               break;
               
            case 2:
               precUnit = precUnit - (precUnit * 0.05);
               break;
               
            case 3:
               precUnit = precUnit + (precUnit * 0.05);
               break;
               
            case 4:
               precUnit = precUnit + (precUnit * 0.1);
               break;
               
            default:
                System.out.print("Tipo de pagamento inválido, digite novamente: ");
                tipoPgto = entrada.nextInt();
               
        }
        
        valPagar = precUnit * qtdeVend;
        System.out.println("Valor a pagar R$ " + valPagar);
    }
    
}
