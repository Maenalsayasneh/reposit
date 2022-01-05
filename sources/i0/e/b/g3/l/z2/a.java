package i0.e.b.g3.l.z2;

import android.content.DialogInterface;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ m0.n.a.a c;

    public /* synthetic */ a(m0.n.a.a aVar) {
        this.c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        m0.n.a.a aVar = this.c;
        i.e(aVar, "$negativeAction");
        dialogInterface.dismiss();
        aVar.invoke();
    }
}
