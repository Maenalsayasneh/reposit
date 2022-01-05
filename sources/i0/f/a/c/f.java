package i0.f.a.c;

import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.c.p.e;
import java.io.IOException;

/* compiled from: JsonSerializable */
public interface f {

    /* compiled from: JsonSerializable */
    public static abstract class a implements f {
        public boolean e(i iVar) {
            return false;
        }
    }

    void b(JsonGenerator jsonGenerator, i iVar) throws IOException;

    void c(JsonGenerator jsonGenerator, i iVar, e eVar) throws IOException;
}
