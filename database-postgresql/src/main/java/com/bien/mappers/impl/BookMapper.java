package com.bien.mappers.impl;

import com.bien.domain.dto.BookDTO;
import com.bien.domain.entities.BookEntity;
import com.bien.mappers.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper implements Mapper<BookEntity, BookDTO> {

    private ModelMapper modelMapper;
    public BookMapper(ModelMapper mapper) {
        this.modelMapper = mapper;
    }

    @Override
    public BookDTO mapTo(BookEntity bookEntity) {
        return modelMapper.map(bookEntity,BookDTO.class);
    }

    @Override
    public BookEntity mapFrom(BookDTO bookDTO) {
        return modelMapper.map(bookDTO,BookEntity.class);
    }
}
