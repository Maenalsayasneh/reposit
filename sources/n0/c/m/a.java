package n0.c.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.KSerializer;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.n.b.r;
import m0.r.d;
import n0.c.b;
import n0.c.l.q.q;

/* compiled from: SerializersModule.kt */
public final class a extends b {
    public final Map<d<?>, KSerializer<?>> a;
    public final Map<d<?>, Map<d<?>, KSerializer<?>>> b;
    public final Map<d<?>, Map<String, KSerializer<?>>> c;
    public final Map<d<?>, l<String, b<?>>> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Map<d<?>, ? extends KSerializer<?>> map, Map<d<?>, ? extends Map<d<?>, ? extends KSerializer<?>>> map2, Map<d<?>, ? extends Map<String, ? extends KSerializer<?>>> map3, Map<d<?>, ? extends l<? super String, ? extends b<?>>> map4) {
        super((f) null);
        i.e(map, "class2Serializer");
        i.e(map2, "polyBase2Serializers");
        i.e(map3, "polyBase2NamedSerializers");
        i.e(map4, "polyBase2DefaultProvider");
        this.a = map;
        this.b = map2;
        this.c = map3;
        this.d = map4;
    }

    public void a(c cVar) {
        i.e(cVar, "collector");
        for (Map.Entry next : this.a.entrySet()) {
            d dVar = (d) next.getKey();
            KSerializer kSerializer = (KSerializer) next.getValue();
            Objects.requireNonNull(dVar, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Objects.requireNonNull(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T>");
            ((q) cVar).a(dVar, kSerializer);
        }
        for (Map.Entry next2 : this.b.entrySet()) {
            d dVar2 = (d) next2.getKey();
            for (Map.Entry entry : ((Map) next2.getValue()).entrySet()) {
                d dVar3 = (d) entry.getKey();
                KSerializer kSerializer2 = (KSerializer) entry.getValue();
                Objects.requireNonNull(dVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Objects.requireNonNull(dVar3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Objects.requireNonNull(kSerializer2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T>");
                ((q) cVar).b(dVar2, dVar3, kSerializer2);
            }
        }
        for (Map.Entry next3 : this.d.entrySet()) {
            d dVar4 = (d) next3.getKey();
            l lVar = (l) next3.getValue();
            Objects.requireNonNull(dVar4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Objects.requireNonNull(lVar, "null cannot be cast to non-null type kotlinx.serialization.modules.PolymorphicProvider<out kotlin.Any> /* = (className: kotlin.String?) -> kotlinx.serialization.DeserializationStrategy<out kotlin.Any>? */");
            r.c(lVar, 1);
            ((q) cVar).c(dVar4, lVar);
        }
    }

    public <T> KSerializer<T> b(d<T> dVar) {
        i.e(dVar, "kclass");
        KSerializer<?> kSerializer = this.a.get(dVar);
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        return kSerializer;
    }

    public <T> b<? extends T> c(d<? super T> dVar, String str) {
        i.e(dVar, "baseClass");
        Map map = this.c.get(dVar);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        l<String, b<?>> lVar = this.d.get(dVar);
        if (!r.d(lVar, 1)) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (lVar2 != null) {
            return (b) lVar2.invoke(str);
        }
        return null;
    }

    public <T> n0.c.f<T> d(d<? super T> dVar, T t) {
        i.e(dVar, "baseClass");
        i.e(t, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        i.e(t, "$this$isInstanceOf");
        i.e(dVar, "kclass");
        if (!h.m1(dVar).isInstance(t)) {
            return null;
        }
        Map map = this.b.get(dVar);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(m.a(t.getClass())) : null;
        if (!(kSerializer instanceof n0.c.f)) {
            return null;
        }
        return kSerializer;
    }
}
