package com.devtiro.database;

import com.devtiro.database.domain.Author;
import com.devtiro.database.domain.Book;

public final class TestDataUtil {
    private TestDataUtil(){

    }

    public static Author createTestAuthorA(){
        return Author.builder()
                .id(1L)
                .name("Abigail Rose")
                .age(80)
                .build();

    }

    public static Author createTestAuthorB(){
        return Author.builder()
                .id(2L)
                .name("Thomas Cronin")
                .age(44)
                .build();

    }

    public static Author createTestAuthorC(){
        return Author.builder()
                .id(3L)
                .name("Jesse A Casey")
                .age(24)
                .build();

    }

    public static Book createTestBook() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadaw in the Artic")
                .authorId(1L)
                .build();
    }
}
