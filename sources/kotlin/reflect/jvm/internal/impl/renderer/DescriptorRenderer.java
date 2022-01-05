package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.b.f;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.m0;
import m0.r.t.a.r.m.v;

/* compiled from: DescriptorRenderer.kt */
public abstract class DescriptorRenderer {
    public static final DescriptorRenderer a = a.a(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES$1.c);
    public static final DescriptorRenderer b = a.a(DescriptorRenderer$Companion$DEBUG_TEXT$1.c);

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        public static final DescriptorRenderer a(l<? super m0.r.t.a.r.i.b, i> lVar) {
            m0.n.b.i.e(lVar, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            lVar.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.b = true;
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    public interface b {

        /* compiled from: DescriptorRenderer.kt */
        public static final class a implements b {
            public static final a a = new a();

            public void a(o0 o0Var, int i, int i2, StringBuilder sb) {
                m0.n.b.i.e(o0Var, "parameter");
                m0.n.b.i.e(sb, "builder");
            }

            public void b(int i, StringBuilder sb) {
                m0.n.b.i.e(sb, "builder");
                sb.append("(");
            }

            public void c(int i, StringBuilder sb) {
                m0.n.b.i.e(sb, "builder");
                sb.append(")");
            }

            public void d(o0 o0Var, int i, int i2, StringBuilder sb) {
                m0.n.b.i.e(o0Var, "parameter");
                m0.n.b.i.e(sb, "builder");
                if (i != i2 - 1) {
                    sb.append(", ");
                }
            }
        }

        void a(o0 o0Var, int i, int i2, StringBuilder sb);

        void b(int i, StringBuilder sb);

        void c(int i, StringBuilder sb);

        void d(o0 o0Var, int i, int i2, StringBuilder sb);
    }

    static {
        a.a(DescriptorRenderer$Companion$COMPACT_WITH_MODIFIERS$1.c);
        a.a(DescriptorRenderer$Companion$COMPACT$1.c);
        a.a(DescriptorRenderer$Companion$COMPACT_WITHOUT_SUPERTYPES$1.c);
        a.a(DescriptorRenderer$Companion$COMPACT_WITH_SHORT_TYPES$1.c);
        a.a(DescriptorRenderer$Companion$ONLY_NAMES_WITH_SHORT_TYPES$1.c);
        a.a(DescriptorRenderer$Companion$FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$1.c);
        a.a(DescriptorRenderer$Companion$SHORT_NAMES_IN_TYPES$1.c);
        a.a(DescriptorRenderer$Companion$HTML$1.c);
    }

    public static /* synthetic */ String s(DescriptorRenderer descriptorRenderer, c cVar, AnnotationUseSiteTarget annotationUseSiteTarget, int i, Object obj) {
        int i2 = i & 2;
        return descriptorRenderer.r(cVar, (AnnotationUseSiteTarget) null);
    }

    public abstract String q(m0.r.t.a.r.c.i iVar);

    public abstract String r(c cVar, AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract String t(String str, String str2, f fVar);

    public abstract String u(m0.r.t.a.r.g.c cVar);

    public abstract String v(d dVar, boolean z);

    public abstract String w(v vVar);

    public abstract String x(m0 m0Var);
}
