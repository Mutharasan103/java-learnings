package com.dwb.Employee.EmployeeDetails.Controller.service;

import com.dwb.Employee.EmployeeDetails.Controller.entity.EmployeeDetails;
import com.dwb.Employee.EmployeeDetails.Controller.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

    @Autowired
    private EmployeeRepository repository;

    @Override
    public EmployeeDetails saveDetails(EmployeeDetails details) {
        return repository.save(details);
    }

    @Override
    public List<EmployeeDetails> fetchDetailsList() {
        return repository.findAll();
    }

    @Override
    public EmployeeDetails updateDetails(Long empId, EmployeeDetails details) {

        EmployeeDetails detailsDB =repository.findById(empId).get();

        if (Objects.nonNull(details.getEmpName()) && !"".equals(details.getEmpName()))
        {
            detailsDB.setEmpName(details.getEmpName());
        }
        if (Objects.nonNull(details.getEmpAddress())&& !"".equals(details.getEmpAddress()))
        {
            detailsDB.setEmpAddress(details.getEmpAddress());
        }
        if (Objects.nonNull(details.getEmpCode())&& !"".equals(details.getEmpCode()))
        {
            detailsDB.setEmpCode(details.getEmpCode());
        }
        if (Objects.nonNull(details.getCompanyName())&& !"".equals(details.getCompanyName()))
        {
            detailsDB.setCompanyName(details.getCompanyName());
        }

        return repository.save(detailsDB);

    }

    @Override
    public EmployeeDetails fetchDetailsById(Long empId) {
        return repository.findById(empId).get();
    }

    @Override
    public EmployeeDetails fetchDetailsByName(String empName) {
        return repository.findByEmpName (empName);
    }

    @Override
    public EmployeeDetails fetchDetailsByCode(String empCode) {
        return repository.findByEmpCode (empCode);
    }

    @Override
    public EmployeeDetails deleteDetailsById(Long empId) {
       repository.deleteById(empId);
       return null;
    }

}
