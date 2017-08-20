package com.hello;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by alin- on 18.08.2017.
 */
@Entity
@Table(name = "contacts")
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;

    public Contact(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Contact(String name) {
        this.name = name;
    }

    public Contact() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
