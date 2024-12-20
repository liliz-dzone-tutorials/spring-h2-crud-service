package es.lili.simple.samples.db.repository;

import es.lili.simple.samples.db.entity.BookGenreEntity;
import es.lili.simple.samples.db.entity.BookGenreEntityPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookGenreRepository extends JpaRepository<BookGenreEntity, BookGenreEntityPk> {

}
