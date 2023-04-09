package com.test.check.JavaDeleteApi.Controller;

import com.test.check.JavaDeleteApi.Entity.Employee;
import com.test.check.JavaDeleteApi.Service.EmployeeService;
import com.test.check.JavaDeleteApi.Util.CustomErrorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService EmpService;

    @GetMapping("/Next")
    public String testMethod() {
        return "MyNextHitController";
    }

    @RequestMapping(value = "/deleteEmp/{eid}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteYard(@PathVariable("eid") long eid) {

        Employee EmpResponse = EmpService.findById(eid);
        if (EmpResponse == null) {
            return new ResponseEntity(new CustomErrorType("Unable to delete. User with eid " + eid + " not found."),
                    HttpStatus.NOT_FOUND);
        }
        EmpService.deleteEmpById(eid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
