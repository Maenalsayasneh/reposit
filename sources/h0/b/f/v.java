package h0.b.f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.widget.ResourceManagerInternal;
import h0.i.b.d.h;
import h0.i.i.q;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AppCompatTextHelper */
public class v {
    public final TextView a;
    public u0 b;
    public u0 c;
    public u0 d;
    public u0 e;
    public u0 f;
    public u0 g;
    public u0 h;
    public final x i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* compiled from: AppCompatTextHelper */
    public class a extends h.a {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ WeakReference c;

        public a(int i, int i2, WeakReference weakReference) {
            this.a = i;
            this.b = i2;
            this.c = weakReference;
        }

        public void d(int i) {
        }

        public void e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
                typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
            }
            v vVar = v.this;
            WeakReference weakReference = this.c;
            if (vVar.m) {
                vVar.l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    AtomicInteger atomicInteger = q.a;
                    if (textView.isAttachedToWindow()) {
                        textView.post(new w(vVar, textView, typeface, vVar.j));
                    } else {
                        textView.setTypeface(typeface, vVar.j);
                    }
                }
            }
        }
    }

    public v(TextView textView) {
        this.a = textView;
        this.i = new x(textView);
    }

    public static u0 c(Context context, j jVar, int i2) {
        ColorStateList d2 = jVar.d(context, i2);
        if (d2 == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.d = true;
        u0Var.a = d2;
        return u0Var;
    }

    public final void a(Drawable drawable, u0 u0Var) {
        if (drawable != null && u0Var != null) {
            int[] drawableState = this.a.getDrawableState();
            PorterDuff.Mode mode = j.a;
            ResourceManagerInternal.tintDrawable(drawable, u0Var, drawableState);
        }
    }

    public void b() {
        if (!(this.b == null && this.c == null && this.d == null && this.e == null)) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    public boolean d() {
        x xVar = this.i;
        return xVar.i() && xVar.d != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0366, code lost:
        if (r3 != null) goto L_0x036d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r1 = r0.a
            android.content.Context r10 = r1.getContext()
            h0.b.f.j r11 = h0.b.f.j.a()
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTextHelper
            r12 = 0
            h0.b.f.w0 r13 = h0.b.f.w0.q(r10, r8, r3, r9, r12)
            android.widget.TextView r1 = r0.a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r13.b
            r7 = 0
            r4 = r20
            r6 = r21
            h0.i.i.q.o(r1, r2, r3, r4, r5, r6, r7)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r1 = r13.l(r1, r14)
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableLeft
            boolean r3 = r13.o(r2)
            if (r3 == 0) goto L_0x0040
            int r2 = r13.l(r2, r12)
            h0.b.f.u0 r2 = c(r10, r11, r2)
            r0.b = r2
        L_0x0040:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableTop
            boolean r3 = r13.o(r2)
            if (r3 == 0) goto L_0x0052
            int r2 = r13.l(r2, r12)
            h0.b.f.u0 r2 = c(r10, r11, r2)
            r0.c = r2
        L_0x0052:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableRight
            boolean r3 = r13.o(r2)
            if (r3 == 0) goto L_0x0064
            int r2 = r13.l(r2, r12)
            h0.b.f.u0 r2 = c(r10, r11, r2)
            r0.d = r2
        L_0x0064:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableBottom
            boolean r3 = r13.o(r2)
            if (r3 == 0) goto L_0x0076
            int r2 = r13.l(r2, r12)
            h0.b.f.u0 r2 = c(r10, r11, r2)
            r0.e = r2
        L_0x0076:
            int r2 = android.os.Build.VERSION.SDK_INT
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableStart
            boolean r4 = r13.o(r3)
            if (r4 == 0) goto L_0x008a
            int r3 = r13.l(r3, r12)
            h0.b.f.u0 r3 = c(r10, r11, r3)
            r0.f = r3
        L_0x008a:
            int r3 = androidx.appcompat.R.styleable.AppCompatTextHelper_android_drawableEnd
            boolean r4 = r13.o(r3)
            if (r4 == 0) goto L_0x009c
            int r3 = r13.l(r3, r12)
            h0.b.f.u0 r3 = c(r10, r11, r3)
            r0.g = r3
        L_0x009c:
            android.content.res.TypedArray r3 = r13.b
            r3.recycle()
            android.widget.TextView r3 = r0.a
            android.text.method.TransformationMethod r3 = r3.getTransformationMethod()
            boolean r3 = r3 instanceof android.text.method.PasswordTransformationMethod
            r4 = 26
            if (r1 == r14) goto L_0x00ef
            int[] r5 = androidx.appcompat.R.styleable.TextAppearance
            h0.b.f.w0 r6 = new h0.b.f.w0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r5)
            r6.<init>(r10, r1)
            if (r3 != 0) goto L_0x00c8
            int r5 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r7 = r6.o(r5)
            if (r7 == 0) goto L_0x00c8
            boolean r5 = r6.a(r5, r12)
            r7 = 1
            goto L_0x00ca
        L_0x00c8:
            r5 = r12
            r7 = r5
        L_0x00ca:
            r0.m(r10, r6)
            int r15 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r16 = r6.o(r15)
            if (r16 == 0) goto L_0x00da
            java.lang.String r15 = r6.m(r15)
            goto L_0x00db
        L_0x00da:
            r15 = 0
        L_0x00db:
            if (r2 < r4) goto L_0x00ea
            int r13 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r17 = r6.o(r13)
            if (r17 == 0) goto L_0x00ea
            java.lang.String r6 = r6.m(r13)
            goto L_0x00eb
        L_0x00ea:
            r6 = 0
        L_0x00eb:
            r1.recycle()
            goto L_0x00f3
        L_0x00ef:
            r5 = r12
            r7 = r5
            r6 = 0
            r15 = 0
        L_0x00f3:
            int[] r1 = androidx.appcompat.R.styleable.TextAppearance
            h0.b.f.w0 r13 = new h0.b.f.w0
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r8, r1, r9, r12)
            r13.<init>(r10, r1)
            if (r3 != 0) goto L_0x010d
            int r14 = androidx.appcompat.R.styleable.TextAppearance_textAllCaps
            boolean r18 = r13.o(r14)
            if (r18 == 0) goto L_0x010d
            boolean r5 = r13.a(r14, r12)
            r7 = 1
        L_0x010d:
            int r14 = androidx.appcompat.R.styleable.TextAppearance_textLocale
            boolean r18 = r13.o(r14)
            if (r18 == 0) goto L_0x0119
            java.lang.String r15 = r13.m(r14)
        L_0x0119:
            if (r2 < r4) goto L_0x0127
            int r4 = androidx.appcompat.R.styleable.TextAppearance_fontVariationSettings
            boolean r14 = r13.o(r4)
            if (r14 == 0) goto L_0x0127
            java.lang.String r6 = r13.m(r4)
        L_0x0127:
            r4 = 28
            if (r2 < r4) goto L_0x0140
            int r2 = androidx.appcompat.R.styleable.TextAppearance_android_textSize
            boolean r4 = r13.o(r2)
            if (r4 == 0) goto L_0x0140
            r4 = -1
            int r2 = r13.f(r2, r4)
            if (r2 != 0) goto L_0x0140
            android.widget.TextView r2 = r0.a
            r4 = 0
            r2.setTextSize(r12, r4)
        L_0x0140:
            r0.m(r10, r13)
            r1.recycle()
            if (r3 != 0) goto L_0x014f
            if (r7 == 0) goto L_0x014f
            android.widget.TextView r1 = r0.a
            r1.setAllCaps(r5)
        L_0x014f:
            android.graphics.Typeface r1 = r0.l
            if (r1 == 0) goto L_0x0165
            int r2 = r0.k
            r3 = -1
            if (r2 != r3) goto L_0x0160
            android.widget.TextView r2 = r0.a
            int r3 = r0.j
            r2.setTypeface(r1, r3)
            goto L_0x0165
        L_0x0160:
            android.widget.TextView r2 = r0.a
            r2.setTypeface(r1)
        L_0x0165:
            if (r6 == 0) goto L_0x016c
            android.widget.TextView r1 = r0.a
            r1.setFontVariationSettings(r6)
        L_0x016c:
            if (r15 == 0) goto L_0x0177
            android.widget.TextView r1 = r0.a
            android.os.LocaleList r2 = android.os.LocaleList.forLanguageTags(r15)
            r1.setTextLocales(r2)
        L_0x0177:
            h0.b.f.x r13 = r0.i
            android.content.Context r1 = r13.m
            int[] r3 = androidx.appcompat.R.styleable.AppCompatTextView
            android.content.res.TypedArray r14 = r1.obtainStyledAttributes(r8, r3, r9, r12)
            android.widget.TextView r1 = r13.l
            android.content.Context r2 = r1.getContext()
            r7 = 0
            r4 = r20
            r5 = r14
            r6 = r21
            h0.i.i.q.o(r1, r2, r3, r4, r5, r6, r7)
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeTextType
            boolean r2 = r14.hasValue(r1)
            if (r2 == 0) goto L_0x019e
            int r1 = r14.getInt(r1, r12)
            r13.d = r1
        L_0x019e:
            int r1 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeStepGranularity
            boolean r2 = r14.hasValue(r1)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L_0x01ad
            float r1 = r14.getDimension(r1, r3)
            goto L_0x01ae
        L_0x01ad:
            r1 = r3
        L_0x01ae:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMinTextSize
            boolean r4 = r14.hasValue(r2)
            if (r4 == 0) goto L_0x01bb
            float r2 = r14.getDimension(r2, r3)
            goto L_0x01bc
        L_0x01bb:
            r2 = r3
        L_0x01bc:
            int r4 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizeMaxTextSize
            boolean r5 = r14.hasValue(r4)
            if (r5 == 0) goto L_0x01c9
            float r4 = r14.getDimension(r4, r3)
            goto L_0x01ca
        L_0x01c9:
            r4 = r3
        L_0x01ca:
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_autoSizePresetSizes
            boolean r6 = r14.hasValue(r5)
            if (r6 == 0) goto L_0x0201
            int r5 = r14.getResourceId(r5, r12)
            if (r5 <= 0) goto L_0x0201
            android.content.res.Resources r6 = r14.getResources()
            android.content.res.TypedArray r5 = r6.obtainTypedArray(r5)
            int r6 = r5.length()
            int[] r7 = new int[r6]
            if (r6 <= 0) goto L_0x01fe
            r9 = r12
        L_0x01e9:
            if (r9 >= r6) goto L_0x01f5
            r15 = -1
            int r18 = r5.getDimensionPixelSize(r9, r15)
            r7[r9] = r18
            int r9 = r9 + 1
            goto L_0x01e9
        L_0x01f5:
            int[] r6 = r13.b(r7)
            r13.i = r6
            r13.h()
        L_0x01fe:
            r5.recycle()
        L_0x0201:
            r14.recycle()
            boolean r5 = r13.i()
            r6 = 2
            if (r5 == 0) goto L_0x023f
            int r5 = r13.d
            r7 = 1
            if (r5 != r7) goto L_0x0241
            boolean r5 = r13.j
            if (r5 != 0) goto L_0x023b
            android.content.Context r5 = r13.m
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r7 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0228
            r2 = 1094713344(0x41400000, float:12.0)
            float r2 = android.util.TypedValue.applyDimension(r6, r2, r5)
        L_0x0228:
            int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0232
            r4 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r6, r4, r5)
        L_0x0232:
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0238
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0238:
            r13.j(r2, r4, r1)
        L_0x023b:
            r13.g()
            goto L_0x0241
        L_0x023f:
            r13.d = r12
        L_0x0241:
            boolean r1 = h0.i.j.b.a
            if (r1 == 0) goto L_0x027e
            h0.b.f.x r1 = r0.i
            int r2 = r1.d
            if (r2 == 0) goto L_0x027e
            int[] r1 = r1.i
            int r2 = r1.length
            if (r2 <= 0) goto L_0x027e
            android.widget.TextView r2 = r0.a
            int r2 = r2.getAutoSizeStepGranularity()
            float r2 = (float) r2
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0279
            android.widget.TextView r1 = r0.a
            h0.b.f.x r2 = r0.i
            float r2 = r2.g
            int r2 = java.lang.Math.round(r2)
            h0.b.f.x r3 = r0.i
            float r3 = r3.h
            int r3 = java.lang.Math.round(r3)
            h0.b.f.x r4 = r0.i
            float r4 = r4.f
            int r4 = java.lang.Math.round(r4)
            r1.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r12)
            goto L_0x027e
        L_0x0279:
            android.widget.TextView r2 = r0.a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r1, r12)
        L_0x027e:
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTextView
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r8, r1)
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_drawableLeftCompat
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L_0x0292
            android.graphics.drawable.Drawable r2 = r11.b(r10, r2)
            goto L_0x0293
        L_0x0292:
            r2 = 0
        L_0x0293:
            int r4 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTopCompat
            int r4 = r1.getResourceId(r4, r3)
            if (r4 == r3) goto L_0x02a0
            android.graphics.drawable.Drawable r4 = r11.b(r10, r4)
            goto L_0x02a1
        L_0x02a0:
            r4 = 0
        L_0x02a1:
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_drawableRightCompat
            int r5 = r1.getResourceId(r5, r3)
            if (r5 == r3) goto L_0x02ae
            android.graphics.drawable.Drawable r5 = r11.b(r10, r5)
            goto L_0x02af
        L_0x02ae:
            r5 = 0
        L_0x02af:
            int r7 = androidx.appcompat.R.styleable.AppCompatTextView_drawableBottomCompat
            int r7 = r1.getResourceId(r7, r3)
            if (r7 == r3) goto L_0x02bc
            android.graphics.drawable.Drawable r7 = r11.b(r10, r7)
            goto L_0x02bd
        L_0x02bc:
            r7 = 0
        L_0x02bd:
            int r8 = androidx.appcompat.R.styleable.AppCompatTextView_drawableStartCompat
            int r8 = r1.getResourceId(r8, r3)
            if (r8 == r3) goto L_0x02ca
            android.graphics.drawable.Drawable r8 = r11.b(r10, r8)
            goto L_0x02cb
        L_0x02ca:
            r8 = 0
        L_0x02cb:
            int r9 = androidx.appcompat.R.styleable.AppCompatTextView_drawableEndCompat
            int r9 = r1.getResourceId(r9, r3)
            if (r9 == r3) goto L_0x02d8
            android.graphics.drawable.Drawable r3 = r11.b(r10, r9)
            goto L_0x02d9
        L_0x02d8:
            r3 = 0
        L_0x02d9:
            r9 = 3
            if (r8 != 0) goto L_0x032c
            if (r3 == 0) goto L_0x02df
            goto L_0x032c
        L_0x02df:
            if (r2 != 0) goto L_0x02e7
            if (r4 != 0) goto L_0x02e7
            if (r5 != 0) goto L_0x02e7
            if (r7 == 0) goto L_0x034c
        L_0x02e7:
            android.widget.TextView r3 = r0.a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawablesRelative()
            r8 = r3[r12]
            if (r8 != 0) goto L_0x0317
            r8 = r3[r6]
            if (r8 == 0) goto L_0x02f6
            goto L_0x0317
        L_0x02f6:
            android.widget.TextView r3 = r0.a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
            android.widget.TextView r8 = r0.a
            if (r2 == 0) goto L_0x0301
            goto L_0x0303
        L_0x0301:
            r2 = r3[r12]
        L_0x0303:
            if (r4 == 0) goto L_0x0306
            goto L_0x0309
        L_0x0306:
            r4 = 1
            r4 = r3[r4]
        L_0x0309:
            if (r5 == 0) goto L_0x030c
            goto L_0x030e
        L_0x030c:
            r5 = r3[r6]
        L_0x030e:
            if (r7 == 0) goto L_0x0311
            goto L_0x0313
        L_0x0311:
            r7 = r3[r9]
        L_0x0313:
            r8.setCompoundDrawablesWithIntrinsicBounds(r2, r4, r5, r7)
            goto L_0x034c
        L_0x0317:
            android.widget.TextView r2 = r0.a
            r5 = r3[r12]
            if (r4 == 0) goto L_0x031e
            goto L_0x0321
        L_0x031e:
            r4 = 1
            r4 = r3[r4]
        L_0x0321:
            r6 = r3[r6]
            if (r7 == 0) goto L_0x0326
            goto L_0x0328
        L_0x0326:
            r7 = r3[r9]
        L_0x0328:
            r2.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r4, r6, r7)
            goto L_0x034c
        L_0x032c:
            android.widget.TextView r2 = r0.a
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.widget.TextView r5 = r0.a
            if (r8 == 0) goto L_0x0337
            goto L_0x0339
        L_0x0337:
            r8 = r2[r12]
        L_0x0339:
            if (r4 == 0) goto L_0x033c
            goto L_0x033f
        L_0x033c:
            r4 = 1
            r4 = r2[r4]
        L_0x033f:
            if (r3 == 0) goto L_0x0342
            goto L_0x0344
        L_0x0342:
            r3 = r2[r6]
        L_0x0344:
            if (r7 == 0) goto L_0x0347
            goto L_0x0349
        L_0x0347:
            r7 = r2[r9]
        L_0x0349:
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r4, r3, r7)
        L_0x034c:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTint
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0375
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0369
            int r3 = r1.getResourceId(r2, r12)
            if (r3 == 0) goto L_0x0369
            java.lang.ThreadLocal<android.util.TypedValue> r4 = h0.b.b.a.a.a
            android.content.res.ColorStateList r3 = r10.getColorStateList(r3)
            if (r3 == 0) goto L_0x0369
            goto L_0x036d
        L_0x0369:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x036d:
            android.widget.TextView r2 = r0.a
            java.util.Objects.requireNonNull(r2)
            r2.setCompoundDrawableTintList(r3)
        L_0x0375:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_drawableTintMode
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0390
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r4 = 0
            android.graphics.PorterDuff$Mode r2 = h0.b.f.b0.c(r2, r4)
            android.widget.TextView r4 = r0.a
            java.util.Objects.requireNonNull(r4)
            r4.setCompoundDrawableTintMode(r2)
            goto L_0x0391
        L_0x0390:
            r3 = -1
        L_0x0391:
            int r2 = androidx.appcompat.R.styleable.AppCompatTextView_firstBaselineToTopHeight
            int r2 = r1.getDimensionPixelSize(r2, r3)
            int r4 = androidx.appcompat.R.styleable.AppCompatTextView_lastBaselineToBottomHeight
            int r4 = r1.getDimensionPixelSize(r4, r3)
            int r5 = androidx.appcompat.R.styleable.AppCompatTextView_lineHeight
            int r5 = r1.getDimensionPixelSize(r5, r3)
            r1.recycle()
            if (r2 == r3) goto L_0x03ad
            android.widget.TextView r1 = r0.a
            g0.a.b.b.a.r0(r1, r2)
        L_0x03ad:
            if (r4 == r3) goto L_0x03b4
            android.widget.TextView r1 = r0.a
            g0.a.b.b.a.s0(r1, r4)
        L_0x03b4:
            if (r5 == r3) goto L_0x03bb
            android.widget.TextView r1 = r0.a
            g0.a.b.b.a.t0(r1, r5)
        L_0x03bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.v.e(android.util.AttributeSet, int):void");
    }

    public void f(Context context, int i2) {
        String m2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, R.styleable.TextAppearance);
        w0 w0Var = new w0(context, obtainStyledAttributes);
        int i3 = R.styleable.TextAppearance_textAllCaps;
        if (w0Var.o(i3)) {
            this.a.setAllCaps(w0Var.a(i3, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        int i5 = R.styleable.TextAppearance_android_textSize;
        if (w0Var.o(i5) && w0Var.f(i5, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        m(context, w0Var);
        if (i4 >= 26) {
            int i6 = R.styleable.TextAppearance_fontVariationSettings;
            if (w0Var.o(i6) && (m2 = w0Var.m(i6)) != null) {
                this.a.setFontVariationSettings(m2);
            }
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public void g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        CharSequence charSequence;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i2 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            Objects.requireNonNull(text);
            if (i2 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i3 = editorInfo.initialSelStart;
            int i4 = editorInfo.initialSelEnd;
            int i5 = i3 > i4 ? i4 + 0 : i3 + 0;
            int i6 = i3 > i4 ? i3 - 0 : i4 + 0;
            int length = text.length();
            if (i5 < 0 || i6 > length) {
                h0.i.i.h0.a.b(editorInfo, (CharSequence) null, 0, 0);
                return;
            }
            int i7 = editorInfo.inputType & 4095;
            if (i7 == 129 || i7 == 225 || i7 == 18) {
                h0.i.i.h0.a.b(editorInfo, (CharSequence) null, 0, 0);
            } else if (length <= 2048) {
                h0.i.i.h0.a.b(editorInfo, text, i5, i6);
            } else {
                int i8 = i6 - i5;
                int i9 = i8 > 1024 ? 0 : i8;
                int i10 = 2048 - i9;
                int min = Math.min(text.length() - i6, i10 - Math.min(i5, (int) (((double) i10) * 0.8d)));
                int min2 = Math.min(i5, i10 - min);
                int i11 = i5 - min2;
                if (h0.i.i.h0.a.a(text, i11, 0)) {
                    i11++;
                    min2--;
                }
                if (h0.i.i.h0.a.a(text, (i6 + min) - 1, 1)) {
                    min--;
                }
                int i12 = min2 + i9 + min;
                if (i9 != i8) {
                    charSequence = TextUtils.concat(new CharSequence[]{text.subSequence(i11, i11 + min2), text.subSequence(i6, min + i6)});
                } else {
                    charSequence = text.subSequence(i11, i12 + i11);
                }
                int i13 = min2 + 0;
                h0.i.i.h0.a.b(editorInfo, charSequence, i13, i9 + i13);
            }
        }
    }

    public void h(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        x xVar = this.i;
        if (xVar.i()) {
            DisplayMetrics displayMetrics = xVar.m.getResources().getDisplayMetrics();
            xVar.j(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (xVar.g()) {
                xVar.a();
            }
        }
    }

    public void i(int[] iArr, int i2) throws IllegalArgumentException {
        x xVar = this.i;
        if (xVar.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = xVar.m.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                xVar.i = xVar.b(iArr2);
                if (!xVar.h()) {
                    StringBuilder P0 = i0.d.a.a.a.P0("None of the preset sizes is valid: ");
                    P0.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(P0.toString());
                }
            } else {
                xVar.j = false;
            }
            if (xVar.g()) {
                xVar.a();
            }
        }
    }

    public void j(int i2) {
        x xVar = this.i;
        if (!xVar.i()) {
            return;
        }
        if (i2 == 0) {
            xVar.d = 0;
            xVar.g = -1.0f;
            xVar.h = -1.0f;
            xVar.f = -1.0f;
            xVar.i = new int[0];
            xVar.e = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = xVar.m.getResources().getDisplayMetrics();
            xVar.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (xVar.g()) {
                xVar.a();
            }
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.e0("Unknown auto-size text type: ", i2));
        }
    }

    public void k(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.a = colorStateList;
        u0Var.d = colorStateList != null;
        this.b = u0Var;
        this.c = u0Var;
        this.d = u0Var;
        this.e = u0Var;
        this.f = u0Var;
        this.g = u0Var;
    }

    public void l(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new u0();
        }
        u0 u0Var = this.h;
        u0Var.b = mode;
        u0Var.c = mode != null;
        this.b = u0Var;
        this.c = u0Var;
        this.d = u0Var;
        this.e = u0Var;
        this.f = u0Var;
        this.g = u0Var;
    }

    public final void m(Context context, w0 w0Var) {
        String m2;
        this.j = w0Var.j(R.styleable.TextAppearance_android_textStyle, this.j);
        int i2 = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i2 >= 28) {
            int j2 = w0Var.j(R.styleable.TextAppearance_android_textFontWeight, -1);
            this.k = j2;
            if (j2 != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i3 = R.styleable.TextAppearance_android_fontFamily;
        if (w0Var.o(i3) || w0Var.o(R.styleable.TextAppearance_fontFamily)) {
            this.l = null;
            int i4 = R.styleable.TextAppearance_fontFamily;
            if (w0Var.o(i4)) {
                i3 = i4;
            }
            int i5 = this.k;
            int i6 = this.j;
            if (!context.isRestricted()) {
                try {
                    Typeface i7 = w0Var.i(i3, this.j, new a(i5, i6, new WeakReference(this.a)));
                    if (i7 != null) {
                        if (i2 < 28 || this.k == -1) {
                            this.l = i7;
                        } else {
                            this.l = Typeface.create(Typeface.create(i7, 0), this.k, (this.j & 2) != 0);
                        }
                    }
                    this.m = this.l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.l == null && (m2 = w0Var.m(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
                    this.l = Typeface.create(m2, this.j);
                    return;
                }
                Typeface create = Typeface.create(m2, 0);
                int i8 = this.k;
                if ((this.j & 2) != 0) {
                    z = true;
                }
                this.l = Typeface.create(create, i8, z);
                return;
            }
            return;
        }
        int i9 = R.styleable.TextAppearance_android_typeface;
        if (w0Var.o(i9)) {
            this.m = false;
            int j3 = w0Var.j(i9, 1);
            if (j3 == 1) {
                this.l = Typeface.SANS_SERIF;
            } else if (j3 == 2) {
                this.l = Typeface.SERIF;
            } else if (j3 == 3) {
                this.l = Typeface.MONOSPACE;
            }
        }
    }
}
