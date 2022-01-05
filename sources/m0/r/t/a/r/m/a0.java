package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.m.z0.g;
import m0.r.t.a.r.m.z0.h;

/* compiled from: KotlinType.kt */
public abstract class a0 extends v0 implements g, h {
    public a0() {
        super((f) null);
    }

    /* renamed from: P0 */
    public abstract a0 M0(boolean z);

    public abstract a0 Q0(m0.r.t.a.r.c.r0.f fVar);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (c s : getAnnotations()) {
            String[] strArr = {"[", DescriptorRenderer.s(DescriptorRenderer.b, s, (AnnotationUseSiteTarget) null, 2, (Object) null), "] "};
            i.e(sb, "$this$append");
            i.e(strArr, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            for (int i = 0; i < 3; i++) {
                sb.append(strArr[i]);
            }
        }
        sb.append(I0());
        if (!H0().isEmpty()) {
            m0.j.g.C(H0(), sb, ", ", "<", ">", 0, (CharSequence) null, (l) null, 112);
        }
        if (J0()) {
            sb.append("?");
        }
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
