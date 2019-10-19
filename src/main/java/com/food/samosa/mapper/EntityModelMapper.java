package com.food.samosa.mapper;

public interface EntityModelMapper<E, M> {
    E modelToEntity(M Model);
    M entityToModel(E entity);
}
