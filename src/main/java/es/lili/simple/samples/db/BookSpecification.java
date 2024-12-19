package es.lili.simple.samples.db;

import org.springframework.data.jpa.domain.Specification;

public class BookSpecification {

    private BookSpecification() {
        //Add private constructor to hide implicit oen
    }

    public static Specification<BookEntity> bookNameLike(String bookName) {
        return (root, query, builder) -> builder.like(root.get("name"), "%" + bookName + "%");
    }

    public static Specification<BookEntity> authorNameLike(String authorName) {
        return (root, query, builder) -> builder.like(root.get("authorName"), "%" + authorName + "%");
    }

    public static Specification<BookEntity> authorSurnameLike(String authorSurname) {
        return (root, query, builder) -> builder.like(root.get("authorSurname"), "%" + authorSurname + "%");
    }

    public static Specification<BookEntity> editorialLike(String editorial) {
        return (root, query, builder) -> builder.like(root.get("editorial"), "%" + editorial + "%");
    }

}
