package com.orbit.github_repos.responses;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class GithubRepoItems {
    private long id;
    private String name;
    private String description;
    private long forks;
}
