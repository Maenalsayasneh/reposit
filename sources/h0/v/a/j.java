package h0.v.a;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import h0.i.e.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker */
public final class j implements Runnable {
    public static final ThreadLocal<j> c = new ThreadLocal<>();
    public static Comparator<c> d = new a();
    public ArrayList<c> Y1 = new ArrayList<>();
    public ArrayList<RecyclerView> q = new ArrayList<>();
    public long x;
    public long y;

    /* compiled from: GapWorker */
    public class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            if (r0 != false) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                h0.v.a.j$c r7 = (h0.v.a.j.c) r7
                h0.v.a.j$c r8 = (h0.v.a.j.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r3 = r2
                goto L_0x000d
            L_0x000c:
                r3 = r1
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.d
                if (r4 != 0) goto L_0x0013
                r4 = r2
                goto L_0x0014
            L_0x0013:
                r4 = r1
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001d
                if (r0 != 0) goto L_0x001b
            L_0x0019:
                r1 = r2
                goto L_0x0037
            L_0x001b:
                r1 = r5
                goto L_0x0037
            L_0x001d:
                boolean r0 = r7.a
                boolean r3 = r8.a
                if (r0 == r3) goto L_0x0026
                if (r0 == 0) goto L_0x0019
                goto L_0x001b
            L_0x0026:
                int r0 = r8.b
                int r2 = r7.b
                int r0 = r0 - r2
                if (r0 == 0) goto L_0x002f
                r1 = r0
                goto L_0x0037
            L_0x002f:
                int r7 = r7.c
                int r8 = r8.c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0037
                r1 = r7
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.v.a.j.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* compiled from: GapWorker */
    public static class b implements RecyclerView.n.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.d * 2;
                int[] iArr = this.c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.n nVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && nVar != null && nVar.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.g()) {
                        nVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    nVar.collectAdjacentPrefetchPositions(this.a, this.b, recyclerView.mState, this);
                }
                int i = this.d;
                if (i > nVar.mPrefetchMaxCountObserved) {
                    nVar.mPrefetchMaxCountObserved = i;
                    nVar.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.mRecycler.o();
                }
            }
        }

        public boolean c(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: GapWorker */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.x == 0) {
            this.x = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.a = i;
        bVar.b = i2;
    }

    public void b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.q.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.q.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.d;
            }
        }
        this.Y1.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.q.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(bVar.b) + Math.abs(bVar.a);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.Y1.size()) {
                        cVar2 = new c();
                        this.Y1.add(cVar2);
                    } else {
                        cVar2 = this.Y1.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar2.a = i6 <= abs;
                    cVar2.b = abs;
                    cVar2.c = i6;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.Y1, d);
        for (int i7 = 0; i7 < this.Y1.size() && (recyclerView = cVar.d) != null; i7++) {
            RecyclerView.b0 c2 = c(recyclerView, (cVar = this.Y1.get(i7)).e, cVar.a ? RecyclerView.FOREVER_NS : j);
            if (!(c2 == null || c2.mNestedRecyclerView == null || !c2.isBound() || c2.isInvalid() || (recyclerView2 = (RecyclerView) c2.mNestedRecyclerView.get()) == null)) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.b(recyclerView2, true);
                if (bVar2.d != 0) {
                    try {
                        int i8 = f.a;
                        Trace.beginSection(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                        RecyclerView.y yVar = recyclerView2.mState;
                        RecyclerView.Adapter adapter = recyclerView2.mAdapter;
                        yVar.d = 1;
                        yVar.e = adapter.getItemCount();
                        yVar.g = false;
                        yVar.h = false;
                        yVar.i = false;
                        for (int i9 = 0; i9 < bVar2.d * 2; i9 += 2) {
                            c(recyclerView2, bVar2.c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = f.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = 0;
        }
    }

    public final RecyclerView.b0 c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.mChildHelper.h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.b0 m = uVar.m(i, false, j);
            if (m != null) {
                if (!m.isBound() || m.isInvalid()) {
                    uVar.a(m, false);
                } else {
                    uVar.i(m.itemView);
                }
            }
            return m;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public void run() {
        try {
            int i = f.a;
            Trace.beginSection(RecyclerView.TRACE_PREFETCH_TAG);
            if (this.q.isEmpty()) {
                this.x = 0;
                Trace.endSection();
                return;
            }
            int size = this.q.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.q.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.x = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j) + this.y);
            this.x = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.x = 0;
            int i3 = f.a;
            Trace.endSection();
            throw th;
        }
    }
}
