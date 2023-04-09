package com.test.check.JavaDeleteApi.ServiceImpl;

import com.test.check.JavaDeleteApi.Entity.Employee;
import com.test.check.JavaDeleteApi.Repository.EmployeeRepository;
import com.test.check.JavaDeleteApi.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository EmpRepository;

    @Override
    public void deleteEmpById(long eid) {
        Employee OrgEmployee = EmpRepository.findById(eid);
        EmpRepository.delete(OrgEmployee);

    }

    @Override
    public Employee findById(long eid) {
        return EmpRepository.findById(eid);
    }
}
