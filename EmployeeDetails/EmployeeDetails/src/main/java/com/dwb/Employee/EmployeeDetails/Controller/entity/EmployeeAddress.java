package com.dwb.Employee.EmployeeDetails.Controller.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeAddress {
    @Id
    @GeneratedValue
    private Long Id;
    private int doorNo;
    private String street;
    private String city;
    private String district;
    private int pincode;


}
