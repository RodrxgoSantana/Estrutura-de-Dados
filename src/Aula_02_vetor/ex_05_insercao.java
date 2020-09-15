package Aula_02_vetor;

import static Aula_01_vetor.ex_04_inverter.exibeVetor;
import static Aula_01_vetor.ex_04_inverter.leInteiroPositivo;

/**
 *
 * @author santa
 */
public class ex_05_insercao {

    public static void main(String[] args) {
        int v[] = new int[30];
        int n = leInteiroPositivo();
        leVetorAleatorioTam(v, n);
        exibeVetorTam(v, n);
        exibeVetor(v);

        int novoN = insercao(v, n, 77, 5);
        
        exibeVetorTam(v, novoN);

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

    public static int insercao(int[] v, int n, int x, int pos) {
        for (int i = n; i < pos; i--) {
            v[i] = v[i-1];
        }
        v[pos] = x;
        return n+1;

    }

    

}
