package backend.booklink.book.dto;

public record BookResponse(
        String title,
        String author,
        BookPublishingResponse publishing,
        String description,
        int pageCount
) {

}
