package h0.b0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import h0.b0.j;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet */
public class p extends j {
    public ArrayList<j> t2 = new ArrayList<>();
    public boolean u2 = true;
    public int v2;
    public boolean w2 = false;
    public int x2 = 0;

    /* compiled from: TransitionSet */
    public class a extends m {
        public final /* synthetic */ j a;

        public a(p pVar, j jVar) {
            this.a = jVar;
        }

        public void c(j jVar) {
            this.a.B();
            jVar.y(this);
        }
    }

    /* compiled from: TransitionSet */
    public static class b extends m {
        public p a;

        public b(p pVar) {
            this.a = pVar;
        }

        public void a(j jVar) {
            p pVar = this.a;
            if (!pVar.w2) {
                pVar.K();
                this.a.w2 = true;
            }
        }

        public void c(j jVar) {
            p pVar = this.a;
            int i = pVar.v2 - 1;
            pVar.v2 = i;
            if (i == 0) {
                pVar.w2 = false;
                pVar.p();
            }
            jVar.y(this);
        }
    }

    public void A(View view) {
        super.A(view);
        int size = this.t2.size();
        for (int i = 0; i < size; i++) {
            this.t2.get(i).A(view);
        }
    }

    public void B() {
        if (this.t2.isEmpty()) {
            K();
            p();
            return;
        }
        b bVar = new b(this);
        Iterator<j> it = this.t2.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.v2 = this.t2.size();
        if (!this.u2) {
            for (int i = 1; i < this.t2.size(); i++) {
                this.t2.get(i - 1).b(new a(this, this.t2.get(i)));
            }
            j jVar = this.t2.get(0);
            if (jVar != null) {
                jVar.B();
                return;
            }
            return;
        }
        Iterator<j> it2 = this.t2.iterator();
        while (it2.hasNext()) {
            it2.next().B();
        }
    }

    public /* bridge */ /* synthetic */ j C(long j) {
        O(j);
        return this;
    }

    public void D(j.c cVar) {
        this.r2 = cVar;
        this.x2 |= 8;
        int size = this.t2.size();
        for (int i = 0; i < size; i++) {
            this.t2.get(i).D(cVar);
        }
    }

    public j E(TimeInterpolator timeInterpolator) {
        this.x2 |= 1;
        ArrayList<j> arrayList = this.t2;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.t2.get(i).E(timeInterpolator);
            }
        }
        this.Z1 = timeInterpolator;
        return this;
    }

    public void F(e eVar) {
        if (eVar == null) {
            this.s2 = j.d;
        } else {
            this.s2 = eVar;
        }
        this.x2 |= 4;
        if (this.t2 != null) {
            for (int i = 0; i < this.t2.size(); i++) {
                this.t2.get(i).F(eVar);
            }
        }
    }

    public void G(o oVar) {
        this.q2 = oVar;
        this.x2 |= 2;
        int size = this.t2.size();
        for (int i = 0; i < size; i++) {
            this.t2.get(i).G(oVar);
        }
    }

    public j H(ViewGroup viewGroup) {
        int size = this.t2.size();
        for (int i = 0; i < size; i++) {
            this.t2.get(i).H(viewGroup);
        }
        return this;
    }

    public j I(long j) {
        this.y = j;
        return this;
    }

    public String L(String str) {
        String L = super.L(str);
        for (int i = 0; i < this.t2.size(); i++) {
            StringBuilder S0 = i0.d.a.a.a.S0(L, "\n");
            S0.append(this.t2.get(i).L(str + "  "));
            L = S0.toString();
        }
        return L;
    }

    public p M(j jVar) {
        this.t2.add(jVar);
        jVar.f2 = this;
        long j = this.Y1;
        if (j >= 0) {
            jVar.C(j);
        }
        if ((this.x2 & 1) != 0) {
            jVar.E(this.Z1);
        }
        if ((this.x2 & 2) != 0) {
            jVar.G(this.q2);
        }
        if ((this.x2 & 4) != 0) {
            jVar.F(this.s2);
        }
        if ((this.x2 & 8) != 0) {
            jVar.D(this.r2);
        }
        return this;
    }

    public j N(int i) {
        if (i < 0 || i >= this.t2.size()) {
            return null;
        }
        return this.t2.get(i);
    }

    public p O(long j) {
        ArrayList<j> arrayList;
        this.Y1 = j;
        if (j >= 0 && (arrayList = this.t2) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.t2.get(i).C(j);
            }
        }
        return this;
    }

    public p P(int i) {
        if (i == 0) {
            this.u2 = true;
        } else if (i == 1) {
            this.u2 = false;
        } else {
            throw new AndroidRuntimeException(i0.d.a.a.a.e0("Invalid parameter for TransitionSet ordering: ", i));
        }
        return this;
    }

    public j b(j.d dVar) {
        super.b(dVar);
        return this;
    }

    public void cancel() {
        super.cancel();
        int size = this.t2.size();
        for (int i = 0; i < size; i++) {
            this.t2.get(i).cancel();
        }
    }

    public j d(View view) {
        for (int i = 0; i < this.t2.size(); i++) {
            this.t2.get(i).d(view);
        }
        this.b2.add(view);
        return this;
    }

    public void f(r rVar) {
        if (v(rVar.b)) {
            Iterator<j> it = this.t2.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.v(rVar.b)) {
                    next.f(rVar);
                    rVar.c.add(next);
                }
            }
        }
    }

    public void h(r rVar) {
        super.h(rVar);
        int size = this.t2.size();
        for (int i = 0; i < size; i++) {
            this.t2.get(i).h(rVar);
        }
    }

    public void i(r rVar) {
        if (v(rVar.b)) {
            Iterator<j> it = this.t2.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.v(rVar.b)) {
                    next.i(rVar);
                    rVar.c.add(next);
                }
            }
        }
    }

    /* renamed from: m */
    public j clone() {
        p pVar = (p) super.clone();
        pVar.t2 = new ArrayList<>();
        int size = this.t2.size();
        for (int i = 0; i < size; i++) {
            j m = this.t2.get(i).clone();
            pVar.t2.add(m);
            m.f2 = pVar;
        }
        return pVar;
    }

    public void o(ViewGroup viewGroup, s sVar, s sVar2, ArrayList<r> arrayList, ArrayList<r> arrayList2) {
        long j = this.y;
        int size = this.t2.size();
        for (int i = 0; i < size; i++) {
            j jVar = this.t2.get(i);
            if (j > 0 && (this.u2 || i == 0)) {
                long j2 = jVar.y;
                if (j2 > 0) {
                    jVar.I(j2 + j);
                } else {
                    jVar.I(j);
                }
            }
            jVar.o(viewGroup, sVar, sVar2, arrayList, arrayList2);
        }
    }

    public void x(View view) {
        super.x(view);
        int size = this.t2.size();
        for (int i = 0; i < size; i++) {
            this.t2.get(i).x(view);
        }
    }

    public j y(j.d dVar) {
        super.y(dVar);
        return this;
    }

    public j z(View view) {
        for (int i = 0; i < this.t2.size(); i++) {
            this.t2.get(i).z(view);
        }
        this.b2.remove(view);
        return this;
    }
}
