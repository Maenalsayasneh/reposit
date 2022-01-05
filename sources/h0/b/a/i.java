package h0.b.a;

import android.graphics.Rect;
import android.view.View;
import h0.i.i.d0;
import h0.i.i.m;
import h0.i.i.q;

/* compiled from: AppCompatDelegateImpl */
public class i implements m {
    public final /* synthetic */ h a;

    public i(h hVar) {
        this.a = hVar;
    }

    public d0 a(View view, d0 d0Var) {
        int e = d0Var.e();
        int a0 = this.a.a0(d0Var, (Rect) null);
        if (e != a0) {
            d0Var = d0Var.h(d0Var.c(), a0, d0Var.d(), d0Var.b());
        }
        return q.k(view, d0Var);
    }
}
