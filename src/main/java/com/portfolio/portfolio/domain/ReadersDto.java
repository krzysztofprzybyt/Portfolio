package com.portfolio.portfolio.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ReadersDto {

    private Integer userId;
    private String name;
    private String surname;
    private Date dateOfCreateAccount;
    private List<RentsDto> rentsDtoList;

    public ReadersDto(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.dateOfCreateAccount = new Date();
    }
}
