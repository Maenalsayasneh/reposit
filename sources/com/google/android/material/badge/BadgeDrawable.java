package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.R;
import h0.i.i.q;
import i0.h.a.c.q.h;
import i0.h.a.c.q.j;
import i0.h.a.c.t.b;
import i0.h.a.c.w.g;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.concurrent.atomic.AtomicInteger;

public class BadgeDrawable extends Drawable implements h.b {
    private static final int BADGE_NUMBER_NONE = -1;
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    private static final int DEFAULT_STYLE = R.style.Widget_MaterialComponents_Badge;
    private static final int DEFAULT_THEME_ATTR = R.attr.badgeStyle;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    public float Y1;
    public WeakReference<View> Z1;
    public WeakReference<FrameLayout> a2;
    private final Rect badgeBounds = new Rect();
    private final float badgeRadius;
    private final float badgeWidePadding;
    private final float badgeWithTextRadius;
    public float c;
    private final WeakReference<Context> contextRef;
    public float d;
    public int q;
    private final SavedState savedState;
    private final g shapeDrawable = new g();
    private final h textDrawableHelper;
    public float x;
    public float y;

    public BadgeDrawable(Context context) {
        b bVar;
        Context context2;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.contextRef = weakReference;
        j.c(context, j.b, "Theme.MaterialComponents");
        Resources resources = context.getResources();
        this.badgeRadius = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
        this.badgeWidePadding = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.badgeWithTextRadius = (float) resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
        h hVar = new h(this);
        this.textDrawableHelper = hVar;
        hVar.a.setTextAlign(Paint.Align.CENTER);
        this.savedState = new SavedState(context);
        int i = R.style.TextAppearance_MaterialComponents_Badge;
        Context context3 = (Context) weakReference.get();
        if (context3 != null && hVar.f != (bVar = new b(context3, i)) && (context2 = (Context) weakReference.get()) != null) {
            hVar.b(bVar, context2);
            n();
        }
    }

    public static BadgeDrawable b(Context context) {
        return c(context, (AttributeSet) null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    public static BadgeDrawable c(Context context, AttributeSet attributeSet, int i, int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        int[] iArr = R.styleable.Badge;
        j.a(context, attributeSet, i, i2);
        j.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        int i3 = obtainStyledAttributes.getInt(R.styleable.Badge_maxCharacterCount, 4);
        SavedState savedState2 = badgeDrawable.savedState;
        if (savedState2.y != i3) {
            savedState2.y = i3;
            badgeDrawable.q = ((int) Math.pow(10.0d, ((double) i3) - 1.0d)) - 1;
            badgeDrawable.textDrawableHelper.d = true;
            badgeDrawable.n();
            badgeDrawable.invalidateSelf();
        }
        int i4 = R.styleable.Badge_number;
        if (obtainStyledAttributes.hasValue(i4)) {
            badgeDrawable.k(obtainStyledAttributes.getInt(i4, 0));
        }
        badgeDrawable.j(i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, R.styleable.Badge_backgroundColor).getDefaultColor());
        int i5 = R.styleable.Badge_badgeTextColor;
        if (obtainStyledAttributes.hasValue(i5)) {
            int defaultColor = i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, i5).getDefaultColor();
            badgeDrawable.savedState.d = defaultColor;
            if (badgeDrawable.textDrawableHelper.a.getColor() != defaultColor) {
                badgeDrawable.textDrawableHelper.a.setColor(defaultColor);
                badgeDrawable.invalidateSelf();
            }
        }
        int i6 = obtainStyledAttributes.getInt(R.styleable.Badge_badgeGravity, 8388661);
        SavedState savedState3 = badgeDrawable.savedState;
        if (savedState3.b2 != i6) {
            savedState3.b2 = i6;
            WeakReference<View> weakReference = badgeDrawable.Z1;
            if (!(weakReference == null || weakReference.get() == null)) {
                View view = (View) badgeDrawable.Z1.get();
                WeakReference<FrameLayout> weakReference2 = badgeDrawable.a2;
                badgeDrawable.m(view, weakReference2 != null ? (FrameLayout) weakReference2.get() : null);
            }
        }
        badgeDrawable.savedState.d2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0);
        badgeDrawable.n();
        badgeDrawable.savedState.e2 = obtainStyledAttributes.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0);
        badgeDrawable.n();
        obtainStyledAttributes.recycle();
        return badgeDrawable;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016 A[Catch:{ IOException | XmlPullParserException -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.material.badge.BadgeDrawable d(android.content.Context r5, int r6) {
        /*
            java.lang.String r0 = "badge"
            android.content.res.Resources r1 = r5.getResources()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            android.content.res.XmlResourceParser r1 = r1.getXml(r6)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x000a:
            int r2 = r1.next()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            r3 = 2
            if (r2 == r3) goto L_0x0014
            r4 = 1
            if (r2 != r4) goto L_0x000a
        L_0x0014:
            if (r2 != r3) goto L_0x003b
            java.lang.String r2 = r1.getName()     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            boolean r0 = android.text.TextUtils.equals(r2, r0)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            if (r0 == 0) goto L_0x0033
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r1)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            int r0 = r6.getStyleAttribute()
            if (r0 != 0) goto L_0x002c
            int r0 = DEFAULT_STYLE
        L_0x002c:
            int r1 = DEFAULT_THEME_ATTR
            com.google.android.material.badge.BadgeDrawable r5 = c(r5, r6, r1, r0)
            return r5
        L_0x0033:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            java.lang.String r0 = "Must have a <badge> start tag"
            r5.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            throw r5     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x003b:
            org.xmlpull.v1.XmlPullParserException r5 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            java.lang.String r0 = "No start tag found"
            r5.<init>(r0)     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
            throw r5     // Catch:{ XmlPullParserException -> 0x0045, IOException -> 0x0043 }
        L_0x0043:
            r5 = move-exception
            goto L_0x0046
        L_0x0045:
            r5 = move-exception
        L_0x0046:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Can't load badge resource ID #0x"
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            java.lang.String r6 = i0.d.a.a.a.R(r6, r1)
            r0.<init>(r6)
            r0.initCause(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.badge.BadgeDrawable.d(android.content.Context, int):com.google.android.material.badge.BadgeDrawable");
    }

    public void a() {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.shapeDrawable.draw(canvas);
            if (i()) {
                Rect rect = new Rect();
                String e = e();
                this.textDrawableHelper.a.getTextBounds(e, 0, e.length(), rect);
                canvas.drawText(e, this.c, this.d + ((float) (rect.height() / 2)), this.textDrawableHelper.a);
            }
        }
    }

    public final String e() {
        if (h() <= this.q) {
            return NumberFormat.getInstance().format((long) h());
        }
        Context context = (Context) this.contextRef.get();
        if (context == null) {
            return "";
        }
        return context.getString(R.string.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.q), "+"});
    }

    public CharSequence f() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!i()) {
            return this.savedState.Y1;
        }
        if (this.savedState.Z1 <= 0 || (context = (Context) this.contextRef.get()) == null) {
            return null;
        }
        int h = h();
        int i = this.q;
        if (h <= i) {
            return context.getResources().getQuantityString(this.savedState.Z1, h(), new Object[]{Integer.valueOf(h())});
        }
        return context.getString(this.savedState.a2, new Object[]{Integer.valueOf(i)});
    }

    public FrameLayout g() {
        WeakReference<FrameLayout> weakReference = this.a2;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public int getAlpha() {
        return this.savedState.q;
    }

    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    public int getOpacity() {
        return -3;
    }

    public int h() {
        if (!i()) {
            return 0;
        }
        return this.savedState.x;
    }

    public boolean i() {
        return this.savedState.x != -1;
    }

    public boolean isStateful() {
        return false;
    }

    public void j(int i) {
        this.savedState.c = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        g gVar = this.shapeDrawable;
        if (gVar.q.d != valueOf) {
            gVar.t(valueOf);
            invalidateSelf();
        }
    }

    public void k(int i) {
        int max = Math.max(0, i);
        SavedState savedState2 = this.savedState;
        if (savedState2.x != max) {
            savedState2.x = max;
            this.textDrawableHelper.d = true;
            n();
            invalidateSelf();
        }
    }

    public void l(boolean z) {
        setVisible(z, false);
        this.savedState.c2 = z;
    }

    public void m(View view, FrameLayout frameLayout) {
        this.Z1 = new WeakReference<>(view);
        this.a2 = new WeakReference<>(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        n();
        invalidateSelf();
    }

    public final void n() {
        float f;
        float f2;
        Context context = (Context) this.contextRef.get();
        WeakReference<View> weakReference = this.Z1;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.badgeBounds);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.a2;
            if (weakReference2 != null) {
                viewGroup = (FrameLayout) weakReference2.get();
            }
            if (viewGroup != null) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            SavedState savedState2 = this.savedState;
            int i = savedState2.b2;
            if (i == 8388691 || i == 8388693) {
                this.d = (float) (rect2.bottom - savedState2.e2);
            } else {
                this.d = (float) (rect2.top + savedState2.e2);
            }
            if (h() <= 9) {
                float f3 = !i() ? this.badgeRadius : this.badgeWithTextRadius;
                this.x = f3;
                this.Y1 = f3;
                this.y = f3;
            } else {
                float f4 = this.badgeWithTextRadius;
                this.x = f4;
                this.Y1 = f4;
                this.y = (this.textDrawableHelper.a(e()) / 2.0f) + this.badgeWidePadding;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i() ? R.dimen.mtrl_badge_text_horizontal_edge_offset : R.dimen.mtrl_badge_horizontal_edge_offset);
            int i2 = this.savedState.b2;
            if (i2 == 8388659 || i2 == 8388691) {
                AtomicInteger atomicInteger = q.a;
                if (view.getLayoutDirection() == 0) {
                    f = (((float) rect2.left) - this.y) + ((float) dimensionPixelSize) + ((float) this.savedState.d2);
                } else {
                    f = ((((float) rect2.right) + this.y) - ((float) dimensionPixelSize)) - ((float) this.savedState.d2);
                }
                this.c = f;
            } else {
                AtomicInteger atomicInteger2 = q.a;
                if (view.getLayoutDirection() == 0) {
                    f2 = ((((float) rect2.right) + this.y) - ((float) dimensionPixelSize)) - ((float) this.savedState.d2);
                } else {
                    f2 = (((float) rect2.left) - this.y) + ((float) dimensionPixelSize) + ((float) this.savedState.d2);
                }
                this.c = f2;
            }
            Rect rect3 = this.badgeBounds;
            float f5 = this.c;
            float f6 = this.d;
            float f7 = this.y;
            float f8 = this.Y1;
            rect3.set((int) (f5 - f7), (int) (f6 - f8), (int) (f5 + f7), (int) (f6 + f8));
            g gVar = this.shapeDrawable;
            gVar.q.a = gVar.q.a.e(this.x);
            gVar.invalidateSelf();
            if (!rect.equals(this.badgeBounds)) {
                this.shapeDrawable.setBounds(this.badgeBounds);
            }
        }
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setAlpha(int i) {
        this.savedState.q = i;
        this.textDrawableHelper.a.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence Y1;
        public int Z1;
        public int a2;
        public int b2;
        public int c;
        public boolean c2;
        public int d;
        public int d2;
        public int e2;
        public int q = 255;
        public int x = -1;
        public int y;

        public static class a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Context context) {
            int i = R.style.TextAppearance_MaterialComponents_Badge;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, R.styleable.TextAppearance);
            obtainStyledAttributes.getDimension(R.styleable.TextAppearance_android_textSize, 0.0f);
            ColorStateList M = i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColor);
            i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorHint);
            i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, R.styleable.TextAppearance_android_textColorLink);
            obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_textStyle, 0);
            obtainStyledAttributes.getInt(R.styleable.TextAppearance_android_typeface, 1);
            int i2 = R.styleable.TextAppearance_fontFamily;
            i2 = !obtainStyledAttributes.hasValue(i2) ? R.styleable.TextAppearance_android_fontFamily : i2;
            obtainStyledAttributes.getResourceId(i2, 0);
            obtainStyledAttributes.getString(i2);
            obtainStyledAttributes.getBoolean(R.styleable.TextAppearance_textAllCaps, false);
            i0.h.a.b.c.m.b.M(context, obtainStyledAttributes, R.styleable.TextAppearance_android_shadowColor);
            obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDx, 0.0f);
            obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowDy, 0.0f);
            obtainStyledAttributes.getFloat(R.styleable.TextAppearance_android_shadowRadius, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, R.styleable.MaterialTextAppearance);
            int i3 = R.styleable.MaterialTextAppearance_android_letterSpacing;
            obtainStyledAttributes2.hasValue(i3);
            obtainStyledAttributes2.getFloat(i3, 0.0f);
            obtainStyledAttributes2.recycle();
            this.d = M.getDefaultColor();
            this.Y1 = context.getString(R.string.mtrl_badge_numberless_content_description);
            this.Z1 = R.plurals.mtrl_badge_content_description;
            this.a2 = R.string.mtrl_exceed_max_badge_number_content_description;
            this.c2 = true;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.q);
            parcel.writeInt(this.x);
            parcel.writeInt(this.y);
            parcel.writeString(this.Y1.toString());
            parcel.writeInt(this.Z1);
            parcel.writeInt(this.b2);
            parcel.writeInt(this.d2);
            parcel.writeInt(this.e2);
            parcel.writeInt(this.c2 ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.q = parcel.readInt();
            this.x = parcel.readInt();
            this.y = parcel.readInt();
            this.Y1 = parcel.readString();
            this.Z1 = parcel.readInt();
            this.b2 = parcel.readInt();
            this.d2 = parcel.readInt();
            this.e2 = parcel.readInt();
            this.c2 = parcel.readInt() != 0;
        }
    }
}
