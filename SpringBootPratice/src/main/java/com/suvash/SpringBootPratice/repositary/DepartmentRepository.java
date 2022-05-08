package com.suvash.SpringBootPratice.repositary;

import com.suvash.SpringBootPratice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    public Department findByDepartmentName(String DepartmentName);

    public Department findByDepartmentNameIgnoreCase(String DepartmentName);

}
