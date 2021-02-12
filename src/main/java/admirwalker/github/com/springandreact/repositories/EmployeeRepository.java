package admirwalker.github.com.springandreact.repositories;

import admirwalker.github.com.springandreact.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
