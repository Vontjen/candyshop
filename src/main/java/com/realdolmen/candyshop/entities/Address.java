package com.realdolmen.candyshop.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
    private String street1;
    private String street2;
    private String city;
    private String state;
}