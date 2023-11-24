public class ComputadorEstadoLigado extends ComputadorEstado{


    private ComputadorEstadoLigado() {};
    private static ComputadorEstadoLigado instance = new ComputadorEstadoLigado();

    public static ComputadorEstadoLigado getInstance(){
        return instance;
    }

    public String getEstado(){
        return "Computador ligado";
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
