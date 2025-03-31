package backend.booklink.book.dto;

import backend.booklink.book.domain.PublishingInfo;

public record BookResponse(
    String title,
    String author,
    PublishingInfo publishingInfo,
    String description,
    int pageCount
) {

}
