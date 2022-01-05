package com.instabug.featuresrequest.ui.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instabug.featuresrequest.R;
import h0.i.i.q;
import i0.j.d.h.d.d;
import i0.j.d.h.d.g;
import i0.j.d.h.d.h;
import i0.j.d.h.d.i;
import i0.j.d.h.d.j;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class SnackbarLayout extends LinearLayout {
    public a Y1;
    public TextView c;
    public Button d;
    public int q;
    public int x;
    public b y;

    public interface a {
    }

    public interface b {
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.SnackbarLayout);
        this.q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_android_maxWidth, -1);
        this.x = obtainStyledAttributes.getDimensionPixelSize(R.styleable.SnackbarLayout_maxActionInlineWidth, -1);
        int i = R.styleable.SnackbarLayout_elevation;
        if (obtainStyledAttributes.hasValue(i)) {
            AtomicInteger atomicInteger = q.a;
            setElevation((float) obtainStyledAttributes.getDimensionPixelSize(i, 0));
        }
        obtainStyledAttributes.recycle();
        setClickable(true);
        LayoutInflater.from(context).inflate(R.layout.ib_fr_insta_toast_include, this);
        AtomicInteger atomicInteger2 = q.a;
        setAccessibilityLiveRegion(1);
    }

    public final boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.c.getPaddingTop() == i2 && this.c.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.c;
        AtomicInteger atomicInteger = q.a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.d;
    }

    public TextView getMessageView() {
        return this.c;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.Y1;
    }

    public void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        a aVar = this.Y1;
        if (aVar != null) {
            h hVar = (h) aVar;
            d dVar = hVar.a;
            Objects.requireNonNull(dVar);
            j a2 = j.a();
            j.b bVar = dVar.g;
            synchronized (a2.b) {
                if (!a2.h(bVar)) {
                    if (!a2.i(bVar)) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                d.b.post(new g(hVar));
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.c = (TextView) findViewById(R.id.snackbar_text);
        this.d = (Button) findViewById(R.id.snackbar_action);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b bVar;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (bVar = this.y) != null) {
            i iVar = (i) bVar;
            iVar.a.c();
            iVar.a.e.setOnLayoutChangeListener((b) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0051, code lost:
        if (a(1, r0, r0) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (a(0, r0, r0) != false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.q
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.q
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.instabug.featuresrequest.R.dimen.ib_fr_toast_multi_line_padding
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.instabug.featuresrequest.R.dimen.ib_fr_toast_single_line_padding
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.c
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = r4
            goto L_0x003d
        L_0x003c:
            r2 = r3
        L_0x003d:
            if (r2 == 0) goto L_0x0054
            int r5 = r7.x
            if (r5 <= 0) goto L_0x0054
            android.widget.Button r5 = r7.d
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.x
            if (r5 <= r6) goto L_0x0054
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L_0x005f
            goto L_0x005e
        L_0x0054:
            if (r2 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r0 = r1
        L_0x0058:
            boolean r0 = r7.a(r3, r0, r0)
            if (r0 == 0) goto L_0x005f
        L_0x005e:
            r3 = r4
        L_0x005f:
            if (r3 == 0) goto L_0x0064
            super.onMeasure(r8, r9)
        L_0x0064:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.ui.custom.SnackbarLayout.onMeasure(int, int):void");
    }

    public void setOnAttachStateChangeListener(a aVar) {
        this.Y1 = aVar;
    }

    public void setOnLayoutChangeListener(b bVar) {
        this.y = bVar;
    }
}
