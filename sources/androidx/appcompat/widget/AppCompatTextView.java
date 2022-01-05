package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import g0.a.b.b.a;
import h0.b.f.e;
import h0.b.f.r0;
import h0.b.f.t0;
import h0.b.f.u;
import h0.b.f.u0;
import h0.b.f.v;
import h0.i.c.l;
import h0.i.g.b;
import h0.i.j.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class AppCompatTextView extends TextView implements b {
    private final e mBackgroundTintHelper;
    private boolean mIsSetTypefaceProcessing;
    private Future<h0.i.g.b> mPrecomputedTextFuture;
    private final u mTextClassifierHelper;
    private final v mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<h0.i.g.b> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                a.u0(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.a();
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            return Math.round(vVar.i.h);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            return Math.round(vVar.i.g);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            return Math.round(vVar.i.f);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        v vVar = this.mTextHelper;
        return vVar != null ? vVar.i.i : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.a) {
            v vVar = this.mTextHelper;
            if (vVar != null) {
                return vVar.i.d;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        u0 u0Var = this.mTextHelper.h;
        if (u0Var != null) {
            return u0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        u0 u0Var = this.mTextHelper.h;
        if (u0Var != null) {
            return u0Var.b;
        }
        return null;
    }

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        u uVar;
        if (Build.VERSION.SDK_INT >= 28 || (uVar = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        return uVar.a();
    }

    public b.a getTextMetricsParamsCompat() {
        return a.S(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.g(this, onCreateInputConnection, editorInfo);
        a.j0(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        v vVar = this.mTextHelper;
        if (vVar != null && !h0.i.j.b.a) {
            vVar.i.a();
        }
    }

    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        v vVar = this.mTextHelper;
        if (vVar != null && !h0.i.j.b.a && vVar.d()) {
            this.mTextHelper.i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (h0.i.j.b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.h(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (h0.i.j.b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.i(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (h0.i.j.b.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.j(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.G0(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            a.r0(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            a.s0(this, i);
        }
    }

    public void setLineHeight(int i) {
        a.t0(this, i);
    }

    public void setPrecomputedText(h0.i.g.b bVar) {
        a.u0(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.k(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.l(mode);
        this.mTextHelper.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.f(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        u uVar;
        if (Build.VERSION.SDK_INT >= 28 || (uVar = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            uVar.b = textClassifier;
        }
    }

    public void setTextFuture(Future<h0.i.g.b> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.b;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aVar.a);
        setBreakStrategy(aVar.c);
        setHyphenationFrequency(aVar.d);
    }

    public void setTextSize(int i, float f) {
        boolean z = h0.i.j.b.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        v vVar = this.mTextHelper;
        if (vVar != null && !z && !vVar.d()) {
            vVar.i.f(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        if (!this.mIsSetTypefaceProcessing) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                Context context = getContext();
                l lVar = h0.i.c.e.a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.mIsSetTypefaceProcessing = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.mIsSetTypefaceProcessing = false;
            }
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        t0.a(context);
        this.mIsSetTypefaceProcessing = false;
        r0.a(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.d(attributeSet, i);
        v vVar = new v(this);
        this.mTextHelper = vVar;
        vVar.e(attributeSet, i);
        vVar.b();
        this.mTextClassifierHelper = new u(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? h0.b.b.a.a.a(context, i) : null;
        Drawable a2 = i2 != 0 ? h0.b.b.a.a.a(context, i2) : null;
        Drawable a3 = i3 != 0 ? h0.b.b.a.a.a(context, i3) : null;
        if (i4 != 0) {
            drawable = h0.b.b.a.a.a(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(a, a2, a3, drawable);
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable a = i != 0 ? h0.b.b.a.a.a(context, i) : null;
        Drawable a2 = i2 != 0 ? h0.b.b.a.a.a(context, i2) : null;
        Drawable a3 = i3 != 0 ? h0.b.b.a.a.a(context, i3) : null;
        if (i4 != 0) {
            drawable = h0.b.b.a.a.a(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(a, a2, a3, drawable);
        v vVar = this.mTextHelper;
        if (vVar != null) {
            vVar.b();
        }
    }
}
