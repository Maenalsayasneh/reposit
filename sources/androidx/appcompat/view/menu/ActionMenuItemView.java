package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import h0.b.e.i.g;
import h0.b.e.i.i;
import h0.b.e.i.n;
import h0.b.e.i.p;
import h0.b.f.c;
import h0.b.f.e0;

public class ActionMenuItemView extends AppCompatTextView implements n.a, View.OnClickListener, ActionMenuView.a {
    public b Y1;
    public boolean Z1 = e();
    public boolean a2;
    public int b2;
    public i c;
    public int c2;
    public CharSequence d;
    public int d2;
    public Drawable q;
    public g.b x;
    public e0 y;

    public class a extends e0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.Y1;
            if (bVar == null || (aVar = c.this.n2) == null) {
                return null;
            }
            return aVar.a();
        }

        public boolean c() {
            p b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.x;
            if (bVar == null || !bVar.a(actionMenuItemView.c) || (b = b()) == null || !b.b()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionMenuItemView, 0, 0);
        this.b2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.d2 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.c2 = -1;
        setSaveEnabled(false);
    }

    public boolean a() {
        return c();
    }

    public boolean b() {
        return c() && this.c.getIcon() == null;
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public void d(i iVar, int i) {
        this.c = iVar;
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitleCondensed());
        setId(iVar.a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.y == null) {
            this.y = new a();
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.d);
        if (this.q != null) {
            if (!((this.c.y & 4) == 4) || (!this.Z1 && !this.a2)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.d : null);
        CharSequence charSequence3 = this.c.q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.c.e;
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(charSequence3);
        }
        CharSequence charSequence4 = this.c.r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z3) {
                charSequence2 = this.c.e;
            }
            g0.a.b.b.a.y0(this, charSequence2);
            return;
        }
        g0.a.b.b.a.y0(this, charSequence4);
    }

    public i getItemData() {
        return this.c;
    }

    public void onClick(View view) {
        g.b bVar = this.x;
        if (bVar != null) {
            bVar.a(this.c);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.Z1 = e();
        f();
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean c3 = c();
        if (c3 && (i4 = this.c2) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.b2);
        } else {
            i3 = this.b2;
        }
        if (mode != 1073741824 && this.b2 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!c3 && this.q != null) {
            super.setPadding((getMeasuredWidth() - this.q.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        if (!this.c.hasSubMenu() || (e0Var = this.y) == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.a2 != z) {
            this.a2 = z;
            i iVar = this.c;
            if (iVar != null) {
                iVar.n.p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.q = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.d2;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.x = bVar;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.c2 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.Y1 = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.d = charSequence;
        f();
    }
}
