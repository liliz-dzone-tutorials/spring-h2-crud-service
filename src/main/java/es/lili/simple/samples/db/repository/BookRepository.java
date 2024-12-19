package es.lili.simple.samples.db.repository;

import es.lili.simple.samples.db.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, BigDecimal>, JpaSpecificationExecutor<BookEntity> {

}
