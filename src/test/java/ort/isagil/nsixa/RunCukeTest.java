package ort.isagil.nsixa;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author alumnoFI
 */

@RunWith(Cucumber.class)
@CucumberOptions(strict=true, monochrome=true, format="junit:output", snippets=SnippetType.CAMELCASE, features="src/test/resources/ort/isagil/nsixa/carpaccio")
public class RunCukeTest {
    
    public RunCukeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
