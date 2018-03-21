package com.portfolio.portfolio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class RentsDto {
    private Integer id;
    private Date rentsDate;
    private Date returnDate;
    private ReadersDto readerDto;
    private BooksDto bookDto;

    public RentsDto(ReadersDto reader, BooksDto book) {
        this.readerDto = reader;
        this.bookDto = book;
        this.rentsDate = new Date();
        this.returnDate = new Date();
    }
}
