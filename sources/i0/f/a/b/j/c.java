package i0.f.a.b.j;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import i0.f.a.b.d;
import i0.f.a.b.f;
import i0.f.a.b.h.a;
import i0.f.a.b.i.b;
import java.io.IOException;

/* compiled from: JsonGeneratorImpl */
public abstract class c extends a {
    public static final int[] b2 = i0.f.a.b.i.a.h;
    public final b c2;
    public int[] d2 = b2;
    public int e2;
    public f f2 = DefaultPrettyPrinter.c;
    public boolean g2;

    public c(b bVar, int i, d dVar) {
        super(i, dVar);
        this.c2 = bVar;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i)) {
            this.e2 = 127;
        }
        this.g2 = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    public JsonGenerator E(f fVar) {
        this.f2 = fVar;
        return this;
    }

    public void U0(int i, int i2) {
        super.U0(i, i2);
        this.g2 = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.enabledIn(i);
    }

    public void W0(String str) throws IOException {
        throw new JsonGenerationException(String.format("Can not %s, expecting field name (context: %s)", new Object[]{str, this.a2.h()}), this);
    }

    public JsonGenerator i(JsonGenerator.Feature feature) {
        super.i(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this.g2 = true;
        }
        return this;
    }

    public JsonGenerator z(int i) {
        if (i < 0) {
            i = 0;
        }
        this.e2 = i;
        return this;
    }
}
