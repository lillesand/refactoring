package oppgaver.dependencyinversion;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Payroll {
	
	ResultSet rs = null;

	public void payDay() throws SQLException {
		while (rs.next()) {
			switch(rs.getInt(3)) {
				case 1: //employee is exempt
					calculatePayForSalaried(rs);
					break;
				case 2: //employee is non-exempt
					calculatePayForHourly(rs);
					break;
				case 3: //what?
			}
		}
	}

	private void calculatePayForHourly(ResultSet rs) {
		//omitted
	}

	private void calculatePayForSalaried(ResultSet rs2) {
		//omitted
	}


}
