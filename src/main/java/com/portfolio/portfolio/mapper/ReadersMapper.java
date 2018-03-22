package com.portfolio.portfolio.mapper;

import com.portfolio.portfolio.domain.Readers;
import com.portfolio.portfolio.domain.ReadersDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class ReadersMapper {

    public Readers mapToReaders(final ReadersDto readersDto) {
        return new Readers(
                readersDto.getName(),
                readersDto.getSurname()
        );
    }
    public ReadersDto mapToReadersDto(final Readers readers) {
        return new ReadersDto(
                readers.getUserId(),
                readers.getName(),
                readers.getSurname()
        );
    }
    public List<ReadersDto> mapToReadersDtoList(final List<Readers> readersList) {
        return readersList.stream()
                .map(readers -> new ReadersDto(readers.getUserId(), readers.getName(),readers.getSurname()))
                .collect(Collectors.toList());
    }
}
