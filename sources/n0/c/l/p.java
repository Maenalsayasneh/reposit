package n0.c.l;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.TreeJsonEncoderKt$writeJson$encoder$1;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.l.q.k;

/* compiled from: JsonTransformingSerializer.kt */
public abstract class p<T> implements KSerializer<T> {
    public final KSerializer<T> a;

    public p(KSerializer<T> kSerializer) {
        i.e(kSerializer, "tSerializer");
        this.a = kSerializer;
    }

    public final T deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        e U = a.U(decoder);
        JsonElement i = U.i();
        a d = U.d();
        KSerializer<T> kSerializer = this.a;
        i.e(i, "element");
        return d.d(kSerializer, i);
    }

    public SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    public final void serialize(Encoder encoder, T t) {
        JsonObject jsonObject;
        i.e(encoder, "encoder");
        i.e(t, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        g V = a.V(encoder);
        a d = V.d();
        KSerializer<T> kSerializer = this.a;
        i.e(d, "$this$writeJson");
        i.e(kSerializer, "serializer");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.c = null;
        new k(d, new TreeJsonEncoderKt$writeJson$encoder$1(ref$ObjectRef)).e(kSerializer, t);
        T t2 = ref$ObjectRef.c;
        if (t2 != null) {
            JsonElement jsonElement = (JsonElement) t2;
            i.e(jsonElement, "element");
            if (jsonElement instanceof JsonArray) {
                JsonArray jsonArray = (JsonArray) jsonElement;
                int i = 0;
                if (jsonArray.size() == 0) {
                    m mVar = new m();
                    a.W2(mVar, "count", 0);
                    jsonObject = new JsonObject(mVar.a);
                } else {
                    m mVar2 = new m();
                    int size = jsonArray.size();
                    while (i < size) {
                        int i2 = i + 1;
                        String valueOf = String.valueOf(i2);
                        JsonElement b = jsonArray.b(i);
                        i.e(valueOf, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                        i.e(b, "element");
                        JsonElement put = mVar2.a.put(valueOf, b);
                        i = i2;
                    }
                    a.W2(mVar2, "count", Integer.valueOf(jsonArray.size()));
                    jsonObject = new JsonObject(mVar2.a);
                }
                V.w(jsonObject);
                return;
            }
            throw new IllegalStateException("Only lists can be transformed");
        }
        i.m("result");
        throw null;
    }
}
