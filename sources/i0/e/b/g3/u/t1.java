package i0.e.b.g3.u;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import h0.b0.v;
import h0.t.l;
import h0.t.q;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class t1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ l d;

    public /* synthetic */ t1(Fragment fragment, l lVar) {
        this.c = fragment;
        this.d = lVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Fragment fragment = this.c;
        l lVar = this.d;
        i.e(fragment, "$this_showEditNameWarningDialog");
        i.e(lVar, "$navigateTo");
        v.a1(fragment, lVar, (q) null, 2);
    }
}
