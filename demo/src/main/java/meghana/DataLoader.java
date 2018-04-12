package meghana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

	private final EmployeeRespository repository;

	@Autowired
	public DataLoader(EmployeeRespository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
		this.repository.save(new Employee("Maggi", "Manasa", "Sindhu"));
	}
}
