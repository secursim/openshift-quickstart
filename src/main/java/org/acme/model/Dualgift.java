package org.acme.model;
import javax.persistence.*;
@Entity
public class Dualgift {
    private Long id;
    private String name;

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="giftSeq")
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
}