package i0.h.a.c.g;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h0.b.a.m;
import h0.i.i.q;

/* compiled from: BottomSheetDialog */
public class d extends m {
    public boolean Y1;
    public boolean Z1;
    public BottomSheetBehavior.c a2;
    public BottomSheetBehavior<FrameLayout> q;
    public FrameLayout x;
    public boolean y;

    /* compiled from: BottomSheetDialog */
    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            d dVar = d.this;
            if (dVar.y && dVar.isShowing()) {
                d dVar2 = d.this;
                if (!dVar2.Z1) {
                    TypedArray obtainStyledAttributes = dVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                    dVar2.Y1 = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    dVar2.Z1 = true;
                }
                if (dVar2.Y1) {
                    d.this.cancel();
                }
            }
        }
    }

    /* compiled from: BottomSheetDialog */
    public class b extends h0.i.i.a {
        public b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, h0.i.i.g0.b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            if (d.this.y) {
                bVar.b.addAction(1048576);
                bVar.b.setDismissable(true);
                return;
            }
            bVar.b.setDismissable(false);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                d dVar = d.this;
                if (dVar.y) {
                    dVar.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
    }

    /* compiled from: BottomSheetDialog */
    public class c implements View.OnTouchListener {
        public c(d dVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: i0.h.a.c.g.d$d  reason: collision with other inner class name */
    /* compiled from: BottomSheetDialog */
    public class C0138d extends BottomSheetBehavior.c {
        public C0138d() {
        }

        public void onSlide(View view, float f) {
        }

        public void onStateChanged(View view, int i) {
            if (i == 5) {
                d.this.cancel();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x0019
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = com.google.android.material.R.attr.bottomSheetDialogTheme
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0017
            int r5 = r5.resourceId
            goto L_0x0019
        L_0x0017:
            int r5 = com.google.android.material.R.style.Theme_Design_Light_BottomSheetDialog
        L_0x0019:
            r3.<init>(r4, r5)
            r3.y = r0
            r3.Y1 = r0
            i0.h.a.c.g.d$d r4 = new i0.h.a.c.g.d$d
            r4.<init>()
            r3.a2 = r4
            r3.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.g.d.<init>(android.content.Context, int):void");
    }

    public void cancel() {
        e();
        super.cancel();
    }

    public final FrameLayout d() {
        if (this.x == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, (ViewGroup) null);
            this.x = frameLayout;
            BottomSheetBehavior<FrameLayout> H = BottomSheetBehavior.H((FrameLayout) frameLayout.findViewById(R.id.design_bottom_sheet));
            this.q = H;
            H.B(this.a2);
            this.q.L(this.y);
        }
        return this.x;
    }

    public BottomSheetBehavior<FrameLayout> e() {
        if (this.q == null) {
            d();
        }
        return this.q;
    }

    public final View f(int i, View view, ViewGroup.LayoutParams layoutParams) {
        d();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.x.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.x.findViewById(R.id.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new a());
        q.p(frameLayout, new b());
        frameLayout.setOnTouchListener(new c(this));
        return this.x;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.q;
        if (bottomSheetBehavior != null && bottomSheetBehavior.z == 5) {
            bottomSheetBehavior.N(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.y != z) {
            this.y = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.q;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.L(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.y) {
            this.y = true;
        }
        this.Y1 = z;
        this.Z1 = true;
    }

    public void setContentView(int i) {
        super.setContentView(f(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(f(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(0, view, layoutParams));
    }
}
