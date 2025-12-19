package com.bien.database_postgresql;

import com.bien.domain.dto.AuthorDTO;
import com.bien.domain.dto.BookDTO;
import com.bien.domain.entities.AuthorEntity;
import com.bien.domain.entities.BookEntity;

public final class TestDataUtil {
    private TestDataUtil() {

    }

    public static AuthorEntity createTestAuthorA() {
        return AuthorEntity.builder()
//                .id(1L)
                .name("Bien")
                .age(67)
                .build();
    }
    public static AuthorEntity createTestAuthorB() {
        return AuthorEntity.builder()
//                .id(2L)
                .name("Huy")
                .age(76)
                .build();
    }
    public static AuthorEntity createTestAuthorC() {
        return AuthorEntity.builder()
//                .id(3L)
                .name("Kien")
                .age(67)
                .build();
    }

    public static AuthorDTO createTestAuthorDTOA() {
        return AuthorDTO.builder()
//                .id(1L)
                .name("Bien")
                .age(67)
                .build();
    }

    public static BookEntity createTestBookA(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("123-456-789")
                .title("Mockito for Dummies")
                .authorEntity(authorEntity)
                .build();
    }

    public static BookDTO createTestBookDTOA(final AuthorDTO author) {
        return BookDTO.builder()
                .isbn("123-456-789")
                .title("Mockito for Dummies")
                .author(author)
                .build();
    }

    public static BookEntity createTestBookB(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("223-456-789")
                .title("Java for Dummies")
                .authorEntity(authorEntity)
                .build();
    }
    public static BookEntity createTestBookC(final AuthorEntity authorEntity) {
        return BookEntity.builder()
                .isbn("323-456-789")
                .title("Spring Boot for Dummies")
                .authorEntity(authorEntity)
                .build();
    }

}
