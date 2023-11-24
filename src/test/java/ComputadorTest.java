import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComputadorTest {
    Computador computador;

    @BeforeEach
    public void setUp(){
        computador = new Computador();
    }

    //Computador Ligado

    @Test
    public void computadorLigadoDeveReiniciar(){
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        computador.reiniciar();
        assertEquals(ComputadorEstadoReiniciado.getInstance(), computador.getEstado());
    }

    @Test
    public void computadorLigadoDeveSuspender(){
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        computador.suspender();
        assertEquals(ComputadorEstadoSuspenso.getInstance(), computador.getEstado());
    }

    @Test
    public void computadorLigadoDeveDesligar(){
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        computador.desligar();
        assertEquals(ComputadorEstadoDesligado.getInstance(), computador.getEstado());
    }

    @Test
    public void computadorLigadoNaoDeveLigar(){
        computador.setEstado(ComputadorEstadoLigado.getInstance());
        assertFalse(computador.ligar());
    }

    //Computador Desligado

    @Test
    public void computadorDesligadoDeveLigar(){
        computador.setEstado(ComputadorEstadoDesligado.getInstance());
        computador.ligar();
        assertEquals(ComputadorEstadoLigado.getInstance(), computador.getEstado());
    }

    @Test
    public void computadorDesligadoNaoDeveDesligar(){
        computador.setEstado(ComputadorEstadoDesligado.getInstance());
        assertFalse(computador.desligar());
    }

    @Test
    public void computadorDesligadoNaoDeveReiniciar(){
        computador.setEstado(ComputadorEstadoDesligado.getInstance());
        assertFalse(computador.reiniciar());
    }

    @Test
    public void computadorDesligadoNaoDeveSuspender(){
        computador.setEstado(ComputadorEstadoDesligado.getInstance());
        assertFalse(computador.suspender());
    }

    //Computador Reiniciado

    @Test
    public void computadorReiniciadoDeveReiniciar(){
        computador.setEstado(ComputadorEstadoReiniciado.getInstance());
        computador.reiniciar();
        assertEquals(ComputadorEstadoReiniciado.getInstance(), computador.getEstado());
    }

    @Test
    public void computadorReiniciadoDeveSuspender(){
        computador.setEstado(ComputadorEstadoReiniciado.getInstance());
        computador.suspender();
        assertEquals(ComputadorEstadoSuspenso.getInstance(), computador.getEstado());
    }

    @Test
    public void computadorReiniciadoDeveDesligar(){
        computador.setEstado(ComputadorEstadoReiniciado.getInstance());
        computador.desligar();
        assertEquals(ComputadorEstadoDesligado.getInstance(), computador.getEstado());
    }

    @Test
    public void computadorReiniciadoNaoDeveLigar(){
        computador.setEstado(ComputadorEstadoReiniciado.getInstance());
        assertFalse(computador.ligar());
    }

    // Computador Suspenso

    @Test
    public void computadorSuspensoNaoDeveReiniciar(){
        computador.setEstado(ComputadorEstadoSuspenso.getInstance());
        assertFalse(computador.reiniciar());
    }

    @Test
    public void computadorSuspensoNaoDeveDesligar(){
        computador.setEstado(ComputadorEstadoSuspenso.getInstance());
        assertFalse(computador.desligar());
    }

    @Test
    public void computadorSuspensoNaoDeveSuspender(){
        computador.setEstado(ComputadorEstadoSuspenso.getInstance());
        assertFalse(computador.suspender());
    }

    @Test
    public void computadorSuspensoDeveLigar(){
        computador.setEstado(ComputadorEstadoSuspenso.getInstance());
        computador.ligar();
        assertEquals(ComputadorEstadoLigado.getInstance(), computador.getEstado());
    }}
