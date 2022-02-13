package ru.postlife.spring.hibernate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;
//
    @ManyToOne
//    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Author author_id) {
        this.author_id = author_id;
    }

    //(fetch = FetchType.LAZY)

    @ManyToMany
    @JoinTable(
            name = "books_readers", // название таблицы
            joinColumns = @JoinColumn(name = "book_id"),  // то что связываем
            inverseJoinColumns = @JoinColumn(name = "reader_id") // то на что связываем
    )
    private List<Reader> readers;


    //   @ManyToOne
    // (fetch = FetchType.LAZY)
//    @OneToOne
//    @JoinColumn(name = "author_id")
//    private Author author_id;
//
//    public Author getAuthor_id() {
//        return author_id;
//    }

    public List<Reader> getReaders() {
        return readers;
    }
//
    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

//    public void setAuthor_id(Author author_id) {
//        this.author_id = author_id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }

//    @Override
//    public String toString() {
//        return "Book [" + id + " " + title + "]";
//    }

//    @Override
//    public String toString() {
//        return "Book [" + id + " " + title + "]";
//    }
    @Override
    public String toString() {
        return "Book [" + id + ", " + title + ", " + author_id.getName() + "]";
    }
}
