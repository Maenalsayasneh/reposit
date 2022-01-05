package com.futuremind.recyclerviewfastscroll;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hbb20.R;
import h0.b0.v;
import i0.g.a.b;
import i0.g.a.d.c;

public class FastScroller extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TextView Y1;
    public int Z1;
    public int a2;
    public int b2;
    public int c2;
    public final b d = new b(this);
    public int d2;
    public int e2;
    public boolean f2;
    public c g2;
    public i0.g.a.c h2;
    public RecyclerView q;
    public View x;
    public View y;

    public class a implements ViewGroup.OnHierarchyChangeListener {
        public a() {
        }

        public void onChildViewAdded(View view, View view2) {
            FastScroller fastScroller = FastScroller.this;
            int i = FastScroller.c;
            fastScroller.b();
        }

        public void onChildViewRemoved(View view, View view2) {
            FastScroller fastScroller = FastScroller.this;
            int i = FastScroller.c;
            fastScroller.b();
        }
    }

    /* JADX INFO: finally extract failed */
    public FastScroller(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setClipChildren(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.fastscroll__fastScroller, R.attr.fastscroll__style, 0);
        try {
            this.b2 = obtainStyledAttributes.getColor(R.styleable.fastscroll__fastScroller_fastscroll__bubbleColor, -1);
            this.a2 = obtainStyledAttributes.getColor(R.styleable.fastscroll__fastScroller_fastscroll__handleColor, -1);
            this.c2 = obtainStyledAttributes.getResourceId(R.styleable.fastscroll__fastScroller_fastscroll__bubbleTextAppearance, -1);
            obtainStyledAttributes.recycle();
            this.e2 = getVisibility();
            setViewProvider(new i0.g.a.d.b());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    public void setRecyclerViewPosition(float f) {
        TextView textView;
        RecyclerView recyclerView = this.q;
        if (recyclerView != null) {
            int itemCount = recyclerView.getAdapter().getItemCount();
            int u02 = (int) v.u0(0.0f, (float) (itemCount - 1), (float) ((int) (f * ((float) itemCount))));
            this.q.scrollToPosition(u02);
            i0.g.a.c cVar = this.h2;
            if (cVar != null && (textView = this.Y1) != null) {
                textView.setText(cVar.a(u02));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        if ((r4.q.getAdapter().getItemCount() * r4.q.getChildAt(0).getWidth()) <= r4.q.getWidth()) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if ((r4.q.getAdapter().getItemCount() * r4.q.getChildAt(0).getHeight()) <= r4.q.getHeight()) goto L_0x0061;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.q
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            if (r0 == 0) goto L_0x006c
            androidx.recyclerview.widget.RecyclerView r0 = r4.q
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            int r0 = r0.getItemCount()
            if (r0 == 0) goto L_0x006c
            androidx.recyclerview.widget.RecyclerView r0 = r4.q
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            if (r0 == 0) goto L_0x006c
            boolean r0 = r4.c()
            r2 = 1
            if (r0 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r0 = r4.q
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getHeight()
            androidx.recyclerview.widget.RecyclerView r3 = r4.q
            androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.getAdapter()
            int r3 = r3.getItemCount()
            int r3 = r3 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.q
            int r0 = r0.getHeight()
            if (r3 > r0) goto L_0x0042
            goto L_0x0061
        L_0x0042:
            r2 = r1
            goto L_0x0061
        L_0x0044:
            androidx.recyclerview.widget.RecyclerView r0 = r4.q
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getWidth()
            androidx.recyclerview.widget.RecyclerView r3 = r4.q
            androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.getAdapter()
            int r3 = r3.getItemCount()
            int r3 = r3 * r0
            androidx.recyclerview.widget.RecyclerView r0 = r4.q
            int r0 = r0.getWidth()
            if (r3 > r0) goto L_0x0042
        L_0x0061:
            if (r2 != 0) goto L_0x006c
            int r0 = r4.e2
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            super.setVisibility(r1)
            goto L_0x0070
        L_0x006c:
            r0 = 4
            super.setVisibility(r0)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.b():void");
    }

    public boolean c() {
        return this.d2 == 1;
    }

    public c getViewProvider() {
        return this.g2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        r3 = r0.y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0042, code lost:
        r3 = r0.Y1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            android.view.View r1 = r0.y
            i0.g.a.a r2 = new i0.g.a.a
            r2.<init>(r0)
            r1.setOnTouchListener(r2)
            i0.g.a.d.c r1 = r0.g2
            i0.g.a.d.b r1 = (i0.g.a.d.b) r1
            com.futuremind.recyclerviewfastscroll.FastScroller r2 = r1.a
            boolean r2 = r2.c()
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 == 0) goto L_0x002a
            android.view.View r2 = r1.d
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r2 = r2 / r3
            android.view.View r1 = r1.c
            int r1 = r1.getHeight()
            goto L_0x0038
        L_0x002a:
            android.view.View r2 = r1.d
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r2 = r2 / r3
            android.view.View r1 = r1.c
            int r1 = r1.getWidth()
        L_0x0038:
            float r1 = (float) r1
            float r2 = r2 - r1
            int r1 = (int) r2
            r0.Z1 = r1
            int r1 = r0.b2
            r2 = -1
            if (r1 == r2) goto L_0x0055
            android.widget.TextView r3 = r0.Y1
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto L_0x004b
            goto L_0x0055
        L_0x004b:
            android.graphics.drawable.Drawable r5 = r4.mutate()
            r5.setTint(r1)
            r3.setBackground(r4)
        L_0x0055:
            int r1 = r0.a2
            if (r1 == r2) goto L_0x006c
            android.view.View r3 = r0.y
            android.graphics.drawable.Drawable r4 = r3.getBackground()
            if (r4 != 0) goto L_0x0062
            goto L_0x006c
        L_0x0062:
            android.graphics.drawable.Drawable r5 = r4.mutate()
            r5.setTint(r1)
            r3.setBackground(r4)
        L_0x006c:
            int r1 = r0.c2
            if (r1 == r2) goto L_0x0075
            android.widget.TextView r2 = r0.Y1
            r2.setTextAppearance(r1)
        L_0x0075:
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L_0x0082
            i0.g.a.b r1 = r0.d
            androidx.recyclerview.widget.RecyclerView r2 = r0.q
            r1.e(r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.futuremind.recyclerviewfastscroll.FastScroller.onLayout(boolean, int, int, int, int):void");
    }

    public void setBubbleColor(int i) {
        this.b2 = i;
        invalidate();
    }

    public void setBubbleTextAppearance(int i) {
        this.c2 = i;
        invalidate();
    }

    public void setHandleColor(int i) {
        this.a2 = i;
        invalidate();
    }

    public void setOrientation(int i) {
        this.d2 = i;
        super.setOrientation(i == 0 ? 1 : 0);
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        this.q = recyclerView;
        if (recyclerView.getAdapter() instanceof i0.g.a.c) {
            this.h2 = (i0.g.a.c) recyclerView.getAdapter();
        }
        recyclerView.addOnScrollListener(this.d);
        b();
        recyclerView.setOnHierarchyChangeListener(new a());
    }

    public void setScrollerPosition(float f) {
        if (c()) {
            this.x.setY(v.u0(0.0f, (float) (getHeight() - this.x.getHeight()), (((float) (getHeight() - this.y.getHeight())) * f) + ((float) this.Z1)));
            this.y.setY(v.u0(0.0f, (float) (getHeight() - this.y.getHeight()), f * ((float) (getHeight() - this.y.getHeight()))));
            return;
        }
        this.x.setX(v.u0(0.0f, (float) (getWidth() - this.x.getWidth()), (((float) (getWidth() - this.y.getWidth())) * f) + ((float) this.Z1)));
        this.y.setX(v.u0(0.0f, (float) (getWidth() - this.y.getWidth()), f * ((float) (getWidth() - this.y.getWidth()))));
    }

    public void setViewProvider(c cVar) {
        removeAllViews();
        this.g2 = cVar;
        cVar.a = this;
        i0.g.a.d.b bVar = (i0.g.a.d.b) cVar;
        int i = 0;
        View inflate = LayoutInflater.from(bVar.b()).inflate(R.layout.fastscroll__default_bubble, this, false);
        bVar.c = inflate;
        this.x = inflate;
        bVar.d = new View(bVar.b());
        int dimensionPixelSize = bVar.a.c() ? 0 : bVar.b().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        if (bVar.a.c()) {
            i = bVar.b().getResources().getDimensionPixelSize(R.dimen.fastscroll__handle_inset);
        }
        int i2 = i;
        bVar.d.setBackground(new InsetDrawable(h0.i.b.a.getDrawable(bVar.b(), R.drawable.fastscroll__default_handle), i2, dimensionPixelSize, i2, dimensionPixelSize));
        bVar.d.setLayoutParams(new ViewGroup.LayoutParams(bVar.b().getResources().getDimensionPixelSize(bVar.a.c() ? R.dimen.fastscroll__handle_clickable_width : R.dimen.fastscroll__handle_height), bVar.b().getResources().getDimensionPixelSize(bVar.a.c() ? R.dimen.fastscroll__handle_height : R.dimen.fastscroll__handle_clickable_width)));
        this.y = bVar.d;
        this.Y1 = (TextView) bVar.c;
        addView(this.x);
        addView(this.y);
    }

    public void setVisibility(int i) {
        this.e2 = i;
        b();
    }
}
