package com.lms.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.lms.model.LeaveDetails;
import com.lms.model.LeaveStatus;

public class LeaveDetailsImpl implements LeaveDetailsDao {

	static List<LeaveDetails> leaveDetailsList;
	
	static {
		leaveDetailsList = new ArrayList<LeaveDetails>();
	}
	
	public int generateLeaveId() {
		if (leaveDetailsList.size() == 0) {
			return 1;
		}
		return leaveDetailsList.get(leaveDetailsList.size()-1).getLeaveId() +1;
	}
	@Override
	public String addLeaveDao(LeaveDetails leaveDetails) {
		int leaveId = generateLeaveId();
		leaveDetails.setLeaveId(leaveId);
		leaveDetails.setAppliedOn(new Date());
		long diff = leaveDetails.getLeaveEndDate().getTime() - leaveDetails.getLeaveStartDate().getTime();
		int days = (int)diff/(1000 * 60 * 60 * 24);
		days++;
		leaveDetails.setNoOfDays(days);
		leaveDetails.setLeaveStatus(LeaveStatus.PENDING);
		leaveDetailsList.add(leaveDetails);
		// TODO Auto-generated method stub
		return "Leave Applied Successfully...";
	}

	@Override
	public List<LeaveDetails> showLeaveDao() {
		return leaveDetailsList;
	}

	
}
