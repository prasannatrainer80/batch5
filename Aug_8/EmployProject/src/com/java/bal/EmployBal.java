package com.java.bal;

import java.util.List;

import com.java.dao.EmployDao;
import com.java.dao.EmployDaoImpl;
import com.java.model.Employ;
import com.java.exception.EmployException;

public class EmployBal {

	static EmployDao dao;
	static StringBuilder sb;
	
	static {
		dao = new EmployDaoImpl();
		sb = new StringBuilder();
	}
	
	public static boolean validateEmploy(Employ employ) {
		boolean flag = true;
		if (employ.getEmpno() <= 0) {
			sb.append("Employ No Cannot be Zero or Negative...\r\n");
			flag = false;
		}
		if (employ.getName().length() < 5) {
			sb.append("Name Contains min 5 characters...\n\r");
			flag = false;
		}
		if (employ.getDept().length() < 2) {
			sb.append("Department Contains min 2 characters...\n\r");
			flag = false;
		}
		if (employ.getBasic() < 10000 || employ.getBasic() > 80000) {
			sb.append("Basic Must be between 10000 and 80000...\r\n");
			flag = false;
		}
		return flag;
	}
	
	public String deleteEmployBal(int empno) {
		return dao.deleteEmployDao(empno);
	}
	public List<Employ> showEmployBal() {
		return dao.showEmployDao();
	}
	
	public Employ searchEmployBal(int empno) {
		return dao.searchEmployDao(empno);
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if (validateEmploy(employ)==true) {
			return dao.addEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public String updateEmployBal(Employ employ) throws EmployException {
		if (validateEmploy(employ)==true) {
			return dao.updateEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
}
