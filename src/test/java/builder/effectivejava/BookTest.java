package builder.effectivejava;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class BookTest {

    @Test
    void shouldBeAbleToCreateBookWithOnlyMandatoryFieldsViaBuilder() {
        var book = new Book.BookBuilder("23", "Psychology of Money").build();

        assertNull(book.getAuthor());
        assertNull(book.getPublisher());
        assertNull(book.getPublishDate());
        assertNull(book.getDescription());
        assertEquals("23", book.getIsbn());
        assertEquals("Psychology of Money", book.getTitle());
    }

    @Test
    void shouldBeAbleToCreateBookWithChainingOfOptionalFieldsViaBuilder() {
        var book = new Book.BookBuilder("23", "Psychology of Money")
            .author("Morgan Housal").publishedYear(LocalDate.of(2020, 9, 9)).build();

        assertNull(book.getPublisher());
        assertNull(book.getDescription());
        assertEquals("Morgan Housal", book.getAuthor());
        assertEquals(LocalDate.parse("2020-09-09"), book.getPublishDate());
        assertEquals("23", book.getIsbn());
        assertEquals("Psychology of Money", book.getTitle());
    }
}
