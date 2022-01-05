package i0.e.b.d3;

import androidx.fragment.app.FragmentManager;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ FragmentManager c;
    public final /* synthetic */ l d;

    public /* synthetic */ a(FragmentManager fragmentManager, l lVar) {
        this.c = fragmentManager;
        this.d = lVar;
    }

    public final void run() {
        FragmentManager fragmentManager = this.c;
        l lVar = this.d;
        i.e(fragmentManager, "$fragmentManager");
        i.e(lVar, "$f");
        try {
            h0.o.a.a aVar = new h0.o.a.a(fragmentManager);
            i.d(aVar, "beginTransaction()");
            lVar.invoke(aVar);
            aVar.j();
        } catch (Exception e) {
            v0.a.a.d.w(e);
        }
    }
}
