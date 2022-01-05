package com.airbnb.epoxy.stickyheader;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import i0.b.a.d;
import kotlin.Metadata;
import m0.n.a.a;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001FJ\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\n\u0010\u001c\u001a\u00060\u001bR\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\n\u0010\u001c\u001a\u00060\u001bR\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b!\u0010\u001fJ#\u0010\"\u001a\u00020\u00042\n\u0010\u001c\u001a\u00060\u001bR\u00020\f2\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b-\u0010+J\u0017\u0010.\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b.\u0010+J\u0017\u0010/\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b/\u0010+J\u0017\u00100\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b0\u0010+J\u0019\u00103\u001a\u0004\u0018\u0001022\u0006\u00101\u001a\u00020\u0019H\u0016¢\u0006\u0004\b3\u00104J5\u00108\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u00020\u00192\n\u0010\u001c\u001a\u00060\u001bR\u00020\f2\u0006\u0010\u0016\u001a\u00020\u001dH\u0016¢\u0006\u0004\b8\u00109R\u0016\u0010<\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010C\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010E\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bD\u0010;¨\u0006G"}, d2 = {"Lcom/airbnb/epoxy/stickyheader/StickyHeaderLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "newAdapter", "Lm0/i;", "m", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "T", "Lkotlin/Function0;", "operation", "l", "(Lm0/n/a/a;)Ljava/lang/Object;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToWindow", "(Landroidx/recyclerview/widget/RecyclerView;)V", "oldAdapter", "onAdapterChanged", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "", "dy", "Landroidx/recyclerview/widget/RecyclerView$u;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$y;", "scrollVerticallyBy", "(ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)I", "dx", "scrollHorizontallyBy", "onLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)V", "position", "scrollToPosition", "(I)V", "offset", "scrollToPositionWithOffset", "(II)V", "computeVerticalScrollExtent", "(Landroidx/recyclerview/widget/RecyclerView$y;)I", "computeVerticalScrollOffset", "computeVerticalScrollRange", "computeHorizontalScrollExtent", "computeHorizontalScrollOffset", "computeHorizontalScrollRange", "targetPosition", "Landroid/graphics/PointF;", "computeScrollVectorForPosition", "(I)Landroid/graphics/PointF;", "Landroid/view/View;", "focused", "focusDirection", "onFocusSearchFailed", "(Landroid/view/View;ILandroidx/recyclerview/widget/RecyclerView$u;Landroidx/recyclerview/widget/RecyclerView$y;)Landroid/view/View;", "d", "I", "scrollOffset", "Li0/b/a/d;", "a", "Li0/b/a/d;", "adapter", "b", "Landroid/view/View;", "stickyHeader", "c", "scrollPosition", "SavedState", "epoxy-adapter_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StickyHeaderLinearLayoutManager.kt */
public final class StickyHeaderLinearLayoutManager extends LinearLayoutManager {
    public d a;
    public View b;
    public int c;
    public int d;

    /* compiled from: StickyHeaderLinearLayoutManager.kt */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final Parcelable c;
        public final int d;
        public final int q;

        public static class a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable, int i, int i2) {
            this.c = parcelable;
            this.d = i;
            this.q = i2;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SavedState)) {
                return false;
            }
            SavedState savedState = (SavedState) obj;
            return i.a(this.c, savedState.c) && this.d == savedState.d && this.q == savedState.q;
        }

        public int hashCode() {
            Parcelable parcelable = this.c;
            return ((((parcelable != null ? parcelable.hashCode() : 0) * 31) + this.d) * 31) + this.q;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("SavedState(superState=");
            P0.append(this.c);
            P0.append(", scrollPosition=");
            P0.append(this.d);
            P0.append(", scrollOffset=");
            return i0.d.a.a.a.u0(P0, this.q, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeParcelable(this.c, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.q);
        }
    }

    public int computeHorizontalScrollExtent(RecyclerView.y yVar) {
        i.e(yVar, "state");
        return ((Number) l(new StickyHeaderLinearLayoutManager$computeHorizontalScrollExtent$1(this, yVar))).intValue();
    }

    public int computeHorizontalScrollOffset(RecyclerView.y yVar) {
        i.e(yVar, "state");
        return ((Number) l(new StickyHeaderLinearLayoutManager$computeHorizontalScrollOffset$1(this, yVar))).intValue();
    }

    public int computeHorizontalScrollRange(RecyclerView.y yVar) {
        i.e(yVar, "state");
        return ((Number) l(new StickyHeaderLinearLayoutManager$computeHorizontalScrollRange$1(this, yVar))).intValue();
    }

    public PointF computeScrollVectorForPosition(int i) {
        return (PointF) l(new StickyHeaderLinearLayoutManager$computeScrollVectorForPosition$1(this, i));
    }

    public int computeVerticalScrollExtent(RecyclerView.y yVar) {
        i.e(yVar, "state");
        return ((Number) l(new StickyHeaderLinearLayoutManager$computeVerticalScrollExtent$1(this, yVar))).intValue();
    }

    public int computeVerticalScrollOffset(RecyclerView.y yVar) {
        i.e(yVar, "state");
        return ((Number) l(new StickyHeaderLinearLayoutManager$computeVerticalScrollOffset$1(this, yVar))).intValue();
    }

    public int computeVerticalScrollRange(RecyclerView.y yVar) {
        i.e(yVar, "state");
        return ((Number) l(new StickyHeaderLinearLayoutManager$computeVerticalScrollRange$1(this, yVar))).intValue();
    }

    public final <T> T l(a<? extends T> aVar) {
        View view = this.b;
        if (view != null) {
            detachView(view);
        }
        T invoke = aVar.invoke();
        View view2 = this.b;
        if (view2 != null) {
            attachView(view2);
        }
        return invoke;
    }

    public final void m(RecyclerView.Adapter<?> adapter) {
        d dVar = this.a;
        if (dVar != null) {
            dVar.unregisterAdapterDataObserver((RecyclerView.h) null);
        }
        if (adapter instanceof d) {
            d dVar2 = (d) adapter;
            this.a = dVar2;
            if (dVar2 != null) {
                dVar2.registerAdapterDataObserver((RecyclerView.h) null);
            }
            throw null;
        }
        this.a = null;
        throw null;
    }

    public void onAdapterChanged(RecyclerView.Adapter<?> adapter, RecyclerView.Adapter<?> adapter2) {
        super.onAdapterChanged(adapter, adapter2);
        m(adapter2);
        throw null;
    }

    public void onAttachedToWindow(RecyclerView recyclerView) {
        i.e(recyclerView, "recyclerView");
        super.onAttachedToWindow(recyclerView);
        m(recyclerView.getAdapter());
        throw null;
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        i.e(view, "focused");
        i.e(uVar, "recycler");
        i.e(yVar, "state");
        return (View) l(new StickyHeaderLinearLayoutManager$onFocusSearchFailed$1(this, view, i, uVar, yVar));
    }

    public void onLayoutChildren(RecyclerView.u uVar, RecyclerView.y yVar) {
        i.e(uVar, "recycler");
        i.e(yVar, "state");
        l(new StickyHeaderLinearLayoutManager$onLayoutChildren$1(this, uVar, yVar));
        if (!yVar.g) {
            throw null;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            parcelable = null;
        }
        SavedState savedState = (SavedState) parcelable;
        if (savedState != null) {
            this.c = savedState.d;
            this.d = savedState.q;
            super.onRestoreInstanceState(savedState.c);
        }
    }

    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.c, this.d);
    }

    public int scrollHorizontallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        i.e(uVar, "recycler");
        int intValue = ((Number) l(new StickyHeaderLinearLayoutManager$scrollHorizontallyBy$scrolled$1(this, i, uVar, yVar))).intValue();
        if (intValue == 0) {
            return intValue;
        }
        throw null;
    }

    public void scrollToPosition(int i) {
        this.c = -1;
        this.d = Integer.MIN_VALUE;
        throw null;
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.c = -1;
        this.d = Integer.MIN_VALUE;
        throw null;
    }

    public int scrollVerticallyBy(int i, RecyclerView.u uVar, RecyclerView.y yVar) {
        i.e(uVar, "recycler");
        int intValue = ((Number) l(new StickyHeaderLinearLayoutManager$scrollVerticallyBy$scrolled$1(this, i, uVar, yVar))).intValue();
        if (intValue == 0) {
            return intValue;
        }
        throw null;
    }
}
