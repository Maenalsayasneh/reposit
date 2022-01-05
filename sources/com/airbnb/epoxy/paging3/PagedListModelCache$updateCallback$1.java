package com.airbnb.epoxy.paging3;

import h0.v.a.r;
import i0.b.a.p0.f;
import m0.i;
import m0.n.a.a;

/* compiled from: PagedListModelCache.kt */
public final class PagedListModelCache$updateCallback$1 implements r {
    public final /* synthetic */ f a;

    public PagedListModelCache$updateCallback$1(f fVar) {
        this.a = fVar;
    }

    public void a(int i, int i2) {
        e(new PagedListModelCache$updateCallback$1$onInserted$1(this, i2, i));
    }

    public void b(int i, int i2) {
        e(new PagedListModelCache$updateCallback$1$onRemoved$1(this, i2, i));
    }

    public void c(int i, int i2) {
        e(new PagedListModelCache$updateCallback$1$onMoved$1(this, i, i2));
    }

    public void d(int i, int i2, Object obj) {
        e(new PagedListModelCache$updateCallback$1$onChanged$1(this, i, i2));
    }

    public final void e(a<i> aVar) {
        synchronized (this.a) {
            aVar.invoke();
        }
    }
}
