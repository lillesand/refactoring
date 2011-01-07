package oppgaver.commandquery;

import java.util.ArrayList;
import java.util.List;

public class Arguments {

    private static final String VALID_ARGUMENT = "ok";
    
    private List<String> validArgs = new ArrayList<String>();

    public void addArgument(String arg) {
		if (isValidArgument(arg))
			validArgs.add(arg);
	}

    private boolean isValidArgument(String argument) {
        return VALID_ARGUMENT.equals(argument);
    }

    public List<String> getArguments() {
        return validArgs;
    }
}