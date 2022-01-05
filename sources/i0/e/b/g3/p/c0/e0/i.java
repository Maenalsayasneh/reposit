package i0.e.b.g3.p.c0.e0;

import android.view.View;
import i0.e.b.b3.b.e.m;
import i0.e.b.g3.p.c0.e0.w0;
import m0.n.a.p;

/* compiled from: lambda */
public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ w0 c;
    public final /* synthetic */ m d;
    public final /* synthetic */ w0.a q;

    public /* synthetic */ i(w0 w0Var, m mVar, w0.a aVar) {
        this.c = w0Var;
        this.d = mVar;
        this.q = aVar;
    }

    public final void onClick(View view) {
        w0 w0Var = this.c;
        m mVar = this.d;
        w0.a aVar = this.q;
        m0.n.b.i.e(w0Var, "this$0");
        m0.n.b.i.e(mVar, "$it");
        m0.n.b.i.e(aVar, "$this_bindUserSuggestion");
        p<? super m, ? super Boolean, m0.i> pVar = w0Var.l;
        if (pVar != null) {
            pVar.invoke(mVar, Boolean.valueOf(aVar.b().e.isChecked()));
        }
        w0Var.L(aVar, mVar.i);
    }
}
