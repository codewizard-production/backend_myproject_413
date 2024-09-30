package com.app.myproject.converter;

import com.app.myproject.enums.PaymentMode;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = false)
public class PaymentModeConverter implements AttributeConverter<PaymentMode, Integer> {

    @Override
    public Integer convertToDatabaseColumn(PaymentMode paymentMode) {
        return paymentMode != null ? paymentMode.ordinal() : null;
    }

    @Override
    public PaymentMode convertToEntityAttribute(Integer dbData) {
      if (dbData == null) {
        return null;
      }
		  return PaymentMode.getPaymentMode(dbData);
    }
}
