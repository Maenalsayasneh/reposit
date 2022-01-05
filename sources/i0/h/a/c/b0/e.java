package i0.h.a.c.b0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R;
import h0.g.c.c;
import h0.i.i.q;
import i0.h.a.c.w.g;
import i0.h.a.c.w.i;
import i0.h.a.c.w.k;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RadialViewGroup */
public class e extends ConstraintLayout {
    public final Runnable n2;
    public int o2;
    public g p2;

    /* compiled from: RadialViewGroup */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            e.this.t();
        }
    }

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            AtomicInteger atomicInteger = q.a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.n2);
            handler.post(this.n2);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        t();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.n2);
            handler.post(this.n2);
        }
    }

    public void setBackgroundColor(int i) {
        this.p2.t(ColorStateList.valueOf(i));
    }

    public void t() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        c cVar = new c();
        cVar.e(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = R.id.circle_center;
            if (id != i4 && !"skip".equals(childAt.getTag())) {
                int id2 = childAt.getId();
                int i5 = this.o2;
                c.b bVar = cVar.h(id2).e;
                bVar.A = i4;
                bVar.B = i5;
                bVar.C = f;
                f = (360.0f / ((float) (childCount - i))) + f;
            }
        }
        cVar.c(this, true);
        setConstraintSet((c) null);
        requestLayout();
    }

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.p2 = gVar;
        i iVar = new i(0.5f);
        k kVar = gVar.q.a;
        Objects.requireNonNull(kVar);
        k.b bVar = new k.b(kVar);
        bVar.e = iVar;
        bVar.f = iVar;
        bVar.g = iVar;
        bVar.h = iVar;
        gVar.q.a = bVar.a();
        gVar.invalidateSelf();
        this.p2.t(ColorStateList.valueOf(-1));
        g gVar2 = this.p2;
        AtomicInteger atomicInteger = q.a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i, 0);
        this.o2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.n2 = new a();
        obtainStyledAttributes.recycle();
    }
}
