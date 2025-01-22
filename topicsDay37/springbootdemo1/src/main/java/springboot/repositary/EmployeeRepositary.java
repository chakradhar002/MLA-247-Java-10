package springboot.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.entity.Employee;


@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Long> {

}
