package com.freemmy.restapidesignfirst.domain;

public interface Identifiable<ID> {

    ID getId();

    void setId(ID id);
}
