package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import i0.f.a.b.e;
import i0.f.a.b.f;
import i0.f.a.b.m.d;
import java.io.IOException;
import java.io.Serializable;

public class DefaultPrettyPrinter implements e, d<DefaultPrettyPrinter>, Serializable {
    public static final SerializedString c = new SerializedString(" ");
    public transient int Y1;
    public Separators Z1;
    public String a2;
    public a d = FixedSpaceIndenter.c;
    public a q = DefaultIndenter.d;
    public final f x;
    public boolean y = true;

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter c = new FixedSpaceIndenter();

        public void a(JsonGenerator jsonGenerator, int i) throws IOException {
            jsonGenerator.w0(' ');
        }

        public boolean isInline() {
            return true;
        }
    }

    public static class NopIndenter implements a, Serializable {
        static {
            new NopIndenter();
        }

        public void a(JsonGenerator jsonGenerator, int i) throws IOException {
        }

        public boolean isInline() {
            return !(this instanceof DefaultIndenter);
        }
    }

    public interface a {
        void a(JsonGenerator jsonGenerator, int i) throws IOException;

        boolean isInline();
    }

    public DefaultPrettyPrinter() {
        SerializedString serializedString = c;
        this.x = serializedString;
        Separators separators = e.b;
        this.Z1 = separators;
        StringBuilder P0 = i0.d.a.a.a.P0(" ");
        P0.append(separators.c);
        P0.append(" ");
        this.a2 = P0.toString();
    }

    public void a(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.w0('{');
        if (!this.q.isInline()) {
            this.Y1++;
        }
    }

    public void b(JsonGenerator jsonGenerator) throws IOException {
        f fVar = this.x;
        if (fVar != null) {
            jsonGenerator.y0(fVar);
        }
    }

    public void c(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.w0(this.Z1.q);
        this.d.a(jsonGenerator, this.Y1);
    }

    public void d(JsonGenerator jsonGenerator) throws IOException {
        this.q.a(jsonGenerator, this.Y1);
    }

    public Object e() {
        if (DefaultPrettyPrinter.class == DefaultPrettyPrinter.class) {
            return new DefaultPrettyPrinter(this);
        }
        throw new IllegalStateException(i0.d.a.a.a.Y(DefaultPrettyPrinter.class, i0.d.a.a.a.P0("Failed `createInstance()`: "), " does not override method; it has to"));
    }

    public void f(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this.q.isInline()) {
            this.Y1--;
        }
        if (i > 0) {
            this.q.a(jsonGenerator, this.Y1);
        } else {
            jsonGenerator.w0(' ');
        }
        jsonGenerator.w0('}');
    }

    public void g(JsonGenerator jsonGenerator) throws IOException {
        if (!this.d.isInline()) {
            this.Y1++;
        }
        jsonGenerator.w0('[');
    }

    public void h(JsonGenerator jsonGenerator) throws IOException {
        this.d.a(jsonGenerator, this.Y1);
    }

    public void i(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.w0(this.Z1.d);
        this.q.a(jsonGenerator, this.Y1);
    }

    public void k(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this.d.isInline()) {
            this.Y1--;
        }
        if (i > 0) {
            this.d.a(jsonGenerator, this.Y1);
        } else {
            jsonGenerator.w0(' ');
        }
        jsonGenerator.w0(']');
    }

    public void l(JsonGenerator jsonGenerator) throws IOException {
        if (this.y) {
            jsonGenerator.A0(this.a2);
        } else {
            jsonGenerator.w0(this.Z1.c);
        }
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        f fVar = defaultPrettyPrinter.x;
        this.d = defaultPrettyPrinter.d;
        this.q = defaultPrettyPrinter.q;
        this.y = defaultPrettyPrinter.y;
        this.Y1 = defaultPrettyPrinter.Y1;
        this.Z1 = defaultPrettyPrinter.Z1;
        this.a2 = defaultPrettyPrinter.a2;
        this.x = fVar;
    }
}
