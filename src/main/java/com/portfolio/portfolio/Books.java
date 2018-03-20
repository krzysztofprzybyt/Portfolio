package com.portfolio.portfolio;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="BOOKS")
public class Books {

    private int bookId;
   //status variants - inRotation, damaged, lost
    private String status;
    private Titles title;

    public Books() {
    }

    public Books(Titles title, String status) {
        this.title = title;
        this.status = status;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getBookId() {
        return bookId;
    }

    private void setBookId(int bookId) {
        this.bookId = bookId;
    }


    @Column(name="STATUS")
    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "TITLE_ID")
    public Titles getTitle() {
        return title;
    }

    public void setTitle(Titles title) {
        this.title = title;
    }
}
