package i0.j.e.l0.i.b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instabug.library.R;
import com.instabug.library.view.IconView;

/* compiled from: FloatingActionButton */
public class b extends IconView {
    public Drawable Y1;
    public int Z1;
    public float a2;
    public float b2;
    public int c;
    public float c2;
    public int d;
    public int d2;
    public boolean e2;
    public int q;
    public String x;
    public int y;

    /* compiled from: FloatingActionButton */
    public static class a extends LayerDrawable {
        public final int c;

        public a(int i, Drawable... drawableArr) {
            super(drawableArr);
            this.c = i;
        }

        public void draw(Canvas canvas) {
            Rect bounds = getBounds();
            canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.c, 31);
            super.draw(canvas);
            canvas.restore();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        c(context, attributeSet);
    }

    private void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    public final int a(int i, float f) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = Math.min(fArr[2] * f, 1.0f);
        return Color.HSVToColor(Color.alpha(i), fArr);
    }

    public void b() {
        int i;
        float d3 = d(R.dimen.instabug_fab_stroke_width);
        float f = d3 / 2.0f;
        Drawable[] drawableArr = new Drawable[4];
        drawableArr[0] = getResources().getDrawable(this.Z1 == 0 ? R.drawable.ibg_core_fab_bg_normal : R.drawable.ibg_core_fab_bg_mini);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, e(this.q, d3));
        stateListDrawable.addState(new int[]{16842919}, e(this.d, d3));
        stateListDrawable.addState(new int[0], e(this.c, d3));
        drawableArr[1] = stateListDrawable;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(d3);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-16777216);
        paint.setAlpha((int) 5.1f);
        drawableArr[2] = shapeDrawable;
        drawableArr[3] = getIconDrawable();
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        if (this.Z1 == 0) {
            i = ((int) (this.a2 - d(R.dimen.instabug_fab_icon_size_normal))) / 2;
        } else {
            i = ((int) (this.a2 - d(R.dimen.instabug_fab_icon_size_mini))) / 2;
        }
        int i2 = i;
        float f2 = this.b2;
        int i3 = (int) f2;
        float f3 = this.c2;
        int i4 = (int) (f2 - f3);
        int i5 = (int) (f2 + f3);
        layerDrawable.setLayerInset(1, i3, i4, i3, i5);
        int i6 = (int) (((float) i3) - f);
        LayerDrawable layerDrawable2 = layerDrawable;
        layerDrawable2.setLayerInset(2, i6, (int) (((float) i4) - f), i6, (int) (((float) i5) - f));
        int i7 = i3 + i2;
        layerDrawable2.setLayerInset(3, i7, i4 + i2, i7, i5 + i2);
        setBackgroundCompat(layerDrawable);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton, 0, 0);
        this.c = obtainStyledAttributes.getColor(R.styleable.FloatingActionButton_instabug_fab_colorNormal, -1);
        this.d = obtainStyledAttributes.getColor(R.styleable.FloatingActionButton_instabug_fab_colorPressed, -3355444);
        this.q = obtainStyledAttributes.getColor(R.styleable.FloatingActionButton_instabug_fab_colorDisabled, Color.parseColor("#EFEFF4"));
        this.Z1 = obtainStyledAttributes.getInt(R.styleable.FloatingActionButton_instabug_fab_size, 0);
        this.y = obtainStyledAttributes.getResourceId(R.styleable.FloatingActionButton_instabug_fab_icon, 0);
        this.x = obtainStyledAttributes.getString(R.styleable.FloatingActionButton_instabug_fab_title);
        this.e2 = obtainStyledAttributes.getBoolean(R.styleable.FloatingActionButton_instabug_fab_stroke_visible, true);
        obtainStyledAttributes.recycle();
        this.a2 = d(this.Z1 == 0 ? R.dimen.instabug_fab_size_normal : R.dimen.instabug_fab_size_mini);
        this.b2 = d(R.dimen.instabug_fab_shadow_radius);
        this.c2 = d(R.dimen.instabug_fab_shadow_offset);
        this.d2 = (int) ((this.b2 * 2.0f) + this.a2);
        b();
    }

    public float d(int i) {
        return getResources().getDimension(i);
    }

    public final Drawable e(int i, float f) {
        ColorDrawable colorDrawable;
        int alpha = Color.alpha(i);
        int rgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(rgb);
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = shapeDrawable;
        if (!this.e2) {
            colorDrawable = new ColorDrawable(0);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            int a3 = a(rgb, 0.9f);
            int f2 = f(a3);
            int a4 = a(rgb, 1.1f);
            int f3 = f(a4);
            Paint paint2 = shapeDrawable2.getPaint();
            paint2.setAntiAlias(true);
            paint2.setStrokeWidth(f);
            paint2.setStyle(Paint.Style.STROKE);
            shapeDrawable2.setShaderFactory(new a(a4, f3, rgb, f2, a3));
            colorDrawable = shapeDrawable2;
        }
        drawableArr[1] = colorDrawable;
        LayerDrawable layerDrawable = (alpha == 255 || !this.e2) ? new LayerDrawable(drawableArr) : new a(alpha, drawableArr);
        int i2 = (int) (f / 2.0f);
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        return layerDrawable;
    }

    public final int f(int i) {
        return Color.argb(Color.alpha(i) / 2, Color.red(i), Color.green(i), Color.blue(i));
    }

    public int getColorDisabled() {
        return this.q;
    }

    public int getColorNormal() {
        return this.c;
    }

    public int getColorPressed() {
        return this.d;
    }

    public Drawable getIconDrawable() {
        Drawable drawable = this.Y1;
        if (drawable != null) {
            return drawable;
        }
        if (this.y != 0) {
            return getResources().getDrawable(this.y);
        }
        return new ColorDrawable(0);
    }

    public TextView getLabelView() {
        return (TextView) getTag(R.id.instabug_fab_label);
    }

    public int getSize() {
        return this.Z1;
    }

    public String getTitle() {
        return this.x;
    }

    public void onMeasure(int i, int i2) {
        int i3 = this.d2;
        setMeasuredDimension(i3, i3);
    }

    public void setColorDisabled(int i) {
        if (this.q != i) {
            this.q = i;
            b();
        }
    }

    public void setColorDisabledResId(int i) {
        setColorDisabled(getResources().getColor(i));
    }

    public void setColorNormal(int i) {
        if (this.c != i) {
            this.c = i;
            b();
        }
    }

    public void setColorNormalResId(int i) {
        setColorNormal(getResources().getColor(i));
    }

    public void setColorPressed(int i) {
        if (this.d != i) {
            this.d = i;
            b();
        }
    }

    public void setColorPressedResId(int i) {
        setColorPressed(getResources().getColor(i));
    }

    public void setIcon(int i) {
        if (this.y != i) {
            this.y = i;
            this.Y1 = null;
            b();
        }
    }

    public void setIconDrawable(Drawable drawable) {
        if (this.Y1 != drawable) {
            this.y = 0;
            this.Y1 = drawable;
            b();
        }
    }

    public void setSize(int i) {
        if (i != 1 && i != 0) {
            throw new IllegalArgumentException("Use @FAB_SIZE constants only!");
        } else if (this.Z1 != i) {
            this.Z1 = i;
            float d3 = d(i == 0 ? R.dimen.instabug_fab_size_normal : R.dimen.instabug_fab_size_mini);
            this.a2 = d3;
            this.d2 = (int) ((this.b2 * 2.0f) + d3);
            b();
        }
    }

    public void setStrokeVisible(boolean z) {
        if (this.e2 != z) {
            this.e2 = z;
            b();
        }
    }

    public void setTitle(String str) {
        this.x = str;
        TextView labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(str);
        }
    }

    public void setVisibility(int i) {
        TextView labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(i);
        }
        super.setVisibility(i);
    }
}
