package com.test.check.JavaDeleteApi.Repository;

import com.test.check.JavaDeleteApi.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findById(long id);

}
