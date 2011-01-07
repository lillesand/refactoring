package oppgaver.commandquery;

import java.util.ArrayList;
import java.util.List;

public class Arguments {
	
	@SuppressWarnings("unused")
	private String arg;

	private List<String> validArgs = new ArrayList<String>();

	public void someMethod(String arg) {
		if (setArgument(arg)) 
			validArgs .add(arg);
	}

	private boolean setArgument(String arg) {
		this.arg = arg;
		return "ok".equalsIgnoreCase(arg);
	}

}