package com.airbnb.epoxy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.viewmodeladapter.R;
import h0.b0.v;
import i0.b.a.m;
import i0.b.a.o;
import i0.b.a.s;
import i0.b.a.t;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0004.^_`B'\b\u0007\u0012\u0006\u0010X\u001a\u00020\u0002\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010Y\u0012\b\b\u0002\u0010[\u001a\u00020\u000f¢\u0006\u0004\b\\\u0010]J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u0013\u0010\u0007J\u0017\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u0007J\u0017\u0010\u001e\u001a\u00020\u00052\b\b\u0001\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0012J\u0017\u0010 \u001a\u00020\u00052\b\b\u0001\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b \u0010\u0012J\u0019\u0010\"\u001a\u00020\u00052\b\b\u0001\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010\u0012J!\u0010&\u001a\u00020\u00052\u0010\u0010%\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030$0#H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\u00052\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00020\u0005¢\u0006\u0004\b-\u0010\u0007J\u000f\u0010.\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010\u0007J\u0019\u0010/\u001a\u00020\u000f2\b\b\u0001\u0010\u001f\u001a\u00020\u000fH\u0005¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\u000f2\b\b\u0001\u0010\u001d\u001a\u00020\u000fH\u0005¢\u0006\u0004\b1\u00100J\u001d\u00104\u001a\u00020\u00052\f\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J%\u00107\u001a\u00020\u00052\f\u00103\u001a\b\u0012\u0002\b\u0003\u0018\u0001022\u0006\u00106\u001a\u00020\u000bH\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0005H\u0016¢\u0006\u0004\b9\u0010\u0007J\u000f\u0010:\u001a\u00020\u0005H\u0016¢\u0006\u0004\b:\u0010\u0007R(\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030<0;8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001c\u0010D\u001a\u00020@8\u0004@\u0004X\u0004¢\u0006\f\n\u0004\b/\u0010A\u001a\u0004\bB\u0010CR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u001c\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010NR \u0010S\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030Q0;8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010>R\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006a"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "getContextForSharedViewPool", "()Landroid/content/Context;", "Lm0/i;", "j", "()V", "i", "f", "c", "", "removeAdapterWhenDetachedFromWindow", "setRemoveAdapterWhenDetachedFromWindow", "(Z)V", "", "delayMsWhenRemovingAdapterOnDetach", "setDelayMsWhenRemovingAdapterOnDetach", "(I)V", "e", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroidx/recyclerview/widget/RecyclerView$n;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$n;)V", "requestLayout", "itemSpacingRes", "setItemSpacingRes", "dp", "setItemSpacingDp", "spacingPx", "setItemSpacingPx", "", "Li0/b/a/t;", "models", "setModels", "(Ljava/util/List;)V", "Li0/b/a/o;", "controller", "setController", "(Li0/b/a/o;)V", "setControllerAndBuildModels", "g", "a", "d", "(I)I", "h", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "adapter", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "removeAndRecycleExistingViews", "swapAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "Lcom/airbnb/epoxy/EpoxyRecyclerView$b;", "c2", "Ljava/util/List;", "preloadConfigs", "Li0/b/a/s;", "Li0/b/a/s;", "getSpacingDecorator", "()Li0/b/a/s;", "spacingDecorator", "Y1", "I", "q", "Li0/b/a/o;", "epoxyController", "x", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "removedAdapter", "Z1", "Z", "isRemoveAdapterRunnablePosted", "y", "Li0/b/a/q0/b;", "b2", "preloadScrollListeners", "Ljava/lang/Runnable;", "a2", "Ljava/lang/Runnable;", "removeAdapterRunnable", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ModelBuilderCallbackController", "b", "WithModelsController", "epoxy-adapter_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: EpoxyRecyclerView.kt */
public class EpoxyRecyclerView extends RecyclerView {
    public static final i0.b.a.a c = new i0.b.a.a();
    public int Y1;
    public boolean Z1;
    public final Runnable a2;
    public final List<i0.b.a.q0.b<?>> b2;
    public final List<b<?, ?, ?>> c2;
    public final s d;
    public o q;
    public RecyclerView.Adapter<?> x;
    public boolean y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;", "Li0/b/a/o;", "Lm0/i;", "buildModels", "()V", "Lcom/airbnb/epoxy/EpoxyRecyclerView$a;", "callback", "Lcom/airbnb/epoxy/EpoxyRecyclerView$a;", "getCallback", "()Lcom/airbnb/epoxy/EpoxyRecyclerView$a;", "setCallback", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$a;)V", "<init>", "epoxy-adapter_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EpoxyRecyclerView.kt */
    public static final class ModelBuilderCallbackController extends o {
        private a callback = new a();

        /* compiled from: EpoxyRecyclerView.kt */
        public static final class a implements a {
            public void a(o oVar) {
                i.e(oVar, "controller");
            }
        }

        public void buildModels() {
            this.callback.a(this);
        }

        public final a getCallback() {
            return this.callback;
        }

        public final void setCallback(a aVar) {
            i.e(aVar, "<set-?>");
            this.callback = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;", "Li0/b/a/o;", "Lm0/i;", "buildModels", "()V", "Lkotlin/Function1;", "callback", "Lm0/n/a/l;", "getCallback", "()Lm0/n/a/l;", "setCallback", "(Lm0/n/a/l;)V", "<init>", "epoxy-adapter_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EpoxyRecyclerView.kt */
    public static final class WithModelsController extends o {
        private l<? super o, m0.i> callback = EpoxyRecyclerView$WithModelsController$callback$1.c;

        public void buildModels() {
            this.callback.invoke(this);
        }

        public final l<o, m0.i> getCallback() {
            return this.callback;
        }

        public final void setCallback(l<? super o, m0.i> lVar) {
            i.e(lVar, "<set-?>");
            this.callback = lVar;
        }
    }

    /* compiled from: EpoxyRecyclerView.kt */
    public interface a {
        void a(o oVar);
    }

    /* compiled from: EpoxyRecyclerView.kt */
    public static final class b<T extends t<?>, U, P extends i0.b.a.q0.c> {
    }

    /* compiled from: EpoxyRecyclerView.kt */
    public static final class c implements Runnable {
        public final /* synthetic */ EpoxyRecyclerView c;

        public c(EpoxyRecyclerView epoxyRecyclerView) {
            this.c = epoxyRecyclerView;
        }

        public final void run() {
            EpoxyRecyclerView epoxyRecyclerView = this.c;
            if (epoxyRecyclerView.Z1) {
                epoxyRecyclerView.Z1 = false;
                epoxyRecyclerView.f();
            }
        }
    }

    public EpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final Context getContextForSharedViewPool() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return context;
            }
        }
        Context context2 = getContext();
        i.d(context2, "this.context");
        return context2;
    }

    public void a() {
        o oVar = this.q;
        if (oVar != null) {
            oVar.cancelPendingModelBuild();
        }
        this.q = null;
        swapAdapter((RecyclerView.Adapter<?>) null, true);
    }

    public final void c() {
        this.x = null;
        if (this.Z1) {
            removeCallbacks(this.a2);
            this.Z1 = false;
        }
    }

    public final int d(int i) {
        Resources resources = getResources();
        i.d(resources, "resources");
        return (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }

    public void e() {
        setClipToPadding(false);
        i0.b.a.a aVar = c;
        Context contextForSharedViewPool = getContextForSharedViewPool();
        EpoxyRecyclerView$initViewPool$1 epoxyRecyclerView$initViewPool$1 = new EpoxyRecyclerView$initViewPool$1(this);
        Objects.requireNonNull(aVar);
        i.e(contextForSharedViewPool, "context");
        i.e(epoxyRecyclerView$initViewPool$1, "poolFactory");
        Iterator<PoolReference> it = aVar.a.iterator();
        i.d(it, "pools.iterator()");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            PoolReference next = it.next();
            i.d(next, "iterator.next()");
            PoolReference poolReference2 = next;
            if (poolReference2.b() == contextForSharedViewPool) {
                if (poolReference == null) {
                    poolReference = poolReference2;
                } else {
                    throw new IllegalStateException("A pool was already found");
                }
            } else if (v.D0(poolReference2.b())) {
                poolReference2.d.a();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(contextForSharedViewPool, (RecyclerView.t) epoxyRecyclerView$initViewPool$1.invoke(), aVar);
            Lifecycle a3 = aVar.a(contextForSharedViewPool);
            if (a3 != null) {
                a3.a(poolReference);
            }
            aVar.a.add(poolReference);
        }
        setRecycledViewPool(poolReference.d);
    }

    public final void f() {
        RecyclerView.Adapter<?> adapter = getAdapter();
        if (adapter != null) {
            swapAdapter((RecyclerView.Adapter<?>) null, true);
            this.x = adapter;
        }
        if (v.D0(getContext())) {
            getRecycledViewPool().a();
        }
    }

    public final void g() {
        o oVar = this.q;
        if (oVar == null) {
            throw new IllegalStateException("A controller must be set before requesting a model build.");
        } else if (!(oVar instanceof SimpleEpoxyController)) {
            i.c(oVar);
            oVar.requestModelBuild();
        } else {
            throw new IllegalStateException("Models were set with #setModels, they can not be rebuilt.");
        }
    }

    public final s getSpacingDecorator() {
        return this.d;
    }

    public final int h(int i) {
        return getResources().getDimensionPixelOffset(i);
    }

    public final void i() {
        RecyclerView.n layoutManager = getLayoutManager();
        o oVar = this.q;
        if ((layoutManager instanceof GridLayoutManager) && oVar != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            if (oVar.getSpanCount() != gridLayoutManager.b || gridLayoutManager.g != oVar.getSpanSizeLookup()) {
                oVar.setSpanCount(gridLayoutManager.b);
                gridLayoutManager.g = oVar.getSpanSizeLookup();
            }
        }
    }

    public final void j() {
        for (i0.b.a.q0.b removeOnScrollListener : this.b2) {
            removeOnScrollListener(removeOnScrollListener);
        }
        this.b2.clear();
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            i.d(adapter, "adapter ?: return");
            for (b bVar : this.c2) {
                i0.b.a.q0.b bVar2 = null;
                if (adapter instanceof m) {
                    m mVar = (m) adapter;
                    Objects.requireNonNull(bVar);
                    List L2 = h.L2(null);
                    i.e(mVar, "epoxyAdapter");
                    i.e((Object) null, "requestHolderFactory");
                    i.e((Object) null, "errorHandler");
                    i.e(L2, "modelPreloaders");
                    i.e(mVar, "adapter");
                    i.e((Object) null, "requestHolderFactory");
                    i.e((Object) null, "errorHandler");
                    i.e(L2, "modelPreloaders");
                    bVar2 = new i0.b.a.q0.b(mVar, (m0.n.a.a) null, (p<? super Context, ? super RuntimeException, m0.i>) null, 0, L2);
                } else {
                    o oVar = this.q;
                    if (oVar != null) {
                        Objects.requireNonNull(bVar);
                        List L22 = h.L2(null);
                        i.e(oVar, "epoxyController");
                        i.e((Object) null, "requestHolderFactory");
                        i.e((Object) null, "errorHandler");
                        i.e(L22, "modelPreloaders");
                        i.e(oVar, "epoxyController");
                        i.e((Object) null, "requestHolderFactory");
                        i.e((Object) null, "errorHandler");
                        i.e(L22, "modelPreloaders");
                        i0.b.a.p adapter2 = oVar.getAdapter();
                        i.d(adapter2, "epoxyController.adapter");
                        bVar2 = new i0.b.a.q0.b(adapter2, (m0.n.a.a) null, (p<? super Context, ? super RuntimeException, m0.i>) null, 0, L22);
                    }
                }
                if (bVar2 != null) {
                    this.b2.add(bVar2);
                    addOnScrollListener(bVar2);
                }
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.Adapter<?> adapter = this.x;
        if (adapter != null) {
            swapAdapter(adapter, false);
        }
        c();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        for (i0.b.a.q0.b bVar : this.b2) {
            for (P clear : bVar.e.a) {
                clear.clear();
            }
        }
        if (this.y) {
            int i = this.Y1;
            if (i > 0) {
                this.Z1 = true;
                postDelayed(this.a2, (long) i);
            } else {
                f();
            }
        }
        if (v.D0(getContext())) {
            getRecycledViewPool().a();
        }
    }

    public void requestLayout() {
        i();
        super.requestLayout();
    }

    public void setAdapter(RecyclerView.Adapter<?> adapter) {
        super.setAdapter(adapter);
        c();
        j();
    }

    public final void setController(o oVar) {
        i.e(oVar, "controller");
        this.q = oVar;
        setAdapter(oVar.getAdapter());
        i();
    }

    public final void setControllerAndBuildModels(o oVar) {
        i.e(oVar, "controller");
        oVar.requestModelBuild();
        setController(oVar);
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int i) {
        this.Y1 = i;
    }

    public final void setItemSpacingDp(int i) {
        setItemSpacingPx(d(i));
    }

    public void setItemSpacingPx(int i) {
        removeItemDecoration(this.d);
        s sVar = this.d;
        sVar.a = i;
        if (i > 0) {
            addItemDecoration(sVar);
        }
    }

    public final void setItemSpacingRes(int i) {
        setItemSpacingPx(getResources().getDimensionPixelOffset(i));
    }

    public void setLayoutManager(RecyclerView.n nVar) {
        super.setLayoutManager(nVar);
        i();
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LinearLayoutManager linearLayoutManager;
        i.e(layoutParams, "params");
        boolean z = getLayoutParams() == null;
        super.setLayoutParams(layoutParams);
        if (z && getLayoutManager() == null) {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            int i = layoutParams2.height;
            if (i == -1 || i == 0) {
                int i2 = layoutParams2.width;
                if (i2 == -1 || i2 == 0) {
                    setHasFixedSize(true);
                }
                linearLayoutManager = new LinearLayoutManager(getContext());
            } else {
                linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            }
            setLayoutManager(linearLayoutManager);
        }
    }

    public void setModels(List<? extends t<?>> list) {
        i.e(list, "models");
        o oVar = this.q;
        if (!(oVar instanceof SimpleEpoxyController)) {
            oVar = null;
        }
        SimpleEpoxyController simpleEpoxyController = (SimpleEpoxyController) oVar;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(list);
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean z) {
        this.y = z;
    }

    public void swapAdapter(RecyclerView.Adapter<?> adapter, boolean z) {
        super.swapAdapter(adapter, z);
        c();
        j();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        this.d = new s();
        this.y = true;
        this.Y1 = RecyclerView.MAX_SCROLL_DURATION;
        this.a2 = new c(this);
        this.b2 = new ArrayList();
        this.c2 = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.EpoxyRecyclerView, i, 0);
            i.d(obtainStyledAttributes, "context.obtainStyledAttr…tyleAttr, 0\n            )");
            setItemSpacingPx(obtainStyledAttributes.getDimensionPixelSize(R.styleable.EpoxyRecyclerView_itemSpacing, 0));
            obtainStyledAttributes.recycle();
        }
        e();
    }
}
