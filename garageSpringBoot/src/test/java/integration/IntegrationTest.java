package integration;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.benleadbeater.database.hello.mySpringDatabaseBootApp.GarageSpringBootApplication;
import com.benleadbeater.database.hello.mySpringDatabaseBootApp.model.MySpringBootDataModel;
import com.benleadbeater.database.hello.mySpringDatabaseBootApp.repository.GarageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { GarageSpringBootApplication.class })
@AutoConfigureMockMvc
public class IntegrationTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private GarageRepository repository;

	@Before
	public void clearDB() {
		repository.deleteAll();
	}

	@Test
	public void findingAndRetrievingVehicleFromDatabase() throws Exception {
		repository.save(new MySpringBootDataModel("Bike", "Bandit", "Suzuki", 120));
		mvc.perform(get("/api/vehicle").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$[0].name", is("Bandit")));
	}
	
	@Test
	public void findingVehicleByIDFromDatabase() throws Exception {
		MySpringBootDataModel bike1 = new MySpringBootDataModel("Bike", "Bandit", "Suzuki", 120);
		repository.save(bike1);
		mvc.perform(get("/api/vehicle/" + bike1.getId()).contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.id", is(3)));
	}
	
	@Test
	public void addAVehicleToDatabaseTest() throws Exception {
		mvc.perform(MockMvcRequestBuilders.post("/api/vehicle").contentType(MediaType.APPLICATION_JSON)
				.content("{\"type\" : \"Car\" , \"name\" : \"Viper\",\"make\" : \"Dodge\", \"topSpeed\" : 200}"))
				.andExpect(status().isOk()).andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
				.andExpect(jsonPath("$.name", is("Viper")));
	} 

	@Test
	public void DeletingVehicleFromDatabase() throws Exception {
		repository.save(new MySpringBootDataModel("Bike", "Bandit", "Suzuki", 120));
		mvc.perform(MockMvcRequestBuilders.delete("/api/vehicle/1").contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk());
	}
	
	@Test
	public void UpdatingVehicleInDatabase() throws Exception {
		MySpringBootDataModel vehicle = new MySpringBootDataModel("Car", "Viper" , "Dodge" , 200);
		repository.save(vehicle);
	
		mvc.perform(MockMvcRequestBuilders.put("/api/vehicle/" + vehicle.getId())
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"type\" : \"Car\" , \"name\" : \"Viper2\" , \"make\" : \"Dodge\" , \"topSpeed\" : \"200\"}"))
		.andExpect(status().isOk())
		.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
		.andExpect(jsonPath("$.name", is("Viper2")));
	}
} 
