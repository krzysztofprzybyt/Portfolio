package com.portfolio.portfolio;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TITLES", uniqueConstraints={@UniqueConstraint(columnNames = {"title" , "author", "publication"})})
public class Titles {

    private int titleId;
    private String title;
    private String author;
    private int publicationYear;
    private List<Books> books = new ArrayList<>();

    public Titles() {
    }

    public Titles(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getTitleId() {
        return titleId;
    }

    @Column(name="TITLE")
    @NotNull
    public String getTitle() {
        return title;
    }

    @Column(name="AUTHOR")
    @NotNull
    public String getAuthor() {
        return author;
    }

    @Column(name="PUBLICATION")
    @NotNull
    public int getPublicationYear() {
        return publicationYear;
    }

    private void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    private void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @OneToMany(
            targetEntity = Books.class,
            mappedBy = "title",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }


}
