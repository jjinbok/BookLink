package backend.booklink.book.domain;

import jakarta.persistence.Embeddable;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class PublishingInfo {

    private String publisher;
    private LocalDateTime publishedDate;
    private String isbn;

}
