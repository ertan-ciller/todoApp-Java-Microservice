package com.todoApp.core.mapper;


import org.modelmapper.ModelMapper;


public interface MapperService {

    ModelMapper forResponse();
    ModelMapper forRequest();
}
