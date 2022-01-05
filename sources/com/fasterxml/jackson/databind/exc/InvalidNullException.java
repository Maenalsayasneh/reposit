package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.PropertyName;

public class InvalidNullException extends MismatchedInputException {
    public static final /* synthetic */ int x = 0;

    public InvalidNullException(DeserializationContext deserializationContext, String str, PropertyName propertyName) {
        super(deserializationContext.Z1, str);
    }
}
