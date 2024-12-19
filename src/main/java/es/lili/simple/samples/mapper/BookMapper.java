package es.lili.simple.samples.mapper;

import es.lili.simple.samples.db.BookEntity;
import es.lili.simple.samples.model.Book;
import org.apache.commons.lang3.StringUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {

    @Mapping(target = "editorial", source = "editorialName")
    BookEntity mapBookDtoToEntity(Book book);

    @Mapping(target = "authorFullName", expression = "java(buildAuthorFullName(entity))")
    @Mapping(target = "editorialName", source = "editorial")
    Book mapBookEntityToDto(BookEntity entity);

    default String buildAuthorFullName(BookEntity entity) {
        return StringUtils.isEmpty(entity.getAuthorName()) && StringUtils.isEmpty(entity.getAuthorSurname())
                ? StringUtils.EMPTY
                : entity.getAuthorName().concat(entity.getAuthorSurname());
    }
}
