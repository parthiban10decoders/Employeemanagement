package com.employee.services;

import java.util.List;
import java.util.Optional;

import com.employee.model.Employee;
import com.employee.model.Leave;

public interface LeaveService {

	public Leave creates(long id, Leave leave);

	public List<Leave> getLeaveByEmployeeId(long employeeId);

	public Optional<Employee> getid(long employeeId);

	public List<Leave> getAllLeaves();

}
