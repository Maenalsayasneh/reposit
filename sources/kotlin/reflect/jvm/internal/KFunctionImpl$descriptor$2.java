package kotlin.reflect.jvm.internal;

import com.pubnub.api.PubNubUtil;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.n;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.g.d;

/* compiled from: KFunctionImpl.kt */
public final class KFunctionImpl$descriptor$2 extends Lambda implements a<r> {
    public final /* synthetic */ KFunctionImpl c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$descriptor$2(KFunctionImpl kFunctionImpl, String str) {
        super(0);
        this.c = kFunctionImpl;
        this.d = str;
    }

    public Object invoke() {
        Iterable iterable;
        String str;
        KFunctionImpl kFunctionImpl = this.c;
        KDeclarationContainerImpl kDeclarationContainerImpl = kFunctionImpl.b2;
        String str2 = this.d;
        String str3 = kFunctionImpl.c2;
        Objects.requireNonNull(kDeclarationContainerImpl);
        i.e(str2, "name");
        i.e(str3, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        if (i.a(str2, "<init>")) {
            iterable = g.v0(kDeclarationContainerImpl.n());
        } else {
            d g = d.g(str2);
            i.d(g, "Name.identifier(name)");
            iterable = kDeclarationContainerImpl.o(g);
        }
        Iterable iterable2 = iterable;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable2) {
            n nVar = n.b;
            if (i.a(n.d((r) next).a(), str3)) {
                arrayList.add(next);
            }
        }
        boolean z = true;
        if (arrayList.size() == 1) {
            return (r) g.j0(arrayList);
        }
        String E = g.E(iterable2, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, KDeclarationContainerImpl$findFunctionDescriptor$allMembers$1.c, 30);
        StringBuilder U0 = i0.d.a.a.a.U0("Function '", str2, "' (JVM signature: ", str3, ") not resolved in ");
        U0.append(kDeclarationContainerImpl);
        U0.append(':');
        if (E.length() != 0) {
            z = false;
        }
        if (z) {
            str = " no members found";
        } else {
            str = 10 + E;
        }
        U0.append(str);
        throw new KotlinReflectionInternalError(U0.toString());
    }
}
