package i0.b.a;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ControllerModelList;
import com.airbnb.epoxy.IllegalEpoxyUsage;
import com.airbnb.epoxy.ViewHolderState;
import h0.v.a.g;
import i0.b.a.c;
import i0.b.a.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: EpoxyController */
public abstract class o implements e0 {
    private static final int DELAY_TO_CHECK_ADAPTER_COUNT_MS = 3000;
    private static final l0 NO_OP_TIMER = new g0();
    public static Handler defaultDiffingHandler;
    public static Handler defaultModelBuildingHandler;
    private static boolean filterDuplicatesDefault = false;
    private static boolean globalDebugLoggingEnabled = false;
    private static d globalExceptionHandler = new b();
    /* access modifiers changed from: private */
    public final p adapter;
    private final Runnable buildModelsRunnable;
    private q debugObserver;
    private volatile boolean filterDuplicates;
    /* access modifiers changed from: private */
    public volatile boolean hasBuiltModelsEver;
    /* access modifiers changed from: private */
    public final h helper;
    private final List<e> interceptors;
    private final Handler modelBuildHandler;
    private List<f> modelInterceptorCallbacks;
    /* access modifiers changed from: private */
    public ControllerModelList modelsBeingBuilt;
    /* access modifiers changed from: private */
    public int recyclerViewAttachCount;
    private volatile int requestedModelBuildType;
    /* access modifiers changed from: private */
    public t<?> stagedModel;
    /* access modifiers changed from: private */
    public volatile Thread threadBuildingModels;
    /* access modifiers changed from: private */
    public l0 timer;

    /* compiled from: EpoxyController */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            int i;
            List<? extends t<?>> list;
            Thread unused = o.this.threadBuildingModels = Thread.currentThread();
            o.this.cancelPendingModelBuild();
            o.this.helper.resetAutoModels();
            ControllerModelList unused2 = o.this.modelsBeingBuilt = new ControllerModelList(o.this.getExpectedModelCount());
            o.this.timer.a("Models built");
            try {
                o.this.buildModels();
                o.this.addCurrentlyStagedModelIfExists();
                o.this.timer.stop();
                o.this.runInterceptors();
                o oVar = o.this;
                oVar.filterDuplicatesIfNeeded(oVar.modelsBeingBuilt);
                ControllerModelList access$200 = o.this.modelsBeingBuilt;
                access$200.d = ControllerModelList.q;
                if (access$200.c) {
                    access$200.c = false;
                    o.this.timer.a("Models diffed");
                    p access$900 = o.this.adapter;
                    ControllerModelList access$2002 = o.this.modelsBeingBuilt;
                    List<? extends t<?>> list2 = access$900.h.f;
                    if (!list2.isEmpty() && ((t) list2.get(0)).u()) {
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            ((t) list2.get(i2)).C("The model was changed between being bound and when models were rebuilt", i2);
                        }
                    }
                    c cVar = access$900.h;
                    synchronized (cVar) {
                        c.C0080c cVar2 = cVar.d;
                        synchronized (cVar2) {
                            i = cVar2.a + 1;
                            cVar2.a = i;
                        }
                        list = cVar.e;
                    }
                    if (access$2002 == list) {
                        if (list == null) {
                            list = Collections.emptyList();
                        }
                        cVar.b(i, access$2002, new l(list, list, (g.d) null));
                    } else if (access$2002 == null || access$2002.isEmpty()) {
                        cVar.b(i, (List<? extends t<?>>) null, (list == null || list.isEmpty()) ? null : new l(list, Collections.EMPTY_LIST, (g.d) null));
                    } else if (list == null || list.isEmpty()) {
                        cVar.b(i, access$2002, new l(Collections.EMPTY_LIST, access$2002, (g.d) null));
                    } else {
                        cVar.a.execute(new b(cVar, new c.b(list, access$2002, cVar.c), i, access$2002, list));
                    }
                    o.this.timer.stop();
                    ControllerModelList unused3 = o.this.modelsBeingBuilt = null;
                    boolean unused4 = o.this.hasBuiltModelsEver = true;
                    Thread unused5 = o.this.threadBuildingModels = null;
                    return;
                }
                throw new IllegalStateException("Notifications already resumed");
            } catch (Throwable th) {
                o.this.timer.stop();
                ControllerModelList unused6 = o.this.modelsBeingBuilt = null;
                boolean unused7 = o.this.hasBuiltModelsEver = true;
                Thread unused8 = o.this.threadBuildingModels = null;
                t unused9 = o.this.stagedModel = null;
                throw th;
            }
        }
    }

    /* compiled from: EpoxyController */
    public class b implements d {
    }

    /* compiled from: EpoxyController */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            if (o.this.recyclerViewAttachCount > 1) {
                o.this.onExceptionSwallowed(new IllegalStateException("This EpoxyController had its adapter added to more than one ReyclerView. Epoxy does not support attaching an adapter to multiple RecyclerViews because saved state will not work properly. If you did not intend to attach your adapter to multiple RecyclerViews you may be leaking a reference to a previous RecyclerView. Make sure to remove the adapter from any previous RecyclerViews (eg if the adapter is reused in a Fragment across multiple onCreateView/onDestroyView cycles). See https://github.com/airbnb/epoxy/wiki/Avoiding-Memory-Leaks for more information."));
            }
        }
    }

    /* compiled from: EpoxyController */
    public interface d {
    }

    /* compiled from: EpoxyController */
    public interface e {
        void a(List<t<?>> list);
    }

    /* compiled from: EpoxyController */
    public interface f {
        void a(o oVar);

        void b(o oVar);
    }

    static {
        Handler handler = d0.d.c;
        defaultModelBuildingHandler = handler;
        defaultDiffingHandler = handler;
    }

    public o() {
        this(defaultModelBuildingHandler, defaultDiffingHandler);
    }

    private void assertIsBuildingModels() {
        if (!isBuildingModels()) {
            throw new IllegalEpoxyUsage("Can only call this when inside the `buildModels` method");
        }
    }

    private void assertNotBuildingModels() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call this from inside `buildModels`");
        }
    }

    /* access modifiers changed from: private */
    public void filterDuplicatesIfNeeded(List<t<?>> list) {
        if (this.filterDuplicates) {
            this.timer.a("Duplicates filtered");
            HashSet hashSet = new HashSet(list.size());
            ListIterator<t<?>> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                t next = listIterator.next();
                if (!hashSet.add(Long.valueOf(next.b))) {
                    int previousIndex = listIterator.previousIndex();
                    listIterator.remove();
                    int findPositionOfDuplicate = findPositionOfDuplicate(list, next);
                    t tVar = list.get(findPositionOfDuplicate);
                    if (previousIndex <= findPositionOfDuplicate) {
                        findPositionOfDuplicate++;
                    }
                    onExceptionSwallowed(new IllegalEpoxyUsage("Two models have the same ID. ID's must be unique!\nOriginal has position " + findPositionOfDuplicate + ":\n" + tVar + "\nDuplicate has position " + previousIndex + ":\n" + next));
                }
            }
            this.timer.stop();
        }
    }

    private int findPositionOfDuplicate(List<t<?>> list, t<?> tVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).b == tVar.b) {
                return i;
            }
        }
        throw new IllegalArgumentException("No duplicates in list");
    }

    /* access modifiers changed from: private */
    public int getExpectedModelCount() {
        int i = this.adapter.j;
        if (i != 0) {
            return i;
        }
        return 25;
    }

    /* access modifiers changed from: private */
    public void runInterceptors() {
        if (!this.interceptors.isEmpty()) {
            List<f> list = this.modelInterceptorCallbacks;
            if (list != null) {
                for (f a2 : list) {
                    a2.a(this);
                }
            }
            this.timer.a("Interceptors executed");
            for (e a3 : this.interceptors) {
                a3.a(this.modelsBeingBuilt);
            }
            this.timer.stop();
            List<f> list2 = this.modelInterceptorCallbacks;
            if (list2 != null) {
                for (f b2 : list2) {
                    b2.b(this);
                }
            }
        }
        this.modelInterceptorCallbacks = null;
    }

    public static void setGlobalDebugLoggingEnabled(boolean z) {
        globalDebugLoggingEnabled = z;
    }

    public static void setGlobalDuplicateFilteringDefault(boolean z) {
        filterDuplicatesDefault = z;
    }

    public static void setGlobalExceptionHandler(d dVar) {
        globalExceptionHandler = dVar;
    }

    public void add(t<?> tVar) {
        tVar.i(this);
    }

    public void addAfterInterceptorCallback(f fVar) {
        assertIsBuildingModels();
        if (this.modelInterceptorCallbacks == null) {
            this.modelInterceptorCallbacks = new ArrayList();
        }
        this.modelInterceptorCallbacks.add(fVar);
    }

    public void addCurrentlyStagedModelIfExists() {
        t<?> tVar = this.stagedModel;
        if (tVar != null) {
            tVar.i(this);
        }
        this.stagedModel = null;
    }

    public void addInterceptor(e eVar) {
        this.interceptors.add(eVar);
    }

    public void addInternal(t<?> tVar) {
        assertIsBuildingModels();
        if (tVar.h) {
            throw new IllegalEpoxyUsage("You must set an id on a model before adding it. Use the @AutoModel annotation if you want an id to be automatically generated for you.");
        } else if (tVar.c) {
            clearModelFromStaging(tVar);
            tVar.e = null;
            this.modelsBeingBuilt.U(tVar);
        } else {
            throw new IllegalEpoxyUsage("You cannot hide a model in an EpoxyController. Use `addIf` to conditionally add a model instead.");
        }
    }

    public void addModelBuildListener(i0 i0Var) {
        this.adapter.k.add(i0Var);
    }

    public abstract void buildModels();

    public synchronized void cancelPendingModelBuild() {
        if (this.requestedModelBuildType != 0) {
            this.requestedModelBuildType = 0;
            this.modelBuildHandler.removeCallbacks(this.buildModelsRunnable);
        }
    }

    public void clearModelFromStaging(t<?> tVar) {
        if (this.stagedModel != tVar) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = null;
    }

    public p getAdapter() {
        return this.adapter;
    }

    public int getFirstIndexOfModelInBuildingList(t<?> tVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        for (int i = 0; i < size; i++) {
            if (this.modelsBeingBuilt.get(i) == tVar) {
                return i;
            }
        }
        return -1;
    }

    public int getModelCountBuiltSoFar() {
        assertIsBuildingModels();
        return this.modelsBeingBuilt.size();
    }

    public int getSpanCount() {
        return this.adapter.a;
    }

    public GridLayoutManager.c getSpanSizeLookup() {
        return this.adapter.e;
    }

    public boolean hasPendingModelBuild() {
        return (this.requestedModelBuildType == 0 && this.threadBuildingModels == null && !this.adapter.h.d.a()) ? false : true;
    }

    public boolean isBuildingModels() {
        return this.threadBuildingModels == Thread.currentThread();
    }

    public boolean isDebugLoggingEnabled() {
        return this.timer != NO_OP_TIMER;
    }

    public boolean isDuplicateFilteringEnabled() {
        return this.filterDuplicates;
    }

    public boolean isModelAddedMultipleTimes(t<?> tVar) {
        assertIsBuildingModels();
        int size = this.modelsBeingBuilt.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (this.modelsBeingBuilt.get(i2) == tVar) {
                i++;
            }
        }
        if (i > 1) {
            return true;
        }
        return false;
    }

    public boolean isMultiSpan() {
        return this.adapter.a > 1;
    }

    public boolean isStickyHeader(int i) {
        return false;
    }

    public void moveModel(int i, int i2) {
        assertNotBuildingModels();
        p pVar = this.adapter;
        Objects.requireNonNull(pVar);
        ArrayList arrayList = new ArrayList(pVar.h.f);
        arrayList.add(i2, (t) arrayList.remove(i));
        pVar.g.a = true;
        pVar.notifyItemMoved(i, i2);
        pVar.g.a = false;
        if (pVar.h.a(arrayList)) {
            pVar.i.requestModelBuild();
        }
        requestDelayedModelBuild(500);
    }

    public void notifyModelChanged(int i) {
        assertNotBuildingModels();
        p pVar = this.adapter;
        Objects.requireNonNull(pVar);
        ArrayList arrayList = new ArrayList(pVar.h.f);
        pVar.g.a = true;
        pVar.notifyItemChanged(i);
        pVar.g.a = false;
        if (pVar.h.a(arrayList)) {
            pVar.i.requestModelBuild();
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public void onAttachedToRecyclerViewInternal(RecyclerView recyclerView) {
        int i = this.recyclerViewAttachCount + 1;
        this.recyclerViewAttachCount = i;
        if (i > 1) {
            d0.d.c.postDelayed(new c(), 3000);
        }
        onAttachedToRecyclerView(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public void onDetachedFromRecyclerViewInternal(RecyclerView recyclerView) {
        this.recyclerViewAttachCount--;
        onDetachedFromRecyclerView(recyclerView);
    }

    public void onExceptionSwallowed(RuntimeException runtimeException) {
        Objects.requireNonNull((b) globalExceptionHandler);
    }

    public void onModelBound(w wVar, t<?> tVar, int i, t<?> tVar2) {
    }

    public void onModelUnbound(w wVar, t<?> tVar) {
    }

    public void onRestoreInstanceState(Bundle bundle) {
        p pVar = this.adapter;
        if (pVar.c.c.r() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        } else if (bundle != null) {
            ViewHolderState viewHolderState = (ViewHolderState) bundle.getParcelable("saved_state_view_holders");
            pVar.d = viewHolderState;
            if (viewHolderState == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        p pVar = this.adapter;
        Iterator<w> it = pVar.c.iterator();
        while (true) {
            e.b bVar = (e.b) it;
            if (!bVar.hasNext()) {
                break;
            }
            pVar.d.t((w) bVar.next());
        }
        if (pVar.d.r() <= 0 || pVar.hasStableIds()) {
            bundle.putParcelable("saved_state_view_holders", pVar.d);
            return;
        }
        throw new IllegalStateException("Must have stable ids when saving view holder state");
    }

    public void onViewAttachedToWindow(w wVar, t<?> tVar) {
    }

    public void onViewDetachedFromWindow(w wVar, t<?> tVar) {
    }

    public void removeInterceptor(e eVar) {
        this.interceptors.remove(eVar);
    }

    public void removeModelBuildListener(i0 i0Var) {
        this.adapter.k.remove(i0Var);
    }

    public synchronized void requestDelayedModelBuild(int i) {
        if (!isBuildingModels()) {
            int i2 = 1;
            if (this.requestedModelBuildType == 2) {
                cancelPendingModelBuild();
            } else if (this.requestedModelBuildType == 1) {
                return;
            }
            if (i != 0) {
                i2 = 2;
            }
            this.requestedModelBuildType = i2;
            this.modelBuildHandler.postDelayed(this.buildModelsRunnable, (long) i);
            return;
        }
        throw new IllegalEpoxyUsage("Cannot call `requestDelayedModelBuild` from inside `buildModels`");
    }

    public void requestModelBuild() {
        if (isBuildingModels()) {
            throw new IllegalEpoxyUsage("Cannot call `requestModelBuild` from inside `buildModels`");
        } else if (this.hasBuiltModelsEver) {
            requestDelayedModelBuild(0);
        } else {
            this.buildModelsRunnable.run();
        }
    }

    public void setDebugLoggingEnabled(boolean z) {
        assertNotBuildingModels();
        if (z) {
            this.timer = new j(getClass().getSimpleName());
            if (this.debugObserver == null) {
                this.debugObserver = new q(getClass().getSimpleName());
            }
            this.adapter.registerAdapterDataObserver(this.debugObserver);
            return;
        }
        this.timer = NO_OP_TIMER;
        q qVar = this.debugObserver;
        if (qVar != null) {
            this.adapter.unregisterAdapterDataObserver(qVar);
        }
    }

    public void setFilterDuplicates(boolean z) {
        this.filterDuplicates = z;
    }

    public void setSpanCount(int i) {
        this.adapter.a = i;
    }

    public void setStagedModel(t<?> tVar) {
        if (tVar != this.stagedModel) {
            addCurrentlyStagedModelIfExists();
        }
        this.stagedModel = tVar;
    }

    public void setupStickyHeaderView(View view) {
    }

    public void teardownStickyHeaderView(View view) {
    }

    public o(Handler handler, Handler handler2) {
        h hVar;
        this.recyclerViewAttachCount = 0;
        this.interceptors = new CopyOnWriteArrayList();
        this.filterDuplicates = filterDuplicatesDefault;
        this.threadBuildingModels = null;
        this.timer = NO_OP_TIMER;
        Map<Class<?>, Constructor<?>> map = i.a;
        Constructor<?> a2 = i.a(getClass());
        if (a2 == null) {
            hVar = i.b;
        } else {
            try {
                hVar = (h) a2.newInstance(new Object[]{this});
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Unable to invoke " + a2, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Unable to invoke " + a2, e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException("Unable to get Epoxy helper class.", cause);
                }
            }
        }
        this.helper = hVar;
        this.requestedModelBuildType = 0;
        this.buildModelsRunnable = new a();
        this.adapter = new p(this, handler2);
        this.modelBuildHandler = handler;
        setDebugLoggingEnabled(globalDebugLoggingEnabled);
    }

    public void add(t<?>... tVarArr) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(controllerModelList.size() + tVarArr.length);
        for (t<?> add : tVarArr) {
            add(add);
        }
    }

    public void add(List<? extends t<?>> list) {
        ControllerModelList controllerModelList = this.modelsBeingBuilt;
        controllerModelList.ensureCapacity(list.size() + controllerModelList.size());
        for (t add : list) {
            add((t<?>) add);
        }
    }
}
