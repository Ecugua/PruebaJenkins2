package Tests;

import com.mycompany.proyecto.Proyecto;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author josep
 */
public class ProyectoTest {
    private Proyecto proyecto;
    private Proyecto.CalculadoraAvanzada calc;
    
    @BeforeEach
    void setUp() {
        proyecto = new Proyecto();
        calc = proyecto.new CalculadoraAvanzada(); 
    } 
    @Test
    void testSumar() {
        assertEquals(8, calc.sumar(5,3));
        assertEquals(-2, calc.sumar(-5,3)); 
        assertEquals(4, calc.sumar(2,2));  //test no erroneo
    } 
    @Test
    void testRestar() {
        assertEquals(2, calc.restar(5, 3));
        assertEquals(-8, calc.restar(-5, 3));
    }
    @Test
    void testMultiplicar() {
        assertEquals(15, calc.multiplicar(5, 3));
        assertEquals(-15, calc.multiplicar(-5, 3));
        assertNotEquals(4, calc.multiplicar(5, 1)); //test no erroneo
    }
    @Test
    void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(5, 0));
    }
    @Test
    void testPromedio() {
        assertEquals(3.0, calc.promedio(new int[]{1, 2, 3, 6}), 1e-9);
        assertThrows(IllegalArgumentException.class, () -> calc.promedio(new int[]{}));
    }

    @Test
    void testEsPar() {
        assertTrue(calc.esPar(4));
        assertFalse(calc.esPar(5));//test no erroneo
    }
        
}
