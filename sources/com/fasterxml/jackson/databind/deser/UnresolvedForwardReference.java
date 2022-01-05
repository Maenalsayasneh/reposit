package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import i0.f.a.c.l.k;
import i0.f.a.c.l.m.h;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UnresolvedForwardReference extends JsonMappingException {
    public h x;
    public List<k> y;

    public UnresolvedForwardReference(JsonParser jsonParser, String str, JsonLocation jsonLocation, h hVar) {
        super((Closeable) jsonParser, str, jsonLocation);
        this.x = hVar;
    }

    public String getMessage() {
        String d = d();
        if (this.y == null) {
            return d;
        }
        StringBuilder sb = new StringBuilder(d);
        Iterator<k> it = this.y.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('.');
        return sb.toString();
    }

    public UnresolvedForwardReference(JsonParser jsonParser, String str) {
        super(jsonParser, str);
        this.y = new ArrayList();
    }
}
