public abstract class ComputadorEstado {

    public abstract String getEstado();

    public boolean ligar(Computador computador){
        return false;
    }

    public boolean desligar(Computador computador){
        return false;
    }

    public boolean reiniciar(Computador computador){
        return false;
    }

    public boolean suspender(Computador computador){
        return false;
    }
}
