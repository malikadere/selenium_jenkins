public class Test extends LaunchBrowserAndGetTitleTest{
    public String browser=System.getProperty("browser","chrome");
    @org.testng.annotations.Test
    public void test(){

        System.out.println("hello");

        setUp(browser);
    }
}
