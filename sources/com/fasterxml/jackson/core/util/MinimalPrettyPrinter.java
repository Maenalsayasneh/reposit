package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.b.e;
import java.io.IOException;
import java.io.Serializable;

public class MinimalPrettyPrinter implements e, Serializable {
    public String c = e.e.d;
    public Separators d = e.b;

    public void a(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.w0('{');
    }

    public void b(JsonGenerator jsonGenerator) throws IOException {
        String str = this.c;
        if (str != null) {
            jsonGenerator.A0(str);
        }
    }

    public void c(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.w0(this.d.q);
    }

    public void d(JsonGenerator jsonGenerator) throws IOException {
    }

    public void f(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.w0('}');
    }

    public void g(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.w0('[');
    }

    public void h(JsonGenerator jsonGenerator) throws IOException {
    }

    public void i(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.w0(this.d.d);
    }

    public void k(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.w0(']');
    }

    public void l(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.w0(this.d.c);
    }
}
