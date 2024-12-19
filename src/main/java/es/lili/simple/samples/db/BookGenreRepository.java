package es.lili.simple.samples.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BookGenreRepository extends JpaRepository<BookGenreEntity, BookGenreEntityPk> {

    @Query("SELECT bookId FROM BookGenreEntity WHERE genreId IN :genreIds")
    List<BigDecimal> findAllBooksWithGenreIn(List<Long> genreIds);

    @Query("SELECT genreId FROM BookGenreEntity WHERE bookId = :bookId")
    List<Long> findAllGenresOfABook(BigDecimal bookId);
}
