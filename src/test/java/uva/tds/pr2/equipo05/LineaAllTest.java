package uva.tds.pr2.equipo05;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
 
@RunWith(Suite.class)
@SuiteClasses({ 
    LineaUnitTDDTest.class,
    LineaIntegrationTDDTest.class,
    LineaBlackBoxTest.class,
    LineaGetParadasTest.class,
    LineaIsolationTest.class,
    LineaSecuenceTest.class})

/**
 * Suite de clases de test para todas las clases de test de Linea*
 * @author ismpere
 * @author martorb
 */
public class LineaAllTest {
 
}