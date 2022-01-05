package h0.g.a.h;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import g0.a.b.b.a;
import h0.g.a.h.k.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: HelperWidget */
public class g extends ConstraintWidget implements f {
    public ConstraintWidget[] M0 = new ConstraintWidget[4];
    public int N0 = 0;

    public void X(ArrayList<m> arrayList, int i, m mVar) {
        for (int i2 = 0; i2 < this.N0; i2++) {
            mVar.a(this.M0[i2]);
        }
        for (int i3 = 0; i3 < this.N0; i3++) {
            a.C(this.M0[i3], i, arrayList, mVar);
        }
    }

    public void a() {
        this.N0 = 0;
        Arrays.fill(this.M0, (Object) null);
    }

    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget != this && constraintWidget != null) {
            int i = this.N0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.M0;
            if (i > constraintWidgetArr.length) {
                this.M0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.M0;
            int i2 = this.N0;
            constraintWidgetArr2[i2] = constraintWidget;
            this.N0 = i2 + 1;
        }
    }

    public void c(c cVar) {
    }

    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        g gVar = (g) constraintWidget;
        this.N0 = 0;
        int i = gVar.N0;
        for (int i2 = 0; i2 < i; i2++) {
            b(hashMap.get(gVar.M0[i2]));
        }
    }
}
