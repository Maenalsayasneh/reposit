package m0.r.t.a.r.e.b;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory$createArrayValue$1;
import m0.n.b.i;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r0.c;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.e.b.j;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.j.p.f;
import m0.r.t.a.r.j.p.g;
import m0.r.t.a.r.j.p.j;
import m0.r.t.a.r.j.p.o;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.v;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class b extends AbstractBinaryClassAnnotationAndConstantLoader<c, g<?>> {
    public final u c;
    public final NotFoundClasses d;
    public final m0.r.t.a.r.k.b.c e;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public static final class a implements j.a {
        public final HashMap<d, g<?>> a = new HashMap<>();
        public final /* synthetic */ m0.r.t.a.r.c.d b;
        public final /* synthetic */ b c;
        public final /* synthetic */ List<c> d;
        public final /* synthetic */ h0 e;

        /* renamed from: m0.r.t.a.r.e.b.b$a$a  reason: collision with other inner class name */
        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C0260a implements j.a {
            public final /* synthetic */ j.a a;
            public final /* synthetic */ j.a b;
            public final /* synthetic */ a c;
            public final /* synthetic */ d d;
            public final /* synthetic */ ArrayList<c> e;

            public C0260a(j.a aVar, a aVar2, d dVar, ArrayList<c> arrayList) {
                this.b = aVar;
                this.c = aVar2;
                this.d = dVar;
                this.e = arrayList;
                this.a = aVar;
            }

            public void a() {
                this.b.a();
                this.c.a.put(this.d, new m0.r.t.a.r.j.p.a((c) m0.j.g.j0(this.e)));
            }

            public void b(d dVar, f fVar) {
                i.e(dVar, "name");
                i.e(fVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                this.a.b(dVar, fVar);
            }

            public void c(d dVar, Object obj) {
                this.a.c(dVar, obj);
            }

            public void d(d dVar, m0.r.t.a.r.g.a aVar, d dVar2) {
                i.e(dVar, "name");
                i.e(aVar, "enumClassId");
                i.e(dVar2, "enumEntryName");
                this.a.d(dVar, aVar, dVar2);
            }

            public j.a e(d dVar, m0.r.t.a.r.g.a aVar) {
                i.e(dVar, "name");
                i.e(aVar, "classId");
                return this.a.e(dVar, aVar);
            }

            public j.b f(d dVar) {
                i.e(dVar, "name");
                return this.a.f(dVar);
            }
        }

        /* renamed from: m0.r.t.a.r.e.b.b$a$b  reason: collision with other inner class name */
        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C0261b implements j.b {
            public final ArrayList<g<?>> a = new ArrayList<>();
            public final /* synthetic */ a b;
            public final /* synthetic */ d c;
            public final /* synthetic */ m0.r.t.a.r.c.d d;

            public C0261b(a aVar, d dVar, m0.r.t.a.r.c.d dVar2) {
                this.b = aVar;
                this.c = dVar;
                this.d = dVar2;
            }

            public void a() {
                o0 O0 = h.O0(this.c, this.d);
                if (O0 != null) {
                    HashMap<d, g<?>> hashMap = this.b.a;
                    d dVar = this.c;
                    List<T> G0 = m0.r.t.a.r.m.a1.a.G0(this.a);
                    v type = O0.getType();
                    i.d(type, "parameter.type");
                    i.e(G0, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                    i.e(type, "type");
                    hashMap.put(dVar, new m0.r.t.a.r.j.p.b(G0, new ConstantValueFactory$createArrayValue$1(type)));
                }
            }

            public void b(Object obj) {
                this.a.add(this.b.g(this.c, obj));
            }

            public void c(m0.r.t.a.r.g.a aVar, d dVar) {
                i.e(aVar, "enumClassId");
                i.e(dVar, "enumEntryName");
                this.a.add(new m0.r.t.a.r.j.p.i(aVar, dVar));
            }

            public void d(f fVar) {
                i.e(fVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
                this.a.add(new o(fVar));
            }
        }

        public a(m0.r.t.a.r.c.d dVar, b bVar, List<c> list, h0 h0Var) {
            this.b = dVar;
            this.c = bVar;
            this.d = list;
            this.e = h0Var;
        }

        public void a() {
            this.d.add(new m0.r.t.a.r.c.r0.d(this.b.q(), this.a, this.e));
        }

        public void b(d dVar, f fVar) {
            i.e(dVar, "name");
            i.e(fVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            this.a.put(dVar, new o(fVar));
        }

        public void c(d dVar, Object obj) {
            if (dVar != null) {
                this.a.put(dVar, g(dVar, obj));
            }
        }

        public void d(d dVar, m0.r.t.a.r.g.a aVar, d dVar2) {
            i.e(dVar, "name");
            i.e(aVar, "enumClassId");
            i.e(dVar2, "enumEntryName");
            this.a.put(dVar, new m0.r.t.a.r.j.p.i(aVar, dVar2));
        }

        public j.a e(d dVar, m0.r.t.a.r.g.a aVar) {
            i.e(dVar, "name");
            i.e(aVar, "classId");
            ArrayList arrayList = new ArrayList();
            b bVar = this.c;
            h0 h0Var = h0.a;
            i.d(h0Var, "NO_SOURCE");
            j.a s = bVar.s(aVar, h0Var, arrayList);
            i.c(s);
            return new C0260a(s, this, dVar, arrayList);
        }

        public j.b f(d dVar) {
            i.e(dVar, "name");
            return new C0261b(this, dVar, this.b);
        }

        public final g<?> g(d dVar, Object obj) {
            g<?> b2 = ConstantValueFactory.b(obj);
            if (b2 != null) {
                return b2;
            }
            String k = i.k("Unsupported annotation argument: ", dVar);
            i.e(k, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            return new j.a(k);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(u uVar, NotFoundClasses notFoundClasses, l lVar, i iVar) {
        super(lVar, iVar);
        i.e(uVar, "module");
        i.e(notFoundClasses, "notFoundClasses");
        i.e(lVar, "storageManager");
        i.e(iVar, "kotlinClassFinder");
        this.c = uVar;
        this.d = notFoundClasses;
        this.e = new m0.r.t.a.r.k.b.c(uVar, notFoundClasses);
    }

    public j.a s(m0.r.t.a.r.g.a aVar, h0 h0Var, List<c> list) {
        i.e(aVar, "annotationClassId");
        i.e(h0Var, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(list, "result");
        return new a(h.G0(this.c, aVar, this.d), this, list, h0Var);
    }
}
