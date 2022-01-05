package t0.b0.a;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import q0.f0;
import t0.h;

/* compiled from: GsonResponseBodyConverter */
public final class c<T> implements h<f0, T> {
    public final Gson a;
    public final TypeAdapter<T> b;

    public c(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    public Object a(Object obj) throws IOException {
        f0 f0Var = (f0) obj;
        JsonReader newJsonReader = this.a.newJsonReader(f0Var.charStream());
        try {
            T read = this.b.read(newJsonReader);
            if (newJsonReader.peek() == JsonToken.END_DOCUMENT) {
                return read;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            f0Var.close();
        }
    }
}
