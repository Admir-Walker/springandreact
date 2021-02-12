package admirwalker.github.com.springandreact;

import admirwalker.github.com.springandreact.models.Employee;
import admirwalker.github.com.springandreact.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final EmployeeRepository employeeRepository;
    @Autowired // it allows Spring to resolve and inject collaborating beans into our bean
    public DatabaseLoader(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        this.employeeRepository.save(new Employee("Admir","Ihtijarevic","Junior"));
    }
}
