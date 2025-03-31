package backend.booklink.book.domain;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String description;
    private int pageCount;

    @Embedded
    private Publishing publishing;

    @Builder
    public Book(String title, String author, Publishing publishing, String description, int pageCount) {
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.description = description;
        this.pageCount = pageCount;
    }

}
