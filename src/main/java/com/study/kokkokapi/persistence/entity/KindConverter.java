package com.study.kokkokapi.persistence.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class KindConverter implements AttributeConverter<AreaEntity.Kind, String> {
    @Override
    public String convertToDatabaseColumn(AreaEntity.Kind attribute) {
        return attribute.toDbValue();
    }

    @Override
    public AreaEntity.Kind convertToEntityAttribute(String dbData) {
        return AreaEntity.Kind.from(dbData);
    }
}
