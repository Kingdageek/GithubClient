package com.orbit.github_repos.responses;

import lombok.Data;

@Data
public class GithubRepoItems {
    private long id;
    private String name;
    private String description;
    private long forks;
}
