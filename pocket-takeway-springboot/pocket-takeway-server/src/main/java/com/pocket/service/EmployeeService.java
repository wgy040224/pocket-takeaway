package com.pocket.service;

import com.pocket.dto.EmployeeLoginDTO;
import com.pocket.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

}
