package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import h0.v.a.j;
import h0.v.a.o;
import h0.v.a.p;
import h0.v.a.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

public class StaggeredGridLayoutManager extends RecyclerView.n implements RecyclerView.x.b {
    public int a = -1;
    public d[] b;
    public v c;
    public v d;
    public int e;
    public int f;
    public final o g;
    public boolean h = false;
    public boolean i = false;
    public BitSet j;
    public int k = -1;
    public int l = Integer.MIN_VALUE;
    public LazySpanLookup m = new LazySpanLookup();
    public int n = 2;
    public boolean o;
    public boolean p;
    public SavedState q;
    public int r;
    public final Rect s = new Rect();
    public final b t = new b();
    public boolean u = true;
    public int[] v;
    public final Runnable w = new a();

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int[] Y1;
        public List<LazySpanLookup.FullSpanItem> Z1;
        public boolean a2;
        public boolean b2;
        public int c;
        public boolean c2;
        public int d;
        public int q;
        public int[] x;
        public int y;

        public class a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.q);
            if (this.q > 0) {
                parcel.writeIntArray(this.x);
            }
            parcel.writeInt(this.y);
            if (this.y > 0) {
                parcel.writeIntArray(this.Y1);
            }
            parcel.writeInt(this.a2 ? 1 : 0);
            parcel.writeInt(this.b2 ? 1 : 0);
            parcel.writeInt(this.c2 ? 1 : 0);
            parcel.writeList(this.Z1);
        }

        public SavedState(Parcel parcel) {
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            int readInt = parcel.readInt();
            this.q = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.x = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.y = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.Y1 = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.a2 = parcel.readInt() == 1;
            this.b2 = parcel.readInt() == 1;
            this.c2 = parcel.readInt() == 1 ? true : z;
            this.Z1 = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.q = savedState.q;
            this.c = savedState.c;
            this.d = savedState.d;
            this.x = savedState.x;
            this.y = savedState.y;
            this.Y1 = savedState.Y1;
            this.a2 = savedState.a2;
            this.b2 = savedState.b2;
            this.c2 = savedState.c2;
            this.Z1 = savedState.Z1;
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.b();
        }
    }

    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            b();
        }

        public void a() {
            int i;
            if (this.c) {
                i = StaggeredGridLayoutManager.this.c.g();
            } else {
                i = StaggeredGridLayoutManager.this.c.k();
            }
            this.b = i;
        }

        public void b() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.o {
        public d e;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public class d {
        public ArrayList<View> a = new ArrayList<>();
        public int b = Integer.MIN_VALUE;
        public int c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public d(int i) {
            this.e = i;
        }

        public void a(View view) {
            c j = j(view);
            j.e = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.d = StaggeredGridLayoutManager.this.c.c(view) + this.d;
            }
        }

        public void b() {
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c j = j(view);
            this.c = StaggeredGridLayoutManager.this.c.b(view);
            Objects.requireNonNull(j);
        }

        public void c() {
            View view = this.a.get(0);
            c j = j(view);
            this.b = StaggeredGridLayoutManager.this.c.e(view);
            Objects.requireNonNull(j);
        }

        public void d() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public int e() {
            if (StaggeredGridLayoutManager.this.h) {
                return g(this.a.size() - 1, -1, true);
            }
            return g(0, this.a.size(), true);
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.h) {
                return g(0, this.a.size(), true);
            }
            return g(this.a.size() - 1, -1, true);
        }

        public int g(int i, int i2, boolean z) {
            int k = StaggeredGridLayoutManager.this.c.k();
            int g = StaggeredGridLayoutManager.this.c.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int e2 = StaggeredGridLayoutManager.this.c.e(view);
                int b2 = StaggeredGridLayoutManager.this.c.b(view);
                boolean z2 = false;
                boolean z3 = !z ? e2 < g : e2 <= g;
                if (!z ? b2 > k : b2 >= k) {
                    z2 = true;
                }
                if (z3 && z2 && (e2 < k || b2 > g)) {
                    return StaggeredGridLayoutManager.this.getPosition(view);
                }
                i += i3;
            }
            return -1;
        }

        public int h(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            b();
            return this.c;
        }

        public View i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.h && staggeredGridLayoutManager.getPosition(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.h && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.h && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.h && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public c j(View view) {
            return (c) view.getLayoutParams();
        }

        public int k(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.b;
        }

        public void l() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c j = j(remove);
            j.e = null;
            if (j.c() || j.b()) {
                this.d -= StaggeredGridLayoutManager.this.c.c(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        public void m() {
            View remove = this.a.remove(0);
            c j = j(remove);
            j.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.d -= StaggeredGridLayoutManager.this.c.c(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        public void n(View view) {
            c j = j(view);
            j.e = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (j.c() || j.b()) {
                this.d = StaggeredGridLayoutManager.this.c.c(view) + this.d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.n.d properties = RecyclerView.n.getProperties(context, attributeSet, i2, i3);
        int i4 = properties.a;
        if (i4 == 0 || i4 == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i4 != this.e) {
                this.e = i4;
                v vVar = this.c;
                this.c = this.d;
                this.d = vVar;
                requestLayout();
            }
            v(properties.b);
            boolean z = properties.c;
            assertNotInLayoutOrScroll((String) null);
            SavedState savedState = this.q;
            if (!(savedState == null || savedState.a2 == z)) {
                savedState.a2 = z;
            }
            this.h = z;
            requestLayout();
            this.g = new o();
            this.c = v.a(this, this.e);
            this.d = v.a(this, 1 - this.e);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public final int a(int i2) {
        if (getChildCount() != 0) {
            if ((i2 < h()) != this.i) {
                return -1;
            }
            return 1;
        } else if (this.i) {
            return 1;
        } else {
            return -1;
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public boolean b() {
        int i2;
        if (!(getChildCount() == 0 || this.n == 0 || !isAttachedToWindow())) {
            if (this.i) {
                i2 = i();
                h();
            } else {
                i2 = h();
                i();
            }
            if (i2 == 0 && m() != null) {
                this.m.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int c(RecyclerView.u uVar, o oVar, RecyclerView.y yVar) {
        int i2;
        int i3;
        int i4;
        d dVar;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        RecyclerView.u uVar2 = uVar;
        o oVar2 = oVar;
        int i13 = 0;
        this.j.set(0, this.a, true);
        if (this.g.i) {
            i2 = oVar2.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (oVar2.e == 1) {
                i12 = oVar2.g + oVar2.b;
            } else {
                i12 = oVar2.f - oVar2.b;
            }
            i2 = i12;
        }
        w(oVar2.e, i2);
        if (this.i) {
            i3 = this.c.g();
        } else {
            i3 = this.c.k();
        }
        int i14 = i3;
        boolean z2 = false;
        while (true) {
            int i15 = oVar2.c;
            int i16 = -1;
            if (((i15 < 0 || i15 >= yVar.b()) ? i13 : 1) == 0 || (!this.g.i && this.j.isEmpty())) {
                int i17 = i13;
            } else {
                View e2 = uVar2.e(oVar2.c);
                oVar2.c += oVar2.d;
                c cVar = (c) e2.getLayoutParams();
                int a2 = cVar.a();
                int[] iArr = this.m.a;
                int i18 = (iArr == null || a2 >= iArr.length) ? -1 : iArr[a2];
                if ((i18 == -1 ? 1 : i13) != 0) {
                    if (p(oVar2.e)) {
                        i10 = this.a - 1;
                        i11 = -1;
                    } else {
                        i16 = this.a;
                        i10 = i13;
                        i11 = 1;
                    }
                    d dVar2 = null;
                    if (oVar2.e == 1) {
                        int k2 = this.c.k();
                        int i19 = Integer.MAX_VALUE;
                        while (i10 != i16) {
                            d dVar3 = this.b[i10];
                            int h2 = dVar3.h(k2);
                            if (h2 < i19) {
                                i19 = h2;
                                dVar2 = dVar3;
                            }
                            i10 += i11;
                        }
                    } else {
                        int g2 = this.c.g();
                        int i20 = Integer.MIN_VALUE;
                        while (i10 != i16) {
                            d dVar4 = this.b[i10];
                            int k3 = dVar4.k(g2);
                            if (k3 > i20) {
                                dVar2 = dVar4;
                                i20 = k3;
                            }
                            i10 += i11;
                        }
                    }
                    dVar = dVar2;
                    LazySpanLookup lazySpanLookup = this.m;
                    lazySpanLookup.b(a2);
                    lazySpanLookup.a[a2] = dVar.e;
                } else {
                    dVar = this.b[i18];
                }
                d dVar5 = dVar;
                cVar.e = dVar5;
                if (oVar2.e == 1) {
                    addView(e2);
                    z = false;
                } else {
                    z = false;
                    addView(e2, 0);
                }
                if (this.e == 1) {
                    n(e2, RecyclerView.n.getChildMeasureSpec(this.f, getWidthMode(), z ? 1 : 0, cVar.width, z), RecyclerView.n.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), cVar.height, true), z);
                } else {
                    n(e2, RecyclerView.n.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), cVar.width, true), RecyclerView.n.getChildMeasureSpec(this.f, getHeightMode(), 0, cVar.height, false), false);
                }
                if (oVar2.e == 1) {
                    int h3 = dVar5.h(i14);
                    i6 = h3;
                    i5 = this.c.c(e2) + h3;
                } else {
                    int k4 = dVar5.k(i14);
                    i5 = k4;
                    i6 = k4 - this.c.c(e2);
                }
                if (oVar2.e == 1) {
                    cVar.e.a(e2);
                } else {
                    cVar.e.n(e2);
                }
                if (!isLayoutRTL() || this.e != 1) {
                    i7 = this.d.k() + (dVar5.e * this.f);
                    i8 = this.d.c(e2) + i7;
                } else {
                    i8 = this.d.g() - (((this.a - 1) - dVar5.e) * this.f);
                    i7 = i8 - this.d.c(e2);
                }
                int i21 = i8;
                int i22 = i7;
                if (this.e == 1) {
                    layoutDecoratedWithMargins(e2, i22, i6, i21, i5);
                } else {
                    layoutDecoratedWithMargins(e2, i6, i22, i5, i21);
                }
                y(dVar5, this.g.e, i2);
                r(uVar2, this.g);
                if (!this.g.h || !e2.hasFocusable()) {
                    i9 = 0;
                } else {
                    i9 = 0;
                    this.j.set(dVar5.e, false);
                }
                i13 = i9;
                z2 = true;
            }
        }
        int i172 = i13;
        if (!z2) {
            r(uVar2, this.g);
        }
        if (this.g.e == -1) {
            i4 = this.c.k() - k(this.c.k());
        } else {
            i4 = j(this.c.g()) - this.c.g();
        }
        return i4 > 0 ? Math.min(oVar2.b, i4) : i172;
    }

    public boolean canScrollHorizontally() {
        return this.e == 0;
    }

    public boolean canScrollVertically() {
        return this.e == 1;
    }

    public boolean checkLayoutParams(RecyclerView.o oVar) {
        return oVar instanceof c;
    }

    public void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.y yVar, RecyclerView.n.c cVar) {
        int i4;
        int i5;
        if (this.e != 0) {
            i2 = i3;
        }
        if (getChildCount() != 0 && i2 != 0) {
            q(i2, yVar);
            int[] iArr = this.v;
            if (iArr == null || iArr.length < this.a) {
                this.v = new int[this.a];
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.a; i7++) {
                o oVar = this.g;
                if (oVar.d == -1) {
                    i5 = oVar.f;
                    i4 = this.b[i7].k(i5);
                } else {
                    i5 = this.b[i7].h(oVar.g);
                    i4 = this.g.g;
                }
                int i8 = i5 - i4;
                if (i8 >= 0) {
                    this.v[i6] = i8;
                    i6++;
                }
            }
            Arrays.sort(this.v, 0, i6);
            int i9 = 0;
            while (i9 < i6) {
                int i10 = this.g.c;
                if (i10 >= 0 && i10 < yVar.b()) {
                    ((j.b) cVar).a(this.g.c, this.v[i9]);
                    o oVar2 = this.g;
                    oVar2.c += oVar2.d;
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    public int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    public int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    public final int computeScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return g0.a.b.b.a.q(yVar, this.c, e(!this.u), d(!this.u), this, this.u);
    }

    public final int computeScrollOffset(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return g0.a.b.b.a.r(yVar, this.c, e(!this.u), d(!this.u), this, this.u, this.i);
    }

    public final int computeScrollRange(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return g0.a.b.b.a.s(yVar, this.c, e(!this.u), d(!this.u), this, this.u);
    }

    public PointF computeScrollVectorForPosition(int i2) {
        int a2 = a(i2);
        PointF pointF = new PointF();
        if (a2 == 0) {
            return null;
        }
        if (this.e == 0) {
            pointF.x = (float) a2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) a2;
        }
        return pointF;
    }

    public int computeVerticalScrollExtent(RecyclerView.y yVar) {
        return computeScrollExtent(yVar);
    }

    public int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return computeScrollOffset(yVar);
    }

    public int computeVerticalScrollRange(RecyclerView.y yVar) {
        return computeScrollRange(yVar);
    }

    public View d(boolean z) {
        int k2 = this.c.k();
        int g2 = this.c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int e2 = this.c.e(childAt);
            int b2 = this.c.b(childAt);
            if (b2 > k2 && e2 < g2) {
                if (b2 <= g2 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public View e(boolean z) {
        int k2 = this.c.k();
        int g2 = this.c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int e2 = this.c.e(childAt);
            if (this.c.b(childAt) > k2 && e2 < g2) {
                if (e2 >= k2 || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void f(RecyclerView.u uVar, RecyclerView.y yVar, boolean z) {
        int g2;
        int j2 = j(Integer.MIN_VALUE);
        if (j2 != Integer.MIN_VALUE && (g2 = this.c.g() - j2) > 0) {
            int i2 = g2 - (-scrollBy(-g2, uVar, yVar));
            if (z && i2 > 0) {
                this.c.p(i2);
            }
        }
    }

    public final void g(RecyclerView.u uVar, RecyclerView.y yVar, boolean z) {
        int k2;
        int k3 = k(Integer.MAX_VALUE);
        if (k3 != Integer.MAX_VALUE && (k2 = k3 - this.c.k()) > 0) {
            int scrollBy = k2 - scrollBy(k2, uVar, yVar);
            if (z && scrollBy > 0) {
                this.c.p(-scrollBy);
            }
        }
    }

    public RecyclerView.o generateDefaultLayoutParams() {
        if (this.e == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public RecyclerView.o generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public int h() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public int i() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public boolean isAutoMeasureEnabled() {
        return this.n != 0;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final int j(int i2) {
        int h2 = this.b[0].h(i2);
        for (int i3 = 1; i3 < this.a; i3++) {
            int h3 = this.b[i3].h(i2);
            if (h3 > h2) {
                h2 = h3;
            }
        }
        return h2;
    }

    public final int k(int i2) {
        int k2 = this.b[0].k(i2);
        for (int i3 = 1; i3 < this.a; i3++) {
            int k3 = this.b[i3].k(i2);
            if (k3 < k2) {
                k2 = k3;
            }
        }
        return k2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.i
            if (r0 == 0) goto L_0x0009
            int r0 = r6.i()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.h()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.m
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.m
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.m
            r7.e(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.m
            r9.f(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.m
            r9.e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.i
            if (r7 == 0) goto L_0x004d
            int r7 = r6.h()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.i()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.requestLayout()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.l(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bc, code lost:
        if (r10 == r11) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r10 == r11) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d2, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m() {
        /*
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.a
            r2.<init>(r3)
            int r3 = r12.a
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.e
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.isLayoutRTL()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.i
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00f4
            android.view.View r7 = r12.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            boolean r10 = r12.i
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x0073
            int r10 = r9.c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.b()
            int r10 = r9.c
        L_0x0056:
            h0.v.a.v r11 = r12.c
            int r11 = r11.g()
            if (r10 >= r11) goto L_0x0096
            java.util.ArrayList<android.view.View> r10 = r9.a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.j(r10)
            java.util.Objects.requireNonNull(r9)
            goto L_0x0094
        L_0x0073:
            int r10 = r9.b
            if (r10 == r11) goto L_0x0078
            goto L_0x007d
        L_0x0078:
            r9.c()
            int r10 = r9.b
        L_0x007d:
            h0.v.a.v r11 = r12.c
            int r11 = r11.k()
            if (r10 <= r11) goto L_0x0096
            java.util.ArrayList<android.view.View> r10 = r9.a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.j(r10)
            java.util.Objects.requireNonNull(r9)
        L_0x0094:
            r9 = r1
            goto L_0x0097
        L_0x0096:
            r9 = r4
        L_0x0097:
            if (r9 == 0) goto L_0x009a
            return r7
        L_0x009a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L_0x00a1:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00f1
            android.view.View r9 = r12.getChildAt(r9)
            boolean r10 = r12.i
            if (r10 == 0) goto L_0x00bf
            h0.v.a.v r10 = r12.c
            int r10 = r10.b(r7)
            h0.v.a.v r11 = r12.c
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00bc
            return r7
        L_0x00bc:
            if (r10 != r11) goto L_0x00d2
            goto L_0x00d0
        L_0x00bf:
            h0.v.a.v r10 = r12.c
            int r10 = r10.e(r7)
            h0.v.a.v r11 = r12.c
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x00ce
            return r7
        L_0x00ce:
            if (r10 != r11) goto L_0x00d2
        L_0x00d0:
            r10 = r1
            goto L_0x00d3
        L_0x00d2:
            r10 = r4
        L_0x00d3:
            if (r10 == 0) goto L_0x00f1
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.e
            int r9 = r9.e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00e8
            r8 = r1
            goto L_0x00e9
        L_0x00e8:
            r8 = r4
        L_0x00e9:
            if (r3 >= 0) goto L_0x00ed
            r9 = r1
            goto L_0x00ee
        L_0x00ed:
            r9 = r4
        L_0x00ee:
            if (r8 == r9) goto L_0x00f1
            return r7
        L_0x00f1:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00f4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m():android.view.View");
    }

    public final void n(View view, int i2, int i3, boolean z) {
        boolean z2;
        calculateItemDecorationsForChild(view, this.s);
        c cVar = (c) view.getLayoutParams();
        int i4 = cVar.leftMargin;
        Rect rect = this.s;
        int z3 = z(i2, i4 + rect.left, cVar.rightMargin + rect.right);
        int i5 = cVar.topMargin;
        Rect rect2 = this.s;
        int z4 = z(i3, i5 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z) {
            z2 = shouldReMeasureChild(view, z3, z4, cVar);
        } else {
            z2 = shouldMeasureChild(view, z3, z4, cVar);
        }
        if (z2) {
            view.measure(z3, z4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:229:0x040e, code lost:
        if (b() != false) goto L_0x0412;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(androidx.recyclerview.widget.RecyclerView.u r12, androidx.recyclerview.widget.RecyclerView.y r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.t
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.q
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.k
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.b()
            if (r1 != 0) goto L_0x0018
            r11.removeAndRecycleAllViews(r12)
            r0.b()
            return
        L_0x0018:
            boolean r1 = r0.e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r11.k
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.q
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01f8
            r0.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.q
            if (r6 == 0) goto L_0x00ba
            int r7 = r6.q
            r8 = 0
            if (r7 <= 0) goto L_0x007d
            int r9 = r11.a
            if (r7 != r9) goto L_0x006f
            r6 = r3
        L_0x003f:
            int r7 = r11.a
            if (r6 >= r7) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r7 = r11.b
            r7 = r7[r6]
            r7.d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.q
            int[] r9 = r7.x
            r9 = r9[r6]
            if (r9 == r5) goto L_0x0064
            boolean r7 = r7.b2
            if (r7 == 0) goto L_0x005d
            h0.v.a.v r7 = r11.c
            int r7 = r7.g()
            goto L_0x0063
        L_0x005d:
            h0.v.a.v r7 = r11.c
            int r7 = r7.k()
        L_0x0063:
            int r9 = r9 + r7
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r7 = r11.b
            r7 = r7[r6]
            r7.b = r9
            r7.c = r9
            int r6 = r6 + 1
            goto L_0x003f
        L_0x006f:
            r6.x = r8
            r6.q = r3
            r6.y = r3
            r6.Y1 = r8
            r6.Z1 = r8
            int r7 = r6.d
            r6.c = r7
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.q
            boolean r7 = r6.c2
            r11.p = r7
            boolean r6 = r6.a2
            r11.assertNotInLayoutOrScroll(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.q
            if (r7 == 0) goto L_0x0092
            boolean r8 = r7.a2
            if (r8 == r6) goto L_0x0092
            r7.a2 = r6
        L_0x0092:
            r11.h = r6
            r11.requestLayout()
            r11.resolveShouldLayoutReverse()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.q
            int r7 = r6.c
            if (r7 == r2) goto L_0x00a7
            r11.k = r7
            boolean r7 = r6.b2
            r0.c = r7
            goto L_0x00ab
        L_0x00a7:
            boolean r7 = r11.i
            r0.c = r7
        L_0x00ab:
            int r7 = r6.y
            if (r7 <= r4) goto L_0x00c1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r11.m
            int[] r8 = r6.Y1
            r7.a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r6 = r6.Z1
            r7.b = r6
            goto L_0x00c1
        L_0x00ba:
            r11.resolveShouldLayoutReverse()
            boolean r6 = r11.i
            r0.c = r6
        L_0x00c1:
            boolean r6 = r13.g
            if (r6 != 0) goto L_0x01b5
            int r6 = r11.k
            if (r6 != r2) goto L_0x00cb
            goto L_0x01b5
        L_0x00cb:
            if (r6 < 0) goto L_0x01b1
            int r7 = r13.b()
            if (r6 < r7) goto L_0x00d5
            goto L_0x01b1
        L_0x00d5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.q
            if (r6 == 0) goto L_0x00ea
            int r7 = r6.c
            if (r7 == r2) goto L_0x00ea
            int r6 = r6.q
            if (r6 >= r4) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            r0.b = r5
            int r6 = r11.k
            r0.a = r6
            goto L_0x01af
        L_0x00ea:
            int r6 = r11.k
            android.view.View r6 = r11.findViewByPosition(r6)
            if (r6 == 0) goto L_0x017b
            boolean r7 = r11.i
            if (r7 == 0) goto L_0x00fb
            int r7 = r11.i()
            goto L_0x00ff
        L_0x00fb:
            int r7 = r11.h()
        L_0x00ff:
            r0.a = r7
            int r7 = r11.l
            if (r7 == r5) goto L_0x0131
            boolean r7 = r0.c
            if (r7 == 0) goto L_0x011d
            h0.v.a.v r7 = r11.c
            int r7 = r7.g()
            int r8 = r11.l
            int r7 = r7 - r8
            h0.v.a.v r8 = r11.c
            int r6 = r8.b(r6)
            int r7 = r7 - r6
            r0.b = r7
            goto L_0x01af
        L_0x011d:
            h0.v.a.v r7 = r11.c
            int r7 = r7.k()
            int r8 = r11.l
            int r7 = r7 + r8
            h0.v.a.v r8 = r11.c
            int r6 = r8.e(r6)
            int r7 = r7 - r6
            r0.b = r7
            goto L_0x01af
        L_0x0131:
            h0.v.a.v r7 = r11.c
            int r7 = r7.c(r6)
            h0.v.a.v r8 = r11.c
            int r8 = r8.l()
            if (r7 <= r8) goto L_0x0153
            boolean r6 = r0.c
            if (r6 == 0) goto L_0x014a
            h0.v.a.v r6 = r11.c
            int r6 = r6.g()
            goto L_0x0150
        L_0x014a:
            h0.v.a.v r6 = r11.c
            int r6 = r6.k()
        L_0x0150:
            r0.b = r6
            goto L_0x01af
        L_0x0153:
            h0.v.a.v r7 = r11.c
            int r7 = r7.e(r6)
            h0.v.a.v r8 = r11.c
            int r8 = r8.k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x0166
            int r6 = -r7
            r0.b = r6
            goto L_0x01af
        L_0x0166:
            h0.v.a.v r7 = r11.c
            int r7 = r7.g()
            h0.v.a.v r8 = r11.c
            int r6 = r8.b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x0178
            r0.b = r7
            goto L_0x01af
        L_0x0178:
            r0.b = r5
            goto L_0x01af
        L_0x017b:
            int r6 = r11.k
            r0.a = r6
            int r7 = r11.l
            if (r7 != r5) goto L_0x0192
            int r6 = r11.a(r6)
            if (r6 != r4) goto L_0x018b
            r6 = r4
            goto L_0x018c
        L_0x018b:
            r6 = r3
        L_0x018c:
            r0.c = r6
            r0.a()
            goto L_0x01ad
        L_0x0192:
            boolean r6 = r0.c
            if (r6 == 0) goto L_0x01a2
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            h0.v.a.v r6 = r6.c
            int r6 = r6.g()
            int r6 = r6 - r7
            r0.b = r6
            goto L_0x01ad
        L_0x01a2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            h0.v.a.v r6 = r6.c
            int r6 = r6.k()
            int r6 = r6 + r7
            r0.b = r6
        L_0x01ad:
            r0.d = r4
        L_0x01af:
            r6 = r4
            goto L_0x01b6
        L_0x01b1:
            r11.k = r2
            r11.l = r5
        L_0x01b5:
            r6 = r3
        L_0x01b6:
            if (r6 == 0) goto L_0x01b9
            goto L_0x01f6
        L_0x01b9:
            boolean r6 = r11.o
            if (r6 == 0) goto L_0x01d5
            int r6 = r13.b()
            int r7 = r11.getChildCount()
        L_0x01c5:
            int r7 = r7 + r2
            if (r7 < 0) goto L_0x01f1
            android.view.View r8 = r11.getChildAt(r7)
            int r8 = r11.getPosition(r8)
            if (r8 < 0) goto L_0x01c5
            if (r8 >= r6) goto L_0x01c5
            goto L_0x01f2
        L_0x01d5:
            int r6 = r13.b()
            int r7 = r11.getChildCount()
            r8 = r3
        L_0x01de:
            if (r8 >= r7) goto L_0x01f1
            android.view.View r9 = r11.getChildAt(r8)
            int r9 = r11.getPosition(r9)
            if (r9 < 0) goto L_0x01ee
            if (r9 >= r6) goto L_0x01ee
            r8 = r9
            goto L_0x01f2
        L_0x01ee:
            int r8 = r8 + 1
            goto L_0x01de
        L_0x01f1:
            r8 = r3
        L_0x01f2:
            r0.a = r8
            r0.b = r5
        L_0x01f6:
            r0.e = r4
        L_0x01f8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.q
            if (r6 != 0) goto L_0x0215
            int r6 = r11.k
            if (r6 != r2) goto L_0x0215
            boolean r6 = r0.c
            boolean r7 = r11.o
            if (r6 != r7) goto L_0x020e
            boolean r6 = r11.isLayoutRTL()
            boolean r7 = r11.p
            if (r6 == r7) goto L_0x0215
        L_0x020e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r11.m
            r6.a()
            r0.d = r4
        L_0x0215:
            int r6 = r11.getChildCount()
            if (r6 <= 0) goto L_0x02cd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.q
            if (r6 == 0) goto L_0x0223
            int r6 = r6.q
            if (r6 >= r4) goto L_0x02cd
        L_0x0223:
            boolean r6 = r0.d
            if (r6 == 0) goto L_0x0242
            r1 = r3
        L_0x0228:
            int r6 = r11.a
            if (r1 >= r6) goto L_0x02cd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r11.b
            r6 = r6[r1]
            r6.d()
            int r6 = r0.b
            if (r6 == r5) goto L_0x023f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r7 = r11.b
            r7 = r7[r1]
            r7.b = r6
            r7.c = r6
        L_0x023f:
            int r1 = r1 + 1
            goto L_0x0228
        L_0x0242:
            if (r1 != 0) goto L_0x0264
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.t
            int[] r1 = r1.f
            if (r1 != 0) goto L_0x024b
            goto L_0x0264
        L_0x024b:
            r1 = r3
        L_0x024c:
            int r6 = r11.a
            if (r1 >= r6) goto L_0x02cd
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r11.b
            r6 = r6[r1]
            r6.d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.t
            int[] r7 = r7.f
            r7 = r7[r1]
            r6.b = r7
            r6.c = r7
            int r1 = r1 + 1
            goto L_0x024c
        L_0x0264:
            r1 = r3
        L_0x0265:
            int r6 = r11.a
            if (r1 >= r6) goto L_0x02a5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r11.b
            r6 = r6[r1]
            boolean r7 = r11.i
            int r8 = r0.b
            if (r7 == 0) goto L_0x0278
            int r9 = r6.h(r5)
            goto L_0x027c
        L_0x0278:
            int r9 = r6.k(r5)
        L_0x027c:
            r6.d()
            if (r9 != r5) goto L_0x0282
            goto L_0x02a2
        L_0x0282:
            if (r7 == 0) goto L_0x028e
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            h0.v.a.v r10 = r10.c
            int r10 = r10.g()
            if (r9 < r10) goto L_0x02a2
        L_0x028e:
            if (r7 != 0) goto L_0x029b
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            h0.v.a.v r7 = r7.c
            int r7 = r7.k()
            if (r9 <= r7) goto L_0x029b
            goto L_0x02a2
        L_0x029b:
            if (r8 == r5) goto L_0x029e
            int r9 = r9 + r8
        L_0x029e:
            r6.c = r9
            r6.b = r9
        L_0x02a2:
            int r1 = r1 + 1
            goto L_0x0265
        L_0x02a5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.t
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r11.b
            java.util.Objects.requireNonNull(r1)
            int r7 = r6.length
            int[] r8 = r1.f
            if (r8 == 0) goto L_0x02b4
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02bd
        L_0x02b4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r8 = r8.b
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f = r8
        L_0x02bd:
            r8 = r3
        L_0x02be:
            if (r8 >= r7) goto L_0x02cd
            int[] r9 = r1.f
            r10 = r6[r8]
            int r10 = r10.k(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02be
        L_0x02cd:
            r11.detachAndScrapAttachedViews(r12)
            h0.v.a.o r1 = r11.g
            r1.a = r3
            h0.v.a.v r1 = r11.d
            int r1 = r1.l()
            int r6 = r11.a
            int r6 = r1 / r6
            r11.f = r6
            h0.v.a.v r6 = r11.d
            int r6 = r6.i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r11.r = r1
            int r1 = r0.a
            r11.x(r1, r13)
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x030d
            r11.u(r2)
            h0.v.a.o r1 = r11.g
            r11.c(r12, r1, r13)
            r11.u(r4)
            h0.v.a.o r1 = r11.g
            int r2 = r0.a
            int r6 = r1.d
            int r2 = r2 + r6
            r1.c = r2
            r11.c(r12, r1, r13)
            goto L_0x0324
        L_0x030d:
            r11.u(r4)
            h0.v.a.o r1 = r11.g
            r11.c(r12, r1, r13)
            r11.u(r2)
            h0.v.a.o r1 = r11.g
            int r2 = r0.a
            int r6 = r1.d
            int r2 = r2 + r6
            r1.c = r2
            r11.c(r12, r1, r13)
        L_0x0324:
            h0.v.a.v r1 = r11.d
            int r1 = r1.i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0330
            goto L_0x03d3
        L_0x0330:
            r1 = 0
            int r2 = r11.getChildCount()
            r6 = r3
        L_0x0336:
            if (r6 >= r2) goto L_0x0358
            android.view.View r7 = r11.getChildAt(r6)
            h0.v.a.v r8 = r11.d
            int r8 = r8.c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0348
            goto L_0x0355
        L_0x0348:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            java.util.Objects.requireNonNull(r7)
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0355:
            int r6 = r6 + 1
            goto L_0x0336
        L_0x0358:
            int r6 = r11.f
            int r7 = r11.a
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            h0.v.a.v r7 = r11.d
            int r7 = r7.i()
            if (r7 != r5) goto L_0x0374
            h0.v.a.v r5 = r11.d
            int r5 = r5.l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0374:
            int r5 = r11.a
            int r5 = r1 / r5
            r11.f = r5
            h0.v.a.v r5 = r11.d
            int r5 = r5.i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            r11.r = r1
            int r1 = r11.f
            if (r1 != r6) goto L_0x038b
            goto L_0x03d3
        L_0x038b:
            r1 = r3
        L_0x038c:
            if (r1 >= r2) goto L_0x03d3
            android.view.View r5 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            java.util.Objects.requireNonNull(r7)
            boolean r8 = r11.isLayoutRTL()
            if (r8 == 0) goto L_0x03bb
            int r8 = r11.e
            if (r8 != r4) goto L_0x03bb
            int r8 = r11.a
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r7.e
            int r7 = r7.e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f
            int r9 = r9 * r10
            int r8 = r8 - r4
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03d0
        L_0x03bb:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r7.e
            int r7 = r7.e
            int r8 = r11.f
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.e
            if (r9 != r4) goto L_0x03cc
            int r8 = r8 - r7
            r5.offsetLeftAndRight(r8)
            goto L_0x03d0
        L_0x03cc:
            int r8 = r8 - r7
            r5.offsetTopAndBottom(r8)
        L_0x03d0:
            int r1 = r1 + 1
            goto L_0x038c
        L_0x03d3:
            int r1 = r11.getChildCount()
            if (r1 <= 0) goto L_0x03ea
            boolean r1 = r11.i
            if (r1 == 0) goto L_0x03e4
            r11.f(r12, r13, r4)
            r11.g(r12, r13, r3)
            goto L_0x03ea
        L_0x03e4:
            r11.g(r12, r13, r4)
            r11.f(r12, r13, r3)
        L_0x03ea:
            if (r14 == 0) goto L_0x0411
            boolean r14 = r13.g
            if (r14 != 0) goto L_0x0411
            int r14 = r11.n
            if (r14 == 0) goto L_0x0402
            int r14 = r11.getChildCount()
            if (r14 <= 0) goto L_0x0402
            android.view.View r14 = r11.m()
            if (r14 == 0) goto L_0x0402
            r14 = r4
            goto L_0x0403
        L_0x0402:
            r14 = r3
        L_0x0403:
            if (r14 == 0) goto L_0x0411
            java.lang.Runnable r14 = r11.w
            r11.removeCallbacks(r14)
            boolean r14 = r11.b()
            if (r14 == 0) goto L_0x0411
            goto L_0x0412
        L_0x0411:
            r4 = r3
        L_0x0412:
            boolean r14 = r13.g
            if (r14 == 0) goto L_0x041b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.t
            r14.b()
        L_0x041b:
            boolean r14 = r0.c
            r11.o = r14
            boolean r14 = r11.isLayoutRTL()
            r11.p = r14
            if (r4 == 0) goto L_0x042f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.t
            r14.b()
            r11.o(r12, r13, r3)
        L_0x042f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    public void offsetChildrenHorizontal(int i2) {
        super.offsetChildrenHorizontal(i2);
        for (int i3 = 0; i3 < this.a; i3++) {
            d dVar = this.b[i3];
            int i4 = dVar.b;
            if (i4 != Integer.MIN_VALUE) {
                dVar.b = i4 + i2;
            }
            int i5 = dVar.c;
            if (i5 != Integer.MIN_VALUE) {
                dVar.c = i5 + i2;
            }
        }
    }

    public void offsetChildrenVertical(int i2) {
        super.offsetChildrenVertical(i2);
        for (int i3 = 0; i3 < this.a; i3++) {
            d dVar = this.b[i3];
            int i4 = dVar.b;
            if (i4 != Integer.MIN_VALUE) {
                dVar.b = i4 + i2;
            }
            int i5 = dVar.c;
            if (i5 != Integer.MIN_VALUE) {
                dVar.c = i5 + i2;
            }
        }
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.m.a();
        for (int i2 = 0; i2 < this.a; i2++) {
            this.b[i2].d();
        }
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        removeCallbacks(this.w);
        for (int i2 = 0; i2 < this.a; i2++) {
            this.b[i2].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003b, code lost:
        if (r8.e == 1) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r8.e == 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
        if (isLayoutRTL() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0059, code lost:
        if (isLayoutRTL() == false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.u r11, androidx.recyclerview.widget.RecyclerView.y r12) {
        /*
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.findContainingItemView(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.resolveShouldLayoutReverse()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r10 == r3) goto L_0x0050
            r4 = 2
            if (r10 == r4) goto L_0x0044
            r4 = 17
            if (r10 == r4) goto L_0x003f
            r4 = 33
            if (r10 == r4) goto L_0x0039
            r4 = 66
            if (r10 == r4) goto L_0x0034
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            int r10 = r8.e
            if (r10 != r3) goto L_0x0032
        L_0x0030:
            r10 = r3
            goto L_0x005c
        L_0x0032:
            r10 = r0
            goto L_0x005c
        L_0x0034:
            int r10 = r8.e
            if (r10 != 0) goto L_0x0032
            goto L_0x0030
        L_0x0039:
            int r10 = r8.e
            if (r10 != r3) goto L_0x0032
        L_0x003d:
            r10 = r2
            goto L_0x005c
        L_0x003f:
            int r10 = r8.e
            if (r10 != 0) goto L_0x0032
        L_0x0043:
            goto L_0x003d
        L_0x0044:
            int r10 = r8.e
            if (r10 != r3) goto L_0x0049
            goto L_0x0030
        L_0x0049:
            boolean r10 = r8.isLayoutRTL()
            if (r10 == 0) goto L_0x0030
            goto L_0x0054
        L_0x0050:
            int r10 = r8.e
            if (r10 != r3) goto L_0x0055
        L_0x0054:
            goto L_0x0043
        L_0x0055:
            boolean r10 = r8.isLayoutRTL()
            if (r10 == 0) goto L_0x003d
            goto L_0x0030
        L_0x005c:
            if (r10 != r0) goto L_0x005f
            return r1
        L_0x005f:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r0
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r0 = r0.e
            if (r10 != r3) goto L_0x0071
            int r4 = r8.i()
            goto L_0x0075
        L_0x0071:
            int r4 = r8.h()
        L_0x0075:
            r8.x(r4, r12)
            r8.u(r10)
            h0.v.a.o r5 = r8.g
            int r6 = r5.d
            int r6 = r6 + r4
            r5.c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            h0.v.a.v r7 = r8.c
            int r7 = r7.l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.b = r6
            h0.v.a.o r5 = r8.g
            r5.h = r3
            r6 = 0
            r5.a = r6
            r8.c(r11, r5, r12)
            boolean r11 = r8.i
            r8.o = r11
            android.view.View r11 = r0.i(r4, r10)
            if (r11 == 0) goto L_0x00a7
            if (r11 == r9) goto L_0x00a7
            return r11
        L_0x00a7:
            boolean r11 = r8.p(r10)
            if (r11 == 0) goto L_0x00c2
            int r11 = r8.a
            int r11 = r11 - r3
        L_0x00b0:
            if (r11 < 0) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r12 = r8.b
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00bf
            if (r12 == r9) goto L_0x00bf
            return r12
        L_0x00bf:
            int r11 = r11 + -1
            goto L_0x00b0
        L_0x00c2:
            r11 = r6
        L_0x00c3:
            int r12 = r8.a
            if (r11 >= r12) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r12 = r8.b
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00d4
            if (r12 == r9) goto L_0x00d4
            return r12
        L_0x00d4:
            int r11 = r11 + 1
            goto L_0x00c3
        L_0x00d7:
            boolean r11 = r8.h
            r11 = r11 ^ r3
            if (r10 != r2) goto L_0x00de
            r12 = r3
            goto L_0x00df
        L_0x00de:
            r12 = r6
        L_0x00df:
            if (r11 != r12) goto L_0x00e3
            r11 = r3
            goto L_0x00e4
        L_0x00e3:
            r11 = r6
        L_0x00e4:
            if (r11 == 0) goto L_0x00eb
            int r12 = r0.e()
            goto L_0x00ef
        L_0x00eb:
            int r12 = r0.f()
        L_0x00ef:
            android.view.View r12 = r8.findViewByPosition(r12)
            if (r12 == 0) goto L_0x00f8
            if (r12 == r9) goto L_0x00f8
            return r12
        L_0x00f8:
            boolean r10 = r8.p(r10)
            if (r10 == 0) goto L_0x0127
            int r10 = r8.a
            int r10 = r10 - r3
        L_0x0101:
            if (r10 < 0) goto L_0x014a
            int r12 = r0.e
            if (r10 != r12) goto L_0x0108
            goto L_0x0124
        L_0x0108:
            if (r11 == 0) goto L_0x0113
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r12 = r8.b
            r12 = r12[r10]
            int r12 = r12.e()
            goto L_0x011b
        L_0x0113:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r12 = r8.b
            r12 = r12[r10]
            int r12 = r12.f()
        L_0x011b:
            android.view.View r12 = r8.findViewByPosition(r12)
            if (r12 == 0) goto L_0x0124
            if (r12 == r9) goto L_0x0124
            return r12
        L_0x0124:
            int r10 = r10 + -1
            goto L_0x0101
        L_0x0127:
            int r10 = r8.a
            if (r6 >= r10) goto L_0x014a
            if (r11 == 0) goto L_0x0136
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r10 = r8.b
            r10 = r10[r6]
            int r10 = r10.e()
            goto L_0x013e
        L_0x0136:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r10 = r8.b
            r10 = r10[r6]
            int r10 = r10.f()
        L_0x013e:
            android.view.View r10 = r8.findViewByPosition(r10)
            if (r10 == 0) goto L_0x0147
            if (r10 == r9) goto L_0x0147
            return r10
        L_0x0147:
            int r6 = r6 + 1
            goto L_0x0127
        L_0x014a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View e2 = e(false);
            View d2 = d(false);
            if (e2 != null && d2 != null) {
                int position = getPosition(e2);
                int position2 = getPosition(d2);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        l(i2, i3, 1);
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.m.a();
        requestLayout();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        l(i2, i3, 8);
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        l(i2, i3, 2);
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        l(i2, i3, 4);
    }

    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        o(uVar, yVar, true);
    }

    public void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.k = -1;
        this.l = Integer.MIN_VALUE;
        this.q = null;
        this.t.b();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.q = savedState;
            if (this.k != -1) {
                savedState.x = null;
                savedState.q = 0;
                savedState.c = -1;
                savedState.d = -1;
                savedState.x = null;
                savedState.q = 0;
                savedState.y = 0;
                savedState.Y1 = null;
                savedState.Z1 = null;
            }
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        int i2;
        View view;
        int i3;
        int i4;
        int[] iArr;
        SavedState savedState = this.q;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.a2 = this.h;
        savedState2.b2 = this.o;
        savedState2.c2 = this.p;
        LazySpanLookup lazySpanLookup = this.m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.a) == null) {
            savedState2.y = 0;
        } else {
            savedState2.Y1 = iArr;
            savedState2.y = iArr.length;
            savedState2.Z1 = lazySpanLookup.b;
        }
        int i5 = -1;
        if (getChildCount() > 0) {
            if (this.o) {
                i2 = i();
            } else {
                i2 = h();
            }
            savedState2.c = i2;
            if (this.i) {
                view = d(true);
            } else {
                view = e(true);
            }
            if (view != null) {
                i5 = getPosition(view);
            }
            savedState2.d = i5;
            int i6 = this.a;
            savedState2.q = i6;
            savedState2.x = new int[i6];
            for (int i7 = 0; i7 < this.a; i7++) {
                if (this.o) {
                    i3 = this.b[i7].h(Integer.MIN_VALUE);
                    if (i3 != Integer.MIN_VALUE) {
                        i4 = this.c.g();
                    } else {
                        savedState2.x[i7] = i3;
                    }
                } else {
                    i3 = this.b[i7].k(Integer.MIN_VALUE);
                    if (i3 != Integer.MIN_VALUE) {
                        i4 = this.c.k();
                    } else {
                        savedState2.x[i7] = i3;
                    }
                }
                i3 -= i4;
                savedState2.x[i7] = i3;
            }
        } else {
            savedState2.c = -1;
            savedState2.d = -1;
            savedState2.q = 0;
        }
        return savedState2;
    }

    public void onScrollStateChanged(int i2) {
        if (i2 == 0) {
            b();
        }
    }

    public final boolean p(int i2) {
        if (this.e == 0) {
            if ((i2 == -1) != this.i) {
                return true;
            }
            return false;
        }
        if (((i2 == -1) == this.i) == isLayoutRTL()) {
            return true;
        }
        return false;
    }

    public void q(int i2, RecyclerView.y yVar) {
        int i3;
        int i4;
        if (i2 > 0) {
            i4 = i();
            i3 = 1;
        } else {
            i3 = -1;
            i4 = h();
        }
        this.g.a = true;
        x(i4, yVar);
        u(i3);
        o oVar = this.g;
        oVar.c = i4 + oVar.d;
        oVar.b = Math.abs(i2);
    }

    public final void r(RecyclerView.u uVar, o oVar) {
        int i2;
        int i3;
        if (oVar.a && !oVar.i) {
            if (oVar.b != 0) {
                int i4 = 1;
                if (oVar.e == -1) {
                    int i5 = oVar.f;
                    int k2 = this.b[0].k(i5);
                    while (i4 < this.a) {
                        int k3 = this.b[i4].k(i5);
                        if (k3 > k2) {
                            k2 = k3;
                        }
                        i4++;
                    }
                    int i6 = i5 - k2;
                    if (i6 < 0) {
                        i3 = oVar.g;
                    } else {
                        i3 = oVar.g - Math.min(i6, oVar.b);
                    }
                    s(uVar, i3);
                    return;
                }
                int i7 = oVar.g;
                int h2 = this.b[0].h(i7);
                while (i4 < this.a) {
                    int h3 = this.b[i4].h(i7);
                    if (h3 < h2) {
                        h2 = h3;
                    }
                    i4++;
                }
                int i8 = h2 - oVar.g;
                if (i8 < 0) {
                    i2 = oVar.f;
                } else {
                    i2 = Math.min(i8, oVar.b) + oVar.f;
                }
                t(uVar, i2);
            } else if (oVar.e == -1) {
                s(uVar, oVar.g);
            } else {
                t(uVar, oVar.f);
            }
        }
    }

    public final void resolveShouldLayoutReverse() {
        if (this.e == 1 || !isLayoutRTL()) {
            this.i = this.h;
        } else {
            this.i = !this.h;
        }
    }

    public final void s(RecyclerView.u uVar, int i2) {
        int childCount = getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            if (this.c.e(childAt) >= i2 && this.c.o(childAt) >= i2) {
                c cVar = (c) childAt.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.e.a.size() != 1) {
                    cVar.e.l();
                    removeAndRecycleView(childAt, uVar);
                    childCount--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public int scrollBy(int i2, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        q(i2, yVar);
        int c2 = c(uVar, this.g, yVar);
        if (this.g.b >= c2) {
            i2 = i2 < 0 ? -c2 : c2;
        }
        this.c.p(-i2);
        this.o = this.i;
        o oVar = this.g;
        oVar.b = 0;
        r(uVar, oVar);
        return i2;
    }

    public int scrollHorizontallyBy(int i2, RecyclerView.u uVar, RecyclerView.y yVar) {
        return scrollBy(i2, uVar, yVar);
    }

    public void scrollToPosition(int i2) {
        SavedState savedState = this.q;
        if (!(savedState == null || savedState.c == i2)) {
            savedState.x = null;
            savedState.q = 0;
            savedState.c = -1;
            savedState.d = -1;
        }
        this.k = i2;
        this.l = Integer.MIN_VALUE;
        requestLayout();
    }

    public int scrollVerticallyBy(int i2, RecyclerView.u uVar, RecyclerView.y yVar) {
        return scrollBy(i2, uVar, yVar);
    }

    public void setMeasuredDimension(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.e == 1) {
            i5 = RecyclerView.n.chooseSize(i3, rect.height() + paddingBottom, getMinimumHeight());
            i4 = RecyclerView.n.chooseSize(i2, (this.f * this.a) + paddingRight, getMinimumWidth());
        } else {
            i4 = RecyclerView.n.chooseSize(i2, rect.width() + paddingRight, getMinimumWidth());
            i5 = RecyclerView.n.chooseSize(i3, (this.f * this.a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(i4, i5);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i2) {
        p pVar = new p(recyclerView.getContext());
        pVar.a = i2;
        startSmoothScroll(pVar);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.q == null;
    }

    public final void t(RecyclerView.u uVar, int i2) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.c.b(childAt) <= i2 && this.c.n(childAt) <= i2) {
                c cVar = (c) childAt.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.e.a.size() != 1) {
                    cVar.e.m();
                    removeAndRecycleView(childAt, uVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void u(int i2) {
        o oVar = this.g;
        oVar.e = i2;
        int i3 = 1;
        if (this.i != (i2 == -1)) {
            i3 = -1;
        }
        oVar.d = i3;
    }

    public void v(int i2) {
        assertNotInLayoutOrScroll((String) null);
        if (i2 != this.a) {
            this.m.a();
            requestLayout();
            this.a = i2;
            this.j = new BitSet(this.a);
            this.b = new d[this.a];
            for (int i3 = 0; i3 < this.a; i3++) {
                this.b[i3] = new d(i3);
            }
            requestLayout();
        }
    }

    public final void w(int i2, int i3) {
        for (int i4 = 0; i4 < this.a; i4++) {
            if (!this.b[i4].a.isEmpty()) {
                y(this.b[i4], i2, i3);
            }
        }
    }

    public final void x(int i2, RecyclerView.y yVar) {
        int i3;
        int i4;
        int i5;
        o oVar = this.g;
        boolean z = false;
        oVar.b = 0;
        oVar.c = i2;
        if (!isSmoothScrolling() || (i5 = yVar.a) == -1) {
            i4 = 0;
            i3 = 0;
        } else {
            if (this.i == (i5 < i2)) {
                i4 = this.c.l();
                i3 = 0;
            } else {
                i3 = this.c.l();
                i4 = 0;
            }
        }
        if (getClipToPadding()) {
            this.g.f = this.c.k() - i3;
            this.g.g = this.c.g() + i4;
        } else {
            this.g.g = this.c.f() + i4;
            this.g.f = -i3;
        }
        o oVar2 = this.g;
        oVar2.h = false;
        oVar2.a = true;
        if (this.c.i() == 0 && this.c.f() == 0) {
            z = true;
        }
        oVar2.i = z;
    }

    public final void y(d dVar, int i2, int i3) {
        int i4 = dVar.d;
        if (i2 == -1) {
            int i5 = dVar.b;
            if (i5 == Integer.MIN_VALUE) {
                dVar.c();
                i5 = dVar.b;
            }
            if (i5 + i4 <= i3) {
                this.j.set(dVar.e, false);
                return;
            }
            return;
        }
        int i6 = dVar.c;
        if (i6 == Integer.MIN_VALUE) {
            dVar.b();
            i6 = dVar.c;
        }
        if (i6 - i4 >= i3) {
            this.j.set(dVar.e, false);
        }
    }

    public final int z(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode);
        }
        return i2;
    }

    public RecyclerView.o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public static class LazySpanLookup {
        public int[] a;
        public List<FullSpanItem> b;

        public void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        public void b(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public FullSpanItem c(int i) {
            List<FullSpanItem> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.b.get(size);
                if (fullSpanItem.c == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = r1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.c
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = r1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.b
                r3.remove(r2)
                int r0 = r0.c
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.a
                int r5 = r5.length
                return r5
            L_0x0052:
                int r0 = r0 + 1
                int[] r2 = r4.a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.d(int):int");
        }

        public void e(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                b(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.a, i, i3, -1);
                List<FullSpanItem> list = this.b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.b.get(size);
                        int i4 = fullSpanItem.c;
                        if (i4 >= i) {
                            fullSpanItem.c = i4 + i2;
                        }
                    }
                }
            }
        }

        public void f(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                b(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<FullSpanItem> list = this.b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.b.get(size);
                        int i4 = fullSpanItem.c;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.b.remove(size);
                            } else {
                                fullSpanItem.c = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            public int c;
            public int d;
            public int[] q;
            public boolean x;

            public class a implements Parcelable.Creator<FullSpanItem> {
                public Object createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public Object[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.c = parcel.readInt();
                this.d = parcel.readInt();
                this.x = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.q = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("FullSpanItem{mPosition=");
                P0.append(this.c);
                P0.append(", mGapDir=");
                P0.append(this.d);
                P0.append(", mHasUnwantedGapAfter=");
                P0.append(this.x);
                P0.append(", mGapPerSpan=");
                P0.append(Arrays.toString(this.q));
                P0.append('}');
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.c);
                parcel.writeInt(this.d);
                parcel.writeInt(this.x ? 1 : 0);
                int[] iArr = this.q;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.q);
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i2, int i3) {
        this.e = i3;
        v(i2);
        this.g = new o();
        this.c = v.a(this, this.e);
        this.d = v.a(this, 1 - this.e);
    }
}
