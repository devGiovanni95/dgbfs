package modelo.heranca;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("AB")
public class AlunoBolsista2 extends Aluno2{

    private double valorBolsa;

    public AlunoBolsista2() {
    }

    public AlunoBolsista2(double bolsa) {
        this.valorBolsa = bolsa;
    }

    public AlunoBolsista2(Long matricula, String nome, double valorBolsa) {
        super(matricula, nome);
        this.valorBolsa = valorBolsa;
    }

    public double getValorBolsa() {
        return valorBolsa;
    }

    public void setValorBolsa(double valorBolsa) {
        this.valorBolsa = valorBolsa;
    }
}
