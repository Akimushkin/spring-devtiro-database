package com.devtiro.database.services;

import com.devtiro.database.domain.entities.AuthorEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuthorService {
    AuthorEntity createAuthor(AuthorEntity authorEntity);

    List<AuthorEntity> findAll();
}
