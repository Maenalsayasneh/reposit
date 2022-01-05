package m0.r.t.a.r.k.b;

import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import m0.n.b.i;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.f.c.e;

/* compiled from: ContractDeserializer.kt */
public interface f {
    public static final a a = a.a;

    /* compiled from: ContractDeserializer.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final f b = new C0274a();

        /* renamed from: m0.r.t.a.r.k.b.f$a$a  reason: collision with other inner class name */
        /* compiled from: ContractDeserializer.kt */
        public static final class C0274a implements f {
            public Pair a(ProtoBuf$Function protoBuf$Function, r rVar, e eVar, TypeDeserializer typeDeserializer) {
                i.e(protoBuf$Function, "proto");
                i.e(rVar, "ownerFunction");
                i.e(eVar, "typeTable");
                i.e(typeDeserializer, "typeDeserializer");
                return null;
            }
        }
    }

    Pair<a.C0250a<?>, Object> a(ProtoBuf$Function protoBuf$Function, r rVar, e eVar, TypeDeserializer typeDeserializer);
}
