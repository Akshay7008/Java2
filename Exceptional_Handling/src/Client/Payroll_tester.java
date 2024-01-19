package Client;

import java.text.ParseException;

import BL.payroll.Payroll_date;

public class Payroll_tester {

	public static void main(String[] args) throws ParseException {
//		try {
//			Payroll_date b1 = new Payroll_date("Smith", "saving", 50000, "15-02-2001");
//			System.out.println(b1);
//
//		}
//
//		catch (Exception e) {
//			System.err.println("--------------");
//			System.out.println(e);
//		}
		
		Payroll_date b1 = new Payroll_date("Smith", "saving", 50000, "15-02-2001");
		System.out.println(b1);

	}

}
