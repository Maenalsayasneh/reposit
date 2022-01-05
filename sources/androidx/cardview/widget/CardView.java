package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.cardview.R;
import h0.e.a.b;
import h0.e.a.c;
import h0.e.a.d;

public class CardView extends FrameLayout {
    public static final int[] c = {16842801};
    public static final c d = new h0.e.a.a();
    public int Y1;
    public final Rect Z1;
    public final Rect a2;
    public final b b2;
    public boolean q;
    public boolean x;
    public int y;

    public class a implements b {
        public Drawable a;

        public a() {
        }

        public boolean a() {
            return CardView.this.getPreventCornerOverlap();
        }

        public void b(int i, int i2, int i3, int i4) {
            CardView.this.a2.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.Z1;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((d) ((a) this.b2).a).h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.Z1.bottom;
    }

    public int getContentPaddingLeft() {
        return this.Z1.left;
    }

    public int getContentPaddingRight() {
        return this.Z1.right;
    }

    public int getContentPaddingTop() {
        return this.Z1.top;
    }

    public float getMaxCardElevation() {
        return ((d) ((a) this.b2).a).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.x;
    }

    public float getRadius() {
        return ((d) ((a) this.b2).a).a;
    }

    public boolean getUseCompatPadding() {
        return this.q;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        b bVar = this.b2;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        d dVar = (d) ((a) bVar).a;
        dVar.b(valueOf);
        dVar.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        ((h0.e.a.a) d).b(this.b2, f);
    }

    public void setMinimumHeight(int i) {
        this.Y1 = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.y = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.x) {
            this.x = z;
            c cVar = d;
            b bVar = this.b2;
            h0.e.a.a aVar = (h0.e.a.a) cVar;
            aVar.b(bVar, aVar.a(bVar).e);
        }
    }

    public void setRadius(float f) {
        d dVar = (d) ((a) this.b2).a;
        if (f != dVar.a) {
            dVar.a = f;
            dVar.c((Rect) null);
            dVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.q != z) {
            this.q = z;
            c cVar = d;
            b bVar = this.b2;
            h0.e.a.a aVar = (h0.e.a.a) cVar;
            aVar.b(bVar, aVar.a(bVar).e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        int i2;
        Rect rect = new Rect();
        this.Z1 = rect;
        this.a2 = new Rect();
        a aVar = new a();
        this.b2 = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CardView, i, R.style.CardView);
        int i3 = R.styleable.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            colorStateList = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(c);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(R.color.cardview_light_background);
            } else {
                i2 = getResources().getColor(R.color.cardview_dark_background);
            }
            colorStateList = ColorStateList.valueOf(i2);
        }
        float dimension = obtainStyledAttributes.getDimension(R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(R.styleable.CardView_cardMaxElevation, 0.0f);
        this.q = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardUseCompatPadding, false);
        this.x = obtainStyledAttributes.getBoolean(R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.y = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minWidth, 0);
        this.Y1 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        d dVar = new d(colorStateList, dimension);
        a aVar2 = aVar;
        aVar2.a = dVar;
        CardView.this.setBackgroundDrawable(dVar);
        CardView cardView = CardView.this;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        ((h0.e.a.a) d).b(aVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        d dVar = (d) ((a) this.b2).a;
        dVar.b(colorStateList);
        dVar.invalidateSelf();
    }
}
