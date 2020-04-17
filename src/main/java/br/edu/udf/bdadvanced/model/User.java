package br.edu.udf.bdadvanced.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Table(schema = "MYDB", name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER")
    private Integer cdUser;

    @Column(name = "LOGIN")
    private String login;

    @Setter
    @Getter
    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "MAIL")
    private String mail;

    @Column(name = "DOCUMENT")
    private Long document;

    @Column(name = "PHONE")
    private Long phone;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "CD_ADRESS", referencedColumnName = "ID_ADRESS")
    private Adress adress;
}
