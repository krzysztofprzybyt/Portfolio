package com.portfolio.portfolio.domain;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
@AllArgsConstructor
//@NoArgsConstructor
@Entity
@Table(name="BOOKS")
public class Books {

    private Integer bookId;
    private String status;
    private Titles title;


    public Books(Titles title, String status) {
        this.status = status;
        this.title = title;
    }
    public Books() {
        this.status = "InUse";

    }
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", unique = true)
    public Integer getBookId() {
        return bookId;
    }

    private void setBookId(Integer bookId) {
        this.bookId = bookId;
    }


    @Column(name="STATUS")
    public String getStatus() {
        return status;
    }

    private void setStatus(String status) {
        this.status = status;
    }

    @ManyToOne(
            cascade = CascadeType.ALL,
            optional = false,
            fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "TITLE_ID")
    public Titles getTitle() {
        return title;
    }

    public void setTitle(Titles title) {
        this.title = title;
    }

}
