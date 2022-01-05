package kotlin.jvm.internal;

import i0.d.a.a.a;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.n;
import m0.r.p;

/* compiled from: TypeReference.kt */
public final class TypeReference$asString$args$1 extends Lambda implements l<p, CharSequence> {
    public final /* synthetic */ TypeReference c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeReference$asString$args$1(TypeReference typeReference) {
        super(1);
        this.c = typeReference;
    }

    public Object invoke(Object obj) {
        String str;
        p pVar = (p) obj;
        i.e(pVar, "it");
        Objects.requireNonNull(this.c);
        if (pVar.c == null) {
            return "*";
        }
        n nVar = pVar.d;
        if (!(nVar instanceof TypeReference)) {
            nVar = null;
        }
        TypeReference typeReference = (TypeReference) nVar;
        if (typeReference == null || (str = typeReference.h()) == null) {
            str = String.valueOf(pVar.d);
        }
        KVariance kVariance = pVar.c;
        if (kVariance != null) {
            int ordinal = kVariance.ordinal();
            if (ordinal == 0) {
                return str;
            }
            if (ordinal == 1) {
                return a.n0("in ", str);
            }
            if (ordinal == 2) {
                return a.n0("out ", str);
            }
        }
        throw new NoWhenBranchMatchedException();
    }
}
