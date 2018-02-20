package ut.com.tkbbank;

import org.junit.Test;
import com.tkbbank.api.MyPluginComponent;
import com.tkbbank.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}