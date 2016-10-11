package com.example;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.example.dao.TeamDao;
import com.example.domain.Player;
import com.example.domain.Team;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

	//JAR
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesBootApplication.class, args);
	}

	/* (non-Javadoc)
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(MicroservicesBootApplication.class);
	}
	
	@PostConstruct
	public void init(){
		Set<Player> players = new HashSet<Player>();
		players.add(new Player("Charlie", "pitcher"));
		players.add(new Player("Brownie", "forward striker"));

		Team team = new Team("Rangers","tren","masc",players);
		Set<Player> players1 = new HashSet<Player>();
		players1.add(new Player("naga", "pitcher"));
		players1.add(new Player("cna", "forward striker"));
		Team team1 = new Team("Nexur","jun","tou",players1);

		teamDao.save(team);
		teamDao.save(team1);

	}
	
	@Autowired
	TeamDao teamDao;
	
}
