package builder.effectivejava;

import java.time.LocalDate;

public class Book {

    private final String isbn;
    private final String title;
    private final String description;
    private final String author;
    private final String publisher;
    private final LocalDate publishDate;

    private Book(BookBuilder bookBuilder) {
        this.isbn = bookBuilder.isbn;
        this.title = bookBuilder.title;
        this.description = bookBuilder.description;
        this.author = bookBuilder.author;
        this.publisher = bookBuilder.publisher;
        this.publishDate = bookBuilder.publishDate;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public static class BookBuilder {

        private final String isbn;
        private final String title;
        private String description;
        private String author;
        private String publisher;
        private LocalDate publishDate;

        public BookBuilder(String isbn, String title) {
            this.isbn = isbn;
            this.title = title;
        }

        public BookBuilder description(String description) {
            this.description = description;
            return this;
        }

        public BookBuilder author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public BookBuilder publishedYear(LocalDate publishedYear) {
            this.publishDate = publishedYear;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
