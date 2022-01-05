package t0.b0.a;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import q0.d0;
import q0.f0;
import t0.h;
import t0.w;

/* compiled from: GsonConverterFactory */
public final class a extends h.a {
    public final Gson a;

    public a(Gson gson) {
        this.a = gson;
    }

    public h<?, d0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        return new b(this.a, this.a.getAdapter(TypeToken.get(type)));
    }

    public h<f0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        return new c(this.a, this.a.getAdapter(TypeToken.get(type)));
    }
}
