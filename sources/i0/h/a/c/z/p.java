package i0.h.a.c.z;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import h0.b.f.d;
import h0.b.f.h0;
import java.util.Locale;

/* compiled from: MaterialAutoCompleteTextView */
public class p extends d {
    public final Rect Y1 = new Rect();
    public final h0 x;
    public final AccessibilityManager y;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R.attr.autoCompleteTextViewStyle
            r6 = 0
            android.content.Context r8 = i0.h.a.c.a0.a.a.a(r8, r9, r3, r6)
            r7.<init>(r8, r9, r3)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.Y1 = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView
            int r4 = com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType
            boolean r1 = r9.hasValue(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0033
            int r0 = r9.getInt(r0, r6)
            if (r0 != 0) goto L_0x0033
            r7.setKeyListener(r2)
        L_0x0033:
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r7.y = r0
            h0.b.f.h0 r0 = new h0.b.f.h0
            int r1 = androidx.appcompat.R.attr.listPopupWindowStyle
            r0.<init>(r8, r2, r1, r6)
            r7.x = r0
            r8 = 1
            r0.s(r8)
            r0.k2 = r7
            r8 = 2
            android.widget.PopupWindow r1 = r0.u2
            r1.setInputMethodMode(r8)
            android.widget.ListAdapter r8 = r7.getAdapter()
            r0.p(r8)
            i0.h.a.c.z.o r8 = new i0.h.a.c.z.o
            r8.<init>(r7)
            r0.l2 = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.z.p.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void a(p pVar, Object obj) {
        pVar.setText(pVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b = b();
        if (b == null || !b.isProvidingHint()) {
            return super.getHint();
        }
        return b.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b = b();
        if (b != null && b.isProvidingHint() && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b = b();
            int i4 = 0;
            if (!(adapter == null || b == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                h0 h0Var = this.x;
                if (!h0Var.b()) {
                    i3 = -1;
                } else {
                    i3 = h0Var.y.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i3) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable i6 = this.x.i();
                if (i6 != null) {
                    i6.getPadding(this.Y1);
                    Rect rect = this.Y1;
                    i5 += rect.left + rect.right;
                }
                i4 = b.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.x.p(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.y;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.x.a();
        }
    }
}
