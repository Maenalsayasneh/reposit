package m0.r.t.a.r.c.t0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.k;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.m.v;

/* compiled from: PropertyGetterDescriptorImpl */
public class a0 extends y implements d0 {
    public v f2;
    public final d0 g2;

    /* JADX WARNING: type inference failed for: r21v0, types: [m0.r.t.a.r.c.d0] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(m0.r.t.a.r.c.c0 r13, m0.r.t.a.r.c.r0.f r14, kotlin.reflect.jvm.internal.impl.descriptors.Modality r15, m0.r.t.a.r.c.p r16, boolean r17, boolean r18, boolean r19, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r20, m0.r.t.a.r.c.d0 r21, m0.r.t.a.r.c.h0 r22) {
        /*
            r12 = this;
            r0 = 0
            if (r14 == 0) goto L_0x005b
            if (r15 == 0) goto L_0x0055
            if (r16 == 0) goto L_0x004f
            if (r20 == 0) goto L_0x0049
            if (r22 == 0) goto L_0x0043
            java.lang.String r0 = "<get-"
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            m0.r.t.a.r.g.d r1 = r13.getName()
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m0.r.t.a.r.g.d r6 = m0.r.t.a.r.g.d.j(r0)
            r1 = r12
            r2 = r15
            r3 = r16
            r4 = r13
            r5 = r14
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r21 == 0) goto L_0x003e
            r1 = r12
            r0 = r21
            goto L_0x0040
        L_0x003e:
            r0 = r12
            r1 = r0
        L_0x0040:
            r1.g2 = r0
            return
        L_0x0043:
            r1 = r12
            r2 = 5
            D(r2)
            throw r0
        L_0x0049:
            r1 = r12
            r2 = 4
            D(r2)
            throw r0
        L_0x004f:
            r1 = r12
            r2 = 3
            D(r2)
            throw r0
        L_0x0055:
            r1 = r12
            r2 = 2
            D(r2)
            throw r0
        L_0x005b:
            r1 = r12
            r2 = 1
            D(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.r.c.t0.a0.<init>(m0.r.t.a.r.c.c0, m0.r.t.a.r.c.r0.f, kotlin.reflect.jvm.internal.impl.descriptors.Modality, m0.r.t.a.r.c.p, boolean, boolean, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, m0.r.t.a.r.c.d0, m0.r.t.a.r.c.h0):void");
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 6 || i == 7 || i == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7 || i == 8) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i == 6) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 7) {
            objArr[1] = "getValueParameters";
        } else if (i != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 6 || i == 7 || i == 8)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7 || i == 8) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: I0 */
    public d0 a() {
        d0 d0Var = this.g2;
        if (d0Var != null) {
            return d0Var;
        }
        D(8);
        throw null;
    }

    public <R, D> R J(k<R, D> kVar, D d) {
        return kVar.b(this, d);
    }

    public void J0(v vVar) {
        if (vVar == null) {
            vVar = x0().getType();
        }
        this.f2 = vVar;
    }

    public Collection<? extends d0> e() {
        return H0(true);
    }

    public v getReturnType() {
        return this.f2;
    }

    public List<o0> h() {
        List<o0> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        D(7);
        throw null;
    }
}
