package com.lms.dao;

import java.util.List;

import com.lms.model.LeaveDetails;

public interface LeaveDetailsDao {

	String addLeaveDao(LeaveDetails leaveDetails);
	List<LeaveDetails> showLeaveDao();
}
