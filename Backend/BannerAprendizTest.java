
package Backend;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BannerAprendizTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BannerAprendizTest
{
    private Aprendiz aprendiz1;

    /**
     * Default constructor for test class BannerAprendizTest
     */
    public BannerAprendizTest()
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
        aprendiz1 = new Aprendiz("TestUser", "1234", "email@domain.com", "Name", "LastName", "12/02/2019", "3004564534", "A City", "Cra falsa #1234", true, 3);
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
    public void CreacióndeBanner()
    {
        BannerAprendiz bannerAp1 = new BannerAprendiz
        ("Matemáticas",
        "Cálculo",
        "Diferenciales",
        "14/02/2019",
        "UIS",
        aprendiz1);
        
        assertNotNull(bannerAp1.getAutor());
        assertEquals("14/02/2019", bannerAp1.getFecha());
        assertEquals("UIS", bannerAp1.getLugar());
        assertEquals("Matemáticas", bannerAp1.getMateria());
        assertEquals("Cálculo", bannerAp1.getRama());
        assertEquals("Diferenciales", bannerAp1.getTema());
        assertNotNull(bannerAp1.verBanner());
        assertNotNull(bannerAp1.verContenidoBanner());
        assertNotNull(bannerAp1.verEncabezado());
        assertNotNull(bannerAp1.verInfoAutor());
    }
}

