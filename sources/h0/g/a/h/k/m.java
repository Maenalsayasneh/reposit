package h0.g.a.h.k;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import h0.g.a.d;
import h0.g.a.h.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WidgetGroup */
public class m {
    public static int a;
    public ArrayList<ConstraintWidget> b = new ArrayList<>();
    public int c = -1;
    public int d = 0;
    public ArrayList<a> e = null;
    public int f = -1;

    /* compiled from: WidgetGroup */
    public class a {
        public a(m mVar, ConstraintWidget constraintWidget, d dVar, int i) {
            new WeakReference(constraintWidget);
            dVar.o(constraintWidget.K);
            dVar.o(constraintWidget.L);
            dVar.o(constraintWidget.M);
            dVar.o(constraintWidget.N);
            dVar.o(constraintWidget.O);
        }
    }

    public m(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.b.contains(constraintWidget)) {
            return false;
        }
        this.b.add(constraintWidget);
        return true;
    }

    public void b(ArrayList<m> arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                m mVar = arrayList.get(i);
                if (this.f == mVar.c) {
                    d(this.d, mVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(d dVar, int i) {
        int i2;
        int i3;
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList<ConstraintWidget> arrayList = this.b;
        c cVar = (c) arrayList.get(0).W;
        dVar.u();
        cVar.f(dVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4).f(dVar, false);
        }
        if (i == 0 && cVar.V0 > 0) {
            g0.a.b.b.a.c(cVar, dVar, arrayList, 0);
        }
        if (i == 1 && cVar.W0 > 0) {
            g0.a.b.b.a.c(cVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.e = new ArrayList<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.e.add(new a(this, arrayList.get(i5), dVar, i));
        }
        if (i == 0) {
            i2 = dVar.o(cVar.K);
            i3 = dVar.o(cVar.M);
            dVar.u();
        } else {
            i2 = dVar.o(cVar.L);
            i3 = dVar.o(cVar.N);
            dVar.u();
        }
        return i3 - i2;
    }

    public void d(int i, m mVar) {
        Iterator<ConstraintWidget> it = this.b.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            mVar.a(next);
            if (i == 0) {
                next.K0 = mVar.c;
            } else {
                next.L0 = mVar.c;
            }
        }
        this.f = mVar.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.d;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String u02 = i0.d.a.a.a.u0(sb, this.c, "] <");
        Iterator<ConstraintWidget> it = this.b.iterator();
        while (it.hasNext()) {
            StringBuilder S0 = i0.d.a.a.a.S0(u02, " ");
            S0.append(it.next().f9p0);
            u02 = S0.toString();
        }
        return i0.d.a.a.a.n0(u02, " >");
    }
}
