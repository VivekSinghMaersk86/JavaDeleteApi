package com.test.check.JavaDeleteApi.Service;

import com.test.check.JavaDeleteApi.Entity.Employee;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    void deleteEmpById(long eid);

    Employee findById(long eid);
}
