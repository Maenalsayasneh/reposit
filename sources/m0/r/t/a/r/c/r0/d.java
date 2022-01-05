package m0.r.t.a.r.c.r0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.m.v;

/* compiled from: AnnotationDescriptorImpl */
public class d implements c {
    public final v a;
    public final Map<m0.r.t.a.r.g.d, g<?>> b;
    public final h0 c;

    public d(v vVar, Map<m0.r.t.a.r.g.d, g<?>> map, h0 h0Var) {
        if (vVar == null) {
            b(0);
            throw null;
        } else if (map == null) {
            b(1);
            throw null;
        } else if (h0Var != null) {
            this.a = vVar;
            this.b = map;
            this.c = h0Var;
        } else {
            b(2);
            throw null;
        }
    }

    public static /* synthetic */ void b(int i) {
        String str = (i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 5) ? 2 : 3)];
        if (i == 1) {
            objArr[0] = "valueArguments";
        } else if (i == 2) {
            objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
        } else if (i == 3 || i == 4 || i == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i == 3) {
            objArr[1] = "getType";
        } else if (i == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 3 || i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public Map<m0.r.t.a.r.g.d, g<?>> a() {
        Map<m0.r.t.a.r.g.d, g<?>> map = this.b;
        if (map != null) {
            return map;
        }
        b(4);
        throw null;
    }

    public b d() {
        return h.e1(this);
    }

    public v getType() {
        v vVar = this.a;
        if (vVar != null) {
            return vVar;
        }
        b(3);
        throw null;
    }

    public h0 r() {
        h0 h0Var = this.c;
        if (h0Var != null) {
            return h0Var;
        }
        b(5);
        throw null;
    }

    public String toString() {
        return DescriptorRenderer.a.r(this, (AnnotationUseSiteTarget) null);
    }
}
