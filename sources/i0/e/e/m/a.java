package i0.e.e.m;

import android.view.View;
import h0.b.a.d;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ d c;

    public /* synthetic */ a(d dVar) {
        this.c = dVar;
    }

    public final void onClick(View view) {
        d dVar = this.c;
        i.e(dVar, "$alertDialog");
        dVar.dismiss();
    }
}
