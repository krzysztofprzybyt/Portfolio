package com.portfolio.portfolio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BooksDto {

    private Integer bookId;
    private String status;
    private TitlesDto titleDto;



    public BooksDto( TitlesDto titlesDto, String status) {
        this.status = status;
        this.titleDto = titlesDto;
    }
    public BooksDto(Integer bookId, TitlesDto titlesDto, String status) {
        this.bookId = bookId;
        this.titleDto = titlesDto;
        this.status = status;
    }
}
