public class Computador {

    private String nome;
    private ComputadorEstado computadorEstado;

    public void setEstado(ComputadorEstado estado) {
        this.computadorEstado = estado;
    }

    public boolean ligar() {
        return computadorEstado.ligar(this);
    }

    public boolean desligar() {
        return computadorEstado.desligar(this);
    }

    public boolean reiniciar() {
        return computadorEstado.reiniciar(this);
    }

    public boolean suspender() {
        return computadorEstado.suspender(this);
    }

    public ComputadorEstado getEstado() {
        return computadorEstado;
    }
}

