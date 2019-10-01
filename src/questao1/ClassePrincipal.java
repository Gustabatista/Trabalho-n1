package questao1;

import java.time.LocalDate;
import java.util.Scanner;
import questao2.Agenda;
import questao3.Elevador;
import questao4.FrameControle;

public class ClassePrincipal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("DIGITE A QUESTÃO DESEJADA PARA TESTAR");
        int q = scan.nextInt();

        switch (q) {
            case 1:
                // questao 1
                Pessoa p1 = new Pessoa();
                p1.setNome("Samuel");
                p1.setAltura((float) 1.70);
                LocalDate data = LocalDate.of(2003, 10, 18);
                p1.setDt_nasc(data);

                System.out.println(p1);

                break;
            case 2:

                Agenda ag = new Agenda();

                
                
                boolean soc = true;

                while (soc) {
                    System.out.println("Digite a função desejada \n 1 - Armazenar pessoa na lista \n 2 - Remover pessoa "
                        + "da lista \n 3 - Listar todos \n 4 - Procurar pessoa por index \n 5 - Sair");
                    int f = scan.nextInt();
                    switch (f) {
                        case 1:
                            ag.armazenaPessoa();
                            break;
                        case 2:
                            ag.removerpessoa();
                            break;
                        case 3:
                            ag.imprimeagenda();
                            break;
                        case 4:
                            ag.imprimepessoa();
                            break;
                        case 5:
                            soc = false;
                            break;

                        default:
                            System.out.println("NUMERO INVALIDO");
                            break;
                    }
                }

                break;
            case 3:
                // questao 3
                Elevador nElevador = new Elevador();

                nElevador.setTotalandar(10);
                nElevador.setCapacidade(6);

                nElevador.inicializar();

                nElevador.entra();
                nElevador.entra();
                nElevador.sobe();
                nElevador.sobe();
                nElevador.desce();

                System.out.println(nElevador);

                break;
            case 4:
                // questao 4

                FrameControle fm = new FrameControle();
                new FrameControle().setVisible(true);

                break;
            default:

                System.out.println("QUESTAO INVALIDA TCHAU");
                break;
        }
    }

    
}
