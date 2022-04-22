package com.dwb.Employee.EmployeeDetails.Controller.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDetails {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long empId;
    private String empName;
    private String empAddress;
    private String empCode;
    private String companyName;

}
