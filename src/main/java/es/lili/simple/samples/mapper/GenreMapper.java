package es.lili.simple.samples.mapper;

import es.lili.simple.samples.db.GenreEntity;
import es.lili.simple.samples.model.Genre;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GenreMapper {

    @Mapping(target = "id", source = "idGenre")
    GenreEntity mapGenreDtoToEntity(Genre genre);

    @Mapping(target = "idGenre", source = "id")
    Genre mapGenreEntityToDto(GenreEntity genre);
}
