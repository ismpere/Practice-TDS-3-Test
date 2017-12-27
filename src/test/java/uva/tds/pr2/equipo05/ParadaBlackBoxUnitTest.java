package uva.tds.pr2.equipo05;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
/**
 * Implementacion de la clase de test de caja negra de la clase Parada
 * @author ismpere
 * @author martorb
 */
@Category({Unit.class})
public class ParadaBlackBoxUnitTest {
	
	private static final double ERROR_ADMISIBLE = 0.01;
	private GD gd1;
	private Parada p1;
	
	@Before
    public void setUp() throws Exception {
        gd1 = new GD (-179.99,179.99);
    }
     
    @After
    public void tearDown() throws Exception {
        gd1 = null;
        p1 = null;
    }
    
    @Test
	public void testInicializaParadaIdGrandeValido() {
		p1 = new Parada("CincoCincoCincoCincoCincoCincoCincoCincoCincoCinco", gd1);
		
		assertNotNull(p1);
		assertEquals("CincoCincoCincoCincoCincoCincoCincoCincoCincoCinco",p1.getId());
		assertEquals(gd1,p1.getGD());
	}
    
    @Test
	public void testSetIdValidoIdGrande() {
		p1 = new Parada("a", gd1);
		
		p1.setId("CincoCincoCincoCincoCincoCincoCincoCincoCincoCinco");
		
		assertNotNull(p1);
		assertEquals("CincoCincoCincoCincoCincoCincoCincoCincoCincoCinco",p1.getId());
		assertEquals(gd1,p1.getGD());
	}
    
    @Test
	public void testNoHayParadasRepetidasNingunaRepetidaValido(){
		p1 = new Parada("a", gd1);
		GD gd2 = new GD(179.99, -179.99);
		Parada p2 = new Parada("b", gd2);
		
		Parada p3[] = {p1, p2};
		
		boolean repetidas = Parada.existeAlgunaParadaRepetida(p3);
		
		assertNotNull(p1);
		assertNotNull(p2);
		assertFalse(repetidas);
	}
    
    @Test
	public void testNoHayParadasRepetidasListaVaciaValido(){
		Parada p3[] = {};
		
		boolean repetidas = Parada.existeAlgunaParadaRepetida(p3);
		
		assertFalse(repetidas);
	}
    
    @Test
	public void testNoHayParadasRepetidasUnaParadaValido(){
    	p1 = new Parada("a", gd1);
		Parada p3[] = {p1};
		
		boolean repetidas = Parada.existeAlgunaParadaRepetida(p3);
		
		assertFalse(repetidas);
	}
    
    @Test
	public void testHayParadasRepetidasMismoGDValido(){
    	p1 = new Parada("a", gd1);
    	Parada p2 = new Parada("b", gd1);
		Parada p3[] = {p1,p2};
		
		boolean repetidas = Parada.existeAlgunaParadaRepetida(p3);
		
		assertNotNull(p2);
		assertTrue(repetidas);
	}
    
    @Test
	public void testCalculaDistanciaEntreParadasValidoParadaThis(){
		p1 = new Parada("a", gd1);
		
		double distancia = p1.getDistanciaEntre(p1);
		
		assertNotNull(p1);
		assertEquals(0.00, distancia, ERROR_ADMISIBLE); 
	}
    
    @Test
    public void testEqualsParadaValidoParadasIguales(){
    	p1 = new Parada("a", gd1);
    	Parada p2 = new Parada("b", gd1);
    	
    	boolean iguales = p1.equals(p2);
    	
    	assertNotNull(p1);
    	assertNotNull(p2);
    	assertTrue(iguales);
    }
    
    @Test
    public void testEqualsParadaValidoParadasDiferentes(){
    	p1 = new Parada("a", gd1);
    	GD gd2 = new GD(179.99, -179.99);
    	Parada p2 = new Parada("b", gd2);
    	
    	boolean iguales = p1.equals(p2);
    	
    	assertNotNull(p1);
    	assertNotNull(p2);
    	assertFalse(iguales);
    }
    
    @Test
    public void testEqualsParadaValidoParadaThis(){
    	p1 = new Parada("a", gd1);
    	
    	boolean iguales = p1.equals(p1);
    	
    	assertNotNull(p1);
    	assertTrue(iguales);
    }
    
    @Test
    public void testEqualsParadaValidoParadaNull(){
    	p1 = new Parada("a", gd1);
    	
    	boolean iguales = p1.equals(null);
    	
    	assertNotNull(p1);
    	assertFalse(iguales);
    }
    
    @Test
    public void testEqualsParadaValidoNoEsUnaParada(){
    	p1 = new Parada("a", gd1);
    	
    	boolean iguales = p1.equals(gd1);
    	
    	assertNotNull(p1);
    	assertFalse(iguales);
    }

	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoIdVacio(){
		p1 = new Parada("", gd1);
	}
	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoIdGrande(){
		p1 = new Parada("CincoCincoCincoCincoCincoCincoCincoCincoCincoCinco+", gd1);
	}
	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoIdNulo(){
		p1 = new Parada(null, gd1);
	}
	@Test(expected = AssertionError.class)
	public void testInicializaParadaNoValidoGDNulo(){
		p1 = new Parada("a", null);
	}
	@Test(expected = AssertionError.class)
	public void testCalculaDistanciaEntreParadasNoValidoParadaNulo(){
		p1 = new Parada("a", gd1);
		Parada p2 = null;
		
		p1.getDistanciaEntre(p2);
	}
	@Test(expected = AssertionError.class)
	public void testSetIdNoValidoIdVacio(){
		p1 = new Parada("a", gd1);
		p1.setId("");
	}
	@Test(expected = AssertionError.class)
	public void testSetIdNoValidoIdGrande(){
		p1 = new Parada("a", gd1);
		p1.setId("CincoCincoCincoCincoCincoCincoCincoCincoCincoCinco+");
	}
	@Test(expected = AssertionError.class)
	public void testSetIdNoValidoIdNulo(){
		p1 = new Parada("a", gd1);
		p1.setId(null);
	}
	@Test(expected = AssertionError.class)
	public void testSetGDNoValidoGDNulo(){
		p1 = new Parada("1", gd1);
		
		p1.setGD(null);
	}
	@Test(expected = AssertionError.class)
	public void testExistenParadasIgualesNoValidoParadasNulo(){
		
		Parada.existeAlgunaParadaRepetida(null);
	}
	@Test(expected = AssertionError.class)
	public void testExistenParadasIgualesNoValidoUnaParadaNulo(){
		Parada pa2[] = {null};
		
		Parada.existeAlgunaParadaRepetida(pa2);
	}
	@Test(expected = AssertionError.class)
	public void testExistenParadasIgualesNoValidoAlgunaParadaNulo(){
		Parada pa2[] = {p1, null};
		
		Parada.existeAlgunaParadaRepetida(pa2);
	}
}
