package com.devmaster.sinhvien.service.mapper;

import java.util.List;

public interface EntityMapper <D,E>{
    D toDo(E e);
    E toEntity(D d);
    List<D> toDo(List<E> e);
    List<E> toEntity(List<D> d);
}