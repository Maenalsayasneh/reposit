package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import java.io.IOException;

public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    public StackTraceElementDeserializer() {
        super((Class<?>) StackTraceElement.class);
    }

    /* renamed from: y0 */
    public StackTraceElement d(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        JsonToken i = jsonParser.i();
        if (i == JsonToken.START_OBJECT) {
            int i2 = -1;
            String str = "";
            String str2 = str;
            String str3 = str2;
            while (true) {
                JsonToken N0 = jsonParser.N0();
                if (N0 == JsonToken.END_OBJECT) {
                    return new StackTraceElement(str, str2, str3, i2);
                }
                String f = jsonParser.f();
                if ("className".equals(f)) {
                    str = jsonParser.Z();
                } else if ("classLoaderName".equals(f)) {
                    jsonParser.Z();
                } else if ("fileName".equals(f)) {
                    str3 = jsonParser.Z();
                } else if ("lineNumber".equals(f)) {
                    if (N0.isNumeric()) {
                        i2 = jsonParser.I();
                    } else {
                        i2 = f0(jsonParser, deserializationContext);
                    }
                } else if ("methodName".equals(f)) {
                    str2 = jsonParser.Z();
                } else if (!"nativeMethod".equals(f)) {
                    if ("moduleName".equals(f)) {
                        jsonParser.Z();
                    } else if ("moduleVersion".equals(f)) {
                        jsonParser.Z();
                    } else if (!"declaringClass".equals(f) && !"format".equals(f)) {
                        x0(jsonParser, deserializationContext, this.d, f);
                    }
                }
                jsonParser.U0();
            }
        } else if (i != JsonToken.START_ARRAY || !deserializationContext.d0(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            deserializationContext.V(this.d, jsonParser);
            throw null;
        } else {
            jsonParser.M0();
            StackTraceElement y0 = d(jsonParser, deserializationContext);
            if (jsonParser.M0() == JsonToken.END_ARRAY) {
                return y0;
            }
            w0(deserializationContext);
            throw null;
        }
    }
}
