package com.orbit.github_repos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orbit.github_repos.responses.GithubRepoResponse;
import com.orbit.github_repos.utils.GithubClient;

@RestController
@RequestMapping("/api/v1/github/repos")
public class GithubRepoController {
    @Autowired
    private GithubClient githubClient;

    @GetMapping
    public ResponseEntity<GithubRepoResponse> getGithubRepos(
            @RequestParam("q") String repoQuery, @RequestParam(value = "page", defaultValue="1") int page) {
        GithubRepoResponse response = githubClient.getGithubRepos(repoQuery, page);
        return ResponseEntity.ok().body(response);
    }
}
