package com.app.myproject.converter;

import com.app.myproject.enums.General;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class GeneralConverter implements AttributeConverter<General, Integer> {

    @Override
    public Integer convertToDatabaseColumn(General general) {
        return general != null ? general.ordinal() : null;
    }

    @Override
    public General convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return General.getGeneral(dbData);
    }
}
