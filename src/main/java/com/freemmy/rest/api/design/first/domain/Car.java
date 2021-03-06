package com.freemmy.rest.api.design.first.domain;

import lombok.*;
import org.springframework.data.relational.core.mapping.Column;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Car extends Vehicle<Long> {

    @Column
    private String manufacturer;
    @Column
    private String model;
}
