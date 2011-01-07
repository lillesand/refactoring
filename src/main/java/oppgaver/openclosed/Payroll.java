package oppgaver.openclosed;

import java.util.Date;

public class Payroll {
	
	private static final int MONTHLY = 0;
	private static final int WEEKLY = 1;
	EmployeeGateway employeeGateway;
	
	public void run(Date payDate) {
		for (Employee employee : employeeGateway.findAll()) {
			@SuppressWarnings("unused")
			boolean payToday = false;
			switch (employee.getPaymentSchedule()) {
				case MONTHLY:
					payToday = DateUtils.isLastDayOfMonth(payDate);
					break;
				case WEEKLY:
					payToday = DateUtils.isFriday(payDate);
					break;					
			}
			// more stuff...
		}
	}

}
