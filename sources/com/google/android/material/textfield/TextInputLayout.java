package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import h0.b.f.b0;
import h0.b.f.j;
import h0.i.i.q;
import i0.h.a.c.w.k;
import i0.h.a.c.z.m;
import i0.h.a.c.z.n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TextInputLayout;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private ValueAnimator animator;
    private i0.h.a.c.w.g boxBackground;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private i0.h.a.c.w.g boxUnderline;
    public final i0.h.a.c.q.c collapsingTextHelper;
    public boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    public EditText editText;
    private final LinkedHashSet<f> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final LinkedHashSet<g> endIconChangedListeners;
    private final SparseArray<m> endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    /* access modifiers changed from: private */
    public final CheckableImageButton endIconView;
    private final LinearLayout endLayout;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private final CheckableImageButton errorIconView;
    private boolean expandedHintEnabled;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean hasEndIconTintList;
    private boolean hasEndIconTintMode;
    private boolean hasStartIconTintList;
    private boolean hasStartIconTintMode;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final n indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    /* access modifiers changed from: private */
    public boolean placeholderEnabled;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private CharSequence prefixText;
    private final TextView prefixTextView;
    /* access modifiers changed from: private */
    public boolean restoringSavedState;
    private k shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final LinearLayout startLayout;
    private ColorStateList strokeErrorColor;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence Y1;
        public CharSequence Z1;
        public CharSequence q;
        public boolean x;
        public CharSequence y;

        public static class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("TextInputLayout.SavedState{");
            P0.append(Integer.toHexString(System.identityHashCode(this)));
            P0.append(" error=");
            P0.append(this.q);
            P0.append(" hint=");
            P0.append(this.y);
            P0.append(" helperText=");
            P0.append(this.Y1);
            P0.append(" placeholderText=");
            P0.append(this.Z1);
            P0.append("}");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            TextUtils.writeToParcel(this.q, parcel, i);
            parcel.writeInt(this.x ? 1 : 0);
            TextUtils.writeToParcel(this.y, parcel, i);
            TextUtils.writeToParcel(this.Y1, parcel, i);
            TextUtils.writeToParcel(this.Z1, parcel, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.x = parcel.readInt() != 1 ? false : true;
            this.y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.Y1 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.Z1 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.counterEnabled) {
                textInputLayout2.updateCounter(editable.length());
            }
            if (TextInputLayout.this.placeholderEnabled) {
                TextInputLayout.this.updatePlaceholderText(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            TextInputLayout.this.endIconView.performClick();
            TextInputLayout.this.endIconView.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            TextInputLayout.this.editText.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.collapsingTextHelper.o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends h0.i.i.a {
        public final TextInputLayout a;

        public e(TextInputLayout textInputLayout) {
            this.a = textInputLayout;
        }

        public void onInitializeAccessibilityNodeInfo(View view, h0.i.i.g0.b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            EditText editText = this.a.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.a.getHint();
            CharSequence error = this.a.getError();
            CharSequence placeholderText = this.a.getPlaceholderText();
            int counterMaxLength = this.a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.a.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.a.isHintExpanded();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z2 ? hint.toString() : "";
            if (z) {
                bVar.b.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                bVar.b.setText(charSequence);
                if (z3 && placeholderText != null) {
                    bVar.b.setText(charSequence + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                bVar.b.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    bVar.k(charSequence);
                } else {
                    if (z) {
                        charSequence = text + ", " + charSequence;
                    }
                    bVar.b.setText(charSequence);
                }
                boolean z6 = !z;
                if (i >= 26) {
                    bVar.b.setShowingHintText(z6);
                } else {
                    bVar.h(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            bVar.b.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                bVar.b.setError(error);
            }
            if (editText != null) {
                editText.setLabelFor(R.id.textinput_helper_text);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText != null && this.boxBackgroundMode == 1) {
            if (i0.h.a.b.c.m.b.W(getContext())) {
                EditText editText2 = this.editText;
                AtomicInteger atomicInteger = q.a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (i0.h.a.b.c.m.b.V(getContext())) {
                EditText editText3 = this.editText;
                AtomicInteger atomicInteger2 = q.a;
                editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.editText.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
    }

    private void applyBoxAttributes() {
        i0.h.a.c.w.g gVar = this.boxBackground;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(this.shapeAppearanceModel);
            if (canDrawOutlineStroke()) {
                this.boxBackground.w((float) this.boxStrokeWidthPx, this.boxStrokeColor);
            }
            int calculateBoxBackgroundColor = calculateBoxBackgroundColor();
            this.boxBackgroundColor = calculateBoxBackgroundColor;
            this.boxBackground.t(ColorStateList.valueOf(calculateBoxBackgroundColor));
            if (this.endIconMode == 3) {
                this.editText.getBackground().invalidateSelf();
            }
            applyBoxUnderlineAttributes();
            invalidate();
        }
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderline != null) {
            if (canDrawStroke()) {
                this.boxUnderline.t(ColorStateList.valueOf(this.boxStrokeColor));
            }
            invalidate();
        }
    }

    private void applyCutoutPadding(RectF rectF) {
        float f2 = rectF.left;
        int i = this.boxLabelCutoutPaddingPx;
        rectF.left = f2 - ((float) i);
        rectF.top -= (float) i;
        rectF.right += (float) i;
        rectF.bottom += (float) i;
    }

    private void applyEndIconTint() {
        applyIconTint(this.endIconView, this.hasEndIconTintList, this.endIconTintList, this.hasEndIconTintMode, this.endIconTintMode);
    }

    private void applyIconTint(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void applyStartIconTint() {
        applyIconTint(this.startIconView, this.hasStartIconTintList, this.startIconTintList, this.hasStartIconTintMode, this.startIconTintMode);
    }

    private void assignBoxBackgroundByMode() {
        int i = this.boxBackgroundMode;
        if (i == 0) {
            this.boxBackground = null;
            this.boxUnderline = null;
        } else if (i == 1) {
            this.boxBackground = new i0.h.a.c.w.g(this.shapeAppearanceModel);
            this.boxUnderline = new i0.h.a.c.w.g();
        } else if (i == 2) {
            if (!this.hintEnabled || (this.boxBackground instanceof i0.h.a.c.z.g)) {
                this.boxBackground = new i0.h.a.c.w.g(this.shapeAppearanceModel);
            } else {
                this.boxBackground = new i0.h.a.c.z.g(this.shapeAppearanceModel);
            }
            this.boxUnderline = null;
        } else {
            throw new IllegalArgumentException(i0.d.a.a.a.u0(new StringBuilder(), this.boxBackgroundMode, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
    }

    private int calculateBoxBackgroundColor() {
        int i = this.boxBackgroundColor;
        if (this.boxBackgroundMode != 1) {
            return i;
        }
        return h0.i.c.a.a(this.boxBackgroundColor, i0.h.a.b.c.m.b.K(getContext(), R.attr.colorSurface, 0));
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            AtomicInteger atomicInteger = q.a;
            boolean z = getLayoutDirection() == 1;
            rect2.bottom = rect.bottom;
            int i = this.boxBackgroundMode;
            if (i == 1) {
                rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z);
                rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
                rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z);
                return rect2;
            } else if (i != 2) {
                rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z);
                rect2.top = getPaddingTop();
                rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z);
                return rect2;
            } else {
                rect2.left = this.editText.getPaddingLeft() + rect.left;
                rect2.top = rect.top - calculateLabelMarginTop();
                rect2.right = rect.right - this.editText.getPaddingRight();
                return rect2;
            }
        } else {
            throw new IllegalStateException();
        }
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f2) {
        if (isSingleLineFilledTextField()) {
            return (int) (((float) rect2.top) + f2);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f2) {
        if (isSingleLineFilledTextField()) {
            return (int) (((float) rect.centerY()) - (f2 / 2.0f));
        }
        return this.editText.getCompoundPaddingTop() + rect.top;
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            i0.h.a.c.q.c cVar = this.collapsingTextHelper;
            TextPaint textPaint = cVar.F;
            textPaint.setTextSize(cVar.i);
            textPaint.setTypeface(cVar.t);
            textPaint.setLetterSpacing(0.0f);
            float f2 = -cVar.F.ascent();
            rect2.left = this.editText.getCompoundPaddingLeft() + rect.left;
            rect2.top = calculateExpandedLabelTop(rect, f2);
            rect2.right = rect.right - this.editText.getCompoundPaddingRight();
            rect2.bottom = calculateExpandedLabelBottom(rect, rect2, f2);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int calculateLabelMarginTop() {
        float f2;
        if (!this.hintEnabled) {
            return 0;
        }
        int i = this.boxBackgroundMode;
        if (i == 0 || i == 1) {
            f2 = this.collapsingTextHelper.f();
        } else if (i != 2) {
            return 0;
        } else {
            f2 = this.collapsingTextHelper.f() / 2.0f;
        }
        return (int) f2;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((i0.h.a.c.z.g) this.boxBackground).C(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void collapseHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (!z || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.o(1.0f);
        } else {
            animateToExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof i0.h.a.c.z.g);
    }

    private void dispatchOnEditTextAttached() {
        Iterator it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    private void dispatchOnEndIconChanged(int i) {
        Iterator it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this, i);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        i0.h.a.c.w.g gVar = this.boxUnderline;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.boxStrokeWidthPx;
            this.boxUnderline.draw(canvas);
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            i0.h.a.c.q.c cVar = this.collapsingTextHelper;
            Objects.requireNonNull(cVar);
            int save = canvas.save();
            if (cVar.x != null && cVar.b) {
                cVar.N.getLineLeft(0);
                cVar.E.setTextSize(cVar.B);
                float f2 = cVar.q;
                float f3 = cVar.r;
                float f4 = cVar.A;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                canvas.translate(f2, f3);
                cVar.N.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
    }

    private void expandHint(boolean z) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (!z || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.o(0.0f);
        } else {
            animateToExpansionFraction(0.0f);
        }
        if (cutoutEnabled() && (!((i0.h.a.c.z.g) this.boxBackground).s2.isEmpty())) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private m getEndIconDelegate() {
        m mVar = this.endIconDelegates.get(this.endIconMode);
        return mVar != null ? mVar : this.endIconDelegates.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.errorIconView.getVisibility() == 0) {
            return this.errorIconView;
        }
        if (!hasEndIcon() || !isEndIconVisible()) {
            return null;
        }
        return this.endIconView;
    }

    private int getLabelLeftBoundAlightWithPrefix(int i, boolean z) {
        int compoundPaddingLeft = this.editText.getCompoundPaddingLeft() + i;
        return (this.prefixText == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.prefixTextView.getMeasuredWidth()) + this.prefixTextView.getPaddingLeft();
    }

    private int getLabelRightBoundAlignedWithSuffix(int i, boolean z) {
        int compoundPaddingRight = i - this.editText.getCompoundPaddingRight();
        return (this.prefixText == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.prefixTextView.getMeasuredWidth() - this.prefixTextView.getPaddingRight());
    }

    private boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView != null && this.placeholderEnabled) {
            textView.setText((CharSequence) null);
            this.placeholderTextView.setVisibility(4);
        }
    }

    private boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    private boolean isSingleLineFilledTextField() {
        if (this.boxBackgroundMode != 1 || this.editText.getMinLines() > 1) {
            return false;
        }
        return true;
    }

    private int[] mergeIconState(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        setEditTextBoxBackground();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void openCutout() {
        /*
            r12 = this;
            boolean r0 = r12.cutoutEnabled()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r12.tmpRectF
            i0.h.a.c.q.c r1 = r12.collapsingTextHelper
            android.widget.EditText r2 = r12.editText
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r12.editText
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.w
            boolean r4 = r1.c(r4)
            r1.y = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 17
            r9 = 5
            if (r3 == r8) goto L_0x005b
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x005b
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x0049
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x0049
        L_0x0038:
            if (r4 == 0) goto L_0x0044
            android.graphics.Rect r4 = r1.e
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.b()
            goto L_0x0062
        L_0x0044:
            android.graphics.Rect r4 = r1.e
            int r4 = r4.left
            goto L_0x004f
        L_0x0049:
            if (r4 == 0) goto L_0x0051
            android.graphics.Rect r4 = r1.e
            int r4 = r4.left
        L_0x004f:
            float r4 = (float) r4
            goto L_0x0063
        L_0x0051:
            android.graphics.Rect r4 = r1.e
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.b()
            goto L_0x0062
        L_0x005b:
            float r4 = (float) r2
            float r4 = r4 / r7
            float r10 = r1.b()
            float r10 = r10 / r7
        L_0x0062:
            float r4 = r4 - r10
        L_0x0063:
            r0.left = r4
            android.graphics.Rect r10 = r1.e
            int r11 = r10.top
            float r11 = (float) r11
            r0.top = r11
            if (r3 == r8) goto L_0x0096
            r8 = r3 & 7
            if (r8 != r6) goto L_0x0073
            goto L_0x0096
        L_0x0073:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x0088
            r2 = r3 & 5
            if (r2 != r9) goto L_0x007c
            goto L_0x0088
        L_0x007c:
            boolean r2 = r1.y
            if (r2 == 0) goto L_0x0083
            int r2 = r10.right
            goto L_0x0094
        L_0x0083:
            float r2 = r1.b()
            goto L_0x0090
        L_0x0088:
            boolean r2 = r1.y
            if (r2 == 0) goto L_0x0092
            float r2 = r1.b()
        L_0x0090:
            float r2 = r2 + r4
            goto L_0x009e
        L_0x0092:
            int r2 = r10.right
        L_0x0094:
            float r2 = (float) r2
            goto L_0x009e
        L_0x0096:
            float r2 = (float) r2
            float r2 = r2 / r7
            float r3 = r1.b()
            float r3 = r3 / r7
            float r2 = r2 + r3
        L_0x009e:
            r0.right = r2
            android.graphics.Rect r2 = r1.e
            int r2 = r2.top
            float r2 = (float) r2
            float r1 = r1.f()
            float r1 = r1 + r2
            r0.bottom = r1
            r12.applyCutoutPadding(r0)
            int r1 = r12.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r12.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            r0.offset(r1, r2)
            i0.h.a.c.w.g r1 = r12.boxBackground
            i0.h.a.c.z.g r1 = (i0.h.a.c.z.g) r1
            java.util.Objects.requireNonNull(r1)
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.C(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.openCutout():void");
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z);
            }
        }
    }

    private void refreshIconDrawableState(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(mergeIconState(checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setEditText(EditText editText2) {
        if (this.editText == null) {
            if (this.endIconMode != 3 && !(editText2 instanceof TextInputEditText)) {
                Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.editText = editText2;
            onApplyBoxBackgroundMode();
            setTextInputAccessibilityDelegate(new e(this));
            this.collapsingTextHelper.q(this.editText.getTypeface());
            i0.h.a.c.q.c cVar = this.collapsingTextHelper;
            float textSize = this.editText.getTextSize();
            if (cVar.i != textSize) {
                cVar.i = textSize;
                cVar.k();
            }
            int gravity = this.editText.getGravity();
            this.collapsingTextHelper.n((gravity & -113) | 48);
            i0.h.a.c.q.c cVar2 = this.collapsingTextHelper;
            if (cVar2.g != gravity) {
                cVar2.g = gravity;
                cVar2.k();
            }
            this.editText.addTextChangedListener(new a());
            if (this.defaultHintTextColor == null) {
                this.defaultHintTextColor = this.editText.getHintTextColors();
            }
            if (this.hintEnabled) {
                if (TextUtils.isEmpty(this.hint)) {
                    CharSequence hint2 = this.editText.getHint();
                    this.originalHint = hint2;
                    setHint(hint2);
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.counterView != null) {
                updateCounter(this.editText.getText().length());
            }
            updateEditTextBackground();
            this.indicatorViewController.b();
            this.startLayout.bringToFront();
            this.endLayout.bringToFront();
            this.endIconFrame.bringToFront();
            this.errorIconView.bringToFront();
            dispatchOnEditTextAttached();
            updatePrefixTextViewPadding();
            updateSuffixTextViewPadding();
            if (!isEnabled()) {
                editText2.setEnabled(false);
            }
            updateLabelState(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setEditTextBoxBackground() {
        if (shouldUseEditTextBackgroundForBoxBackground()) {
            EditText editText2 = this.editText;
            i0.h.a.c.w.g gVar = this.boxBackground;
            AtomicInteger atomicInteger = q.a;
            editText2.setBackground(gVar);
        }
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.errorIconView.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.endIconFrame;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        updateSuffixTextViewPadding();
        if (!hasEndIcon()) {
            updateDummyDrawables();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.hint)) {
            this.hint = charSequence;
            i0.h.a.c.q.c cVar = this.collapsingTextHelper;
            if (charSequence == null || !TextUtils.equals(cVar.w, charSequence)) {
                cVar.w = charSequence;
                cVar.x = null;
                Bitmap bitmap = cVar.z;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.z = null;
                }
                cVar.k();
            }
            if (!this.hintExpanded) {
                openCutout();
            }
        }
    }

    private static void setIconClickable(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        AtomicInteger atomicInteger = q.a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (hasOnClickListeners || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    private static void setIconOnClickListener(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private static void setIconOnLongClickListener(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.placeholderEnabled != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.placeholderTextView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_placeholder);
                TextView textView = this.placeholderTextView;
                AtomicInteger atomicInteger = q.a;
                textView.setAccessibilityLiveRegion(1);
                setPlaceholderTextAppearance(this.placeholderTextAppearance);
                setPlaceholderTextColor(this.placeholderTextColor);
                addPlaceholderTextView();
            } else {
                removePlaceholderTextView();
                this.placeholderTextView = null;
            }
            this.placeholderEnabled = z;
        }
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.errorIconView.getVisibility() == 0 || ((hasEndIcon() && isEndIconVisible()) || this.suffixText != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return !(getStartIconDrawable() == null && this.prefixText == null) && this.startLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUseEditTextBackgroundForBoxBackground() {
        EditText editText2 = this.editText;
        return (editText2 == null || this.boxBackground == null || editText2.getBackground() != null || this.boxBackgroundMode == 0) ? false : true;
    }

    private void showPlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView != null && this.placeholderEnabled) {
            textView.setText(this.placeholderText);
            this.placeholderTextView.setVisibility(0);
            this.placeholderTextView.bringToFront();
        }
    }

    private void tintEndIconOnError(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            applyEndIconTint();
            return;
        }
        Drawable mutate = getEndIconDrawable().mutate();
        mutate.setTint(this.indicatorViewController.g());
        this.endIconView.setImageDrawable(mutate);
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode != 1) {
            return;
        }
        if (i0.h.a.b.c.m.b.W(getContext())) {
            this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
        } else if (i0.h.a.b.c.m.b.V(getContext())) {
            this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        i0.h.a.c.w.g gVar = this.boxUnderline;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.boxStrokeWidthFocusedPx, rect.right, i);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText2 = this.editText;
            updateCounter(editText2 == null ? 0 : editText2.getText().length());
        }
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (this.counterOverflowed && (colorStateList = this.counterOverflowTextColor) != null) {
                this.counterView.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean updateDummyDrawables() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.editText
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r10.shouldUpdateStartDummyDrawable()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0049
            android.widget.LinearLayout r0 = r10.startLayout
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.startDummyDrawable
            if (r6 == 0) goto L_0x0025
            int r6 = r10.startDummyDrawableWidth
            if (r6 == r0) goto L_0x0031
        L_0x0025:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.startDummyDrawable = r6
            r10.startDummyDrawableWidth = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0031:
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.startDummyDrawable
            if (r6 == r7) goto L_0x0062
            android.widget.EditText r6 = r10.editText
            r8 = r0[r5]
            r9 = r0[r4]
            r0 = r0[r3]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0060
        L_0x0049:
            android.graphics.drawable.Drawable r0 = r10.startDummyDrawable
            if (r0 == 0) goto L_0x0062
            android.widget.EditText r0 = r10.editText
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.editText
            r7 = r0[r5]
            r8 = r0[r4]
            r0 = r0[r3]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.startDummyDrawable = r2
        L_0x0060:
            r0 = r5
            goto L_0x0063
        L_0x0062:
            r0 = r1
        L_0x0063:
            boolean r6 = r10.shouldUpdateEndDummyDrawable()
            if (r6 == 0) goto L_0x00d3
            android.widget.TextView r2 = r10.suffixTextView
            int r2 = r2.getMeasuredWidth()
            android.widget.EditText r6 = r10.editText
            int r6 = r6.getPaddingRight()
            int r2 = r2 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x008c
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r2
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r2 = r2 + r7
        L_0x008c:
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r7 == 0) goto L_0x00ad
            int r8 = r10.endDummyDrawableWidth
            if (r8 == r2) goto L_0x00ad
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            android.graphics.drawable.Drawable r4 = r10.endDummyDrawable
            r3 = r6[r3]
            r0.setCompoundDrawablesRelative(r1, r2, r4, r3)
            goto L_0x00f4
        L_0x00ad:
            if (r7 != 0) goto L_0x00bb
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.endDummyDrawable = r7
            r10.endDummyDrawableWidth = r2
            r7.setBounds(r1, r1, r2, r5)
        L_0x00bb:
            r2 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r2 == r7) goto L_0x00d1
            r0 = r6[r4]
            r10.originalEditTextEndDrawable = r0
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r2 = r6[r5]
            r3 = r6[r3]
            r0.setCompoundDrawablesRelative(r1, r2, r7, r3)
            goto L_0x00f4
        L_0x00d1:
            r5 = r0
            goto L_0x00f4
        L_0x00d3:
            android.graphics.drawable.Drawable r6 = r10.endDummyDrawable
            if (r6 == 0) goto L_0x00f5
            android.widget.EditText r6 = r10.editText
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r4 = r6[r4]
            android.graphics.drawable.Drawable r7 = r10.endDummyDrawable
            if (r4 != r7) goto L_0x00f1
            android.widget.EditText r0 = r10.editText
            r1 = r6[r1]
            r4 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.originalEditTextEndDrawable
            r3 = r6[r3]
            r0.setCompoundDrawablesRelative(r1, r4, r7, r3)
            goto L_0x00f2
        L_0x00f1:
            r5 = r0
        L_0x00f2:
            r10.endDummyDrawable = r2
        L_0x00f4:
            r0 = r5
        L_0x00f5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.updateDummyDrawables():boolean");
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int max;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (max = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(max);
        return true;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText2;
        if (this.placeholderTextView != null && (editText2 = this.editText) != null) {
            this.placeholderTextView.setGravity(editText2.getGravity());
            this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
        }
    }

    private void updatePlaceholderText() {
        EditText editText2 = this.editText;
        updatePlaceholderText(editText2 == null ? 0 : editText2.getText().length());
    }

    private void updatePrefixTextViewPadding() {
        int i;
        if (this.editText != null) {
            if (isStartIconVisible()) {
                i = 0;
            } else {
                EditText editText2 = this.editText;
                AtomicInteger atomicInteger = q.a;
                i = editText2.getPaddingStart();
            }
            TextView textView = this.prefixTextView;
            int compoundPaddingTop = this.editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = this.editText.getCompoundPaddingBottom();
            AtomicInteger atomicInteger2 = q.a;
            textView.setPaddingRelative(i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    private void updatePrefixTextVisibility() {
        this.prefixTextView.setVisibility((this.prefixText == null || isHintExpanded()) ? 8 : 0);
        updateDummyDrawables();
    }

    private void updateStrokeErrorColor(boolean z, boolean z2) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.boxStrokeColor = colorForState2;
        } else if (z2) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    private void updateSuffixTextViewPadding() {
        int i;
        if (this.editText != null) {
            if (isEndIconVisible() || isErrorIconVisible()) {
                i = 0;
            } else {
                EditText editText2 = this.editText;
                AtomicInteger atomicInteger = q.a;
                i = editText2.getPaddingEnd();
            }
            TextView textView = this.suffixTextView;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.editText.getPaddingTop();
            int paddingBottom = this.editText.getPaddingBottom();
            AtomicInteger atomicInteger2 = q.a;
            textView.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i = 0;
        boolean z = this.suffixText != null && !isHintExpanded();
        TextView textView = this.suffixTextView;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.suffixTextView.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        updateDummyDrawables();
    }

    public void addOnEditTextAttachedListener(f fVar) {
        this.editTextAttachedListeners.add(fVar);
        if (this.editText != null) {
            fVar.a(this);
        }
    }

    public void addOnEndIconChangedListener(g gVar) {
        this.endIconChangedListeners.add(gVar);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.inputFrame.addView(view, layoutParams2);
            this.inputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void animateToExpansionFraction(float f2) {
        if (this.collapsingTextHelper.c != f2) {
            if (this.animator == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.animator = valueAnimator;
                valueAnimator.setInterpolator(i0.h.a.c.a.a.b);
                this.animator.setDuration(167);
                this.animator.addUpdateListener(new d());
            }
            this.animator.setFloatValues(new float[]{this.collapsingTextHelper.c, f2});
            this.animator.start();
        }
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    public boolean cutoutIsOpen() {
        if (!cutoutEnabled() || !(!((i0.h.a.c.z.g) this.boxBackground).s2.isEmpty())) {
            return false;
        }
        return true;
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText2 = this.editText;
        if (editText2 == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.originalHint != null) {
            boolean z = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint2 = editText2.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.editText.setHint(hint2);
                this.isProvidingHint = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.inputFrame.getChildCount());
            for (int i2 = 0; i2 < this.inputFrame.getChildCount(); i2++) {
                View childAt = this.inputFrame.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.editText) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r2.k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.inDrawableStateChanged
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.inDrawableStateChanged = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            i0.h.a.c.q.c r2 = r4.collapsingTextHelper
            r3 = 0
            if (r2 == 0) goto L_0x0037
            r2.C = r1
            android.content.res.ColorStateList r1 = r2.l
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r2.k
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = r0
            goto L_0x002d
        L_0x002c:
            r1 = r3
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r2.k()
            r1 = r0
            goto L_0x0035
        L_0x0034:
            r1 = r3
        L_0x0035:
            r1 = r1 | r3
            goto L_0x0038
        L_0x0037:
            r1 = r3
        L_0x0038:
            android.widget.EditText r2 = r4.editText
            if (r2 == 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicInteger r2 = h0.i.i.q.a
            boolean r2 = r4.isLaidOut()
            if (r2 == 0) goto L_0x004b
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r3
        L_0x004c:
            r4.updateLabelState(r0)
        L_0x004f:
            r4.updateEditTextBackground()
            r4.updateTextInputBoxState()
            if (r1 == 0) goto L_0x005a
            r4.invalidate()
        L_0x005a:
            r4.inDrawableStateChanged = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public int getBaseline() {
        EditText editText2 = this.editText;
        if (editText2 == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText2.getBaseline() + calculateLabelMarginTop();
    }

    public i0.h.a.c.w.g getBoxBackground() {
        int i = this.boxBackgroundMode;
        if (i == 1 || i == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.boxBackground.h();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.boxBackground.i();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.boxBackground.o();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.boxBackground.n();
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.counterEnabled || !this.counterOverflowed || (textView = this.counterView) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public CharSequence getError() {
        n nVar = this.indicatorViewController;
        if (nVar.k) {
            return nVar.j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.m;
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.indicatorViewController.g();
    }

    public CharSequence getHelperText() {
        n nVar = this.indicatorViewController;
        if (nVar.q) {
            return nVar.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.indicatorViewController.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.g();
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.y;
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.k;
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    public final boolean isHelperTextDisplayed() {
        n nVar = this.indicatorViewController;
        return nVar.h == 2 && nVar.r != null && !TextUtils.isEmpty(nVar.p);
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.q;
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.y;
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText2 = this.editText;
        if (editText2 != null) {
            Rect rect = this.tmpRect;
            i0.h.a.c.q.d.a(this, editText2, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                i0.h.a.c.q.c cVar = this.collapsingTextHelper;
                float textSize = this.editText.getTextSize();
                if (cVar.i != textSize) {
                    cVar.i = textSize;
                    cVar.k();
                }
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.n((gravity & -113) | 48);
                i0.h.a.c.q.c cVar2 = this.collapsingTextHelper;
                if (cVar2.g != gravity) {
                    cVar2.g = gravity;
                    cVar2.k();
                }
                i0.h.a.c.q.c cVar3 = this.collapsingTextHelper;
                Rect calculateCollapsedTextBounds = calculateCollapsedTextBounds(rect);
                Objects.requireNonNull(cVar3);
                int i5 = calculateCollapsedTextBounds.left;
                int i6 = calculateCollapsedTextBounds.top;
                int i7 = calculateCollapsedTextBounds.right;
                int i8 = calculateCollapsedTextBounds.bottom;
                if (!i0.h.a.c.q.c.l(cVar3.e, i5, i6, i7, i8)) {
                    cVar3.e.set(i5, i6, i7, i8);
                    cVar3.D = true;
                    cVar3.j();
                }
                i0.h.a.c.q.c cVar4 = this.collapsingTextHelper;
                Rect calculateExpandedTextBounds = calculateExpandedTextBounds(rect);
                Objects.requireNonNull(cVar4);
                int i9 = calculateExpandedTextBounds.left;
                int i10 = calculateExpandedTextBounds.top;
                int i11 = calculateExpandedTextBounds.right;
                int i12 = calculateExpandedTextBounds.bottom;
                if (!i0.h.a.c.q.c.l(cVar4.d, i9, i10, i11, i12)) {
                    cVar4.d.set(i9, i10, i11, i12);
                    cVar4.D = true;
                    cVar4.j();
                }
                this.collapsingTextHelper.k();
                if (cutoutEnabled() && !this.hintExpanded) {
                    openCutout();
                }
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean updateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean updateDummyDrawables = updateDummyDrawables();
        if (updateEditTextHeightBasedOnIcon || updateDummyDrawables) {
            this.editText.post(new c());
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        updatePrefixTextViewPadding();
        updateSuffixTextViewPadding();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setError(savedState.q);
        if (savedState.x) {
            this.endIconView.post(new b());
        }
        setHint(savedState.y);
        setHelperText(savedState.Y1);
        setPlaceholderText(savedState.Z1);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.indicatorViewController.e()) {
            savedState.q = getError();
        }
        savedState.x = hasEndIcon() && this.endIconView.isChecked();
        savedState.y = getHint();
        savedState.Y1 = getHelperText();
        savedState.Z1 = getPlaceholderText();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void refreshEndIconDrawableState() {
        refreshIconDrawableState(this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        refreshIconDrawableState(this.errorIconView, this.errorIconTintList);
    }

    public void refreshStartIconDrawableState() {
        refreshIconDrawableState(this.startIconView, this.startIconTintList);
    }

    public void removeOnEditTextAttachedListener(f fVar) {
        this.editTextAttachedListeners.remove(fVar);
    }

    public void removeOnEndIconChangedListener(g gVar) {
        this.endIconChangedListeners.remove(gVar);
    }

    public void setBoxBackgroundColor(int i) {
        if (this.boxBackgroundColor != i) {
            this.boxBackgroundColor = i;
            this.defaultFilledBackgroundColor = i;
            this.focusedFilledBackgroundColor = i;
            this.hoveredFilledBackgroundColor = i;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(h0.i.b.a.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.boxBackgroundMode) {
            this.boxBackgroundMode = i;
            if (this.editText != null) {
                onApplyBoxBackgroundMode();
            }
        }
    }

    public void setBoxCornerRadii(float f2, float f3, float f4, float f5) {
        i0.h.a.c.w.g gVar = this.boxBackground;
        if (gVar == null || gVar.n() != f2 || this.boxBackground.o() != f3 || this.boxBackground.i() != f5 || this.boxBackground.h() != f4) {
            k kVar = this.shapeAppearanceModel;
            Objects.requireNonNull(kVar);
            k.b bVar = new k.b(kVar);
            bVar.e = new i0.h.a.c.w.a(f2);
            bVar.f = new i0.h.a.c.w.a(f3);
            bVar.g = new i0.h.a.c.w.a(f5);
            bVar.h = new i0.h.a.c.w.a(f4);
            this.shapeAppearanceModel = bVar.a();
            applyBoxAttributes();
        }
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setBoxStrokeColor(int i) {
        if (this.focusedStrokeColor != i) {
            this.focusedStrokeColor = i;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.boxStrokeWidthDefaultPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.boxStrokeWidthFocusedPx = i;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.counterEnabled != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface2 = this.typeface;
                if (typeface2 != null) {
                    this.counterView.setTypeface(typeface2);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.a(this.counterView, 2);
                ((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.j(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.counterMaxLength != i) {
            if (i > 0) {
                this.counterMaxLength = i;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.counterOverflowTextAppearance != i) {
            this.counterOverflowTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.counterTextAppearance != i) {
            this.counterTextAppearance = i;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    public void setEnabled(boolean z) {
        recursiveSetEnabled(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.endIconView.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.endIconView.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? h0.b.b.a.a.a(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        int i2 = this.endIconMode;
        this.endIconMode = i;
        dispatchOnEndIconChanged(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.boxBackgroundMode)) {
            getEndIconDelegate().a();
            applyEndIconTint();
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("The current box background mode ");
        P0.append(this.boxBackgroundMode);
        P0.append(" is not supported by the end icon mode ");
        P0.append(i);
        throw new IllegalStateException(P0.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            this.hasEndIconTintList = true;
            applyEndIconTint();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            this.hasEndIconTintMode = true;
            applyEndIconTint();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (isEndIconVisible() != z) {
            this.endIconView.setVisibility(z ? 0 : 8);
            updateSuffixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            n nVar = this.indicatorViewController;
            nVar.c();
            nVar.j = charSequence;
            nVar.l.setText(charSequence);
            int i = nVar.h;
            if (i != 1) {
                nVar.i = 1;
            }
            nVar.l(i, nVar.i, nVar.k(nVar.l, charSequence));
            return;
        }
        this.indicatorViewController.i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        n nVar = this.indicatorViewController;
        nVar.m = charSequence;
        TextView textView = nVar.l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        n nVar = this.indicatorViewController;
        if (nVar.k != z) {
            nVar.c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(nVar.a);
                nVar.l = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_error);
                nVar.l.setTextAlignment(5);
                Typeface typeface2 = nVar.u;
                if (typeface2 != null) {
                    nVar.l.setTypeface(typeface2);
                }
                int i = nVar.n;
                nVar.n = i;
                TextView textView = nVar.l;
                if (textView != null) {
                    nVar.b.setTextAppearanceCompatWithErrorFallback(textView, i);
                }
                ColorStateList colorStateList = nVar.o;
                nVar.o = colorStateList;
                TextView textView2 = nVar.l;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = nVar.m;
                nVar.m = charSequence;
                TextView textView3 = nVar.l;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                nVar.l.setVisibility(4);
                TextView textView4 = nVar.l;
                AtomicInteger atomicInteger = q.a;
                textView4.setAccessibilityLiveRegion(1);
                nVar.a(nVar.l, 0);
            } else {
                nVar.i();
                nVar.j(nVar.l, 0);
                nVar.l = null;
                nVar.b.updateEditTextBackground();
                nVar.b.updateTextInputBoxState();
            }
            nVar.k = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? h0.b.b.a.a.a(getContext(), i) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.errorIconTintList = colorStateList;
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        n nVar = this.indicatorViewController;
        nVar.n = i;
        TextView textView = nVar.l;
        if (textView != null) {
            nVar.b.setTextAppearanceCompatWithErrorFallback(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        n nVar = this.indicatorViewController;
        nVar.o = colorStateList;
        TextView textView = nVar.l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.expandedHintEnabled != z) {
            this.expandedHintEnabled = z;
            updateLabelState(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            n nVar = this.indicatorViewController;
            nVar.c();
            nVar.p = charSequence;
            nVar.r.setText(charSequence);
            int i = nVar.h;
            if (i != 2) {
                nVar.i = 2;
            }
            nVar.l(i, nVar.i, nVar.k(nVar.r, charSequence));
        } else if (isHelperTextEnabled()) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        n nVar = this.indicatorViewController;
        nVar.t = colorStateList;
        TextView textView = nVar.r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        n nVar = this.indicatorViewController;
        if (nVar.q != z) {
            nVar.c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(nVar.a);
                nVar.r = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_helper_text);
                nVar.r.setTextAlignment(5);
                Typeface typeface2 = nVar.u;
                if (typeface2 != null) {
                    nVar.r.setTypeface(typeface2);
                }
                nVar.r.setVisibility(4);
                TextView textView = nVar.r;
                AtomicInteger atomicInteger = q.a;
                textView.setAccessibilityLiveRegion(1);
                int i = nVar.s;
                nVar.s = i;
                TextView textView2 = nVar.r;
                if (textView2 != null) {
                    textView2.setTextAppearance(i);
                }
                ColorStateList colorStateList = nVar.t;
                nVar.t = colorStateList;
                TextView textView3 = nVar.r;
                if (!(textView3 == null || colorStateList == null)) {
                    textView3.setTextColor(colorStateList);
                }
                nVar.a(nVar.r, 1);
            } else {
                nVar.c();
                int i2 = nVar.h;
                if (i2 == 2) {
                    nVar.i = 0;
                }
                nVar.l(i2, nVar.i, nVar.k(nVar.r, (CharSequence) null));
                nVar.j(nVar.r, 1);
                nVar.r = null;
                nVar.b.updateEditTextBackground();
                nVar.b.updateTextInputBoxState();
            }
            nVar.q = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        n nVar = this.indicatorViewController;
        nVar.s = i;
        TextView textView = nVar.r;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.hintAnimationEnabled = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.hintEnabled) {
            this.hintEnabled = z;
            if (!z) {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint2 = this.editText.getHint();
                if (!TextUtils.isEmpty(hint2)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint2);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        i0.h.a.c.q.c cVar = this.collapsingTextHelper;
        i0.h.a.c.t.b bVar = new i0.h.a.c.t.b(cVar.a.getContext(), i);
        ColorStateList colorStateList = bVar.a;
        if (colorStateList != null) {
            cVar.l = colorStateList;
        }
        float f2 = bVar.k;
        if (f2 != 0.0f) {
            cVar.j = f2;
        }
        ColorStateList colorStateList2 = bVar.b;
        if (colorStateList2 != null) {
            cVar.L = colorStateList2;
        }
        cVar.J = bVar.f;
        cVar.K = bVar.g;
        cVar.I = bVar.h;
        cVar.M = bVar.j;
        i0.h.a.c.t.a aVar = cVar.v;
        if (aVar != null) {
            aVar.c = true;
        }
        i0.h.a.c.q.b bVar2 = new i0.h.a.c.q.b(cVar);
        bVar.a();
        cVar.v = new i0.h.a.c.t.a(bVar2, bVar.n);
        bVar.b(cVar.a.getContext(), cVar.v);
        cVar.k();
        this.focusedTextColor = this.collapsingTextHelper.l;
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                i0.h.a.c.q.c cVar = this.collapsingTextHelper;
                if (cVar.l != colorStateList) {
                    cVar.l = colorStateList;
                    cVar.k();
                }
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? h0.b.b.a.a.a(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.endIconMode != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        this.hasEndIconTintList = true;
        applyEndIconTint();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        this.hasEndIconTintMode = true;
        applyEndIconTint();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (!this.placeholderEnabled || !TextUtils.isEmpty(charSequence)) {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.placeholderTextAppearance = i;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updatePrefixTextVisibility();
    }

    public void setPrefixTextAppearance(int i) {
        this.prefixTextView.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.startIconView.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? h0.b.b.a.a.a(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            this.hasStartIconTintList = true;
            applyStartIconTint();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            this.hasStartIconTintMode = true;
            applyStartIconTint();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (isStartIconVisible() != z) {
            this.startIconView.setVisibility(z ? 0 : 8);
            updatePrefixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(int i) {
        this.suffixTextView.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void setTextAppearanceCompatWithErrorFallback(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(h0.i.b.a.getColor(getContext(), R.color.design_error));
        }
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText2 = this.editText;
        if (editText2 != null) {
            q.p(editText2, eVar);
        }
    }

    public void setTypeface(Typeface typeface2) {
        if (typeface2 != this.typeface) {
            this.typeface = typeface2;
            this.collapsingTextHelper.q(typeface2);
            n nVar = this.indicatorViewController;
            if (typeface2 != nVar.u) {
                nVar.u = typeface2;
                TextView textView = nVar.l;
                if (textView != null) {
                    textView.setTypeface(typeface2);
                }
                TextView textView2 = nVar.r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface2);
                }
            }
            TextView textView3 = this.counterView;
            if (textView3 != null) {
                textView3.setTypeface(typeface2);
            }
        }
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText2 = this.editText;
        if (editText2 != null && this.boxBackgroundMode == 0 && (background = editText2.getBackground()) != null) {
            if (b0.a(background)) {
                background = background.mutate();
            }
            if (this.indicatorViewController.e()) {
                background.setColorFilter(j.c(this.indicatorViewController.g(), PorterDuff.Mode.SRC_IN));
            } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
                background.clearColorFilter();
                this.editText.refreshDrawableState();
            } else {
                background.setColorFilter(j.c(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public void updateLabelState(boolean z) {
        updateLabelState(z, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.editText;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateTextInputBoxState() {
        /*
            r6 = this;
            i0.h.a.c.w.g r0 = r6.boxBackground
            if (r0 == 0) goto L_0x00eb
            int r0 = r6.boxBackgroundMode
            if (r0 != 0) goto L_0x000a
            goto L_0x00eb
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.editText
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.editText
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = r1
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.disabledColor
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x003f:
            i0.h.a.c.z.n r4 = r6.indicatorViewController
            boolean r4 = r4.e()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.strokeErrorColor
            if (r4 == 0) goto L_0x004f
            r6.updateStrokeErrorColor(r0, r3)
            goto L_0x0081
        L_0x004f:
            i0.h.a.c.z.n r4 = r6.indicatorViewController
            int r4 = r4.g()
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.counterOverflowed
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.counterView
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.strokeErrorColor
            if (r5 == 0) goto L_0x0068
            r6.updateStrokeErrorColor(r0, r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.focusedStrokeColor
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.hoveredStrokeColor
            r6.boxStrokeColor = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.defaultStrokeColor
            r6.boxStrokeColor = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0094
            i0.h.a.c.z.n r4 = r6.indicatorViewController
            boolean r5 = r4.k
            if (r5 == 0) goto L_0x0094
            boolean r4 = r4.e()
            if (r4 == 0) goto L_0x0094
            r1 = r2
        L_0x0094:
            r6.setErrorIconVisible(r1)
            r6.refreshErrorIconDrawableState()
            r6.refreshStartIconDrawableState()
            r6.refreshEndIconDrawableState()
            i0.h.a.c.z.m r1 = r6.getEndIconDelegate()
            java.util.Objects.requireNonNull(r1)
            boolean r1 = r1 instanceof i0.h.a.c.z.h
            if (r1 == 0) goto L_0x00b4
            i0.h.a.c.z.n r1 = r6.indicatorViewController
            boolean r1 = r1.e()
            r6.tintEndIconOnError(r1)
        L_0x00b4:
            if (r0 == 0) goto L_0x00c1
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00c1
            int r1 = r6.boxStrokeWidthFocusedPx
            r6.boxStrokeWidthPx = r1
            goto L_0x00c5
        L_0x00c1:
            int r1 = r6.boxStrokeWidthDefaultPx
            r6.boxStrokeWidthPx = r1
        L_0x00c5:
            int r1 = r6.boxBackgroundMode
            if (r1 != r2) goto L_0x00e8
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x00d4
            int r0 = r6.disabledFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto L_0x00e8
        L_0x00d4:
            if (r3 == 0) goto L_0x00dd
            if (r0 != 0) goto L_0x00dd
            int r0 = r6.hoveredFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto L_0x00e8
        L_0x00dd:
            if (r0 == 0) goto L_0x00e4
            int r0 = r6.focusedFilledBackgroundColor
            r6.boxBackgroundColor = r0
            goto L_0x00e8
        L_0x00e4:
            int r0 = r6.defaultFilledBackgroundColor
            r6.boxBackgroundColor = r0
        L_0x00e8:
            r6.applyBoxAttributes()
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.updateTextInputBoxState():void");
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    private void updateLabelState(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText2 = this.editText;
        boolean z3 = editText2 != null && !TextUtils.isEmpty(editText2.getText());
        EditText editText3 = this.editText;
        boolean z4 = editText3 != null && editText3.hasFocus();
        boolean e2 = this.indicatorViewController.e();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            i0.h.a.c.q.c cVar = this.collapsingTextHelper;
            if (cVar.l != colorStateList2) {
                cVar.l = colorStateList2;
                cVar.k();
            }
            i0.h.a.c.q.c cVar2 = this.collapsingTextHelper;
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            if (cVar2.k != colorStateList3) {
                cVar2.k = colorStateList3;
                cVar2.k();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.defaultHintTextColor;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor;
            this.collapsingTextHelper.m(ColorStateList.valueOf(colorForState));
            i0.h.a.c.q.c cVar3 = this.collapsingTextHelper;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (cVar3.k != valueOf) {
                cVar3.k = valueOf;
                cVar3.k();
            }
        } else if (e2) {
            i0.h.a.c.q.c cVar4 = this.collapsingTextHelper;
            TextView textView2 = this.indicatorViewController.l;
            cVar4.m(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.m(textView.getTextColors());
        } else if (z4 && (colorStateList = this.focusedTextColor) != null) {
            i0.h.a.c.q.c cVar5 = this.collapsingTextHelper;
            if (cVar5.l != colorStateList) {
                cVar5.l = colorStateList;
                cVar5.k();
            }
        }
        if (z3 || !this.expandedHintEnabled || (isEnabled() && z4)) {
            if (z2 || this.hintExpanded) {
                collapseHint(z);
            }
        } else if (z2 || !this.hintExpanded) {
            expandHint(z);
        }
    }

    /* access modifiers changed from: private */
    public void updatePlaceholderText(int i) {
        if (i != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        refreshEndIconDrawableState();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            refreshStartIconDrawableState();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r23, android.util.AttributeSet r24, int r25) {
        /*
            r22 = this;
            r0 = r22
            r7 = r24
            r8 = r25
            int r9 = DEF_STYLE_RES
            r1 = r23
            android.content.Context r1 = i0.h.a.c.a0.a.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            i0.h.a.c.z.n r1 = new i0.h.a.c.z.n
            r1.<init>(r0)
            r0.indicatorViewController = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpRect = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpBoundsRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.editTextAttachedListeners = r1
            r10 = 0
            r0.endIconMode = r10
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.endIconDelegates = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.endIconChangedListeners = r1
            i0.h.a.c.q.c r1 = new i0.h.a.c.q.c
            r1.<init>(r0)
            r0.collapsingTextHelper = r1
            android.content.Context r11 = r22.getContext()
            r12 = 1
            r0.setOrientation(r12)
            r0.setWillNotDraw(r10)
            r0.setAddStatesFromChildren(r12)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r11)
            r0.inputFrame = r2
            r2.setAddStatesFromChildren(r12)
            r0.addView(r2)
            android.widget.LinearLayout r3 = new android.widget.LinearLayout
            r3.<init>(r11)
            r0.startLayout = r3
            r3.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r13 = -2
            r14 = -1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            r4.<init>(r13, r14, r5)
            r3.setLayoutParams(r4)
            r2.addView(r3)
            android.widget.LinearLayout r15 = new android.widget.LinearLayout
            r15.<init>(r11)
            r0.endLayout = r15
            r15.setOrientation(r10)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = 8388613(0x800005, float:1.175495E-38)
            r3.<init>(r13, r14, r4)
            r15.setLayoutParams(r3)
            r2.addView(r15)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r11)
            r0.endIconFrame = r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r13, r14)
            r2.setLayoutParams(r3)
            android.animation.TimeInterpolator r2 = i0.h.a.c.a.a.a
            r1.H = r2
            r1.k()
            r1.G = r2
            r1.k()
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.n(r2)
            int[] r6 = com.google.android.material.R.styleable.TextInputLayout
            r1 = 5
            int[] r5 = new int[r1]
            int r4 = com.google.android.material.R.styleable.TextInputLayout_counterTextAppearance
            r5[r10] = r4
            int r3 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextAppearance
            r5[r12] = r3
            int r2 = com.google.android.material.R.styleable.TextInputLayout_errorTextAppearance
            r1 = 2
            r5[r1] = r2
            int r13 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextAppearance
            r14 = 3
            r5[r14] = r13
            int r14 = com.google.android.material.R.styleable.TextInputLayout_hintTextAppearance
            r16 = 4
            r5[r16] = r14
            i0.h.a.c.q.j.a(r11, r7, r8, r9)
            r1 = r11
            r17 = r2
            r2 = r24
            r18 = r3
            r3 = r6
            r19 = r4
            r4 = r25
            r16 = r5
            r5 = r9
            r10 = r6
            r6 = r16
            i0.h.a.c.q.j.b(r1, r2, r3, r4, r5, r6)
            h0.b.f.w0 r1 = new h0.b.f.w0
            android.content.res.TypedArray r2 = r11.obtainStyledAttributes(r7, r10, r8, r9)
            r1.<init>(r11, r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_hintEnabled
            boolean r2 = r1.a(r2, r12)
            r0.hintEnabled = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.n(r2)
            r0.setHint((java.lang.CharSequence) r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.a(r2, r12)
            r0.hintAnimationEnabled = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_expandedHintEnabled
            boolean r2 = r1.a(r2, r12)
            r0.expandedHintEnabled = r2
            i0.h.a.c.w.a r2 = new i0.h.a.c.w.a
            r3 = 0
            float r4 = (float) r3
            r2.<init>(r4)
            i0.h.a.c.w.k$b r2 = i0.h.a.c.w.k.b(r11, r7, r8, r9, r2)
            i0.h.a.c.w.k r2 = r2.a()
            r0.shapeAppearanceModel = r2
            android.content.res.Resources r2 = r11.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r4)
            r0.boxLabelCutoutPaddingPx = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r1.e(r2, r3)
            r0.boxCollapsedPaddingTopPx = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r11.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.f(r2, r3)
            r0.boxStrokeWidthDefaultPx = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r11.getResources()
            int r4 = com.google.android.material.R.dimen.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.f(r2, r3)
            r0.boxStrokeWidthFocusedPx = r2
            int r2 = r0.boxStrokeWidthDefaultPx
            r0.boxStrokeWidthPx = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.d(r2, r3)
            int r4 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.d(r4, r3)
            int r5 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.d(r5, r3)
            int r6 = com.google.android.material.R.styleable.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.d(r6, r3)
            i0.h.a.c.w.k r6 = r0.shapeAppearanceModel
            java.util.Objects.requireNonNull(r6)
            i0.h.a.c.w.k$b r7 = new i0.h.a.c.w.k$b
            r7.<init>(r6)
            r6 = 0
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0192
            r7.f(r2)
        L_0x0192:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0199
            r7.g(r4)
        L_0x0199:
            int r2 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01a0
            r7.e(r5)
        L_0x01a0:
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01a7
            r7.d(r3)
        L_0x01a7:
            i0.h.a.c.w.k r2 = r7.a()
            r0.shapeAppearanceModel = r2
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.N(r11, r1, r2)
            if (r2 == 0) goto L_0x0211
            int r3 = r2.getDefaultColor()
            r0.defaultFilledBackgroundColor = r3
            r0.boxBackgroundColor = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01ea
            int[] r3 = new int[r12]
            r5 = 0
            r3[r5] = r4
            r5 = -1
            int r3 = r2.getColorForState(r3, r5)
            r0.disabledFilledBackgroundColor = r3
            r3 = 2
            int[] r4 = new int[r3]
            r4 = {16842908, 16842910} // fill-array
            int r4 = r2.getColorForState(r4, r5)
            r0.focusedFilledBackgroundColor = r4
            int[] r4 = new int[r3]
            r4 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r4, r5)
            r0.hoveredFilledBackgroundColor = r2
            goto L_0x021d
        L_0x01ea:
            r3 = 2
            r5 = -1
            int r2 = r0.defaultFilledBackgroundColor
            r0.focusedFilledBackgroundColor = r2
            int r2 = com.google.android.material.R.color.mtrl_filled_background_color
            java.lang.ThreadLocal<android.util.TypedValue> r6 = h0.b.b.a.a.a
            android.content.res.ColorStateList r2 = r11.getColorStateList(r2)
            int[] r6 = new int[r12]
            r7 = 0
            r6[r7] = r4
            int r4 = r2.getColorForState(r6, r5)
            r0.disabledFilledBackgroundColor = r4
            int[] r4 = new int[r12]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r4[r7] = r6
            int r2 = r2.getColorForState(r4, r5)
            r0.hoveredFilledBackgroundColor = r2
            goto L_0x021d
        L_0x0211:
            r3 = 2
            r7 = 0
            r0.boxBackgroundColor = r7
            r0.defaultFilledBackgroundColor = r7
            r0.disabledFilledBackgroundColor = r7
            r0.focusedFilledBackgroundColor = r7
            r0.hoveredFilledBackgroundColor = r7
        L_0x021d:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_textColorHint
            boolean r4 = r1.o(r2)
            if (r4 == 0) goto L_0x022d
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.focusedTextColor = r2
            r0.defaultHintTextColor = r2
        L_0x022d:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r4 = i0.h.a.b.c.m.b.N(r11, r1, r2)
            r5 = 0
            int r2 = r1.b(r2, r5)
            r0.focusedStrokeColor = r2
            int r2 = com.google.android.material.R.color.mtrl_textinput_default_box_stroke_color
            int r2 = h0.i.b.a.getColor(r11, r2)
            r0.defaultStrokeColor = r2
            int r2 = com.google.android.material.R.color.mtrl_textinput_disabled_color
            int r2 = h0.i.b.a.getColor(r11, r2)
            r0.disabledColor = r2
            int r2 = com.google.android.material.R.color.mtrl_textinput_hovered_box_stroke_color
            int r2 = h0.i.b.a.getColor(r11, r2)
            r0.hoveredStrokeColor = r2
            if (r4 == 0) goto L_0x0257
            r0.setBoxStrokeColorStateList(r4)
        L_0x0257:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxStrokeErrorColor
            boolean r4 = r1.o(r2)
            if (r4 == 0) goto L_0x0266
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.N(r11, r1, r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0266:
            r2 = -1
            int r4 = r1.l(r14, r2)
            if (r4 == r2) goto L_0x0276
            r2 = 0
            int r4 = r1.l(r14, r2)
            r0.setHintTextAppearance(r4)
            goto L_0x0277
        L_0x0276:
            r2 = 0
        L_0x0277:
            r4 = r17
            int r4 = r1.l(r4, r2)
            int r5 = com.google.android.material.R.styleable.TextInputLayout_errorContentDescription
            java.lang.CharSequence r5 = r1.n(r5)
            int r6 = com.google.android.material.R.styleable.TextInputLayout_errorEnabled
            boolean r6 = r1.a(r6, r2)
            android.content.Context r7 = r22.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r8 = com.google.android.material.R.layout.design_text_input_end_icon
            android.view.View r7 = r7.inflate(r8, r15, r2)
            com.google.android.material.internal.CheckableImageButton r7 = (com.google.android.material.internal.CheckableImageButton) r7
            r0.errorIconView = r7
            int r9 = com.google.android.material.R.id.text_input_error_icon
            r7.setId(r9)
            r9 = 8
            r7.setVisibility(r9)
            boolean r10 = i0.h.a.b.c.m.b.V(r11)
            if (r10 == 0) goto L_0x02b4
            android.view.ViewGroup$LayoutParams r10 = r7.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            r10.setMarginStart(r2)
        L_0x02b4:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_errorIconDrawable
            boolean r10 = r1.o(r2)
            if (r10 == 0) goto L_0x02c3
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x02c3:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_errorIconTint
            boolean r10 = r1.o(r2)
            if (r10 == 0) goto L_0x02d2
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.N(r11, r1, r2)
            r0.setErrorIconTintList(r2)
        L_0x02d2:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_errorIconTintMode
            boolean r10 = r1.o(r2)
            r14 = 0
            if (r10 == 0) goto L_0x02e7
            r10 = -1
            int r2 = r1.j(r2, r10)
            android.graphics.PorterDuff$Mode r2 = i0.h.a.b.c.m.b.f0(r2, r14)
            r0.setErrorIconTintMode(r2)
        L_0x02e7:
            android.content.res.Resources r2 = r22.getResources()
            int r10 = com.google.android.material.R.string.error_icon_content_description
            java.lang.CharSequence r2 = r2.getText(r10)
            r7.setContentDescription(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = h0.i.i.q.a
            r7.setImportantForAccessibility(r3)
            r2 = 0
            r7.setClickable(r2)
            r7.setPressable(r2)
            r7.setFocusable(r2)
            int r7 = r1.l(r13, r2)
            int r10 = com.google.android.material.R.styleable.TextInputLayout_helperTextEnabled
            boolean r10 = r1.a(r10, r2)
            int r13 = com.google.android.material.R.styleable.TextInputLayout_helperText
            java.lang.CharSequence r13 = r1.n(r13)
            int r15 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextAppearance
            int r15 = r1.l(r15, r2)
            int r3 = com.google.android.material.R.styleable.TextInputLayout_placeholderText
            java.lang.CharSequence r3 = r1.n(r3)
            int r12 = com.google.android.material.R.styleable.TextInputLayout_prefixTextAppearance
            int r12 = r1.l(r12, r2)
            int r14 = com.google.android.material.R.styleable.TextInputLayout_prefixText
            java.lang.CharSequence r14 = r1.n(r14)
            int r9 = com.google.android.material.R.styleable.TextInputLayout_suffixTextAppearance
            int r9 = r1.l(r9, r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_suffixText
            java.lang.CharSequence r2 = r1.n(r2)
            r17 = r9
            int r9 = com.google.android.material.R.styleable.TextInputLayout_counterEnabled
            r20 = r2
            r2 = 0
            boolean r9 = r1.a(r9, r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_counterMaxLength
            r21 = r9
            r9 = -1
            int r2 = r1.j(r2, r9)
            r0.setCounterMaxLength(r2)
            r2 = r19
            r9 = 0
            int r2 = r1.l(r2, r9)
            r0.counterTextAppearance = r2
            r2 = r18
            int r2 = r1.l(r2, r9)
            r0.counterOverflowTextAppearance = r2
            android.content.Context r2 = r22.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r18 = r12
            int r12 = com.google.android.material.R.layout.design_text_input_start_icon
            r19 = r14
            android.widget.LinearLayout r14 = r0.startLayout
            android.view.View r2 = r2.inflate(r12, r14, r9)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.startIconView = r2
            r12 = 8
            r2.setVisibility(r12)
            boolean r12 = i0.h.a.b.c.m.b.V(r11)
            if (r12 == 0) goto L_0x038b
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.setMarginEnd(r9)
        L_0x038b:
            r2 = 0
            r0.setStartIconOnClickListener(r2)
            r0.setStartIconOnLongClickListener(r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_startIconDrawable
            boolean r9 = r1.o(r2)
            if (r9 == 0) goto L_0x03ba
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_startIconContentDescription
            boolean r9 = r1.o(r2)
            if (r9 == 0) goto L_0x03b0
            java.lang.CharSequence r2 = r1.n(r2)
            r0.setStartIconContentDescription((java.lang.CharSequence) r2)
        L_0x03b0:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_startIconCheckable
            r9 = 1
            boolean r2 = r1.a(r2, r9)
            r0.setStartIconCheckable(r2)
        L_0x03ba:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_startIconTint
            boolean r9 = r1.o(r2)
            if (r9 == 0) goto L_0x03c9
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.N(r11, r1, r2)
            r0.setStartIconTintList(r2)
        L_0x03c9:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_startIconTintMode
            boolean r9 = r1.o(r2)
            if (r9 == 0) goto L_0x03de
            r9 = -1
            int r2 = r1.j(r2, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r2 = i0.h.a.b.c.m.b.f0(r2, r9)
            r0.setStartIconTintMode(r2)
        L_0x03de:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_boxBackgroundMode
            r9 = 0
            int r2 = r1.j(r2, r9)
            r0.setBoxBackgroundMode(r2)
            android.content.Context r2 = r22.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.widget.FrameLayout r12 = r0.endIconFrame
            android.view.View r2 = r2.inflate(r8, r12, r9)
            com.google.android.material.internal.CheckableImageButton r2 = (com.google.android.material.internal.CheckableImageButton) r2
            r0.endIconView = r2
            android.widget.FrameLayout r2 = r0.endIconFrame
            com.google.android.material.internal.CheckableImageButton r8 = r0.endIconView
            r2.addView(r8)
            com.google.android.material.internal.CheckableImageButton r2 = r0.endIconView
            r8 = 8
            r2.setVisibility(r8)
            boolean r2 = i0.h.a.b.c.m.b.V(r11)
            if (r2 == 0) goto L_0x041b
            com.google.android.material.internal.CheckableImageButton r2 = r0.endIconView
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r8 = 0
            r2.setMarginStart(r8)
            goto L_0x041c
        L_0x041b:
            r8 = 0
        L_0x041c:
            android.util.SparseArray<i0.h.a.c.z.m> r2 = r0.endIconDelegates
            i0.h.a.c.z.f r9 = new i0.h.a.c.z.f
            r9.<init>(r0)
            r12 = -1
            r2.append(r12, r9)
            android.util.SparseArray<i0.h.a.c.z.m> r2 = r0.endIconDelegates
            i0.h.a.c.z.q r9 = new i0.h.a.c.z.q
            r9.<init>(r0)
            r2.append(r8, r9)
            android.util.SparseArray<i0.h.a.c.z.m> r2 = r0.endIconDelegates
            i0.h.a.c.z.r r8 = new i0.h.a.c.z.r
            r8.<init>(r0)
            r9 = 1
            r2.append(r9, r8)
            android.util.SparseArray<i0.h.a.c.z.m> r2 = r0.endIconDelegates
            i0.h.a.c.z.a r8 = new i0.h.a.c.z.a
            r8.<init>(r0)
            r9 = 2
            r2.append(r9, r8)
            android.util.SparseArray<i0.h.a.c.z.m> r2 = r0.endIconDelegates
            i0.h.a.c.z.h r8 = new i0.h.a.c.z.h
            r8.<init>(r0)
            r9 = 3
            r2.append(r9, r8)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_endIconMode
            boolean r8 = r1.o(r2)
            if (r8 == 0) goto L_0x048b
            r8 = 0
            int r2 = r1.j(r2, r8)
            r0.setEndIconMode(r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_endIconDrawable
            boolean r8 = r1.o(r2)
            if (r8 == 0) goto L_0x0471
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
        L_0x0471:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_endIconContentDescription
            boolean r8 = r1.o(r2)
            if (r8 == 0) goto L_0x0480
            java.lang.CharSequence r2 = r1.n(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x0480:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_endIconCheckable
            r8 = 1
            boolean r2 = r1.a(r2, r8)
            r0.setEndIconCheckable(r2)
            goto L_0x04d1
        L_0x048b:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r8 = r1.o(r2)
            if (r8 == 0) goto L_0x04d1
            r8 = 0
            boolean r2 = r1.a(r2, r8)
            r0.setEndIconMode(r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r2 = r1.g(r2)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r2 = r1.n(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTint
            boolean r8 = r1.o(r2)
            if (r8 == 0) goto L_0x04bc
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.N(r11, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04bc:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleTintMode
            boolean r8 = r1.o(r2)
            if (r8 == 0) goto L_0x04d1
            r8 = -1
            int r2 = r1.j(r2, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r2 = i0.h.a.b.c.m.b.f0(r2, r8)
            r0.setEndIconTintMode(r2)
        L_0x04d1:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_passwordToggleEnabled
            boolean r2 = r1.o(r2)
            if (r2 != 0) goto L_0x04fd
            int r2 = com.google.android.material.R.styleable.TextInputLayout_endIconTint
            boolean r8 = r1.o(r2)
            if (r8 == 0) goto L_0x04e8
            android.content.res.ColorStateList r2 = i0.h.a.b.c.m.b.N(r11, r1, r2)
            r0.setEndIconTintList(r2)
        L_0x04e8:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_endIconTintMode
            boolean r8 = r1.o(r2)
            if (r8 == 0) goto L_0x04fd
            r8 = -1
            int r2 = r1.j(r2, r8)
            r8 = 0
            android.graphics.PorterDuff$Mode r2 = i0.h.a.b.c.m.b.f0(r2, r8)
            r0.setEndIconTintMode(r2)
        L_0x04fd:
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r11)
            r0.prefixTextView = r2
            int r8 = com.google.android.material.R.id.textinput_prefix_text
            r2.setId(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r2.setLayoutParams(r8)
            r8 = 1
            r2.setAccessibilityLiveRegion(r8)
            android.widget.LinearLayout r8 = r0.startLayout
            com.google.android.material.internal.CheckableImageButton r9 = r0.startIconView
            r8.addView(r9)
            android.widget.LinearLayout r8 = r0.startLayout
            r8.addView(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r11)
            r0.suffixTextView = r2
            int r8 = com.google.android.material.R.id.textinput_suffix_text
            r2.setId(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r9 = 80
            r11 = -2
            r8.<init>(r11, r11, r9)
            r2.setLayoutParams(r8)
            r8 = 1
            r2.setAccessibilityLiveRegion(r8)
            android.widget.LinearLayout r8 = r0.endLayout
            r8.addView(r2)
            android.widget.LinearLayout r2 = r0.endLayout
            com.google.android.material.internal.CheckableImageButton r8 = r0.errorIconView
            r2.addView(r8)
            android.widget.LinearLayout r2 = r0.endLayout
            android.widget.FrameLayout r8 = r0.endIconFrame
            r2.addView(r8)
            r0.setHelperTextEnabled(r10)
            r0.setHelperText(r13)
            r0.setHelperTextTextAppearance(r7)
            r0.setErrorEnabled(r6)
            r0.setErrorTextAppearance(r4)
            r0.setErrorContentDescription(r5)
            int r2 = r0.counterTextAppearance
            r0.setCounterTextAppearance(r2)
            int r2 = r0.counterOverflowTextAppearance
            r0.setCounterOverflowTextAppearance(r2)
            r0.setPlaceholderText(r3)
            r0.setPlaceholderTextAppearance(r15)
            r2 = r19
            r0.setPrefixText(r2)
            r2 = r18
            r0.setPrefixTextAppearance(r2)
            r2 = r20
            r0.setSuffixText(r2)
            r2 = r17
            r0.setSuffixTextAppearance(r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_errorTextColor
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x0595
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setErrorTextColor(r2)
        L_0x0595:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_helperTextTextColor
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x05a4
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHelperTextColor(r2)
        L_0x05a4:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_hintTextColor
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x05b3
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setHintTextColor(r2)
        L_0x05b3:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_counterTextColor
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x05c2
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterTextColor(r2)
        L_0x05c2:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_counterOverflowTextColor
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x05d1
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05d1:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_placeholderTextColor
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x05e0
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05e0:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_prefixTextColor
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x05ef
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setPrefixTextColor(r2)
        L_0x05ef:
            int r2 = com.google.android.material.R.styleable.TextInputLayout_suffixTextColor
            boolean r3 = r1.o(r2)
            if (r3 == 0) goto L_0x05fe
            android.content.res.ColorStateList r2 = r1.c(r2)
            r0.setSuffixTextColor(r2)
        L_0x05fe:
            r2 = r21
            r0.setCounterEnabled(r2)
            int r2 = com.google.android.material.R.styleable.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.a(r2, r3)
            r0.setEnabled(r2)
            android.content.res.TypedArray r1 = r1.b
            r1.recycle()
            r1 = 2
            r0.setImportantForAccessibility(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0621
            if (r1 < r2) goto L_0x0621
            r0.setImportantForAutofill(r3)
        L_0x0621:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.indicatorViewController.k);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    public void updateCounter(int i) {
        boolean z = this.counterOverflowed;
        int i2 = this.counterMaxLength;
        String str = null;
        if (i2 == -1) {
            this.counterView.setText(String.valueOf(i));
            this.counterView.setContentDescription((CharSequence) null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = i > i2;
            updateCounterContentDescription(getContext(), this.counterView, i, this.counterMaxLength, this.counterOverflowed);
            if (z != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            h0.i.g.a c2 = h0.i.g.a.c();
            TextView textView = this.counterView;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.counterMaxLength)});
            h0.i.g.c cVar = c2.h;
            if (string != null) {
                str = c2.e(string, cVar, true).toString();
            }
            textView.setText(str);
        }
        if (this.editText != null && z != this.counterOverflowed) {
            updateLabelState(false);
            updateTextInputBoxState();
            updateEditTextBackground();
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
