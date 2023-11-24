public class ComputadorEstadoReiniciado extends ComputadorEstado{

    private ComputadorEstadoReiniciado() {};
    private static ComputadorEstadoReiniciado instance = new ComputadorEstadoReiniciado();

    public static ComputadorEstadoReiniciado getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Computador reiniciado";
    }

    public boolean desligar(Computador computador) {
        computador.setEstado(ComputadorEstadoDesligado.getInstance());
        return true;
    }

    public boolean reiniciar(Computador computador) {
        computador.setEstado(ComputadorEstadoReiniciado.getInstance());
        return true;
    }

    public boolean suspender(Computador computador) {
        computador.setEstado(ComputadorEstadoSuspenso.getInstance());
        return true;
    }
}
