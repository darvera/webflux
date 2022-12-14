package com.example.webflux.service;

import com.example.webflux.model.Blog;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BlogService {

    Mono<Blog> createBlog(Blog blog);

    Mono<Blog> updateBlog(Blog blog, String id);

    Flux<Blog> findAll();

    Mono<Blog> findOne(String id);

    Flux<Blog> findByTitle(String title);

    Mono<Boolean> delete(String id);
}
