package backend.booklink.book.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Publishing {

    private String publisher;
    private LocalDateTime publishedDate;
    private String isbn;

}
