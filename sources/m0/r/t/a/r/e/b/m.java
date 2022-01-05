package m0.r.t.a.r.e.b;

import com.pubnub.api.PubNubUtil;
import i0.d.a.a.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.f.c.c;
import m0.r.t.a.r.f.d.a.e;

/* compiled from: MemberSignature.kt */
public final class m {
    public final String a;

    public m(String str, f fVar) {
        this.a = str;
    }

    public static final m a(String str, String str2) {
        i.e(str, "name");
        i.e(str2, "desc");
        return new m(str + '#' + str2, (f) null);
    }

    public static final m b(e eVar) {
        i.e(eVar, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        if (eVar instanceof e.b) {
            return d(eVar.c(), eVar.b());
        }
        if (eVar instanceof e.a) {
            return a(eVar.c(), eVar.b());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final m c(c cVar, JvmProtoBuf.JvmMethodSignature jvmMethodSignature) {
        i.e(cVar, "nameResolver");
        i.e(jvmMethodSignature, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        return d(cVar.b(jvmMethodSignature.y), cVar.b(jvmMethodSignature.Y1));
    }

    public static final m d(String str, String str2) {
        i.e(str, "name");
        i.e(str2, "desc");
        return new m(i.k(str, str2), (f) null);
    }

    public static final m e(m mVar, int i) {
        i.e(mVar, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        return new m(mVar.a + '@' + i, (f) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && i.a(this.a, ((m) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return a.x0(a.P0("MemberSignature(signature="), this.a, ')');
    }
}
