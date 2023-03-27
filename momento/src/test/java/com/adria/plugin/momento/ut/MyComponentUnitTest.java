package ut.com.adria.plugin.momento;

import org.junit.Test;
import com.adria.plugin.momento.api.MyPluginComponent;
import com.adria.plugin.momento.impl.MyPluginComponentImpl;

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