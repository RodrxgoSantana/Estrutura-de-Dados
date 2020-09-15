package Aula_02_vetor;

import static Aula_01_vetor.ex_04_inverter.exibeVetor;
import static Aula_01_vetor.ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.ex_04_inverter.leVetorAleatorio;
import static Aula_02_vetor.ex_05_insercao.exibeVetorTam;
import static Aula_01_vetor.ex_01_buscaLinear.buscaLinear;

/**
 *
 * @author santa
 */
public class ex_08_interseccao {

    public static void main(String[] args) {

        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);

        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n2);
        exibeVetor(v2);

        int inter[] = new int[n1];

        int n3 = inter2Vetores(v1, v2, inter);

        exibeVetor(inter);
        exibeVetorTam(inter, n3);

    }

    public static int inter2Vetores(int[] v1, int[] v2, int[] inter) {
        int k = 0;

        for (int i = 0; i < v1.length; i++) {

            if (buscaLinear(v2, v1[i])) {
                inter[k] = v1[i];
                k++;
            }

        }
        return k;
    }

}
