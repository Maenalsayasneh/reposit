package h0.o.a;

import android.view.View;
import android.view.ViewGroup;
import h0.i.e.a;
import h0.o.a.b;

/* compiled from: DefaultSpecialEffectsController */
public class f implements a.C0042a {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ b.C0060b c;

    public f(b bVar, View view, ViewGroup viewGroup, b.C0060b bVar2) {
        this.a = view;
        this.b = viewGroup;
        this.c = bVar2;
    }

    public void a() {
        this.a.clearAnimation();
        this.b.endViewTransition(this.a);
        this.c.a();
    }
}
