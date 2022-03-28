import com.htec.SandBoxExam;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {

    @BeforeClass
    public void beforeClass() {
        SandBoxExam.setup();
    }


    @Test (priority = 10)
    public void checkIfHomePageIsOpenAndLogIn() {
        Assert.assertEquals(SandBoxExam.getCurrentUrl(), "https://qa-sandbox.ni.htec.rs/");
        SandBoxExam.logMeIn("matejminchev@gmail.com", "zxc1234567");

        SandBoxExam.waitFor(5);
        Assert.assertEquals(SandBoxExam.getCurrentUrl(), "https://qa-sandbox.ni.htec.rs/dashboard" );

    }
    @Test (priority = 20)
    public void checkIfFirstTestCaseIsCreated() {
        Assert.assertEquals (SandBoxExam.createTestCase(), "#1");
    }

    @Test (priority = 30)
    public void checkIfSecondTestCaseIsCreated() {
        Assert.assertEquals(SandBoxExam.createSecondTestCase(),"#2");
    }
    @Test (priority = 40)
    public void checkIfThirdTestCaseIsCreated() {
        Assert.assertEquals(SandBoxExam.createThirdTestCase(),"#3");
    }
}