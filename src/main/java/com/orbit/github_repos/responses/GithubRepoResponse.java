package com.orbit.github_repos.responses;

import lombok.Data;
import java.util.List;

import org.springframework.stereotype.Component;

@Data
@Component
public class GithubRepoResponse {
    private long total_count;
    private boolean incomplete_results;

    private List<GithubRepoItems> items;
}
