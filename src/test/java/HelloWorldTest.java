import org.junit.Assert;
import org.junit.Test;


import java.io.*;
import java.util.Locale;

public class HelloWorldTest {

	@Test
	public void HelloTest() {
		HelloWorld.main(new String[] {"arg1", "arg2", "arg3"});
		//Assert.assertEquals("Hello", HelloWorld.hello);
		//System.out.println(HelloWorld.hello);
		Assert.assertEquals("Hello, World!", HelloWorld.hello);
	
	}
}