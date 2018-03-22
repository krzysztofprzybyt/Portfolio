package com.portfolio.portfolio.domain;



import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="RENTS")
public class Rents {

    private Integer id;
    private Date rentsDate;
    private Date returnDate;
    private Readers reader;
    private Books book;

    public Rents(Readers reader, Books book) {
        this.reader = reader;
        this.book = book;
        this.rentsDate = new Date();
        this.returnDate = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true)
    public Integer getId() {
        return id;
    }

    private void setId(Integer bookId) {
        this.id = bookId;
    }

    @ManyToOne(
            cascade = CascadeType.ALL

    )
    @JoinColumn(name = "USER_ID")
    public Readers getReader() {
        return reader;
    }

    public void setReader(Readers reader) {
        this.reader = reader;
    }

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    @JoinColumn(name = "BOOK_ID")
    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    @Column(name="RENTS_DATE")
    public Date getRentsDate() {
        return rentsDate;
    }

    private void setRentsDate(Date rentsDate) {
        this.rentsDate = rentsDate;
    }

    @Column(name="RETURN_DATE")
    public Date getReturnDate() {
        return returnDate;
    }

    private void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

}
