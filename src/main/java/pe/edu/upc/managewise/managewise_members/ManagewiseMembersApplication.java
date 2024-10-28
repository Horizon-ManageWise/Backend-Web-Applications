package pe.edu.upc.managewise.managewise_members;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableJpaAuditing
public class 	ManagewiseMembersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagewiseMembersApplication.class, args);
	}

}
