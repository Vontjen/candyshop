package com.realdolmen.candyshop.entities;

import javax.persistence.*;

@Entity
public class Candy {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    
    @Enumerated(EnumType.STRING)
    private CandyColor color;

    public Candy() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
