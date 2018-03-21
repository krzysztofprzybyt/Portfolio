package com.portfolio.portfolio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class TitlesDto {

    private Integer titleId;
    private String title;
    private String author;
    private Integer publicationYear;
    private List<BooksDto> booksDtoList = new ArrayList<>();

    public TitlesDto(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
