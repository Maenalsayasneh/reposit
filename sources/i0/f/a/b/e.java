package i0.f.a.b;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.Separators;
import java.io.IOException;

/* compiled from: PrettyPrinter */
public interface e {
    public static final Separators b = new Separators();
    public static final SerializedString e = new SerializedString(" ");

    void a(JsonGenerator jsonGenerator) throws IOException;

    void b(JsonGenerator jsonGenerator) throws IOException;

    void c(JsonGenerator jsonGenerator) throws IOException;

    void d(JsonGenerator jsonGenerator) throws IOException;

    void f(JsonGenerator jsonGenerator, int i) throws IOException;

    void g(JsonGenerator jsonGenerator) throws IOException;

    void h(JsonGenerator jsonGenerator) throws IOException;

    void i(JsonGenerator jsonGenerator) throws IOException;

    void k(JsonGenerator jsonGenerator, int i) throws IOException;

    void l(JsonGenerator jsonGenerator) throws IOException;
}
