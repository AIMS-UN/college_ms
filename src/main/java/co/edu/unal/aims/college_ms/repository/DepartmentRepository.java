package co.edu.unal.aims.college_ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.unal.aims.college_ms.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}