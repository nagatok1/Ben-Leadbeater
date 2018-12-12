package repo;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.benleadbeater.database.hello.mySpringDatabaseBootApp.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MySpringBootDatabaseAppApplication.class})
@DataJpaTest
public class RepositoryTest {
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private GarageRepository MyRepo;

}
