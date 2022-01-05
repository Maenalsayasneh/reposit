package t0.b0.a;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.pubnub.api.vendor.FileEncryptionUtil;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import m0.n.b.i;
import okio.ByteString;
import q0.c0;
import q0.d0;
import q0.y;
import r0.f;
import r0.g;
import t0.h;

/* compiled from: GsonRequestBodyConverter */
public final class b<T> implements h<T, d0> {
    public static final y a = y.b("application/json; charset=UTF-8");
    public static final Charset b = Charset.forName(FileEncryptionUtil.ENCODING_UTF_8);
    public final Gson c;
    public final TypeAdapter<T> d;

    public b(Gson gson, TypeAdapter<T> typeAdapter) {
        this.c = gson;
        this.d = typeAdapter;
    }

    public Object a(Object obj) throws IOException {
        f fVar = new f();
        JsonWriter newJsonWriter = this.c.newJsonWriter(new OutputStreamWriter(new g(fVar), b));
        this.d.write(newJsonWriter, obj);
        newJsonWriter.close();
        y yVar = a;
        ByteString X = fVar.X();
        i.e(X, "content");
        i.e(X, "$this$toRequestBody");
        return new c0(X, yVar);
    }
}
