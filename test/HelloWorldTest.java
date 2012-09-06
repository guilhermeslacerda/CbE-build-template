import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {

    @Test
    public void shouldSayStuff() {
        HelloWorld helloWorld = new HelloWorld("lalalalala");

        assertThat(helloWorld.sayIt(), is("lalalalala"));
    }
}
