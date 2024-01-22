package com.devtiro.database.services;

import com.devtiro.database.domain.entities.AuthorEntity;
import org.springframework.stereotype.Service;

public interface AuthorService {
    AuthorEntity createAuthor(AuthorEntity authorEntity);
}
