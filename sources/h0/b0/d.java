package h0.b0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import h0.b0.j;
import h0.i.e.a;
import h0.o.a.l0;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* compiled from: FragmentTransitionSupport */
public class d extends l0 {

    /* compiled from: FragmentTransitionSupport */
    public class a extends j.c {
        public final /* synthetic */ Rect a;

        public a(d dVar, Rect rect) {
            this.a = rect;
        }

        public Rect a(j jVar) {
            return this.a;
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class b implements j.d {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public b(d dVar, View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        public void a(j jVar) {
            jVar.y(this);
            jVar.b(this);
        }

        public void b(j jVar) {
        }

        public void c(j jVar) {
            jVar.y(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        public void d(j jVar) {
        }

        public void e(j jVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class c extends m {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        public void a(j jVar) {
            Object obj = this.a;
            if (obj != null) {
                d.this.p(obj, this.b, (ArrayList<View>) null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                d.this.p(obj2, this.d, (ArrayList<View>) null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                d.this.p(obj3, this.f, (ArrayList<View>) null);
            }
        }

        public void c(j jVar) {
            jVar.y(this);
        }
    }

    /* renamed from: h0.b0.d$d  reason: collision with other inner class name */
    /* compiled from: FragmentTransitionSupport */
    public class C0022d implements a.C0042a {
        public final /* synthetic */ j a;

        public C0022d(d dVar, j jVar) {
            this.a = jVar;
        }

        public void a() {
            this.a.cancel();
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class e implements j.d {
        public final /* synthetic */ Runnable a;

        public e(d dVar, Runnable runnable) {
            this.a = runnable;
        }

        public void a(j jVar) {
        }

        public void b(j jVar) {
        }

        public void c(j jVar) {
            this.a.run();
        }

        public void d(j jVar) {
        }

        public void e(j jVar) {
        }
    }

    /* compiled from: FragmentTransitionSupport */
    public class f extends j.c {
        public final /* synthetic */ Rect a;

        public f(d dVar, Rect rect) {
            this.a = rect;
        }

        public Rect a(j jVar) {
            Rect rect = this.a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.a;
        }
    }

    public static boolean z(j jVar) {
        return !l0.k(jVar.a2) || !l0.k((List) null) || !l0.k((List) null);
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((j) obj).d(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        j jVar = (j) obj;
        if (jVar != null) {
            int i = 0;
            if (jVar instanceof p) {
                p pVar = (p) jVar;
                int size = pVar.t2.size();
                while (i < size) {
                    b(pVar.N(i), arrayList);
                    i++;
                }
            } else if (!z(jVar) && l0.k(jVar.b2)) {
                int size2 = arrayList.size();
                while (i < size2) {
                    jVar.d(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        n.a(viewGroup, (j) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof j;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((j) obj).clone();
        }
        return null;
    }

    public Object l(Object obj, Object obj2, Object obj3) {
        j jVar = (j) obj;
        j jVar2 = (j) obj2;
        j jVar3 = (j) obj3;
        if (jVar != null && jVar2 != null) {
            p pVar = new p();
            pVar.M(jVar);
            pVar.M(jVar2);
            pVar.P(1);
            jVar = pVar;
        } else if (jVar == null) {
            jVar = jVar2 != null ? jVar2 : null;
        }
        if (jVar3 == null) {
            return jVar;
        }
        p pVar2 = new p();
        if (jVar != null) {
            pVar2.M(jVar);
        }
        pVar2.M(jVar3);
        return pVar2;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        p pVar = new p();
        if (obj != null) {
            pVar.M((j) obj);
        }
        if (obj2 != null) {
            pVar.M((j) obj2);
        }
        if (obj3 != null) {
            pVar.M((j) obj3);
        }
        return pVar;
    }

    public void o(Object obj, View view) {
        if (obj != null) {
            ((j) obj).z(view);
        }
    }

    public void p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        j jVar = (j) obj;
        int i2 = 0;
        if (jVar instanceof p) {
            p pVar = (p) jVar;
            int size = pVar.t2.size();
            while (i2 < size) {
                p(pVar.N(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!z(jVar)) {
            ArrayList<View> arrayList3 = jVar.b2;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    jVar.d(arrayList2.get(i2));
                    i2++;
                }
                int size2 = arrayList.size();
                while (true) {
                    size2--;
                    if (size2 >= 0) {
                        jVar.z(arrayList.get(size2));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void q(Object obj, View view, ArrayList<View> arrayList) {
        ((j) obj).b(new b(this, view, arrayList));
    }

    public void r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((j) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void s(Object obj, Rect rect) {
        if (obj != null) {
            ((j) obj).D(new f(this, rect));
        }
    }

    public void t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            j(view, rect);
            ((j) obj).D(new a(this, rect));
        }
    }

    public void u(Fragment fragment, Object obj, h0.i.e.a aVar, Runnable runnable) {
        j jVar = (j) obj;
        aVar.b(new C0022d(this, jVar));
        jVar.b(new e(this, runnable));
    }

    public void w(Object obj, View view, ArrayList<View> arrayList) {
        p pVar = (p) obj;
        ArrayList<View> arrayList2 = pVar.b2;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            l0.d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(pVar, arrayList);
    }

    public void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        p pVar = (p) obj;
        if (pVar != null) {
            pVar.b2.clear();
            pVar.b2.addAll(arrayList2);
            p(pVar, arrayList, arrayList2);
        }
    }

    public Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        p pVar = new p();
        pVar.M((j) obj);
        return pVar;
    }
}
