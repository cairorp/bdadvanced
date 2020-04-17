package br.edu.udf.bdadvanced.model;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(schema = "MYDB", name = "STATUS")
public class Status {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_STATUS")
    private Integer cdStatus;

    @Column(name = "DESCRIPTION")
    private String description;

    public String getDescription() {
        return description.toUpperCase();
    }
}
