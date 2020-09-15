package Aula_02_vetor;

import static Aula_01_vetor.ex_04_inverter.exibeVetor;
import static Aula_01_vetor.ex_04_inverter.leInteiroPositivo;
import java.util.Scanner;

/**
 *
 * @author santa
 */
public class ex_06_remocao {

    public static void main(String[] args) {
        int v[] = new int[30];
        int n = leInteiroPositivo();
        leVetorAleatorioTam(v, n);
        exibeVetorTam(v, n);
        exibeVetor(v);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número que deseja remover: ");
        int x = entrada.nextInt();

        int pos = buscaLinearTam(v, n, x);

        if (pos != -1) {
            int novoN = remocao(v, n, pos);
            exibeVetorTam(v, novoN);
        } else {
            System.out.println("o valor não está no vetor");
        }

    }

    public static void leVetorAleatorioTam(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            v[i] = (int) (Math.random() * 50);
        }
    }

    public static void exibeVetorTam(int[] v, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(v[i] + "");
        }
        System.out.println("");
    }

    public static int remocao(int[] v, int n, int pos) {
        for (int i = n; i <= n; i++) {
            v[i] = v[i + 1];
        }
        return n - 1;

    }

    public static int buscaLinearTam(int[] v, int n, int x) {
        for (int i = 0; i <= n; i++) {
            if (v[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
