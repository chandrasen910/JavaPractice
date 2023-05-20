import java.util.stream.Stream;

public class AppTest {
    public static void main(String[] args) {
        Application application=new Application();
        Assert.assertEquals(application.getData()).toEqual(null);
    }
}
