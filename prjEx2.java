package prjatividade1;

import java.util.Scanner;

/* @author Mateus */
public class prjEx2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numPlaca, horaEntrada, horaSaida, contador;
        double valPagar, valTotal = 0;
        System.out.print("Digite o número da placa: ");
        numPlaca = entrada.nextInt();
        while (numPlaca != 0) {
            System.out.print("Digite a hora de entrada: ");
            horaEntrada = entrada.nextInt();
            System.out.print("Digite a hora de saída: ");
            horaSaida = entrada.nextInt();
            contador = (horaSaida - horaEntrada);
            if (contador < 100) {
                valPagar = (contador / 15) * 1.5;
            } else {
                valPagar = (contador / 100) * 6;
                contador = contador - (contador/100) * 100;
                valPagar += contador/15 * 1.5;
            }
            
            valTotal+= valPagar;
            System.out.println("Valor a pagar pelo carro de placa " + numPlaca + ": R$" + valPagar);
            System.out.print("Digite o número da placa: ");
            numPlaca = entrada.nextInt();
        }
        System.out.println("Valor total faturado: R$" + valTotal);
    }

}
