

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TutorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TutorTest
{
    /**
     * Default constructor for test class TutorTest
     */
    public TutorTest()
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
    public void CrearTutordePrueba()
    {
        Tutor tutor1 = new Tutor(
        "TestTutor",
        "password",
        "email@domain.com",
        "Douglas",
        "Ramirez",
        "22 de enero de 1999",
        "3005432575",
        "Bucaramanga",
        "carrera falsa #321",
        true,
        3,
        "no tengo",
        12,
        8,
        20000,
        "Uis",
        "documento.pdf");
        
        assertEquals("Ramirez", tutor1.getApellido());
        assertEquals("email@domain.com", tutor1.getEmail());
        assertEquals("Douglas", tutor1.getNombre());
        assertEquals("TestTutor", tutor1.getNombreUsuario());
        assertEquals(3.0, tutor1.getReputacion(), 0.1);
        assertEquals("Uis", tutor1.getInstitucion());
    }
}

