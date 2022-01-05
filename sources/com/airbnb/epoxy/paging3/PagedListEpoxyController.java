package com.airbnb.epoxy.paging3;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import h0.v.a.g;
import i0.b.a.o;
import i0.b.a.p0.e;
import i0.b.a.t;
import i0.b.a.w;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 '*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001(B+\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b%\u0010&J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0010\u0010\t\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0006R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/airbnb/epoxy/paging3/PagedListEpoxyController;", "", "T", "Li0/b/a/o;", "Lm0/i;", "buildModels", "()V", "", "Li0/b/a/t;", "models", "addModels", "(Ljava/util/List;)V", "", "currentPosition", "item", "buildItemModel", "(ILjava/lang/Object;)Li0/b/a/t;", "Li0/b/a/w;", "holder", "boundModel", "position", "previouslyBoundModel", "onModelBound", "(Li0/b/a/w;Li0/b/a/t;ILi0/b/a/t;)V", "Lh0/u/t;", "newList", "submitList", "(Lh0/u/t;)V", "requestForcedModelBuild", "Li0/b/a/p0/f;", "modelCache", "Li0/b/a/p0/f;", "Landroid/os/Handler;", "modelBuildingHandler", "diffingHandler", "Lh0/v/a/g$e;", "itemDiffCallback", "<init>", "(Landroid/os/Handler;Landroid/os/Handler;Lh0/v/a/g$e;)V", "Companion", "b", "epoxy-paging3_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PagedListEpoxyController.kt */
public abstract class PagedListEpoxyController<T> extends o {
    public static final b Companion = new b((f) null);
    /* access modifiers changed from: private */
    public static final g.e<Object> DEFAULT_ITEM_DIFF_CALLBACK = new a();
    private final i0.b.a.p0.f<T> modelCache;

    /* compiled from: PagedListEpoxyController.kt */
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

    /* compiled from: PagedListEpoxyController.kt */
    public static final class b {
        public b(f fVar) {
        }
    }

    public PagedListEpoxyController() {
        this((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PagedListEpoxyController(android.os.Handler r1, android.os.Handler r2, h0.v.a.g.e<java.lang.Object> r3, int r4, m0.n.b.f r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L_0x000b
            android.os.Handler r1 = i0.b.a.o.defaultModelBuildingHandler
            java.lang.String r5 = "EpoxyController.defaultModelBuildingHandler"
            m0.n.b.i.d(r1, r5)
        L_0x000b:
            r5 = r4 & 2
            if (r5 == 0) goto L_0x0016
            android.os.Handler r2 = i0.b.a.o.defaultDiffingHandler
            java.lang.String r5 = "EpoxyController.defaultDiffingHandler"
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
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.paging3.PagedListEpoxyController.<init>(android.os.Handler, android.os.Handler, h0.v.a.g$e, int, m0.n.b.f):void");
    }

    public void addModels(List<? extends t<?>> list) {
        i.e(list, "models");
        super.add(list);
    }

    public abstract t<?> buildItemModel(int i, T t);

    public final void buildModels() {
        ArrayList<t<?>> arrayList;
        i0.b.a.p0.f<T> fVar = this.modelCache;
        synchronized (fVar) {
            List a2 = fVar.e.a();
            if (a2 == null) {
                a2 = EmptyList.c;
            }
            int i = 0;
            if (!i.a(Looper.myLooper(), fVar.j.getLooper())) {
                arrayList = new ArrayList<>(h.K(a2, 10));
                for (Object next : a2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList.add(fVar.f.invoke(Integer.valueOf(i), next));
                        i = i2;
                    } else {
                        m0.j.g.r0();
                        throw null;
                    }
                }
                fVar.j.post(new e(fVar, a2, arrayList));
            } else {
                Iterator it = m0.q.i.f(0, fVar.a.size()).iterator();
                while (((d) it).hasNext()) {
                    int a3 = ((m0.j.o) it).a();
                    if (fVar.a.get(a3) == null) {
                        fVar.a.set(a3, fVar.f.invoke(Integer.valueOf(a3), a2.get(a3)));
                    }
                }
                Integer num = fVar.b;
                if (num != null) {
                    num.intValue();
                    if (fVar.e.a() != null) {
                        throw null;
                    }
                }
                arrayList = fVar.a;
                if (arrayList == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.airbnb.epoxy.EpoxyModel<*>>");
                }
            }
        }
        addModels(arrayList);
    }

    public void onModelBound(w wVar, t<?> tVar, int i, t<?> tVar2) {
        i.e(wVar, "holder");
        i.e(tVar, "boundModel");
        i0.b.a.p0.f<T> fVar = this.modelCache;
        if (fVar.e.a() == null) {
            fVar.b = Integer.valueOf(i);
            return;
        }
        throw null;
    }

    public final void requestForcedModelBuild() {
        i0.b.a.p0.f<T> fVar = this.modelCache;
        fVar.j.post(new i0.b.a.p0.d(fVar));
        requestModelBuild();
    }

    public final void submitList(h0.u.t<T> tVar) {
        i0.b.a.p0.f<T> fVar = this.modelCache;
        synchronized (fVar) {
            fVar.c = true;
            fVar.e.c(tVar);
            fVar.c = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagedListEpoxyController(Handler handler, Handler handler2, g.e<T> eVar) {
        super(handler, handler2);
        i.e(handler, "modelBuildingHandler");
        i.e(handler2, "diffingHandler");
        i.e(eVar, "itemDiffCallback");
        this.modelCache = new i0.b.a.p0.f(new PagedListEpoxyController$modelCache$1(this), new PagedListEpoxyController$modelCache$2(this), eVar, (Executor) null, handler, 8);
    }
}
