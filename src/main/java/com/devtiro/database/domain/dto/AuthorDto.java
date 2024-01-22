package com.devtiro.database.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AuthorDto {
    private Long id;

    private String name;

    private Integer age;
}
