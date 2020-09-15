package Aula_04_ADO1;

import static Aula_01_vetor.ex_04_inverter.exibeVetor;
import static Aula_01_vetor.ex_04_inverter.leInteiroPositivo;
import static Aula_01_vetor.ex_04_inverter.leVetorAleatorio;
import static Aula_04_ADO1.ex_06_exiberinterseccao.bubblesort;
import static Aula_04_ADO1.ex_06_exiberinterseccao.exibeInters2Vetores;

/**
 *
 * @author santa
 */
public class ex_08_intercalar {

    public static void main(String[] args) {

        int n = leInteiroPositivo();
        int A[] = leVetorAleatorio(n);
        exibeVetor(A);
        bubblesort(A);
        exibeVetor(A);

        int m = leInteiroPositivo();
        int B[] = leVetorAleatorio(n);
        bubblesort(B);
        exibeVetor(B);

        System.out.println("O vetor C com os elementos intercalados: ");
        exibeInters2Vetores(A, B);
    }

}
