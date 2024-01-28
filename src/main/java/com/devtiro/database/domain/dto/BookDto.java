package com.devtiro.database.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class BookDto {
    private  String isbn;

    private String title;

    private AuthorDto author;

}
