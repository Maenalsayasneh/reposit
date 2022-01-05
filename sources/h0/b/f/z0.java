package h0.b.f;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.R;
import h0.i.i.q;
import h0.i.i.v;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: TooltipCompatHandler */
public class z0 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static z0 c;
    public static z0 d;
    public final Runnable Y1 = new a();
    public final Runnable Z1 = new b();
    public int a2;
    public int b2;
    public a1 c2;
    public boolean d2;
    public final View q;
    public final CharSequence x;
    public final int y;

    /* compiled from: TooltipCompatHandler */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            z0.this.d(false);
        }
    }

    /* compiled from: TooltipCompatHandler */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            z0.this.b();
        }
    }

    public z0(View view, CharSequence charSequence) {
        int i;
        this.q = view;
        this.x = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = v.a;
        if (Build.VERSION.SDK_INT >= 28) {
            i = viewConfiguration.getScaledHoverSlop();
        } else {
            i = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.y = i;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(z0 z0Var) {
        z0 z0Var2 = c;
        if (z0Var2 != null) {
            z0Var2.q.removeCallbacks(z0Var2.Y1);
        }
        c = z0Var;
        if (z0Var != null) {
            z0Var.q.postDelayed(z0Var.Y1, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.a2 = Integer.MAX_VALUE;
        this.b2 = Integer.MAX_VALUE;
    }

    public void b() {
        if (d == this) {
            d = null;
            a1 a1Var = this.c2;
            if (a1Var != null) {
                a1Var.a();
                this.c2 = null;
                a();
                this.q.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (c == this) {
            c((z0) null);
        }
        this.q.removeCallbacks(this.Z1);
    }

    public void d(boolean z) {
        int i;
        int i2;
        long j;
        int i3;
        long j2;
        View view = this.q;
        AtomicInteger atomicInteger = q.a;
        if (view.isAttachedToWindow()) {
            c((z0) null);
            z0 z0Var = d;
            if (z0Var != null) {
                z0Var.b();
            }
            d = this;
            this.d2 = z;
            a1 a1Var = new a1(this.q.getContext());
            this.c2 = a1Var;
            View view2 = this.q;
            int i4 = this.a2;
            int i5 = this.b2;
            boolean z2 = this.d2;
            CharSequence charSequence = this.x;
            if (a1Var.b.getParent() != null) {
                a1Var.a();
            }
            a1Var.c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = a1Var.d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = a1Var.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i4 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = a1Var.a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i = i5 + dimensionPixelOffset2;
                i2 = i5 - dimensionPixelOffset2;
            } else {
                i = view2.getHeight();
                i2 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = a1Var.a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(a1Var.e);
                Rect rect = a1Var.e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = a1Var.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    a1Var.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(a1Var.g);
                view2.getLocationOnScreen(a1Var.f);
                int[] iArr = a1Var.f;
                int i6 = iArr[0];
                int[] iArr2 = a1Var.g;
                iArr[0] = i6 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                a1Var.b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = a1Var.b.getMeasuredHeight();
                int[] iArr3 = a1Var.f;
                int i7 = ((iArr3[1] + i2) - dimensionPixelOffset3) - measuredHeight;
                int i8 = iArr3[1] + i + dimensionPixelOffset3;
                if (z2) {
                    if (i7 >= 0) {
                        layoutParams.y = i7;
                    } else {
                        layoutParams.y = i8;
                    }
                } else if (measuredHeight + i8 <= a1Var.e.height()) {
                    layoutParams.y = i8;
                } else {
                    layoutParams.y = i7;
                }
            }
            ((WindowManager) a1Var.a.getSystemService("window")).addView(a1Var.b, a1Var.d);
            this.q.addOnAttachStateChangeListener(this);
            if (this.d2) {
                j = 2500;
            } else {
                if ((this.q.getWindowSystemUiVisibility() & 1) == 1) {
                    j2 = 3000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    i3 = ViewConfiguration.getLongPressTimeout();
                }
                j = j2 - ((long) i3);
            }
            this.q.removeCallbacks(this.Z1);
            this.q.postDelayed(this.Z1, j);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.c2 != null && this.d2) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.q.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.q.isEnabled() && this.c2 == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (Math.abs(x2 - this.a2) > this.y || Math.abs(y2 - this.b2) > this.y) {
                this.a2 = x2;
                this.b2 = y2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.a2 = view.getWidth() / 2;
        this.b2 = view.getHeight() / 2;
        d(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
