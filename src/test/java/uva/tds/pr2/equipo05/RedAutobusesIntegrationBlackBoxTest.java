package uva.tds.pr2.equipo05;
 
import static org.junit.Assert.*;
 
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
 
@Category({Integration.class})
public class RedAutobusesIntegrationBlackBoxTest {
   
    private GD gd1 = new GD (41.3154608,-4.9177346);
    private GD gd2 = new GD (41.3142809,-4.9189326);
    private GD gd3 = new GD (41.3153508,-4.9176232);
    private GD gd4 = new GD (41.308344,-4.9180686);
    private GD gd5 = new GD (41.3123926,-4.9176796);
    private GD gd6 = new GD (41.3078393, -4.9181145);
   
    private Parada p1 = new Parada("a",gd1);
    private Parada p2 = new Parada("b",gd2);
    private Parada p3 = new Parada("c",gd3);
    private Parada p4 = new Parada("d", gd4);
    private Parada p5 = new Parada("e", gd5);
    private Parada p6 = new Parada("f", gd6);
   
    private Parada p_1[] = {p1,p2,p3};
    private Parada p_2[] = {p4,p5,p6};
   
    private Linea l1, l2;
   
    @Before
    public void setUp() throws Exception {
       
        l1= new Linea(1,p_1);
        l2= new Linea(2,p_2);
    }
   
    @After
    public void tearDown() throws Exception{
        l1= null;
        l2= null;
    }
 
    @Test (expected = AssertionError.class)
    public void testAddLineaNoValidoLineaRepetida() {
       
        Linea[] lista_lineas={l1,l2};
        RedAutobuses red= new RedAutobuses(lista_lineas);
        red.addLinea(l1);
    }
   
    @Test (expected = AssertionError.class)
    public void testDeleteLineaNoValidoLineaNoExisteEnRed() {
       
        GD gd4 = new GD(-100.00, 100.00);  
        GD gd5 = new GD(-100.0002, 100.00);
        GD gd6 = new GD(-100.00001, 100.00);
        Parada p4 = new Parada("d", gd4);
        Parada p5 = new Parada("d", gd5);
        Parada p6 = new Parada("d", gd6);
       
        Parada pa3[] = {p4, p5, p6};
        Linea l3 = new Linea(2, pa3);
       
        Linea[] lista_lineas={l1,l2};
        RedAutobuses red= new RedAutobuses(lista_lineas);
        red.deleteLinea(l3);
    }
 
}