public class Quarto {

    private int numero;
    private boolean ocupado;
    private Hospede hospede;

    public Quarto(int numero) {
        this.numero = numero;
        this.ocupado = false;
        this.hospede = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void fazerCheckIn(Hospede hospede) {
        this.hospede = hospede;
        this.ocupado = true;
    }

    public void fazerCheckOut() {
        this.hospede = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {

        if (ocupado) {
            return "Quarto " + numero + " - Ocupado por " + hospede.getNome();
        } else {
            return "Quarto " + numero + " - Disponível";
        }
    }
}
