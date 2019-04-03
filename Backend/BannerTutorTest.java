
package Backend;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BannerTutorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BannerTutorTest
{
    private Tutor tutor1;

    /**
     * Default constructor for test class BannerTutorTest
     */
    public BannerTutorTest()
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
        tutor1 = new Tutor("TestTutor", "password", "email@domain.com", "Douglas", "Ramirez", "22 de enero de 1999", "3004562345", "Bucaramana", "Cra falsa #321", true, 3, "no tengo", 12, 6, 10000, "UIS", "documento.pdf");
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
    public void CrearBannerTutor()
    {
        BannerTutor bannerTu1 = new BannerTutor
        ("Fisica",
        "Mecánica",
        "dinámica",
        "14/02/2019",
        "UIS-Laboratorios Pésados",
        tutor1);
        
        assertNotNull(bannerTu1.getAutor());
        assertEquals( "14/02/2019", bannerTu1.getFecha());
        assertEquals("UIS-Laboratorios Pésados", bannerTu1.getLugar());
        assertEquals("Fisica", bannerTu1.getMateria());
        assertEquals("Mecánica", bannerTu1.getRama());
        assertEquals("dinámica", bannerTu1.getTema());
    }
}

