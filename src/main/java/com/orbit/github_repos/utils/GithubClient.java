package com.orbit.github_repos.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.orbit.github_repos.responses.GithubRepoResponse;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@RequiredArgsConstructor
public class GithubClient {
    private static final String URL = "https://api.github.com/search/repositories";

    @Value("${github.access-token}")
    private String accessToken;

    private final RestTemplate restTemplate;

    public GithubRepoResponse getGithubRepos(String repoQuery, int page) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + accessToken);
        headers.set("Accept", "application/json");

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        ResponseEntity<GithubRepoResponse> response = restTemplate.exchange(
                URL + "?q=" + repoQuery + "&page=" + page, HttpMethod.GET, requestEntity, GithubRepoResponse.class);
        log.info(response.toString());
        return response.getBody();
    }
}
