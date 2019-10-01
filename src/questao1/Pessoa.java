package questao1;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dt_nasc;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(LocalDate dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Dados pessoais :\n" + "Nome : " + this.getNome() + ", \nData de nascimento : " + this.getDt_nasc() + ","
                + " \nAltura : " + this.getAltura() + ", \nIdade : " + this.calculoIdade()  ;
    }

    public int calculoIdade() {
        int idade = 0;
        LocalDate hoje = LocalDate.now();
        if (this.dt_nasc != null) {
            idade = Period.between(this.dt_nasc, hoje).getYears();
        }
        return idade;
    }
}