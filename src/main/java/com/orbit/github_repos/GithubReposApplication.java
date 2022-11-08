package com.orbit.github_repos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class GithubReposApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubReposApplication.class, args);

// 		Implement a middleware that queries the existing Github repositories 
// 		and provides a search (e.g. all repos where the title contains "template").
// The results should be paginable and allow filtering on the repositories 
// (e.g. on attributes of the response or in the form of a sort).
		// "https://api.github.com/search/repositories?q=template&"
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
