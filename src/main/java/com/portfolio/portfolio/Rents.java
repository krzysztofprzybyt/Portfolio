package com.portfolio.portfolio;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="RENTS")
public class Rents {

    private int id;
    private Date rentsDate;
    private Date returnDate;
    private Readers reader;
    private Books book;

    public Rents() {
    }

    public Rents(Readers reader, Books book) {
        this.reader = reader;
        this.book = book;
        this.rentsDate = new Date();
        this.returnDate = new Date();
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    private void setId(int bookId) {
        this.id = bookId;
    }

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    public Readers getReader() {
        return reader;
    }

    public void setReader(Readers reader) {
        this.reader = reader;
    }

    @OneToOne(
            cascade = CascadeType.REFRESH,
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
