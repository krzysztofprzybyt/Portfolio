package com.portfolio.portfolio.mapper;

import com.portfolio.portfolio.domain.Books;
import com.portfolio.portfolio.domain.BooksDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BooksMapper {

    @Autowired
    private TitlesMapper titlesMapper;

    public Books mapToBooks(final BooksDto booksDto) {
        return new Books(
                titlesMapper.mapToTitles(booksDto.getTitleDto()), booksDto.getStatus()
        );
    }

    public BooksDto mapToBooksDto(final Books books) {
        return new BooksDto(books.getBookId(), titlesMapper.mapToTitlesDto(books.getTitle()), books.getStatus());
    }
    public List<BooksDto> mapToBooksDtoList(final List<Books> booksList) {
        return booksList.stream()
                .map(b-> new BooksDto(b.getBookId(), titlesMapper.mapToTitlesDto(b.getTitle()), b.getStatus()))
                .collect(Collectors.toList());

    }

}
