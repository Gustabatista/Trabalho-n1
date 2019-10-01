package questao3;

public class Elevador {

    int andar;
    int totalandar;
    int capacidade;
    int pessoas;

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getTotalandar() {
        return totalandar;
    }

    public void setTotalandar(int totalandar) {
        this.totalandar = totalandar;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoas() {
        return pessoas;
    }

    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }

    public void inicializar() {
        this.andar = 0;
        this.pessoas=0;
    }

    public void entra() {

        if (this.capacidade > this.pessoas) {

            this.pessoas = 1 + this.pessoas;

        }

    }

    public void sai() {

        if (this.pessoas != 0) {

            this.pessoas = this.pessoas - 1;
        }

    }

    public void sobe() {

        if (this.andar < this.totalandar) {

            this.andar = this.andar + 1;
        }
    }

    public void desce() {

        if (this.andar < this.totalandar) {

            this.andar = this.andar - 1;
        }
    }

    @Override
    public String toString() {
        return "Elevador{" + "Andar Atual = " + andar + ", Total de Andares = " + totalandar + ", Capacidade = " + capacidade + ", Pessoas = " + pessoas + '}';
    }
    
    

}
