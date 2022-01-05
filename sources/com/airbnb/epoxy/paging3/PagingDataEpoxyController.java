package com.airbnb.epoxy.paging3;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import androidx.paging.AsyncPagingDataDiffer;
import androidx.paging.AsyncPagingDataDiffer$differBase$1;
import h0.u.g0;
import h0.u.w;
import h0.v.a.g;
import i0.b.a.o;
import i0.b.a.t;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import m0.j.a;
import m0.l.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 6*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u00017B+\u0012\b\b\u0002\u00100\u001a\u00020/\u0012\b\b\u0002\u00101\u001a\u00020/\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00028\u000002¢\u0006\u0004\b4\u00105J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0006J\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0006J!\u0010!\u001a\u00020\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u001e¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00042\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u001e¢\u0006\u0004\b#\u0010\"J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0004¢\u0006\u0004\b'\u0010\u0006R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0019\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001f0+8F@\u0006¢\u0006\u0006\u001a\u0004\b,\u0010-\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "", "T", "Li0/b/a/o;", "Lm0/i;", "buildModels", "()V", "", "Li0/b/a/t;", "models", "addModels", "(Ljava/util/List;)V", "", "currentPosition", "item", "buildItemModel", "(ILjava/lang/Object;)Li0/b/a/t;", "Li0/b/a/w;", "holder", "boundModel", "position", "previouslyBoundModel", "onModelBound", "(Li0/b/a/w;Li0/b/a/t;ILi0/b/a/t;)V", "Lh0/u/w;", "pagingData", "submitData", "(Lh0/u/w;Lm0/l/c;)Ljava/lang/Object;", "retry", "refresh", "Lkotlin/Function1;", "Lh0/u/b;", "listener", "addLoadStateListener", "(Lm0/n/a/l;)V", "removeLoadStateListener", "Lh0/u/i;", "snapshot", "()Lh0/u/i;", "requestForcedModelBuild", "Lcom/airbnb/epoxy/paging3/PagedDataModelCache;", "modelCache", "Lcom/airbnb/epoxy/paging3/PagedDataModelCache;", "Ln0/a/g2/d;", "getLoadStateFlow", "()Ln0/a/g2/d;", "loadStateFlow", "Landroid/os/Handler;", "modelBuildingHandler", "diffingHandler", "Lh0/v/a/g$e;", "itemDiffCallback", "<init>", "(Landroid/os/Handler;Landroid/os/Handler;Lh0/v/a/g$e;)V", "Companion", "b", "epoxy-paging3_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PagingDataEpoxyController.kt */
public abstract class PagingDataEpoxyController<T> extends o {
    public static final b Companion = new b((f) null);
    /* access modifiers changed from: private */
    public static final g.e<Object> DEFAULT_ITEM_DIFF_CALLBACK = new a();
    private final PagedDataModelCache<T> modelCache;

    /* compiled from: PagingDataEpoxyController.kt */
    public static final class a extends g.e<Object> {
        @SuppressLint({"DiffUtilEquals"})
        public boolean a(Object obj, Object obj2) {
            i.e(obj, "oldItem");
            i.e(obj2, "newItem");
            return i.a(obj, obj2);
        }

        public boolean b(Object obj, Object obj2) {
            i.e(obj, "oldItem");
            i.e(obj2, "newItem");
            return i.a(obj, obj2);
        }
    }

    /* compiled from: PagingDataEpoxyController.kt */
    public static final class b {
        public b(f fVar) {
        }
    }

    public PagingDataEpoxyController() {
        this((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PagingDataEpoxyController(android.os.Handler r1, android.os.Handler r2, h0.v.a.g.e<java.lang.Object> r3, int r4, m0.n.b.f r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L_0x000b
            android.os.Handler r1 = i0.b.a.o.defaultModelBuildingHandler
            java.lang.String r5 = "defaultModelBuildingHandler"
            m0.n.b.i.d(r1, r5)
        L_0x000b:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0016
            android.os.Handler r2 = i0.b.a.o.defaultDiffingHandler
            java.lang.String r5 = "defaultDiffingHandler"
            m0.n.b.i.d(r2, r5)
        L_0x0016:
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0021
            h0.v.a.g$e<java.lang.Object> r3 = DEFAULT_ITEM_DIFF_CALLBACK
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.DiffUtil.ItemCallback<T>"
            java.util.Objects.requireNonNull(r3, r4)
        L_0x0021:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.paging3.PagingDataEpoxyController.<init>(android.os.Handler, android.os.Handler, h0.v.a.g$e, int, m0.n.b.f):void");
    }

    public static Object submitData$suspendImpl(PagingDataEpoxyController pagingDataEpoxyController, w wVar, c cVar) {
        Object b2 = pagingDataEpoxyController.modelCache.b(wVar, cVar);
        if (b2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b2;
        }
        return m0.i.a;
    }

    public final void addLoadStateListener(l<? super h0.u.b, m0.i> lVar) {
        i.e(lVar, "listener");
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        Objects.requireNonNull(pagedDataModelCache);
        i.e(lVar, "listener");
        AsyncPagingDataDiffer<T> asyncPagingDataDiffer = pagedDataModelCache.f;
        Objects.requireNonNull(asyncPagingDataDiffer);
        i.e(lVar, "listener");
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = asyncPagingDataDiffer.c;
        Objects.requireNonNull(asyncPagingDataDiffer$differBase$1);
        i.e(lVar, "listener");
        asyncPagingDataDiffer$differBase$1.d.add(lVar);
        lVar.invoke(asyncPagingDataDiffer$differBase$1.c.e());
    }

    public void addModels(List<? extends t<?>> list) {
        i.e(list, "models");
        super.add(list);
    }

    public abstract t<?> buildItemModel(int i, T t);

    public final void buildModels() {
        ArrayList<t<?>> arrayList;
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        synchronized (pagedDataModelCache) {
            h0.u.i<T> a2 = pagedDataModelCache.f.a();
            int i = 0;
            if (!i.a(Looper.myLooper(), pagedDataModelCache.i.getLooper())) {
                arrayList = new ArrayList<>(h.K(a2, 10));
                Iterator<E> it = a2.iterator();
                while (true) {
                    a.C0240a aVar = (a.C0240a) it;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    Object next = aVar.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList.add(pagedDataModelCache.g.invoke(Integer.valueOf(i), next));
                        i = i2;
                    } else {
                        m0.j.g.r0();
                        throw null;
                    }
                }
            } else {
                Iterator it2 = m0.q.i.f(0, pagedDataModelCache.a.size()).iterator();
                while (((d) it2).hasNext()) {
                    int a3 = ((m0.j.o) it2).a();
                    if (pagedDataModelCache.a.get(a3) == null) {
                        pagedDataModelCache.a.set(a3, pagedDataModelCache.g.invoke(Integer.valueOf(a3), a2.get(a3)));
                    }
                }
                Integer num = pagedDataModelCache.b;
                if (num != null) {
                    pagedDataModelCache.c(num.intValue());
                }
                arrayList = pagedDataModelCache.a;
                if (arrayList == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.airbnb.epoxy.EpoxyModel<*>>");
                }
            }
        }
        addModels(arrayList);
    }

    public final n0.a.g2.d<h0.u.b> getLoadStateFlow() {
        return this.modelCache.f.e;
    }

    public void onModelBound(i0.b.a.w wVar, t<?> tVar, int i, t<?> tVar2) {
        i.e(wVar, "holder");
        i.e(tVar, "boundModel");
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        pagedDataModelCache.c(i);
        pagedDataModelCache.b = Integer.valueOf(i);
    }

    public final void refresh() {
        g0 g0Var = this.modelCache.f.c.b;
        if (g0Var != null) {
            g0Var.refresh();
        }
    }

    public final void removeLoadStateListener(l<? super h0.u.b, m0.i> lVar) {
        i.e(lVar, "listener");
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        Objects.requireNonNull(pagedDataModelCache);
        i.e(lVar, "listener");
        AsyncPagingDataDiffer<T> asyncPagingDataDiffer = pagedDataModelCache.f;
        Objects.requireNonNull(asyncPagingDataDiffer);
        i.e(lVar, "listener");
        AsyncPagingDataDiffer$differBase$1 asyncPagingDataDiffer$differBase$1 = asyncPagingDataDiffer.c;
        Objects.requireNonNull(asyncPagingDataDiffer$differBase$1);
        i.e(lVar, "listener");
        asyncPagingDataDiffer$differBase$1.d.remove(lVar);
    }

    public final void requestForcedModelBuild() {
        PagedDataModelCache<T> pagedDataModelCache = this.modelCache;
        pagedDataModelCache.i.post(new i0.b.a.p0.a(pagedDataModelCache));
        requestModelBuild();
    }

    public final void retry() {
        g0 g0Var = this.modelCache.f.c.b;
        if (g0Var != null) {
            g0Var.retry();
        }
    }

    public final h0.u.i<T> snapshot() {
        return this.modelCache.f.a();
    }

    public Object submitData(w<T> wVar, c<? super m0.i> cVar) {
        return submitData$suspendImpl(this, wVar, cVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagingDataEpoxyController(Handler handler, Handler handler2, g.e<T> eVar) {
        super(handler, handler2);
        i.e(handler, "modelBuildingHandler");
        i.e(handler2, "diffingHandler");
        i.e(eVar, "itemDiffCallback");
        this.modelCache = new PagedDataModelCache<>(new PagingDataEpoxyController$modelCache$1(this), new PagingDataEpoxyController$modelCache$2(this), eVar, handler);
    }
}
