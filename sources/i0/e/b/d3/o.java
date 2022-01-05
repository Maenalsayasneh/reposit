package i0.e.b.d3;

import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyRecyclerView;
import h0.q.r;
import i0.d.a.a.a;
import m0.i;
import m0.n.a.l;

/* compiled from: ViewExtensions.kt */
public final class o implements EpoxyRecyclerView.a {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ EpoxyRecyclerView b;
    public final /* synthetic */ l<i0.b.a.o, i> c;

    public o(Fragment fragment, EpoxyRecyclerView epoxyRecyclerView, l<? super i0.b.a.o, i> lVar) {
        this.a = fragment;
        this.b = epoxyRecyclerView;
        this.c = lVar;
    }

    public void a(i0.b.a.o oVar) {
        m0.n.b.i.e(oVar, "controller");
        if (k.s(this.a)) {
            StringBuilder P0 = a.P0("buildModels lifecyce state: ");
            P0.append(((r) this.a.getViewLifecycleOwner().getLifecycle()).c);
            P0.append(", RecyclerView: ");
            P0.append(this.b.getResources().getResourceEntryName(this.b.getId()));
            v0.a.a.d.i(P0.toString(), new Object[0]);
            this.c.invoke(oVar);
        }
    }
}
