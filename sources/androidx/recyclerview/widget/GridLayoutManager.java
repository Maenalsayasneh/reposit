package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.i.i.g0.b;
import h0.v.a.j;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean a = false;
    public int b = -1;
    public int[] c;
    public View[] d;
    public final SparseIntArray e = new SparseIntArray();
    public final SparseIntArray f = new SparseIntArray();
    public c g = new a();
    public final Rect h = new Rect();

    public static final class a extends c {
        public int d(int i, int i2) {
            return i % i2;
        }

        public int e(int i) {
            return 1;
        }
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        public boolean c = false;

        public static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int b(int i, int i2) {
            if (!this.c) {
                return d(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = d(i, i2);
            this.a.put(i, d);
            return d;
        }

        public int c(int i, int i2) {
            int e = e(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int e2 = e(i5);
                i3 += e2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = e2;
                }
            }
            return i3 + e > i2 ? i4 + 1 : i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.e(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.a
                int r3 = r3.get(r2)
                int r4 = r5.e(r2)
                int r4 = r4 + r3
                goto L_0x0030
            L_0x0020:
                r2 = r1
                r4 = r2
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r3 = r5.e(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L_0x002d
                r4 = r1
                goto L_0x0030
            L_0x002d:
                if (r4 <= r7) goto L_0x0030
                r4 = r3
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r4
                if (r0 > r7) goto L_0x0037
                return r4
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        i(RecyclerView.n.getProperties(context, attributeSet, i, i2).b);
    }

    public final void a(int i) {
        int i2;
        int[] iArr = this.c;
        int i3 = this.b;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.c = iArr;
    }

    public final void b() {
        View[] viewArr = this.d;
        if (viewArr == null || viewArr.length != this.b) {
            this.d = new View[this.b];
        }
    }

    public int c(int i, int i2) {
        if (this.mOrientation != 1 || !isLayoutRTL()) {
            int[] iArr = this.c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.c;
        int i3 = this.b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public boolean checkLayoutParams(RecyclerView.o oVar) {
        return oVar instanceof b;
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.n.c cVar2) {
        int i = this.b;
        for (int i2 = 0; i2 < this.b && cVar.b(yVar) && i > 0; i2++) {
            int i3 = cVar.d;
            ((j.b) cVar2).a(i3, Math.max(0, cVar.g));
            i -= this.g.e(i3);
            cVar.d += cVar.e;
        }
    }

    public int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        return super.computeHorizontalScrollOffset(yVar);
    }

    public int computeHorizontalScrollRange(RecyclerView.y yVar) {
        return super.computeHorizontalScrollRange(yVar);
    }

    public int computeVerticalScrollOffset(RecyclerView.y yVar) {
        return super.computeVerticalScrollOffset(yVar);
    }

    public int computeVerticalScrollRange(RecyclerView.y yVar) {
        return super.computeVerticalScrollRange(yVar);
    }

    public final int d(RecyclerView.u uVar, RecyclerView.y yVar, int i) {
        if (!yVar.g) {
            return this.g.c(i, this.b);
        }
        int c2 = uVar.c(i);
        if (c2 != -1) {
            return this.g.c(c2, this.b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    public final int e(RecyclerView.u uVar, RecyclerView.y yVar, int i) {
        if (!yVar.g) {
            return this.g.b(i, this.b);
        }
        int i2 = this.f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int c2 = uVar.c(i);
        if (c2 != -1) {
            return this.g.b(c2, this.b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int f(RecyclerView.u uVar, RecyclerView.y yVar, int i) {
        if (!yVar.g) {
            return this.g.e(i);
        }
        int i2 = this.e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int c2 = uVar.c(i);
        if (c2 != -1) {
            return this.g.e(c2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    public View findReferenceChild(RecyclerView.u uVar, RecyclerView.y yVar, boolean z, boolean z2) {
        int i;
        int childCount = getChildCount();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = getChildCount() - 1;
            i3 = -1;
        } else {
            i2 = childCount;
            i = 0;
        }
        int b2 = yVar.b();
        ensureLayoutState();
        int k = this.mOrientationHelper.k();
        int g2 = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View childAt = getChildAt(i);
            int position = getPosition(childAt);
            if (position >= 0 && position < b2 && e(uVar, yVar, position) == 0) {
                if (((RecyclerView.o) childAt.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else if (this.mOrientationHelper.e(childAt) < g2 && this.mOrientationHelper.b(childAt) >= k) {
                    return childAt;
                } else {
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    public final void g(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i5 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int c2 = c(bVar.e, bVar.f);
        if (this.mOrientation == 1) {
            i2 = RecyclerView.n.getChildMeasureSpec(c2, i, i5, bVar.width, false);
            i3 = RecyclerView.n.getChildMeasureSpec(this.mOrientationHelper.l(), getHeightMode(), i4, bVar.height, true);
        } else {
            int childMeasureSpec = RecyclerView.n.getChildMeasureSpec(c2, i, i4, bVar.height, false);
            int childMeasureSpec2 = RecyclerView.n.getChildMeasureSpec(this.mOrientationHelper.l(), getWidthMode(), i5, bVar.width, true);
            i3 = childMeasureSpec;
            i2 = childMeasureSpec2;
        }
        h(view, i2, i3, z);
    }

    public RecyclerView.o generateDefaultLayoutParams() {
        if (this.mOrientation == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public RecyclerView.o generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public int getColumnCountForAccessibility(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 1) {
            return this.b;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return d(uVar, yVar, yVar.b() - 1) + 1;
    }

    public int getRowCountForAccessibility(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 0) {
            return this.b;
        }
        if (yVar.b() < 1) {
            return 0;
        }
        return d(uVar, yVar, yVar.b() - 1) + 1;
    }

    public final void h(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
        if (z) {
            z2 = shouldReMeasureChild(view, i, i2, oVar);
        } else {
            z2 = shouldMeasureChild(view, i, i2, oVar);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    public void i(int i) {
        if (i != this.b) {
            this.a = true;
            if (i >= 1) {
                this.b = i;
                this.g.a.clear();
                requestLayout();
                return;
            }
            throw new IllegalArgumentException(i0.d.a.a.a.e0("Span count should be at least 1. Provided ", i));
        }
    }

    public final void j() {
        int i;
        int i2;
        if (getOrientation() == 1) {
            i2 = getWidth() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = getHeight() - getPaddingBottom();
            i = getPaddingTop();
        }
        a(i2 - i);
    }

    public void layoutChunk(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z;
        View c2;
        RecyclerView.u uVar2 = uVar;
        RecyclerView.y yVar2 = yVar;
        LinearLayoutManager.c cVar2 = cVar;
        LinearLayoutManager.b bVar2 = bVar;
        int j = this.mOrientationHelper.j();
        boolean z2 = j != 1073741824;
        int i19 = getChildCount() > 0 ? this.c[this.b] : 0;
        if (z2) {
            j();
        }
        boolean z3 = cVar2.e == 1;
        int i20 = this.b;
        if (!z3) {
            i20 = e(uVar2, yVar2, cVar2.d) + f(uVar2, yVar2, cVar2.d);
        }
        int i21 = 0;
        while (i21 < this.b && cVar2.b(yVar2) && i20 > 0) {
            int i22 = cVar2.d;
            int f2 = f(uVar2, yVar2, i22);
            if (f2 <= this.b) {
                i20 -= f2;
                if (i20 < 0 || (c2 = cVar2.c(uVar2)) == null) {
                    break;
                }
                this.d[i21] = c2;
                i21++;
            } else {
                throw new IllegalArgumentException(i0.d.a.a.a.u0(i0.d.a.a.a.R0("Item at position ", i22, " requires ", f2, " spans but GridLayoutManager has only "), this.b, " spans."));
            }
        }
        if (i21 == 0) {
            bVar2.b = true;
            return;
        }
        if (z3) {
            i = 1;
            i2 = i21;
            i3 = 0;
        } else {
            i3 = i21 - 1;
            i2 = -1;
            i = -1;
        }
        int i23 = 0;
        while (i3 != i2) {
            View view = this.d[i3];
            b bVar3 = (b) view.getLayoutParams();
            int f3 = f(uVar2, yVar2, getPosition(view));
            bVar3.f = f3;
            bVar3.e = i23;
            i23 += f3;
            i3 += i;
        }
        float f4 = 0.0f;
        int i24 = 0;
        for (int i25 = 0; i25 < i21; i25++) {
            View view2 = this.d[i25];
            if (cVar2.k != null) {
                z = false;
                if (z3) {
                    addDisappearingView(view2);
                } else {
                    addDisappearingView(view2, 0);
                }
            } else if (z3) {
                addView(view2);
                z = false;
            } else {
                z = false;
                addView(view2, 0);
            }
            calculateItemDecorationsForChild(view2, this.h);
            g(view2, j, z);
            int c3 = this.mOrientationHelper.c(view2);
            if (c3 > i24) {
                i24 = c3;
            }
            float d2 = (((float) this.mOrientationHelper.d(view2)) * 1.0f) / ((float) ((b) view2.getLayoutParams()).f);
            if (d2 > f4) {
                f4 = d2;
            }
        }
        if (z2) {
            a(Math.max(Math.round(f4 * ((float) this.b)), i19));
            i24 = 0;
            for (int i26 = 0; i26 < i21; i26++) {
                View view3 = this.d[i26];
                g(view3, 1073741824, true);
                int c4 = this.mOrientationHelper.c(view3);
                if (c4 > i24) {
                    i24 = c4;
                }
            }
        }
        for (int i27 = 0; i27 < i21; i27++) {
            View view4 = this.d[i27];
            if (this.mOrientationHelper.c(view4) != i24) {
                b bVar4 = (b) view4.getLayoutParams();
                Rect rect = bVar4.b;
                int i28 = rect.top + rect.bottom + bVar4.topMargin + bVar4.bottomMargin;
                int i29 = rect.left + rect.right + bVar4.leftMargin + bVar4.rightMargin;
                int c5 = c(bVar4.e, bVar4.f);
                if (this.mOrientation == 1) {
                    i18 = RecyclerView.n.getChildMeasureSpec(c5, 1073741824, i29, bVar4.width, false);
                    i17 = View.MeasureSpec.makeMeasureSpec(i24 - i28, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i24 - i29, 1073741824);
                    i17 = RecyclerView.n.getChildMeasureSpec(c5, 1073741824, i28, bVar4.height, false);
                    i18 = makeMeasureSpec;
                }
                h(view4, i18, i17, true);
            }
        }
        bVar2.a = i24;
        if (this.mOrientation == 1) {
            if (cVar2.f == -1) {
                i16 = cVar2.b;
                i15 = i16 - i24;
            } else {
                int i30 = cVar2.b;
                i15 = i30;
                i16 = i24 + i30;
            }
            i5 = i15;
            i6 = 0;
            i4 = i16;
            i7 = 0;
        } else {
            if (cVar2.f == -1) {
                i7 = cVar2.b;
                i14 = i7 - i24;
            } else {
                int i31 = cVar2.b;
                i14 = i31;
                i7 = i24 + i31;
            }
            i6 = i14;
            i5 = 0;
            i4 = 0;
        }
        int i32 = 0;
        while (i32 < i21) {
            View view5 = this.d[i32];
            b bVar5 = (b) view5.getLayoutParams();
            if (this.mOrientation == 1) {
                if (isLayoutRTL()) {
                    i13 = getPaddingLeft() + this.c[this.b - bVar5.e];
                    i12 = i13 - this.mOrientationHelper.d(view5);
                } else {
                    i12 = this.c[bVar5.e] + getPaddingLeft();
                    i13 = this.mOrientationHelper.d(view5) + i12;
                }
                i10 = i12;
                i9 = i5;
                i8 = i4;
                i11 = i13;
            } else {
                int paddingTop = getPaddingTop() + this.c[bVar5.e];
                i11 = i7;
                i10 = i6;
                i9 = paddingTop;
                i8 = this.mOrientationHelper.d(view5) + paddingTop;
            }
            layoutDecoratedWithMargins(view5, i10, i9, i11, i8);
            if (bVar5.c() || bVar5.b()) {
                bVar2.c = true;
            }
            bVar2.d |= view5.hasFocusable();
            i32++;
            i7 = i11;
            i6 = i10;
            i5 = i9;
            i4 = i8;
        }
        Arrays.fill(this.d, (Object) null);
    }

    public void onAnchorReady(RecyclerView.u uVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i) {
        super.onAnchorReady(uVar, yVar, aVar, i);
        j();
        if (yVar.b() > 0 && !yVar.g) {
            boolean z = i == 1;
            int e2 = e(uVar, yVar, aVar.b);
            if (z) {
                while (e2 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    e2 = e(uVar, yVar, i3);
                }
            } else {
                int b2 = yVar.b() - 1;
                int i4 = aVar.b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int e3 = e(uVar, yVar, i5);
                    if (e3 <= e2) {
                        break;
                    }
                    i4 = i5;
                    e2 = e3;
                }
                aVar.b = i4;
            }
        }
        b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f6, code lost:
        if (r13 == r11) goto L_0x00b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onFocusSearchFailed(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.y r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.findContainingItemView(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.e
            int r5 = r5.f
            int r5 = r5 + r6
            android.view.View r7 = super.onFocusSearchFailed(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.convertFocusDirectionToLayoutDirection(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = r9
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.mShouldReverseLayout
            if (r7 == r10) goto L_0x0032
            r7 = r9
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.getChildCount()
            int r7 = r7 - r9
            r11 = r10
            r12 = r11
            goto L_0x0045
        L_0x003e:
            int r7 = r23.getChildCount()
            r11 = r7
            r12 = r9
            r7 = 0
        L_0x0045:
            int r13 = r0.mOrientation
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.isLayoutRTL()
            if (r13 == 0) goto L_0x0051
            r13 = r9
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.d(r1, r2, r7)
            r15 = r10
            r16 = r15
            r8 = 0
            r17 = 0
            r10 = r7
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0149
            int r9 = r0.d(r1, r2, r10)
            android.view.View r1 = r0.getChildAt(r10)
            if (r1 != r3) goto L_0x006c
            goto L_0x0149
        L_0x006c:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0086
            if (r9 == r14) goto L_0x0086
            if (r4 == 0) goto L_0x0078
            goto L_0x0149
        L_0x0078:
            r18 = r3
            r21 = r7
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
            goto L_0x0135
        L_0x0086:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r9 = (androidx.recyclerview.widget.GridLayoutManager.b) r9
            int r2 = r9.e
            r18 = r3
            int r3 = r9.f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009e
            if (r2 != r6) goto L_0x009e
            if (r3 != r5) goto L_0x009e
            return r1
        L_0x009e:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a6
            if (r4 == 0) goto L_0x00ae
        L_0x00a6:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00ba
            if (r7 != 0) goto L_0x00ba
        L_0x00ae:
            r21 = r7
        L_0x00b0:
            r19 = r8
            r20 = r11
            r7 = r16
            r8 = r17
        L_0x00b8:
            r11 = 1
            goto L_0x0105
        L_0x00ba:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d9
            if (r7 <= r8) goto L_0x00cf
        L_0x00ce:
            goto L_0x00b0
        L_0x00cf:
            if (r7 != r8) goto L_0x00fc
            if (r2 <= r15) goto L_0x00d5
            r7 = 1
            goto L_0x00d6
        L_0x00d5:
            r7 = 0
        L_0x00d6:
            if (r13 != r7) goto L_0x00fc
            goto L_0x00ce
        L_0x00d9:
            if (r4 != 0) goto L_0x00fc
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.isViewPartiallyVisible(r1, r8, r11)
            if (r22 == 0) goto L_0x0100
            r8 = r17
            if (r7 <= r8) goto L_0x00ee
            r7 = r16
            goto L_0x0105
        L_0x00ee:
            if (r7 != r8) goto L_0x00f9
            r7 = r16
            if (r2 <= r7) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r13 != r11) goto L_0x0104
            goto L_0x00b8
        L_0x00f9:
            r7 = r16
            goto L_0x0104
        L_0x00fc:
            r19 = r8
            r20 = r11
        L_0x0100:
            r7 = r16
            r8 = r17
        L_0x0104:
            r11 = 0
        L_0x0105:
            if (r11 == 0) goto L_0x0135
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0123
            int r4 = r9.e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r2 = r3 - r2
            r15 = r4
            r16 = r7
            r17 = r8
            r7 = r21
            r4 = r1
            r8 = r2
            goto L_0x013d
        L_0x0123:
            int r7 = r9.e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r17 = r3 - r2
            r16 = r7
            r8 = r19
            r7 = r1
            goto L_0x013d
        L_0x0135:
            r16 = r7
            r17 = r8
            r8 = r19
            r7 = r21
        L_0x013d:
            int r10 = r10 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005e
        L_0x0149:
            r21 = r7
            if (r4 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r4 = r21
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.u uVar, RecyclerView.y yVar, View view, h0.i.i.g0.b bVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, bVar);
            return;
        }
        b bVar2 = (b) layoutParams;
        int d2 = d(uVar, yVar, bVar2.a());
        if (this.mOrientation == 0) {
            bVar.j(b.c.a(bVar2.e, bVar2.f, d2, 1, false, false));
            return;
        }
        bVar.j(b.c.a(d2, 1, bVar2.e, bVar2.f, false, false));
    }

    public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.g.a.clear();
        this.g.b.clear();
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        this.g.a.clear();
        this.g.b.clear();
    }

    public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.g.a.clear();
        this.g.b.clear();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.g.a.clear();
        this.g.b.clear();
    }

    public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.g.a.clear();
        this.g.b.clear();
    }

    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        if (yVar.g) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                b bVar = (b) getChildAt(i).getLayoutParams();
                int a2 = bVar.a();
                this.e.put(a2, bVar.f);
                this.f.put(a2, bVar.e);
            }
        }
        super.onLayoutChildren(uVar, yVar);
        this.e.clear();
        this.f.clear();
    }

    public void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.a = false;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        j();
        b();
        return super.scrollHorizontallyBy(i, uVar, yVar);
    }

    public int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        j();
        b();
        return super.scrollVerticallyBy(i, uVar, yVar);
    }

    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.c == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.mOrientation == 1) {
            i4 = RecyclerView.n.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            int[] iArr = this.c;
            i3 = RecyclerView.n.chooseSize(i, iArr[iArr.length - 1] + paddingRight, getMinimumWidth());
        } else {
            i3 = RecyclerView.n.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            int[] iArr2 = this.c;
            i4 = RecyclerView.n.chooseSize(i2, iArr2[iArr2.length - 1] + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.a;
    }

    public RecyclerView.o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public static class b extends RecyclerView.o {
        public int e = -1;
        public int f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        i(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        i(i);
    }
}
