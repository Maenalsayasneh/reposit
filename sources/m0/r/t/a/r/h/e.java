package m0.r.t.a.r.h;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* compiled from: ExtensionRegistryLite */
public class e {
    public static final e a = new e(true);
    public final Map<a, GeneratedMessageLite.e<?, ?>> b;

    /* compiled from: ExtensionRegistryLite */
    public static final class a {
        public final Object a;
        public final int b;

        public a(Object obj, int i) {
            this.a = obj;
            this.b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    public e() {
        this.b = new HashMap();
    }

    public final void a(GeneratedMessageLite.e<?, ?> eVar) {
        this.b.put(new a(eVar.a, eVar.d.d), eVar);
    }

    public e(boolean z) {
        this.b = Collections.emptyMap();
    }
}
