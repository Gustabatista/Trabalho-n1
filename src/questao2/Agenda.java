package questao2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import questao1.Pessoa;

public class Agenda {

    ArrayList<Pessoa> pessoa = new ArrayList<>();

    public void armazenaPessoa() {

        Scanner scan = new Scanner(System.in);
        Pessoa npessoa = new Pessoa();

        System.out.println("Digite o nome da pessoa");
        String kk = scan.nextLine();
        npessoa.setNome(kk);

        System.out.println("Digite a altura da pessoa");
        float kk2 = scan.nextFloat();
        npessoa.setAltura(kk2);

        System.out.println("Digite o dia de nascimento da pessoa");
        int dia = scan.nextInt();
        System.out.println("Digite o mês de nascimento da pessoa");
        int mes = scan.nextInt();
        System.out.println("Digite o ano de nascimento da pessoa");
        int ano = scan.nextInt();
        LocalDate haha = LocalDate.of(ano, mes, dia);
        npessoa.setDt_nasc(haha);

        pessoa.add(npessoa);
    }

    public void removerpessoa() {

        System.out.println("Para remover uma pessoa da lista, digite o index da mesma");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        pessoa.remove(index);

    }

    public void imprimeagenda() {
        for (int i = 0; i < pessoa.size(); i++) {
            System.out.println(pessoa.get(i));

        }
    }

    public void imprimepessoa() {
        System.out.println("Para visualizar uma pessoa na lista, digite o index da mesma(comeca pelo 0)");
        Scanner scan = new Scanner(System.in);

        int index = scan.nextInt();
        int i = index;

        System.out.println(pessoa.get(i));
    }

}
