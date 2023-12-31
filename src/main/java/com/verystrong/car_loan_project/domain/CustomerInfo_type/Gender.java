package com.verystrong.car_loan_project.domain.CustomerInfo_type;

import lombok.Getter;

@Getter
public enum Gender {
    Man("남자"),
    Woman("여자");

    private final String name;
    private Gender(String name) {
        this.name = name;
    }
}
