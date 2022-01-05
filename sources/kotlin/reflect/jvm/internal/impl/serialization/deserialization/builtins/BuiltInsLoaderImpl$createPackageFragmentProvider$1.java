package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import kotlin.jvm.internal.FunctionReference;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.f;
import m0.r.t.a.r.k.b.v.c;

/* compiled from: BuiltInsLoaderImpl.kt */
public /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends FunctionReference implements l<String, InputStream> {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(c cVar) {
        super(1, cVar);
    }

    public final String getName() {
        return "loadResource";
    }

    public final f getOwner() {
        return m.a(c.class);
    }

    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    public Object invoke(Object obj) {
        String str = (String) obj;
        i.e(str, "p0");
        return ((c) this.receiver).a(str);
    }
}
