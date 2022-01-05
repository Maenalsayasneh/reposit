package m0.r.t.a.r.i;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import m0.j.r;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.g.d;

/* compiled from: ClassifierNamePolicy.kt */
public interface a {

    /* renamed from: m0.r.t.a.r.i.a$a  reason: collision with other inner class name */
    /* compiled from: ClassifierNamePolicy.kt */
    public static final class C0270a implements a {
        public static final C0270a a = new C0270a();

        public String a(f fVar, DescriptorRenderer descriptorRenderer) {
            i.e(fVar, "classifier");
            i.e(descriptorRenderer, "renderer");
            if (fVar instanceof m0) {
                d name = ((m0) fVar).getName();
                i.d(name, "classifier.name");
                return descriptorRenderer.v(name, false);
            }
            m0.r.t.a.r.g.c g = m0.r.t.a.r.j.d.g(fVar);
            i.d(g, "getFqName(classifier)");
            return descriptorRenderer.u(g);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class b implements a {
        public static final b a = new b();

        public String a(f fVar, DescriptorRenderer descriptorRenderer) {
            boolean z;
            i.e(fVar, "classifier");
            i.e(descriptorRenderer, "renderer");
            if (fVar instanceof m0) {
                d name = ((m0) fVar).getName();
                i.d(name, "classifier.name");
                return descriptorRenderer.v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            m0.r.t.a.r.c.i iVar = fVar;
            do {
                arrayList.add(iVar.getName());
                m0.r.t.a.r.c.i b = iVar.b();
                z = b instanceof m0.r.t.a.r.c.d;
                iVar = b;
            } while (z);
            i.e(arrayList, "$this$asReversed");
            return h.s3(new r(arrayList));
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    public static final class c implements a {
        public static final c a = new c();

        public String a(f fVar, DescriptorRenderer descriptorRenderer) {
            i.e(fVar, "classifier");
            i.e(descriptorRenderer, "renderer");
            return b(fVar);
        }

        public final String b(f fVar) {
            String str;
            d name = fVar.getName();
            i.d(name, "descriptor.name");
            String r3 = h.r3(name);
            if (fVar instanceof m0) {
                return r3;
            }
            m0.r.t.a.r.c.i b = fVar.b();
            i.d(b, "descriptor.containingDeclaration");
            if (b instanceof m0.r.t.a.r.c.d) {
                str = b((f) b);
            } else if (b instanceof v) {
                m0.r.t.a.r.g.c j = ((v) b).d().j();
                i.d(j, "descriptor.fqName.toUnsafe()");
                i.e(j, "<this>");
                List<d> g = j.g();
                i.d(g, "pathSegments()");
                str = h.s3(g);
            } else {
                str = null;
            }
            if (str == null || i.a(str, "")) {
                return r3;
            }
            return str + '.' + r3;
        }
    }

    String a(f fVar, DescriptorRenderer descriptorRenderer);
}
