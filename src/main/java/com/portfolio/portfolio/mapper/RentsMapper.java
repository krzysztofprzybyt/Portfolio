package com.portfolio.portfolio.mapper;

import com.portfolio.portfolio.domain.Books;
import com.portfolio.portfolio.domain.Rents;
import com.portfolio.portfolio.domain.RentsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RentsMapper {
    @Autowired
    private BooksMapper booksMapper;
    @Autowired
    private ReadersMapper readersMapper;

    public Rents mapToRents(RentsDto rentsDto) {
        return new Rents(
                readersMapper.mapToReaders(rentsDto.getReaderDto()),
                booksMapper.mapToBooks(rentsDto.getBookDto()));
    }
    public RentsDto mapToRentsDto(Rents rents) {
        return new RentsDto(
                rents.getId(),
                readersMapper.mapToReadersDto(rents.getReader()),
                booksMapper.mapToBooksDto(rents.getBook()));
    }
    public List<RentsDto> mapToRentsDto(List<Rents> rentsList) {
        return rentsList.stream()
                .map(r->new RentsDto(r.getId(),
                        readersMapper.mapToReadersDto(r.getReader()),
                        booksMapper.mapToBooksDto(r.getBook())))
                .collect(Collectors.toList());

    }
}
