package i0.f.a.c.r.k;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import i0.f.a.b.f;
import i0.f.a.c.i;
import java.io.IOException;

/* compiled from: WritableObjectId */
public final class e {
    public final ObjectIdGenerator<?> a;
    public Object b;
    public boolean c = false;

    public e(ObjectIdGenerator<?> objectIdGenerator) {
        this.a = objectIdGenerator;
    }

    public void a(JsonGenerator jsonGenerator, i iVar, a aVar) throws IOException {
        this.c = true;
        if (jsonGenerator.e()) {
            Object obj = this.b;
            jsonGenerator.v0(obj == null ? null : String.valueOf(obj));
            return;
        }
        f fVar = aVar.b;
        if (fVar != null) {
            jsonGenerator.Z(fVar);
            aVar.d.f(this.b, jsonGenerator, iVar);
        }
    }

    public boolean b(JsonGenerator jsonGenerator, i iVar, a aVar) throws IOException {
        if (this.b == null) {
            return false;
        }
        if (!this.c && !aVar.e) {
            return false;
        }
        if (!jsonGenerator.e()) {
            aVar.d.f(this.b, jsonGenerator, iVar);
            return true;
        }
        String.valueOf(this.b);
        throw new JsonGenerationException("No native support for writing Object Ids", jsonGenerator);
    }
}
