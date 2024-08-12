package com.lms.bal;

import java.util.Date;
import java.util.List;

import com.lms.dao.LeaveDetailsDao;
import com.lms.dao.LeaveDetailsImpl;
import com.lms.ex.LeaveDetailsException;
import com.lms.model.LeaveDetails;

public class LeaveDetailsBal {

	static StringBuilder sb = new StringBuilder();
	
	static LeaveDetailsDao dao = new LeaveDetailsImpl();
	
	public boolean validateLeave(LeaveDetails leaveDetails) {
		boolean flag = true;
		Date today = new Date();
		long diff = today.getTime() - leaveDetails.getLeaveStartDate().getTime();
		int days = (int) diff/(1000 * 60 * 60 * 24);
		days++;
		System.out.println(days);
		if (days > 1) {
			sb.append("Leave Start-Date Cannot be Yesterday's Date...");
			flag = false;
		}
		diff = today.getTime() - leaveDetails.getLeaveEndDate().getTime();
		days = (int) diff/(1000 * 60 * 60 * 24);
		days++;
		System.out.println(days);
		if (days > 1) {
			sb.append("Leave End-Date Cannot be Yesterday's Date...");
			flag = false;
		}
		
		diff = leaveDetails.getLeaveStartDate().getTime() - leaveDetails.getLeaveEndDate().getTime();
		days = (int) diff/(1000 * 60 * 60 * 24);
		days++;
		System.out.println(days);
		if (days > 1) {
			sb.append("Leave Start-Date cannot be Greaer Than Leave ENd Date...");
			flag = false;
		}
		return flag;
	}
	
	public String addLeaveBal(LeaveDetails leaveDetails) throws LeaveDetailsException {
		if (validateLeave(leaveDetails)==true) {
			return dao.addLeaveDao(leaveDetails);
		}
		throw new LeaveDetailsException(sb.toString());
	}
	
	public List<LeaveDetails> showLeaveDetailsBal() {
		return dao.showLeaveDao();
	}
}
