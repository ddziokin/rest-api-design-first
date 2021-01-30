package com.freemmy.rest.api.design.first.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class Vehicle<ID> implements Identifiable<ID> {

    @Id
    private ID id;
}
