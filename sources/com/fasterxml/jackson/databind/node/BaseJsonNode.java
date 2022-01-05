package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.json.JsonMapper;
import i0.f.a.b.i.g;
import i0.f.a.c.e;
import i0.f.a.c.i;
import i0.f.a.c.q.a;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

public abstract class BaseJsonNode extends e implements Serializable {
    public abstract void b(JsonGenerator jsonGenerator, i iVar) throws IOException, JsonProcessingException;

    public String toString() {
        JsonMapper jsonMapper = a.a;
        try {
            ObjectWriter objectWriter = a.b;
            Objects.requireNonNull(objectWriter);
            g gVar = new g(objectWriter.y.d());
            objectWriter.a(objectWriter.b(gVar), this);
            String h = gVar.c.h();
            gVar.c.p();
            return h;
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.e(e2);
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }
}
