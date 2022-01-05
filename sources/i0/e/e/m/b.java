package i0.e.e.m;

import android.view.View;
import h0.b.a.d;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ a c;
    public final /* synthetic */ d d;

    public /* synthetic */ b(a aVar, d dVar) {
        this.c = aVar;
        this.d = dVar;
    }

    public final void onClick(View view) {
        a aVar = this.c;
        d dVar = this.d;
        i.e(dVar, "$alertDialog");
        if (aVar != null) {
            aVar.invoke();
        }
        dVar.dismiss();
    }
}
