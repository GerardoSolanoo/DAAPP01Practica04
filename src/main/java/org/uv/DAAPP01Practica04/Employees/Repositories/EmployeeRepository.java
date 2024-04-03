package org.uv.DAAPP01Practica04.Employees.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.uv.DAAPP01Practica04.Employees.Entities.Employee;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
}
