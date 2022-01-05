package h0.b.f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionMenuView;
import h0.b.e.i.g;
import h0.i.i.q;
import h0.i.i.y;
import h0.i.i.z;

/* compiled from: AbsActionBarView */
public abstract class a extends ViewGroup {
    public y Y1;
    public boolean Z1;
    public boolean a2;
    public final C0019a c;
    public final Context d;
    public ActionMenuView q;
    public c x;
    public int y;

    /* renamed from: h0.b.f.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    public class C0019a implements z {
        public boolean a = false;
        public int b;

        public C0019a() {
        }

        public void a(View view) {
            this.a = true;
        }

        public void b(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.Y1 = null;
                a.super.setVisibility(this.b);
            }
        }

        public void c(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public y e(int i, long j) {
        y yVar = this.Y1;
        if (yVar != null) {
            yVar.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            y b = q.b(this);
            b.a(1.0f);
            b.c(j);
            C0019a aVar = this.c;
            a.this.Y1 = b;
            aVar.b = i;
            View view = (View) b.a.get();
            if (view != null) {
                b.f(view, aVar);
            }
            return b;
        }
        y b2 = q.b(this);
        b2.a(0.0f);
        b2.c(j);
        C0019a aVar2 = this.c;
        a.this.Y1 = b2;
        aVar2.b = i;
        View view2 = (View) b2.a.get();
        if (view2 != null) {
            b2.f(view2, aVar2);
        }
        return b2;
    }

    public int getAnimatedVisibility() {
        if (this.Y1 != null) {
            return this.c.b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.y;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.x;
        if (cVar != null) {
            Configuration configuration2 = cVar.d.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            cVar.i2 = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            g gVar = cVar.q;
            if (gVar != null) {
                gVar.q(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.a2 = false;
        }
        if (!this.a2) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.a2 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.a2 = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Z1 = false;
        }
        if (!this.Z1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.Z1 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.Z1 = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            y yVar = this.Y1;
            if (yVar != null) {
                yVar.b();
            }
            super.setVisibility(i);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new C0019a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.d = context;
        } else {
            this.d = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
