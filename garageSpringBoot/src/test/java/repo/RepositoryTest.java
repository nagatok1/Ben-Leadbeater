package repo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.benleadbeater.database.hello.mySpringDatabaseBootApp.GarageSpringBootApplication;
import com.benleadbeater.database.hello.mySpringDatabaseBootApp.model.MySpringBootDataModel;
import com.benleadbeater.database.hello.mySpringDatabaseBootApp.repository.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {GarageSpringBootApplication.class})
@DataJpaTest
public class RepositoryTest {
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Autowired
	private GarageRepository MyRepo;
	
	@Test
	public void retrievebyIdTest() {
		MySpringBootDataModel model1 = new MySpringBootDataModel("Car", "458", "Ferrari", 150);
		entityManager.persist(model1);
		entityManager.flush();
		assertTrue(MyRepo.findById(model1.getId()).isPresent());
	}
	
	@Test
	public void retrievebyTypeTest() {
		MySpringBootDataModel model2 = new MySpringBootDataModel("Car", "459", "Ferrari", 150);
		entityManager.persist(model2);
		entityManager.flush();
		assertTrue(MyRepo.findByType(model2.getType()).isPresent()); 
	}

}