package br.com.fiap.teste;

import br.com.fiap.beans.Elevador;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElevadorTest {

    Elevador el = new Elevador(1, 200, 0, false);

    @Test
    public void testAlertMais() {
        boolean alert = el.valiarPeso(300);
        assertEquals(alert, true);
    }

    @Test
    public void testAlertIgual() {
        boolean alert = el.valiarPeso(200);
        assertEquals(alert, true);
    }

    @Test
    public void testAlertMenos() {
        boolean alert = el.valiarPeso(50);
        assertEquals(alert, true);
    }

    @Test
    public void tesetEntrar() {
        double atual = el.entrarNoElevador(10);
        assertEquals(atual, 10, 0);
    }
}