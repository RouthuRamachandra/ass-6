package com.blockPost;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.blockPost.entities.Location;
import com.blockPost.entities.Posts;
import com.blockPost.entities.Users;
import com.blockPost.repo.LocationRepo;
import com.blockPost.repo.PostsRepo;
import com.blockPost.repo.UsersRepo;

@SpringBootApplication
public class BlockPostApplication implements CommandLineRunner {

	@Autowired
	private UsersRepo userRepo;
	@Autowired
	private PostsRepo postRepo;
	@Autowired
	private LocationRepo locationRepo;

	public static void main(String[] args) {
		SpringApplication.run(BlockPostApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Location loc1 = new Location("mumbai");
		Location loc2 = new Location("hyderabad");

		Users user1 = new Users("naidu", "routhu", loc1, "naidu@gmail.com");
		Users user2 = new Users("pavan", "alla", loc1, "pavan@gmail.com");
		Users user3 = new Users("madhu", "m", loc2, "madhu@gmail.com");
		Users user4 = new Users("siva", "s", loc2, "siva@gmail.com");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d1 = LocalDate.parse("05/16/2019", formatter);
		LocalDate d2 = LocalDate.parse("10/05/2016", formatter);
		LocalDate d3 = LocalDate.parse("09/06/2011", formatter);
		LocalDate d4 = LocalDate.parse("26/09/2017", formatter);
		LocalDate d5 = LocalDate.parse("28/09/2017", formatter);
		LocalDate d6 = LocalDate.parse("25/09/2019", formatter);
		Posts post1 = new Posts(d1, user1, "abc");
		Posts post2 = new Posts(d2, user1, "def");
		Posts post3 = new Posts(d3, user2, "dfk");
		Posts post4 = new Posts(d4, user3, "ppp");
		Posts post5 = new Posts(d5, user3, "ooo");
		Posts post6 = new Posts(d6, user4, "dhf");

		locationRepo.save(loc1);
		locationRepo.save(loc2);

		userRepo.save(user1);
		userRepo.save(user2);
		userRepo.save(user3);
		userRepo.save(user4);

		postRepo.save(post1);
		postRepo.save(post2);
		postRepo.save(post3);
		postRepo.save(post4);
		postRepo.save(post5);
		postRepo.save(post6);
	}

}
