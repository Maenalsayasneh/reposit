package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.j.s.b;

/* compiled from: LazyJavaPackageFragment.kt */
public final class LazyJavaPackageFragment$partToFacade$2 extends Lambda implements a<HashMap<b, b>> {
    public final /* synthetic */ LazyJavaPackageFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageFragment$partToFacade$2(LazyJavaPackageFragment lazyJavaPackageFragment) {
        super(0);
        this.c = lazyJavaPackageFragment;
    }

    public Object invoke() {
        String a;
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.c.B0().entrySet()) {
            b d = b.d((String) next.getKey());
            i.d(d, "byInternalName(partInternalName)");
            KotlinClassHeader a2 = ((j) next.getValue()).a();
            int ordinal = a2.a.ordinal();
            if (ordinal == 2) {
                hashMap.put(d, d);
            } else if (ordinal == 5 && (a = a2.a()) != null) {
                b d2 = b.d(a);
                i.d(d2, "byInternalName(header.multifileClassName ?: continue@kotlinClasses)");
                hashMap.put(d, d2);
            }
        }
        return hashMap;
    }
}
