package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import h0.v.a.j;
import h0.v.a.k;
import h0.v.a.p;
import h0.v.a.v;
import java.util.List;
import java.util.Objects;

public class LinearLayoutManager extends RecyclerView.n implements k.h, RecyclerView.x.b {
    public static final boolean DEBUG = false;
    public static final int HORIZONTAL = 0;
    public static final int INVALID_OFFSET = Integer.MIN_VALUE;
    private static final float MAX_SCROLL_FACTOR = 0.33333334f;
    private static final String TAG = "LinearLayoutManager";
    public static final int VERTICAL = 1;
    public final a mAnchorInfo;
    private int mInitialPrefetchItemCount;
    private boolean mLastStackFromEnd;
    private final b mLayoutChunkResult;
    private c mLayoutState;
    public int mOrientation;
    public v mOrientationHelper;
    public SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    private boolean mRecycleChildrenOnDetach;
    private int[] mReusableIntPair;
    private boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    private boolean mSmoothScrollbarEnabled;
    private boolean mStackFromEnd;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;
        public int d;
        public boolean q;

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

        public boolean a() {
            return this.c >= 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.q ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.q = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.c = savedState.c;
            this.d = savedState.d;
            this.q = savedState.q;
        }
    }

    public static class a {
        public v a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            d();
        }

        public void a() {
            int i;
            if (this.d) {
                i = this.a.g();
            } else {
                i = this.a.k();
            }
            this.c = i;
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.m() + this.a.b(view);
            } else {
                this.c = this.a.e(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int m = this.a.m();
            if (m >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int g = (this.a.g() - m) - this.a.b(view);
                this.c = this.a.g() - g;
                if (g > 0) {
                    int c2 = this.c - this.a.c(view);
                    int k = this.a.k();
                    int min = c2 - (Math.min(this.a.e(view) - k, 0) + k);
                    if (min < 0) {
                        this.c = Math.min(g, -min) + this.c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e2 = this.a.e(view);
            int k2 = e2 - this.a.k();
            this.c = e2;
            if (k2 > 0) {
                int g2 = (this.a.g() - Math.min(0, (this.a.g() - m) - this.a.b(view))) - (this.a.c(view) + e2);
                if (g2 < 0) {
                    this.c -= Math.min(k2, -g2);
                }
            }
        }

        public void d() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("AnchorInfo{mPosition=");
            P0.append(this.b);
            P0.append(", mCoordinate=");
            P0.append(this.c);
            P0.append(", mLayoutFromEnd=");
            P0.append(this.d);
            P0.append(", mValid=");
            return i0.d.a.a.a.C0(P0, this.e, '}');
        }
    }

    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    public static class c {
        public boolean a = true;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h = 0;
        public int i = 0;
        public int j;
        public List<RecyclerView.b0> k = null;
        public boolean l;

        public void a(View view) {
            int a2;
            int size = this.k.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.k.get(i3).itemView;
                RecyclerView.o oVar = (RecyclerView.o) view3.getLayoutParams();
                if (view3 != view && !oVar.c() && (a2 = (oVar.a() - this.d) * this.e) >= 0 && a2 < i2) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i2 = a2;
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.o) view2.getLayoutParams()).a();
            }
        }

        public boolean b(RecyclerView.y yVar) {
            int i2 = this.d;
            return i2 >= 0 && i2 < yVar.b();
        }

        public View c(RecyclerView.u uVar) {
            List<RecyclerView.b0> list = this.k;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = this.k.get(i2).itemView;
                    RecyclerView.o oVar = (RecyclerView.o) view.getLayoutParams();
                    if (!oVar.c() && this.d == oVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View e2 = uVar.e(this.d);
            this.d += this.e;
            return e2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        v vVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return g0.a.b.b.a.q(yVar, vVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        v vVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return g0.a.b.b.a.r(yVar, vVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(RecyclerView.y yVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        v vVar = this.mOrientationHelper;
        View findFirstVisibleChildClosestToStart = findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true);
        return g0.a.b.b.a.s(yVar, vVar, findFirstVisibleChildClosestToStart, findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        if (this.mShouldReverseLayout) {
            return findFirstPartiallyOrCompletelyInvisibleChild();
        }
        return findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        if (this.mShouldReverseLayout) {
            return findLastPartiallyOrCompletelyInvisibleChild();
        }
        return findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private int fixLayoutEndGap(int i, RecyclerView.u uVar, RecyclerView.y yVar, boolean z) {
        int g;
        int g2 = this.mOrientationHelper.g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(-g2, uVar, yVar);
        int i3 = i + i2;
        if (!z || (g = this.mOrientationHelper.g() - i3) <= 0) {
            return i2;
        }
        this.mOrientationHelper.p(g);
        return g + i2;
    }

    private int fixLayoutStartGap(int i, RecyclerView.u uVar, RecyclerView.y yVar, boolean z) {
        int k;
        int k2 = i - this.mOrientationHelper.k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -scrollBy(k2, uVar, yVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.mOrientationHelper.k()) <= 0) {
            return i2;
        }
        this.mOrientationHelper.p(-k);
        return i2 - k;
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void layoutForPredictiveAnimations(RecyclerView.u uVar, RecyclerView.y yVar, int i, int i2) {
        RecyclerView.u uVar2 = uVar;
        RecyclerView.y yVar2 = yVar;
        if (yVar2.k && getChildCount() != 0 && !yVar2.g && supportsPredictiveItemAnimations()) {
            List<RecyclerView.b0> list = uVar2.d;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.b0 b0Var = list.get(i5);
                if (!b0Var.isRemoved()) {
                    boolean z = true;
                    if ((b0Var.getLayoutPosition() < position) != this.mShouldReverseLayout) {
                        z = true;
                    }
                    if (z) {
                        i3 += this.mOrientationHelper.c(b0Var.itemView);
                    } else {
                        i4 += this.mOrientationHelper.c(b0Var.itemView);
                    }
                }
            }
            this.mLayoutState.k = list;
            if (i3 > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                c cVar = this.mLayoutState;
                cVar.h = i3;
                cVar.c = 0;
                cVar.a((View) null);
                fill(uVar2, this.mLayoutState, yVar2, false);
            }
            if (i4 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                c cVar2 = this.mLayoutState;
                cVar2.h = i4;
                cVar2.c = 0;
                cVar2.a((View) null);
                fill(uVar2, this.mLayoutState, yVar2, false);
            }
            this.mLayoutState.k = null;
        }
    }

    private void logChildren() {
        Log.d(TAG, "internal representation of views on the screen");
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            StringBuilder P0 = i0.d.a.a.a.P0("item ");
            P0.append(getPosition(childAt));
            P0.append(", coord:");
            P0.append(this.mOrientationHelper.e(childAt));
            Log.d(TAG, P0.toString());
        }
        Log.d(TAG, "==============");
    }

    private void recycleByLayoutState(RecyclerView.u uVar, c cVar) {
        if (cVar.a && !cVar.l) {
            int i = cVar.g;
            int i2 = cVar.i;
            if (cVar.f == -1) {
                recycleViewsFromEnd(uVar, i, i2);
            } else {
                recycleViewsFromStart(uVar, i, i2);
            }
        }
    }

    private void recycleChildren(RecyclerView.u uVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    removeAndRecycleViewAt(i3, uVar);
                }
                return;
            }
            while (i > i2) {
                removeAndRecycleViewAt(i, uVar);
                i--;
            }
        }
    }

    private void recycleViewsFromEnd(RecyclerView.u uVar, int i, int i2) {
        int childCount = getChildCount();
        if (i >= 0) {
            int f = (this.mOrientationHelper.f() - i) + i2;
            if (this.mShouldReverseLayout) {
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (this.mOrientationHelper.e(childAt) < f || this.mOrientationHelper.o(childAt) < f) {
                        recycleChildren(uVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt2 = getChildAt(i5);
                if (this.mOrientationHelper.e(childAt2) < f || this.mOrientationHelper.o(childAt2) < f) {
                    recycleChildren(uVar, i4, i5);
                    return;
                }
            }
        }
    }

    private void recycleViewsFromStart(RecyclerView.u uVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int childCount = getChildCount();
            if (this.mShouldReverseLayout) {
                int i4 = childCount - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View childAt = getChildAt(i5);
                    if (this.mOrientationHelper.b(childAt) > i3 || this.mOrientationHelper.n(childAt) > i3) {
                        recycleChildren(uVar, i4, i5);
                        return;
                    }
                }
                return;
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (this.mOrientationHelper.b(childAt2) > i3 || this.mOrientationHelper.n(childAt2) > i3) {
                    recycleChildren(uVar, 0, i6);
                    return;
                }
            }
        }
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    private boolean updateAnchorFromChildren(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        View findReferenceChild;
        boolean z = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            Objects.requireNonNull(aVar);
            RecyclerView.o oVar = (RecyclerView.o) focusedChild.getLayoutParams();
            if (!oVar.c() && oVar.a() >= 0 && oVar.a() < yVar.b()) {
                aVar.c(focusedChild, getPosition(focusedChild));
                return true;
            }
        }
        boolean z2 = this.mLastStackFromEnd;
        boolean z3 = this.mStackFromEnd;
        if (z2 != z3 || (findReferenceChild = findReferenceChild(uVar, yVar, aVar.d, z3)) == null) {
            return false;
        }
        aVar.b(findReferenceChild, getPosition(findReferenceChild));
        if (!yVar.g && supportsPredictiveItemAnimations()) {
            int e = this.mOrientationHelper.e(findReferenceChild);
            int b2 = this.mOrientationHelper.b(findReferenceChild);
            int k = this.mOrientationHelper.k();
            int g = this.mOrientationHelper.g();
            boolean z4 = b2 <= k && e < k;
            if (e >= g && b2 > g) {
                z = true;
            }
            if (z4 || z) {
                if (aVar.d) {
                    k = g;
                }
                aVar.c = k;
            }
        }
        return true;
    }

    private boolean updateAnchorFromPendingData(RecyclerView.y yVar, a aVar) {
        int i;
        int i2;
        boolean z = false;
        if (!yVar.g && (i = this.mPendingScrollPosition) != -1) {
            if (i < 0 || i >= yVar.b()) {
                this.mPendingScrollPosition = -1;
                this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
            } else {
                aVar.b = this.mPendingScrollPosition;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.a()) {
                    boolean z2 = this.mPendingSavedState.q;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.mOrientationHelper.g() - this.mPendingSavedState.d;
                    } else {
                        aVar.c = this.mOrientationHelper.k() + this.mPendingSavedState.d;
                    }
                    return true;
                } else if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View findViewByPosition = findViewByPosition(this.mPendingScrollPosition);
                    if (findViewByPosition == null) {
                        if (getChildCount() > 0) {
                            if ((this.mPendingScrollPosition < getPosition(getChildAt(0))) == this.mShouldReverseLayout) {
                                z = true;
                            }
                            aVar.d = z;
                        }
                        aVar.a();
                    } else if (this.mOrientationHelper.c(findViewByPosition) > this.mOrientationHelper.l()) {
                        aVar.a();
                        return true;
                    } else if (this.mOrientationHelper.e(findViewByPosition) - this.mOrientationHelper.k() < 0) {
                        aVar.c = this.mOrientationHelper.k();
                        aVar.d = false;
                        return true;
                    } else if (this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition) < 0) {
                        aVar.c = this.mOrientationHelper.g();
                        aVar.d = true;
                        return true;
                    } else {
                        if (aVar.d) {
                            i2 = this.mOrientationHelper.m() + this.mOrientationHelper.b(findViewByPosition);
                        } else {
                            i2 = this.mOrientationHelper.e(findViewByPosition);
                        }
                        aVar.c = i2;
                    }
                    return true;
                } else {
                    boolean z3 = this.mShouldReverseLayout;
                    aVar.d = z3;
                    if (z3) {
                        aVar.c = this.mOrientationHelper.g() - this.mPendingScrollPositionOffset;
                    } else {
                        aVar.c = this.mOrientationHelper.k() + this.mPendingScrollPositionOffset;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void updateAnchorInfoForLayout(RecyclerView.u uVar, RecyclerView.y yVar, a aVar) {
        if (!updateAnchorFromPendingData(yVar, aVar) && !updateAnchorFromChildren(uVar, yVar, aVar)) {
            aVar.a();
            aVar.b = this.mStackFromEnd ? yVar.b() - 1 : 0;
        }
    }

    private void updateLayoutState(int i, int i2, boolean z, RecyclerView.y yVar) {
        int i3;
        this.mLayoutState.l = resolveIsInfinite();
        this.mLayoutState.f = i;
        int[] iArr = this.mReusableIntPair;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(yVar, iArr);
        int max = Math.max(0, this.mReusableIntPair[0]);
        int max2 = Math.max(0, this.mReusableIntPair[1]);
        if (i == 1) {
            z2 = true;
        }
        c cVar = this.mLayoutState;
        int i5 = z2 ? max2 : max;
        cVar.h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = this.mOrientationHelper.h() + i5;
            View childClosestToEnd = getChildClosestToEnd();
            c cVar2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i4 = -1;
            }
            cVar2.e = i4;
            int position = getPosition(childClosestToEnd);
            c cVar3 = this.mLayoutState;
            cVar2.d = position + cVar3.e;
            cVar3.b = this.mOrientationHelper.b(childClosestToEnd);
            i3 = this.mOrientationHelper.b(childClosestToEnd) - this.mOrientationHelper.g();
        } else {
            View childClosestToStart = getChildClosestToStart();
            c cVar4 = this.mLayoutState;
            cVar4.h = this.mOrientationHelper.k() + cVar4.h;
            c cVar5 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i4 = -1;
            }
            cVar5.e = i4;
            int position2 = getPosition(childClosestToStart);
            c cVar6 = this.mLayoutState;
            cVar5.d = position2 + cVar6.e;
            cVar6.b = this.mOrientationHelper.e(childClosestToStart);
            i3 = (-this.mOrientationHelper.e(childClosestToStart)) + this.mOrientationHelper.k();
        }
        c cVar7 = this.mLayoutState;
        cVar7.c = i2;
        if (z) {
            cVar7.c = i2 - i3;
        }
        cVar7.g = i3;
    }

    private void updateLayoutStateToFillEnd(a aVar) {
        updateLayoutStateToFillEnd(aVar.b, aVar.c);
    }

    private void updateLayoutStateToFillStart(a aVar) {
        updateLayoutStateToFillStart(aVar.b, aVar.c);
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(yVar);
        if (this.mLayoutState.f == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.y yVar, RecyclerView.n.c cVar) {
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            updateLayoutState(i > 0 ? 1 : -1, Math.abs(i), true, yVar);
            collectPrefetchPositionsForLayoutState(yVar, this.mLayoutState, cVar);
        }
    }

    public void collectInitialPrefetchPositions(int i, RecyclerView.n.c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.mPendingSavedState;
        int i3 = -1;
        if (savedState == null || !savedState.a()) {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.mPendingSavedState;
            z = savedState2.q;
            i2 = savedState2.c;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i4++) {
            ((j.b) cVar).a(i2, 0);
            i2 += i3;
        }
    }

    public void collectPrefetchPositionsForLayoutState(RecyclerView.y yVar, c cVar, RecyclerView.n.c cVar2) {
        int i = cVar.d;
        if (i >= 0 && i < yVar.b()) {
            ((j.b) cVar2).a(i, Math.max(0, cVar.g));
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

    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
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

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i == 1) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.mOrientation != 1 && isLayoutRTL()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        return Integer.MIN_VALUE;
                    }
                    return this.mOrientation == 1 ? 1 : Integer.MIN_VALUE;
                } else if (this.mOrientation == 0) {
                    return 1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.mOrientation == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.mOrientation == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public c createLayoutState() {
        return new c();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    public int fill(RecyclerView.u uVar, c cVar, RecyclerView.y yVar, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            recycleByLayoutState(uVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.mLayoutChunkResult;
        while (true) {
            if ((!cVar.l && i3 <= 0) || !cVar.b(yVar)) {
                break;
            }
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            layoutChunk(uVar, yVar, cVar, bVar);
            if (!bVar.b) {
                int i4 = cVar.b;
                int i5 = bVar.a;
                cVar.b = (cVar.f * i5) + i4;
                if (!bVar.c || cVar.k != null || !yVar.g) {
                    cVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    recycleByLayoutState(uVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public int findFirstVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public int findLastVisibleItemPosition() {
        View findOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (findOneVisibleChild == null) {
            return -1;
        }
        return getPosition(findOneVisibleChild);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.e(getChildAt(i)) < this.mOrientationHelper.k()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.a(i, i2, i4, i3);
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        ensureLayoutState();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.a(i, i2, i4, i3);
        }
        return this.mVerticalBoundCheck.a(i, i2, i4, i3);
    }

    public View findReferenceChild(RecyclerView.u uVar, RecyclerView.y yVar, boolean z, boolean z2) {
        int i;
        int i2;
        ensureLayoutState();
        int childCount = getChildCount();
        int i3 = -1;
        if (z2) {
            i2 = getChildCount() - 1;
            i = -1;
        } else {
            i3 = childCount;
            i2 = 0;
            i = 1;
        }
        int b2 = yVar.b();
        int k = this.mOrientationHelper.k();
        int g = this.mOrientationHelper.g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            int position = getPosition(childAt);
            int e = this.mOrientationHelper.e(childAt);
            int b3 = this.mOrientationHelper.b(childAt);
            if (position >= 0 && position < b2) {
                if (!((RecyclerView.o) childAt.getLayoutParams()).c()) {
                    boolean z3 = b3 <= k && e < k;
                    boolean z4 = e >= g && b3 > g;
                    if (!z3 && !z4) {
                        return childAt;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = childAt;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = childAt;
                    }
                    view2 = childAt;
                } else if (view3 == null) {
                    view3 = childAt;
                }
            }
            i2 += i;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public RecyclerView.o generateDefaultLayoutParams() {
        return new RecyclerView.o(-2, -2);
    }

    @Deprecated
    public int getExtraLayoutSpace(RecyclerView.y yVar) {
        if (yVar.a != -1) {
            return this.mOrientationHelper.l();
        }
        return 0;
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public void layoutChunk(RecyclerView.u uVar, RecyclerView.y yVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View c2 = cVar.c(uVar);
        if (c2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.o oVar = (RecyclerView.o) c2.getLayoutParams();
        if (cVar.k == null) {
            if (this.mShouldReverseLayout == (cVar.f == -1)) {
                addView(c2);
            } else {
                addView(c2, 0);
            }
        } else {
            if (this.mShouldReverseLayout == (cVar.f == -1)) {
                addDisappearingView(c2);
            } else {
                addDisappearingView(c2, 0);
            }
        }
        measureChildWithMargins(c2, 0, 0);
        bVar.a = this.mOrientationHelper.c(c2);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                i5 = getWidth() - getPaddingRight();
                i4 = i5 - this.mOrientationHelper.d(c2);
            } else {
                i4 = getPaddingLeft();
                i5 = this.mOrientationHelper.d(c2) + i4;
            }
            if (cVar.f == -1) {
                int i6 = cVar.b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.a;
            } else {
                int i7 = cVar.b;
                i3 = i7;
                i2 = i5;
                i = bVar.a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d = this.mOrientationHelper.d(c2) + paddingTop;
            if (cVar.f == -1) {
                int i8 = cVar.b;
                i2 = i8;
                i3 = paddingTop;
                i = d;
                i4 = i8 - bVar.a;
            } else {
                int i9 = cVar.b;
                i3 = paddingTop;
                i2 = bVar.a + i9;
                i = d;
                i4 = i9;
            }
        }
        layoutDecoratedWithMargins(c2, i4, i3, i2, i);
        if (oVar.c() || oVar.b()) {
            bVar.c = true;
        }
        bVar.d = c2.hasFocusable();
    }

    public void onAnchorReady(RecyclerView.u uVar, RecyclerView.y yVar, a aVar, int i) {
    }

    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.onDetachedFromWindow(recyclerView, uVar);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(uVar);
            uVar.b();
        }
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        int convertFocusDirectionToLayoutDirection;
        View view2;
        View view3;
        resolveShouldLayoutReverse();
        if (getChildCount() == 0 || (convertFocusDirectionToLayoutDirection = convertFocusDirectionToLayoutDirection(i)) == Integer.MIN_VALUE) {
            return null;
        }
        ensureLayoutState();
        updateLayoutState(convertFocusDirectionToLayoutDirection, (int) (((float) this.mOrientationHelper.l()) * MAX_SCROLL_FACTOR), false, yVar);
        c cVar = this.mLayoutState;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        fill(uVar, cVar, yVar, true);
        if (convertFocusDirectionToLayoutDirection == -1) {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToStart();
        } else {
            view2 = findPartiallyOrCompletelyInvisibleChildClosestToEnd();
        }
        if (convertFocusDirectionToLayoutDirection == -1) {
            view3 = getChildClosestToStart();
        } else {
            view3 = getChildClosestToEnd();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View findViewByPosition;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.mPendingSavedState == null && this.mPendingScrollPosition == -1) && yVar.b() == 0) {
            removeAndRecycleAllViews(uVar);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && savedState.a()) {
            this.mPendingScrollPosition = this.mPendingSavedState.c;
        }
        ensureLayoutState();
        this.mLayoutState.a = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        a aVar = this.mAnchorInfo;
        if (!aVar.e || this.mPendingScrollPosition != -1 || this.mPendingSavedState != null) {
            aVar.d();
            a aVar2 = this.mAnchorInfo;
            aVar2.d = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(uVar, yVar, aVar2);
            this.mAnchorInfo.e = true;
        } else if (focusedChild != null && (this.mOrientationHelper.e(focusedChild) >= this.mOrientationHelper.g() || this.mOrientationHelper.b(focusedChild) <= this.mOrientationHelper.k())) {
            this.mAnchorInfo.c(focusedChild, getPosition(focusedChild));
        }
        c cVar = this.mLayoutState;
        cVar.f = cVar.j >= 0 ? 1 : -1;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(yVar, iArr);
        int k = this.mOrientationHelper.k() + Math.max(0, this.mReusableIntPair[0]);
        int h = this.mOrientationHelper.h() + Math.max(0, this.mReusableIntPair[1]);
        if (!(!yVar.g || (i6 = this.mPendingScrollPosition) == -1 || this.mPendingScrollPositionOffset == Integer.MIN_VALUE || (findViewByPosition = findViewByPosition(i6)) == null)) {
            if (this.mShouldReverseLayout) {
                i7 = this.mOrientationHelper.g() - this.mOrientationHelper.b(findViewByPosition);
                i8 = this.mPendingScrollPositionOffset;
            } else {
                i8 = this.mOrientationHelper.e(findViewByPosition) - this.mOrientationHelper.k();
                i7 = this.mPendingScrollPositionOffset;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                k += i10;
            } else {
                h -= i10;
            }
        }
        a aVar3 = this.mAnchorInfo;
        if (!aVar3.d ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i9 = 1;
        }
        onAnchorReady(uVar, yVar, aVar3, i9);
        detachAndScrapAttachedViews(uVar);
        this.mLayoutState.l = resolveIsInfinite();
        Objects.requireNonNull(this.mLayoutState);
        this.mLayoutState.i = 0;
        a aVar4 = this.mAnchorInfo;
        if (aVar4.d) {
            updateLayoutStateToFillStart(aVar4);
            c cVar2 = this.mLayoutState;
            cVar2.h = k;
            fill(uVar, cVar2, yVar, false);
            c cVar3 = this.mLayoutState;
            i2 = cVar3.b;
            int i11 = cVar3.d;
            int i12 = cVar3.c;
            if (i12 > 0) {
                h += i12;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            c cVar4 = this.mLayoutState;
            cVar4.h = h;
            cVar4.d += cVar4.e;
            fill(uVar, cVar4, yVar, false);
            c cVar5 = this.mLayoutState;
            i = cVar5.b;
            int i13 = cVar5.c;
            if (i13 > 0) {
                updateLayoutStateToFillStart(i11, i2);
                c cVar6 = this.mLayoutState;
                cVar6.h = i13;
                fill(uVar, cVar6, yVar, false);
                i2 = this.mLayoutState.b;
            }
        } else {
            updateLayoutStateToFillEnd(aVar4);
            c cVar7 = this.mLayoutState;
            cVar7.h = h;
            fill(uVar, cVar7, yVar, false);
            c cVar8 = this.mLayoutState;
            i = cVar8.b;
            int i14 = cVar8.d;
            int i15 = cVar8.c;
            if (i15 > 0) {
                k += i15;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            c cVar9 = this.mLayoutState;
            cVar9.h = k;
            cVar9.d += cVar9.e;
            fill(uVar, cVar9, yVar, false);
            c cVar10 = this.mLayoutState;
            int i16 = cVar10.b;
            int i17 = cVar10.c;
            if (i17 > 0) {
                updateLayoutStateToFillEnd(i14, i);
                c cVar11 = this.mLayoutState;
                cVar11.h = i17;
                fill(uVar, cVar11, yVar, false);
                i = this.mLayoutState.b;
            }
            i2 = i16;
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int fixLayoutEndGap = fixLayoutEndGap(i, uVar, yVar, true);
                i4 = i2 + fixLayoutEndGap;
                i3 = i + fixLayoutEndGap;
                i5 = fixLayoutStartGap(i4, uVar, yVar, false);
            } else {
                int fixLayoutStartGap = fixLayoutStartGap(i2, uVar, yVar, true);
                i4 = i2 + fixLayoutStartGap;
                i3 = i + fixLayoutStartGap;
                i5 = fixLayoutEndGap(i3, uVar, yVar, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        layoutForPredictiveAnimations(uVar, yVar, i2, i);
        if (!yVar.g) {
            v vVar = this.mOrientationHelper;
            vVar.b = vVar.l();
        } else {
            this.mAnchorInfo.d();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void onLayoutCompleted(RecyclerView.y yVar) {
        super.onLayoutCompleted(yVar);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.d();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.c = -1;
            }
            requestLayout();
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (getChildCount() > 0) {
            ensureLayoutState();
            boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
            savedState2.q = z;
            if (z) {
                View childClosestToEnd = getChildClosestToEnd();
                savedState2.d = this.mOrientationHelper.g() - this.mOrientationHelper.b(childClosestToEnd);
                savedState2.c = getPosition(childClosestToEnd);
            } else {
                View childClosestToStart = getChildClosestToStart();
                savedState2.c = getPosition(childClosestToStart);
                savedState2.d = this.mOrientationHelper.e(childClosestToStart) - this.mOrientationHelper.k();
            }
        } else {
            savedState2.c = -1;
        }
        return savedState2;
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        boolean z = position < position2 ? true : true;
        if (this.mShouldReverseLayout) {
            if (z) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - (this.mOrientationHelper.c(view) + this.mOrientationHelper.e(view2)));
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.g() - this.mOrientationHelper.b(view2));
            }
        } else if (z) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.e(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.b(view2) - this.mOrientationHelper.c(view));
        }
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.i() == 0 && this.mOrientationHelper.f() == 0;
    }

    public int scrollBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        updateLayoutState(i2, abs, true, yVar);
        c cVar = this.mLayoutState;
        int fill = fill(uVar, cVar, yVar, false) + cVar.g;
        if (fill < 0) {
            return 0;
        }
        if (abs > fill) {
            i = i2 * fill;
        }
        this.mOrientationHelper.p(-i);
        this.mLayoutState.j = i;
        return i;
    }

    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, uVar, yVar);
    }

    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.c = -1;
        }
        requestLayout();
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.c = -1;
        }
        requestLayout();
    }

    public int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, uVar, yVar);
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i != this.mOrientation || this.mOrientationHelper == null) {
                v a2 = v.a(this, i);
                this.mOrientationHelper = a2;
                this.mAnchorInfo.a = a2;
                this.mOrientation = i;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.e0("invalid orientation:", i));
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (z != this.mReverseLayout) {
            this.mReverseLayout = z;
            requestLayout();
        }
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll((String) null);
        if (this.mStackFromEnd != z) {
            this.mStackFromEnd = z;
            requestLayout();
        }
    }

    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        p pVar = new p(recyclerView.getContext());
        pVar.a = i;
        startSmoothScroll(pVar);
    }

    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    public void validateChildOrder() {
        StringBuilder P0 = i0.d.a.a.a.P0("validating child count ");
        P0.append(getChildCount());
        Log.d(TAG, P0.toString());
        boolean z = true;
        if (getChildCount() >= 1) {
            int position = getPosition(getChildAt(0));
            int e = this.mOrientationHelper.e(getChildAt(0));
            if (this.mShouldReverseLayout) {
                int i = 1;
                while (i < getChildCount()) {
                    View childAt = getChildAt(i);
                    int position2 = getPosition(childAt);
                    int e2 = this.mOrientationHelper.e(childAt);
                    if (position2 < position) {
                        logChildren();
                        StringBuilder P02 = i0.d.a.a.a.P0("detected invalid position. loc invalid? ");
                        if (e2 >= e) {
                            z = false;
                        }
                        P02.append(z);
                        throw new RuntimeException(P02.toString());
                    } else if (e2 <= e) {
                        i++;
                    } else {
                        logChildren();
                        throw new RuntimeException("detected invalid location");
                    }
                }
                return;
            }
            int i2 = 1;
            while (i2 < getChildCount()) {
                View childAt2 = getChildAt(i2);
                int position3 = getPosition(childAt2);
                int e3 = this.mOrientationHelper.e(childAt2);
                if (position3 < position) {
                    logChildren();
                    StringBuilder P03 = i0.d.a.a.a.P0("detected invalid position. loc invalid? ");
                    if (e3 >= e) {
                        z = false;
                    }
                    P03.append(z);
                    throw new RuntimeException(P03.toString());
                } else if (e3 >= e) {
                    i2++;
                } else {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        this.mLayoutState.c = this.mOrientationHelper.g() - i2;
        c cVar = this.mLayoutState;
        cVar.e = this.mShouldReverseLayout ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        this.mLayoutState.c = i2 - this.mOrientationHelper.k();
        c cVar = this.mLayoutState;
        cVar.d = i;
        cVar.e = this.mShouldReverseLayout ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mReverseLayout = false;
        this.mShouldReverseLayout = false;
        this.mStackFromEnd = false;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mPendingSavedState = null;
        this.mAnchorInfo = new a();
        this.mLayoutChunkResult = new b();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        RecyclerView.n.d properties = RecyclerView.n.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.a);
        setReverseLayout(properties.c);
        setStackFromEnd(properties.d);
    }
}
