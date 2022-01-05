package i0.b.a;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import h0.v.a.g;
import i0.b.a.c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EpoxyControllerAdapter */
public final class p extends d implements c.d {
    public static final g.e<t<?>> f = new a();
    public final h0 g;
    public final c h;
    public final o i;
    public int j;
    public final List<i0> k = new ArrayList();

    /* compiled from: EpoxyControllerAdapter */
    public class a extends g.e<t<?>> {
        public boolean a(Object obj, Object obj2) {
            return ((t) obj).equals((t) obj2);
        }

        public boolean b(Object obj, Object obj2) {
            return ((t) obj).b == ((t) obj2).b;
        }

        public Object c(Object obj, Object obj2) {
            t tVar = (t) obj2;
            return new k((t) obj);
        }
    }

    public p(o oVar, Handler handler) {
        h0 h0Var = new h0();
        this.g = h0Var;
        this.i = oVar;
        this.h = new c(handler, this, f);
        registerAdapterDataObserver(h0Var);
    }

    public e b() {
        return this.c;
    }

    public List<? extends t<?>> c() {
        return this.h.f;
    }

    public void f(RuntimeException runtimeException) {
        this.i.onExceptionSwallowed(runtimeException);
    }

    public void g(w wVar, t<?> tVar, int i2, t<?> tVar2) {
        this.i.onModelBound(wVar, tVar, i2, tVar2);
    }

    public int getItemCount() {
        return this.j;
    }

    public void h(w wVar, t<?> tVar) {
        this.i.onModelUnbound(wVar, tVar);
    }

    public void i(w wVar) {
        wVar.a();
        wVar.a.x(wVar.c());
        o oVar = this.i;
        wVar.a();
        oVar.onViewAttachedToWindow(wVar, wVar.a);
    }

    public void j(w wVar) {
        wVar.a();
        wVar.a.y(wVar.c());
        o oVar = this.i;
        wVar.a();
        oVar.onViewDetachedFromWindow(wVar, wVar.a);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.i.onAttachedToRecyclerViewInternal(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.b.b = null;
        this.i.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    public void onViewAttachedToWindow(RecyclerView.b0 b0Var) {
        w wVar = (w) b0Var;
        wVar.a();
        wVar.a.x(wVar.c());
        o oVar = this.i;
        wVar.a();
        oVar.onViewAttachedToWindow(wVar, wVar.a);
    }

    public void onViewDetachedFromWindow(RecyclerView.b0 b0Var) {
        w wVar = (w) b0Var;
        wVar.a();
        wVar.a.y(wVar.c());
        o oVar = this.i;
        wVar.a();
        oVar.onViewDetachedFromWindow(wVar, wVar.a);
    }
}
