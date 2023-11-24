public class ComputadorEstadoDesligado extends ComputadorEstado{

    private ComputadorEstadoDesligado() {};

    private static ComputadorEstadoDesligado instance = new ComputadorEstadoDesligado();

    public String getEstado(){
        return "Computador desligado";
    }

    public static ComputadorEstadoDesligado getInstance(){
        return instance;
    }

    public boolean ligar(Computador computador){
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        return true;
    }

}
