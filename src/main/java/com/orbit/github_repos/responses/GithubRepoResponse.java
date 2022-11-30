package com.orbit.github_repos.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

@Builder
@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class GithubRepoResponse {
    private long total_count;
    private boolean incomplete_results;

    private List<GithubRepoItems> items;
}
