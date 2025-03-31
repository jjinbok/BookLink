package backend.booklink.book.dto;

import java.time.LocalDateTime;

public record BookPublishingResponse(
    String publisher,
    LocalDateTime publishedDate,
    String isbn
) {

}
