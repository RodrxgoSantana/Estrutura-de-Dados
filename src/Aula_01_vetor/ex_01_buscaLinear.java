package Aula_01_vetor;

import static Aula_01_vetor.ex_04_inverter.exibeVetor;
import static Aula_01_vetor.ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.ex_04_inverter.leVetorAleatorio;

import java.util.Scanner;

/**
 *
 * @author santa
 */
public class ex_01_buscaLinear {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = leInteiroPositivo();
        int vetor[] = leVetorAleatorio(n);
        exibeVetor(vetor);

        System.out.println("Digite o número que deseja buscar");
        int x = entrada.nextInt();

        if (buscaLinear(vetor, x)) {
            System.out.println("está no vetor");
        } else {
            System.out.println("NÃO está no vetor");
        }

    }

    public static boolean buscaLinear(int[] vetor, int x) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                return true;

            }

        }
        return false;
    }
}
