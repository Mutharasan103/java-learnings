package com.dwb.Employee.EmployeeDetails.Controller.service;

import com.dwb.Employee.EmployeeDetails.Controller.entity.EmployeeDetails;

import java.util.List;

public interface EmployeeService {

    EmployeeDetails saveDetails(EmployeeDetails details);

    List<EmployeeDetails> fetchDetailsList();

    EmployeeDetails updateDetails(Long empId, EmployeeDetails details);

    EmployeeDetails fetchDetailsById(Long empId);

    EmployeeDetails fetchDetailsByName(String empName);

    EmployeeDetails fetchDetailsByCode(String empCode);

    EmployeeDetails deleteDetailsById(Long empId);
}
