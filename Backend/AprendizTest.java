package Backend;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AprendizTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AprendizTest
{
    private Aprendiz aprendiz1;

    /**
     * Default constructor for test class AprendizTest
     */
    public AprendizTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        aprendiz1 = new Aprendiz("TestUser", "1234", "email@domain.com", "Pepito", "Perez", "1/01/1810", "3005523123", "Los Angeles", "Fake st23", true, 3);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void CrearAprendizDePrueba()
    {
        Aprendiz aprendiz1 = new Aprendiz
        ("TestAprendiz",
        "password",
        "email@domain.com",
        "Henry",
        "Peña",
        "5 de enero de 1999",
        "3013458764",
        "Bucaramanga",
        "cra falsa #1234",
        true,
        3);
        
        assertEquals("Peña", aprendiz1.getApellido());        
        assertEquals("email@domain.com", aprendiz1.getEmail());
        assertEquals("Henry", aprendiz1.getNombre());
        assertEquals("TestAprendiz", aprendiz1.getNombreUsuario());
        assertEquals(3.0, aprendiz1.getReputacion(), 0.1);
    }
    
    @Test
    public void ReputacionMaximaAprendiz()
    {        
        assertEquals(3.0, aprendiz1.verificarRep(23), 0.1);
        assertEquals(0, aprendiz1.verificarRep(-5), 0.1);
    }

    
}


