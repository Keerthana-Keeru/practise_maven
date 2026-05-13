package com.example.app;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class AppTest{
    @Test
    public void testGreet(){
        String result=App.greet("Student");
	assertEquals("hello! Student",result);
}
}

return "hello! " + name;
