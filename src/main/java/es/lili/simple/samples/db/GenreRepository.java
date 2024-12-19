package es.lili.simple.samples.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {

    List<GenreEntity> findByName(String name);

    @Query("SELECT id FROM GenreEntity WHERE name LIKE %:name%")
    List<Long> findIdsByNameLike(String name);

}
