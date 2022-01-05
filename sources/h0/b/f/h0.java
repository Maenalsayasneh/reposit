package h0.b.f;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import h0.b.e.i.p;
import h0.i.i.q;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ListPopupWindow */
public class h0 implements p {
    public static Method c;
    public static Method d;
    public int Y1 = -2;
    public int Z1 = -2;
    public int a2;
    public int b2;
    public int c2 = 1002;
    public boolean d2;
    public boolean e2;
    public boolean f2;
    public int g2 = 0;
    public int h2 = Integer.MAX_VALUE;
    public int i2 = 0;
    public DataSetObserver j2;
    public View k2;
    public AdapterView.OnItemClickListener l2;
    public final e m2 = new e();
    public final d n2 = new d();
    public final c o2 = new c();
    public final a p2 = new a();
    public Context q;
    public final Handler q2;
    public final Rect r2 = new Rect();
    public Rect s2;
    public boolean t2;
    public PopupWindow u2;
    public ListAdapter x;
    public c0 y;

    /* compiled from: ListPopupWindow */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c0 c0Var = h0.this.y;
            if (c0Var != null) {
                c0Var.setListSelectionHidden(true);
                c0Var.requestLayout();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            if (h0.this.b()) {
                h0.this.a();
            }
        }

        public void onInvalidated() {
            h0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (h0.this.u2.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && h0.this.u2.getContentView() != null) {
                    h0 h0Var = h0.this;
                    h0Var.q2.removeCallbacks(h0Var.m2);
                    h0.this.m2.run();
                }
            }
        }
    }

    /* compiled from: ListPopupWindow */
    public class d implements View.OnTouchListener {
        public d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = h0.this.u2) != null && popupWindow.isShowing() && x >= 0 && x < h0.this.u2.getWidth() && y >= 0 && y < h0.this.u2.getHeight()) {
                h0 h0Var = h0.this;
                h0Var.q2.postDelayed(h0Var.m2, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                h0 h0Var2 = h0.this;
                h0Var2.q2.removeCallbacks(h0Var2.m2);
                return false;
            }
        }
    }

    /* compiled from: ListPopupWindow */
    public class e implements Runnable {
        public e() {
        }

        public void run() {
            c0 c0Var = h0.this.y;
            if (c0Var != null) {
                AtomicInteger atomicInteger = q.a;
                if (c0Var.isAttachedToWindow() && h0.this.y.getCount() > h0.this.y.getChildCount()) {
                    int childCount = h0.this.y.getChildCount();
                    h0 h0Var = h0.this;
                    if (childCount <= h0Var.h2) {
                        h0Var.u2.setInputMethodMode(2);
                        h0.this.a();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                c = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                d = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public h0(Context context, AttributeSet attributeSet, int i, int i3) {
        this.q = context;
        this.q2 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i, i3);
        this.a2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.b2 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.d2 = true;
        }
        obtainStyledAttributes.recycle();
        n nVar = new n(context, attributeSet, i, i3);
        this.u2 = nVar;
        nVar.setInputMethodMode(1);
    }

    public void a() {
        int i;
        int i3;
        c0 c0Var;
        int i4;
        if (this.y == null) {
            c0 q3 = q(this.q, !this.t2);
            this.y = q3;
            q3.setAdapter(this.x);
            this.y.setOnItemClickListener(this.l2);
            this.y.setFocusable(true);
            this.y.setFocusableInTouchMode(true);
            this.y.setOnItemSelectedListener(new g0(this));
            this.y.setOnScrollListener(this.o2);
            this.u2.setContentView(this.y);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.u2.getContentView();
        }
        Drawable background = this.u2.getBackground();
        int i5 = 0;
        if (background != null) {
            background.getPadding(this.r2);
            Rect rect = this.r2;
            int i6 = rect.top;
            i = rect.bottom + i6;
            if (!this.d2) {
                this.b2 = -i6;
            }
        } else {
            this.r2.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = this.u2.getMaxAvailableHeight(this.k2, this.b2, this.u2.getInputMethodMode() == 2);
        if (this.Y1 == -1) {
            i3 = maxAvailableHeight + i;
        } else {
            int i7 = this.Z1;
            if (i7 == -2) {
                int i8 = this.q.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.r2;
                i4 = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i7 != -1) {
                i4 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else {
                int i9 = this.q.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.r2;
                i4 = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
            }
            int a3 = this.y.a(i4, maxAvailableHeight - 0, -1);
            i3 = a3 + (a3 > 0 ? this.y.getPaddingBottom() + this.y.getPaddingTop() + i + 0 : 0);
        }
        boolean z = this.u2.getInputMethodMode() == 2;
        this.u2.setWindowLayoutType(this.c2);
        if (this.u2.isShowing()) {
            View view = this.k2;
            AtomicInteger atomicInteger = q.a;
            if (view.isAttachedToWindow()) {
                int i10 = this.Z1;
                if (i10 == -1) {
                    i10 = -1;
                } else if (i10 == -2) {
                    i10 = this.k2.getWidth();
                }
                int i11 = this.Y1;
                if (i11 == -1) {
                    if (!z) {
                        i3 = -1;
                    }
                    if (z) {
                        this.u2.setWidth(this.Z1 == -1 ? -1 : 0);
                        this.u2.setHeight(0);
                    } else {
                        PopupWindow popupWindow = this.u2;
                        if (this.Z1 == -1) {
                            i5 = -1;
                        }
                        popupWindow.setWidth(i5);
                        this.u2.setHeight(-1);
                    }
                } else if (i11 != -2) {
                    i3 = i11;
                }
                this.u2.setOutsideTouchable(true);
                this.u2.update(this.k2, this.a2, this.b2, i10 < 0 ? -1 : i10, i3 < 0 ? -1 : i3);
                return;
            }
            return;
        }
        int i12 = this.Z1;
        if (i12 == -1) {
            i12 = -1;
        } else if (i12 == -2) {
            i12 = this.k2.getWidth();
        }
        int i13 = this.Y1;
        if (i13 == -1) {
            i3 = -1;
        } else if (i13 != -2) {
            i3 = i13;
        }
        this.u2.setWidth(i12);
        this.u2.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = c;
            if (method != null) {
                try {
                    method.invoke(this.u2, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.u2.setIsClippedToScreen(true);
        }
        this.u2.setOutsideTouchable(true);
        this.u2.setTouchInterceptor(this.n2);
        if (this.f2) {
            this.u2.setOverlapAnchor(this.e2);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = d;
            if (method2 != null) {
                try {
                    method2.invoke(this.u2, new Object[]{this.s2});
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            this.u2.setEpicenterBounds(this.s2);
        }
        this.u2.showAsDropDown(this.k2, this.a2, this.b2, this.g2);
        this.y.setSelection(-1);
        if ((!this.t2 || this.y.isInTouchMode()) && (c0Var = this.y) != null) {
            c0Var.setListSelectionHidden(true);
            c0Var.requestLayout();
        }
        if (!this.t2) {
            this.q2.post(this.p2);
        }
    }

    public boolean b() {
        return this.u2.isShowing();
    }

    public void dismiss() {
        this.u2.dismiss();
        this.u2.setContentView((View) null);
        this.y = null;
        this.q2.removeCallbacks(this.m2);
    }

    public void e(Drawable drawable) {
        this.u2.setBackgroundDrawable(drawable);
    }

    public int f() {
        return this.a2;
    }

    public void g(int i) {
        this.a2 = i;
    }

    public Drawable i() {
        return this.u2.getBackground();
    }

    public ListView j() {
        return this.y;
    }

    public void l(int i) {
        this.b2 = i;
        this.d2 = true;
    }

    public int o() {
        if (!this.d2) {
            return 0;
        }
        return this.b2;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.j2;
        if (dataSetObserver == null) {
            this.j2 = new b();
        } else {
            ListAdapter listAdapter2 = this.x;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.x = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.j2);
        }
        c0 c0Var = this.y;
        if (c0Var != null) {
            c0Var.setAdapter(this.x);
        }
    }

    public c0 q(Context context, boolean z) {
        return new c0(context, z);
    }

    public void r(int i) {
        Drawable background = this.u2.getBackground();
        if (background != null) {
            background.getPadding(this.r2);
            Rect rect = this.r2;
            this.Z1 = rect.left + rect.right + i;
            return;
        }
        this.Z1 = i;
    }

    public void s(boolean z) {
        this.t2 = z;
        this.u2.setFocusable(z);
    }
}
