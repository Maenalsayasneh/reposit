package com.airbnb.epoxy;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.viewmodeladapter.R;
import h0.v.a.q;
import i0.b.a.o;
import i0.b.a.t;
import java.util.List;

public class Carousel extends EpoxyRecyclerView {
    public static b d2 = new a();
    public static int e2 = 8;
    public float f2;

    public static class Padding {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final PaddingType f;

        public enum PaddingType {
            PX,
            DP,
            RESOURCE
        }

        public Padding(int i, int i2, int i3, int i4, int i5) {
            PaddingType paddingType = PaddingType.PX;
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = paddingType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Padding.class != obj.getClass()) {
                return false;
            }
            Padding padding = (Padding) obj;
            if (this.a != padding.a || this.b != padding.b || this.c != padding.c || this.d != padding.d) {
                return false;
            }
            if (this.e == padding.e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e;
        }
    }

    public class a extends b {
    }

    public static abstract class b {
    }

    public Carousel(Context context) {
        super(context, (AttributeSet) null, 0);
    }

    public static void setDefaultGlobalSnapHelperFactory(b bVar) {
        d2 = bVar;
    }

    public static void setDefaultItemSpacingDp(int i) {
        e2 = i;
    }

    public void a() {
        o oVar = this.q;
        if (oVar != null) {
            oVar.cancelPendingModelBuild();
        }
        this.q = null;
        swapAdapter((RecyclerView.Adapter<?>) null, true);
    }

    public void e() {
        super.e();
        int defaultSpacingBetweenItemsDp = getDefaultSpacingBetweenItemsDp();
        if (defaultSpacingBetweenItemsDp >= 0) {
            setItemSpacingDp(defaultSpacingBetweenItemsDp);
            if (getPaddingLeft() == 0 && getPaddingRight() == 0 && getPaddingTop() == 0 && getPaddingBottom() == 0) {
                setPaddingDp(defaultSpacingBetweenItemsDp);
            }
        }
        if (getSnapHelperFactory() != null) {
            getContext();
            new q().a(this);
        }
        setRemoveAdapterWhenDetachedFromWindow(false);
    }

    public int getDefaultSpacingBetweenItemsDp() {
        return e2;
    }

    public float getNumViewsToShowOnScreen() {
        return this.f2;
    }

    public b getSnapHelperFactory() {
        return d2;
    }

    public void onChildAttachedToWindow(View view) {
        int i;
        int i2;
        int i3;
        if (this.f2 > 0.0f) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.setTag(R.id.epoxy_recycler_view_child_initial_size_id, Integer.valueOf(layoutParams.width));
            int i4 = getSpacingDecorator().a;
            int i5 = 0;
            int i6 = i4 > 0 ? (int) (((float) i4) * this.f2) : 0;
            boolean canScrollHorizontally = getLayoutManager().canScrollHorizontally();
            if (canScrollHorizontally) {
                if (getWidth() > 0) {
                    i3 = getWidth();
                } else if (getMeasuredWidth() > 0) {
                    i3 = getMeasuredWidth();
                } else {
                    i3 = getContext().getResources().getDisplayMetrics().widthPixels;
                }
                i = i3 - getPaddingLeft();
                if (getClipToPadding()) {
                    i5 = getPaddingRight();
                }
            } else {
                if (getHeight() > 0) {
                    i2 = getHeight();
                } else if (getMeasuredHeight() > 0) {
                    i2 = getMeasuredHeight();
                } else {
                    i2 = getContext().getResources().getDisplayMetrics().heightPixels;
                }
                i = i2 - getPaddingTop();
                if (getClipToPadding()) {
                    i5 = getPaddingBottom();
                }
            }
            int i7 = (int) (((float) ((i - i5) - i6)) / this.f2);
            if (canScrollHorizontally) {
                layoutParams.width = i7;
            } else {
                layoutParams.height = i7;
            }
        }
    }

    public void onChildDetachedFromWindow(View view) {
        int i = R.id.epoxy_recycler_view_child_initial_size_id;
        Object tag = view.getTag(i);
        if (tag instanceof Integer) {
            view.getLayoutParams().width = ((Integer) tag).intValue();
            view.setTag(i, (Object) null);
        }
    }

    public void setHasFixedSize(boolean z) {
        super.setHasFixedSize(z);
    }

    public void setInitialPrefetchItemCount(int i) {
        if (i >= 0) {
            if (i == 0) {
                i = 2;
            }
            RecyclerView.n layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).setInitialPrefetchItemCount(i);
                return;
            }
            return;
        }
        throw new IllegalStateException("numItemsToPrefetch must be greater than 0");
    }

    public void setModels(List<? extends t<?>> list) {
        super.setModels(list);
    }

    public void setNumViewsToShowOnScreen(float f) {
        this.f2 = f;
        setInitialPrefetchItemCount((int) Math.ceil((double) f));
    }

    public void setPadding(Padding padding) {
        if (padding == null) {
            setPaddingDp(0);
            return;
        }
        Padding.PaddingType paddingType = padding.f;
        if (paddingType == Padding.PaddingType.PX) {
            setPadding(padding.a, padding.b, padding.c, padding.d);
            setItemSpacingPx(padding.e);
        } else if (paddingType == Padding.PaddingType.DP) {
            setPadding(d(padding.a), d(padding.b), d(padding.c), d(padding.d));
            setItemSpacingPx(d(padding.e));
        } else if (paddingType == Padding.PaddingType.RESOURCE) {
            setPadding(h(padding.a), h(padding.b), h(padding.c), h(padding.d));
            setItemSpacingPx(h(padding.e));
        }
    }

    public void setPaddingDp(int i) {
        if (i == -1) {
            i = getDefaultSpacingBetweenItemsDp();
        }
        int d = d(i);
        setPadding(d, d, d, d);
        setItemSpacingPx(d);
    }

    public void setPaddingRes(int i) {
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(i);
        setPadding(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        setItemSpacingPx(dimensionPixelOffset);
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
