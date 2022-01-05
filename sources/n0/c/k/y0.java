package n0.c.k;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.j.d;
import n0.c.k.w0;

/* compiled from: CollectionSerializers.kt */
public abstract class y0<Element, Array, Builder extends w0<Array>> extends l0<Element, Array, Builder> {
    public final SerialDescriptor b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y0(KSerializer<Element> kSerializer) {
        super(kSerializer, (f) null);
        i.e(kSerializer, "primitiveSerializer");
        this.b = new x0(kSerializer.getDescriptor());
    }

    public Object a() {
        return (w0) i(l());
    }

    public int b(Object obj) {
        w0 w0Var = (w0) obj;
        i.e(w0Var, "$this$builderSize");
        return w0Var.d();
    }

    public void c(Object obj, int i) {
        w0 w0Var = (w0) obj;
        i.e(w0Var, "$this$checkCapacity");
        w0Var.b(i);
    }

    public final Iterator<Element> d(Array array) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    public final Array deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return f(decoder, null);
    }

    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public Object j(Object obj) {
        w0 w0Var = (w0) obj;
        i.e(w0Var, "$this$toResult");
        return w0Var.a();
    }

    public void k(Object obj, int i, Object obj2) {
        i.e((w0) obj, "$this$insert");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Array l();

    public abstract void m(d dVar, Array array, int i);

    public final void serialize(Encoder encoder, Array array) {
        i.e(encoder, "encoder");
        int e = e(array);
        d t = encoder.t(this.b, e);
        m(t, array, e);
        t.b(this.b);
    }
}
