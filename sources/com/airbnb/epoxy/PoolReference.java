package com.airbnb.epoxy;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import h0.b0.v;
import h0.q.a0;
import h0.q.o;
import i0.b.a.a;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0015\u0010\f\u001a\u0004\u0018\u00010\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0016\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/airbnb/epoxy/PoolReference;", "Lh0/q/o;", "Lm0/i;", "onContextDestroyed", "()V", "Li0/b/a/a;", "q", "Li0/b/a/a;", "parent", "Landroid/content/Context;", "b", "()Landroid/content/Context;", "context", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "contextReference", "Landroidx/recyclerview/widget/RecyclerView$t;", "d", "Landroidx/recyclerview/widget/RecyclerView$t;", "getViewPool", "()Landroidx/recyclerview/widget/RecyclerView$t;", "viewPool", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/RecyclerView$t;Li0/b/a/a;)V", "epoxy-adapter_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ActivityRecyclerPool.kt */
public final class PoolReference implements o {
    public final WeakReference<Context> c;
    public final RecyclerView.t d;
    public final a q;

    public PoolReference(Context context, RecyclerView.t tVar, a aVar) {
        i.e(context, "context");
        i.e(tVar, "viewPool");
        i.e(aVar, "parent");
        this.d = tVar;
        this.q = aVar;
        this.c = new WeakReference<>(context);
    }

    public final Context b() {
        return (Context) this.c.get();
    }

    @a0(Lifecycle.Event.ON_DESTROY)
    public final void onContextDestroyed() {
        a aVar = this.q;
        Objects.requireNonNull(aVar);
        i.e(this, "pool");
        if (v.D0(b())) {
            this.d.a();
            aVar.a.remove(this);
        }
    }
}
