package br.edu.udf.bdadvanced.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "MYDB", name = "ADRESS")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ADRESS")
    private Integer cdAdress;

    @Getter
    @Column(name = "CEP")
    private Integer cep;

    @Getter
    @Column(name = "STREET")
    private String street;

    @Getter
    @Column(name = "NUMBER")
    private Integer number;

    @Column(name = "COMPLEMENT")
    private String complement;

    @Column(name = "CITY")
    private String city;

    @Column(name = "DISTRICT")
    private String district;

}
