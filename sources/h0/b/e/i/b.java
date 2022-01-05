package h0.b.e.i;

import android.content.Context;
import android.view.LayoutInflater;
import h0.b.e.i.m;

/* compiled from: BaseMenuPresenter */
public abstract class b implements m {
    public int Y1;
    public int Z1;
    public n a2;
    public Context c;
    public Context d;
    public g q;
    public LayoutInflater x;
    public m.a y;

    public b(Context context, int i, int i2) {
        this.c = context;
        this.x = LayoutInflater.from(context);
        this.Y1 = i;
        this.Z1 = i2;
    }

    public boolean f(g gVar, i iVar) {
        return false;
    }

    public boolean g(g gVar, i iVar) {
        return false;
    }

    public void h(m.a aVar) {
        this.y = aVar;
    }
}
