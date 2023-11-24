public class ComputadorEstadoSuspenso extends ComputadorEstado{

    private ComputadorEstadoSuspenso() {};
    private static ComputadorEstadoSuspenso instance = new ComputadorEstadoSuspenso();

    public static ComputadorEstadoSuspenso getInstance() {
        return instance;
    }

    public String getEstado(){
        return "Computador suspenso";
    }

    public boolean ligar(Computador computador) {
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        return true;
    }
}
