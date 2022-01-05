package h0.v.a;

import androidx.recyclerview.widget.RecyclerView;
import h0.f.e;
import h0.f.h;
import h0.i.h.d;

/* compiled from: ViewInfoStore */
public class c0 {
    public final h<RecyclerView.b0, a> a = new h<>();
    public final e<RecyclerView.b0> b = new e<>();

    /* compiled from: ViewInfoStore */
    public static class a {
        public static d<a> a = new d<>(20);
        public int b;
        public RecyclerView.k.c c;
        public RecyclerView.k.c d;

        public static a a() {
            a a2 = a.a();
            return a2 == null ? new a() : a2;
        }

        public static void b(a aVar) {
            aVar.b = 0;
            aVar.c = null;
            aVar.d = null;
            a.b(aVar);
        }
    }

    /* compiled from: ViewInfoStore */
    public interface b {
    }

    public void a(RecyclerView.b0 b0Var) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(b0Var, orDefault);
        }
        orDefault.b |= 1;
    }

    public void b(RecyclerView.b0 b0Var, RecyclerView.k.c cVar) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(b0Var, orDefault);
        }
        orDefault.d = cVar;
        orDefault.b |= 8;
    }

    public void c(RecyclerView.b0 b0Var, RecyclerView.k.c cVar) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(b0Var, orDefault);
        }
        orDefault.c = cVar;
        orDefault.b |= 4;
    }

    public boolean d(RecyclerView.b0 b0Var) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault == null || (orDefault.b & 1) == 0) {
            return false;
        }
        return true;
    }

    public final RecyclerView.k.c e(RecyclerView.b0 b0Var, int i) {
        a l;
        RecyclerView.k.c cVar;
        int f = this.a.f(b0Var);
        if (f >= 0 && (l = this.a.l(f)) != null) {
            int i2 = l.b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                l.b = i3;
                if (i == 4) {
                    cVar = l.c;
                } else if (i == 8) {
                    cVar = l.d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.j(f);
                    a.b(l);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.b0 b0Var) {
        a orDefault = this.a.getOrDefault(b0Var, null);
        if (orDefault != null) {
            orDefault.b &= -2;
        }
    }

    public void g(RecyclerView.b0 b0Var) {
        int r = this.b.r() - 1;
        while (true) {
            if (r < 0) {
                break;
            } else if (b0Var == this.b.s(r)) {
                e<RecyclerView.b0> eVar = this.b;
                Object[] objArr = eVar.x;
                Object obj = objArr[r];
                Object obj2 = e.c;
                if (obj != obj2) {
                    objArr[r] = obj2;
                    eVar.d = true;
                }
            } else {
                r--;
            }
        }
        a remove = this.a.remove(b0Var);
        if (remove != null) {
            a.b(remove);
        }
    }
}
