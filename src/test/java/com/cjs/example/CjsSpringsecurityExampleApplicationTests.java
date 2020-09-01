package com.cjs.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CjsSpringsecurityExampleApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void encode() {
		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
		String hashPass = bcryptPasswordEncoder.encode("123456");

		System.out.println(hashPass);

		boolean f = bcryptPasswordEncoder.matches("123456", hashPass);
		System.out.println(f);

		hashPass = bcryptPasswordEncoder.encode("123456");

		System.out.println(hashPass);

		f = bcryptPasswordEncoder.matches("123456", hashPass);
		System.out.println(f);
	}

}
