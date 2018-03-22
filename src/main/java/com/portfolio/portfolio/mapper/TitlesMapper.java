package com.portfolio.portfolio.mapper;

import com.portfolio.portfolio.domain.Titles;
import com.portfolio.portfolio.domain.TitlesDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TitlesMapper {
    public Titles mapToTitles(final TitlesDto titlesDto) {
        return  new Titles(
                titlesDto.getTitle(),
                titlesDto.getAuthor(),
                titlesDto.getPublicationYear()
        );
    }
    public TitlesDto mapToTitlesDto(final Titles titles) {
        return new TitlesDto(
                titles.getTitleId(),
                titles.getTitle(),
                titles.getAuthor(),
                titles.getPublicationYear()
        );
    }
    public List<TitlesDto> mapToTitlesDtoList(final List<Titles> titlesList) {
        return titlesList.stream()
                .map(t-> new TitlesDto(t.getTitleId(),t.getTitle(),t.getAuthor(),t.getPublicationYear()))
                .collect(Collectors.toList());
    }
}
