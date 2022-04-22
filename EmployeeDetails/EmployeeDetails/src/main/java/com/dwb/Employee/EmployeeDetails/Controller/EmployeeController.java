package com.dwb.Employee.EmployeeDetails.Controller;
import com.dwb.Employee.EmployeeDetails.Controller.entity.EmployeeDetails;
import com.dwb.Employee.EmployeeDetails.Controller.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping ("/EmployeeDetails")
    public EmployeeDetails saveDetails (@RequestBody EmployeeDetails details)
    {
        return service.saveDetails (details);
    }

    @GetMapping ("/EmployeeDetails")
    public List<EmployeeDetails> fetchDetails ()
    {
        return service.fetchDetailsList ();
    }

    @PutMapping ("/EmployeeDetails/{empId}")
    public EmployeeDetails updateDetails (@PathVariable ("empId") Long empId, @RequestBody EmployeeDetails details)
    {
        return service.updateDetails (empId, details);
    }

    @GetMapping ("/EmployeeDetails/{empId}")
    public EmployeeDetails fetchDetailsById (@PathVariable ("empId") Long empId)
    {
        return service.fetchDetailsById (empId);
    }

    @GetMapping ("/EmployeeDetails/empName/{empName}")
    public EmployeeDetails fetchDetailsByName (@PathVariable ("empName") String empName)
    {
        return service.fetchDetailsByName (empName);
    }

    @GetMapping ("/EmployeeDetails/empCode/{empCode}")
    public EmployeeDetails fetchDetailsByCode (@PathVariable ("empCode") String empCode)
    {
        return service.fetchDetailsByCode (empCode);
    }

    @DeleteMapping ("/EmployeeDetails/{empId}")
    public String deleteDetailsById (@PathVariable ("empId") Long empId)
    {
       service.deleteDetailsById (empId);
       return "Details Deleted Successfully";
    }

}
