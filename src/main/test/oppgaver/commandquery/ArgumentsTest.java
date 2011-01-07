package oppgaver.commandquery;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ArgumentsTest {

    @Test
    public void shouldNotStoreInvalidArguments() throws Exception {
        Arguments arguments = new Arguments();
        arguments.addArgument("not ok");
        arguments.addArgument("not not ok");

        assertEquals(0, arguments.getArguments().size());
    }

    @Test
    public void shouldSaveOks() throws Exception {
        Arguments arguments = new Arguments();
        arguments.addArgument("ok");

        assertEquals(1, arguments.getArguments().size());
    }
    
}