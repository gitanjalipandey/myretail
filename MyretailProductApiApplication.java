package com.myretail.product;

import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
//@EnableCassandraRepositories(basePackageClasses = Customer.class)
public class MyretailProductApiApplication {


	public static void main(String[] args) {
		SpringApplication.run(MyretailProductApiApplication.class, args);
	}


/*
	@Override
	public void run(String... args) throws Exception {
 //log.info("Creating Keyspace");
		cqlSession.execute("CREATE KEYSPACE IF NOT EXISTS myretail;");
  //log.info("Creating table");
		cqlSession.execute("CREATE TABLE demo.customer
		(\n" + "  id INT PRIMARY KEY,\n" + " firstName text,\n" \+
		" lastName text\n" + ") WITH default_time_to_live = 0\n"
      \+ " AND transactions = {'enabled': 'true'};");

   // Split the array of whole names into an array of first-last names
   List<Object[]> splitUpNames = Arrays.asList(
				"Tim Bun", "Mike Dean", "Alan Row", "Josh Rambo")
				.stream().map(name -> name.split(" ")).collect(Collectors.toList());

		// Use a Java 8 stream to print out each tuple of the list
  splitUpNames.forEach(name -> {
     int id = 1;
     log.info(String.format("Inserting customer record for %s %s", name[0], name[1]));
     customerRepository.save(new Customer(id, (String) name[0], (String) name[1]));
     id++;
   });
  log.info("Querying for customer records where first_name = 'Josh':");
  log.info(customerRepository.findByFirstName("Josh").toString());

	 */

}
