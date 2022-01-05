package i0.b.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.IllegalEpoxyUsage;
import com.airbnb.epoxy.ImmutableModelException;
import i0.b.a.o;
import java.util.List;

/* compiled from: EpoxyModel */
public abstract class t<T> {
    public static long a = -1;
    public long b;
    public boolean c = true;
    public o d;
    public o e;
    public boolean f;
    public int g;
    public boolean h;

    /* compiled from: EpoxyModel */
    public class a implements o.f {
        public a() {
        }

        public void a(o oVar) {
            t.this.f = true;
        }

        public void b(o oVar) {
            t tVar = t.this;
            tVar.g = tVar.hashCode();
            t.this.f = false;
        }
    }

    public t() {
        long j = a;
        a = j - 1;
        r(j);
        this.h = true;
    }

    public void A(int i, T t) {
    }

    public void B(T t) {
    }

    public final void C(String str, int i) {
        if (u() && !this.f && this.g != hashCode()) {
            throw new ImmutableModelException(this, str, i);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.b != tVar.b || q() != tVar.q()) {
            return false;
        }
        if (this.c == tVar.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        return ((q() + (((int) (j ^ (j >>> 32))) * 31)) * 31) + (this.c ? 1 : 0);
    }

    public void i(o oVar) {
        oVar.addInternal(this);
    }

    public final void j(o oVar) {
        if (oVar.isModelAddedMultipleTimes(this)) {
            StringBuilder P0 = i0.d.a.a.a.P0("This model was already added to the controller at position ");
            P0.append(oVar.getFirstIndexOfModelInBuildingList(this));
            throw new IllegalEpoxyUsage(P0.toString());
        } else if (this.d == null) {
            this.d = oVar;
            this.g = hashCode();
            oVar.addAfterInterceptorCallback(new a());
        }
    }

    public void k(T t) {
    }

    public void l(T t, t<?> tVar) {
        k(t);
    }

    public void m(T t, List<Object> list) {
        k(t);
    }

    public View n(ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(o(), viewGroup, false);
    }

    public abstract int o();

    public int p(int i, int i2, int i3) {
        return 1;
    }

    public int q() {
        return o();
    }

    public t<T> r(long j) {
        if (this.d == null || j == this.b) {
            this.h = false;
            this.b = j;
            return this;
        }
        throw new IllegalEpoxyUsage("Cannot change a model's id after it has been added to the adapter.");
    }

    public t<T> s(CharSequence charSequence) {
        long j;
        if (charSequence == null) {
            j = 0;
        } else {
            j = -3750763034362895579L;
            int length = charSequence.length();
            for (int i = 0; i < length; i++) {
                j = (j ^ ((long) charSequence.charAt(i))) * 1099511628211L;
            }
        }
        r(j);
        return this;
    }

    public t<T> t(Number... numberArr) {
        long j;
        long j2 = 0;
        if (numberArr != null) {
            long j3 = 0;
            for (Number number : numberArr) {
                long j4 = j3 * 31;
                if (number == null) {
                    j = 0;
                } else {
                    j = (long) number.hashCode();
                }
                long j5 = j ^ (j << 21);
                long j6 = j5 ^ (j5 >>> 35);
                j3 = j4 + (j6 ^ (j6 << 4));
            }
            j2 = j3;
        }
        return r(j2);
    }

    public String toString() {
        return getClass().getSimpleName() + "{id=" + this.b + ", viewType=" + q() + ", shown=" + this.c + ", addedToAdapter=" + false + '}';
    }

    public boolean u() {
        return this.d != null;
    }

    public boolean v(T t) {
        return false;
    }

    public final void w() {
        int i;
        if (!u() || this.f) {
            o oVar = this.e;
            if (oVar != null) {
                oVar.setStagedModel(this);
                return;
            }
            return;
        }
        o oVar2 = this.d;
        if (!oVar2.isBuildingModels()) {
            p adapter = oVar2.getAdapter();
            int size = adapter.h.f.size();
            i = 0;
            while (true) {
                if (i < size) {
                    if (((t) adapter.h.f.get(i)).b == this.b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        } else {
            i = oVar2.getFirstIndexOfModelInBuildingList(this);
        }
        throw new ImmutableModelException(this, "", i);
    }

    public void x(T t) {
    }

    public void y(T t) {
    }

    public void z(float f2, float f3, int i, int i2, T t) {
    }
}
