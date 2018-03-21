package com.portfolio.portfolio.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="READERS", uniqueConstraints={@UniqueConstraint(columnNames = {"NAME" , "SURNAME"})})
public class Readers {

    private Integer userId;
    private String name;
    private String surname;
    private Date dateOfCreateAccount;
    private List<Rents> rents;


    public Readers() {
    }

    public Readers(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.dateOfCreateAccount = new Date();
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getUserId() {
        return userId;
    }

    private void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name="NAME")
    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Column(name="SURNAME")
    public String getSurname() {
        return surname;
    }

    private void setSurname(String surname) {
        this.surname = surname;
    }

    @Column(name="DATE_CREATE")
    public Date getDateOfCreateAccount() {
        return dateOfCreateAccount;
    }

    private void setDateOfCreateAccount(Date dateOfCreateAccount) {
        this.dateOfCreateAccount = dateOfCreateAccount;
    }

    @OneToMany(
            targetEntity = Rents.class,
            mappedBy = "reader",
            cascade = CascadeType.REFRESH,
            fetch = FetchType.EAGER
    )
    public List<Rents> getRents() {
        return rents;
    }

    public void setRents(List<Rents> rents) {
        this.rents = rents;
    }
}
