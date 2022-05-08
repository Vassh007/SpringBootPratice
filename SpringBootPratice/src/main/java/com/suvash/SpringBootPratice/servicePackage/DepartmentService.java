package com.suvash.SpringBootPratice.servicePackage;

import com.suvash.SpringBootPratice.entity.Department;
import com.suvash.SpringBootPratice.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentName(String departmentName);
}

