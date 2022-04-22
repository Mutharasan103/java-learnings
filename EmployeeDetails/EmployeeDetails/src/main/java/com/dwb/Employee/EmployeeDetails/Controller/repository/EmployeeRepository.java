package com.dwb.Employee.EmployeeDetails.Controller.repository;

import com.dwb.Employee.EmployeeDetails.Controller.entity.EmployeeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDetails, Long> {

    EmployeeDetails findByEmpName(String empName);

    EmployeeDetails findByEmpCode(String empCode);
}
