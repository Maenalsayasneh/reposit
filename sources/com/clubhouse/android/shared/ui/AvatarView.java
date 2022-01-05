package com.clubhouse.android.shared.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.clubhouse.android.core.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.i.b.d.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 12\u00020\u0001:\u00012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0018\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010$\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00198Æ\u0002@Æ\u0002X\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010\rR\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010\u0011R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00063"}, d2 = {"Lcom/clubhouse/android/shared/ui/AvatarView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/graphics/Canvas;", "canvas", "Lm0/i;", "onDraw", "(Landroid/graphics/Canvas;)V", "", "a2", "F", "avatarBorderStrokeWidth", "Landroid/text/TextPaint;", "q", "Landroid/text/TextPaint;", "borderPaint", "", "Y1", "I", "avatarBackgroundColor", "b2", "getSquareness", "()F", "setSquareness", "(F)V", "squareness", "", "value", "c2", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "getName", "setName", "name", "x", "textPaint", "Landroid/graphics/Rect;", "y", "Landroid/graphics/Rect;", "textRect", "Z1", "avatarBorderColor", "Landroid/graphics/Paint;", "d", "Landroid/graphics/Paint;", "backgroundPaint", "c", "a", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: AvatarView.kt */
public final class AvatarView extends AppCompatImageView {
    public static final a c = new a((f) null);
    public int Y1;
    public int Z1;
    public float a2;
    public float b2;
    public String c2;
    public final Paint d;
    public final TextPaint q;
    public final TextPaint x;
    public final Rect y = new Rect();

    /* compiled from: AvatarView.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final String a(String str) {
            String str2;
            String obj;
            Character ch = null;
            List D = (str == null || (obj = StringsKt__IndentKt.X(str).toString()) == null) ? null : StringsKt__IndentKt.D(obj, new char[]{' '}, false, 0, 6);
            String str3 = "";
            if (D == null) {
                return str3;
            }
            String str4 = (String) g.w(D);
            if (str4 != null) {
                Character u1 = m0.r.t.a.r.m.a1.a.u1(str4);
                str3 = i.k(str3, u1 == null ? null : Character.valueOf(Character.toUpperCase(u1.charValue())));
            }
            if (D.size() <= 1 || (str2 = (String) g.I(D)) == null) {
                return str3;
            }
            Character u12 = m0.r.t.a.r.m.a1.a.u1(str2);
            if (u12 != null) {
                ch = Character.valueOf(Character.toUpperCase(u12.charValue()));
            }
            return i.k(str3, ch);
        }

        public final Path b(float f, float f2, float f3, float f4) {
            float f5 = f4;
            float f6 = (float) 2;
            float f7 = f / f6;
            float f8 = f2 / f6;
            float f9 = f7 * f3;
            float f10 = f8 * f3;
            float f11 = f - f5;
            float f12 = f2 - f5;
            PointF pointF = new PointF(f7, f5);
            PointF pointF2 = new PointF(f11, f8);
            PointF pointF3 = new PointF(f7, f12);
            PointF pointF4 = new PointF(f5, f8);
            float f13 = f8 - f10;
            float f14 = f7 + f9;
            float f15 = f8 + f10;
            float f16 = f7 - f9;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            path.cubicTo(f14, f4, f11, f13, pointF2.x, pointF2.y);
            Path path2 = path;
            PointF pointF5 = pointF4;
            path.cubicTo(f11, f15, f14, f12, pointF3.x, pointF3.y);
            Path path3 = path2;
            PointF pointF6 = pointF;
            path3.cubicTo(f16, f12, f4, f15, pointF5.x, pointF5.y);
            path3.cubicTo(f4, f13, f16, f4, pointF6.x, pointF6.y);
            path2.close();
            return path2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        Paint paint = new Paint(1);
        this.d = paint;
        TextPaint textPaint = new TextPaint(1);
        this.q = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.x = textPaint2;
        int i = R.color.clubhouse_gray_wash;
        this.Y1 = h0.i.b.a.getColor(context, i);
        this.Z1 = h0.i.b.a.getColor(context, R.color.clubhouse_dark_gray);
        this.a2 = 0.3f;
        this.b2 = 0.68f;
        this.c2 = "";
        isInEditMode();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.AvatarView);
        i.d(obtainStyledAttributes, "context.obtainStyledAttributes(attrs,\n            R.styleable.AvatarView\n        )");
        this.Y1 = h0.i.b.a.getColor(context, obtainStyledAttributes.getResourceId(R.styleable.AvatarView_backgroundColorResourceId, i));
        this.Z1 = getResources().getColor(obtainStyledAttributes.getResourceId(R.styleable.AvatarView_borderColorResourceId, R.color.clubhouse_eggshell));
        obtainStyledAttributes.recycle();
        paint.setColor(this.Y1);
        paint.setStyle(Paint.Style.FILL);
        textPaint.setColor(this.Z1);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.a2);
        textPaint2.setTypeface(h.a(context, R.font.nunito_semi_bold));
        textPaint2.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint2.setStrokeWidth(0.3f);
    }

    public final String getName() {
        return getText();
    }

    public final float getSquareness() {
        return this.b2;
    }

    public final String getText() {
        return this.c2;
    }

    public void onDraw(Canvas canvas) {
        i.e(canvas, "canvas");
        Path b = c.b((float) getWidth(), (float) getHeight(), this.b2, 0.0f);
        canvas.drawPath(b, this.d);
        canvas.drawPath(b, this.q);
        canvas.clipPath(b);
        if (getDrawable() == null) {
            this.x.setTextAlign(Paint.Align.CENTER);
            this.x.setColor(h0.i.b.a.getColor(getContext(), R.color.clubhouse_dark_gray));
            this.x.setTextSize((float) (((double) getWidth()) * 0.4d));
            TextPaint textPaint = this.x;
            String str = this.c2;
            textPaint.getTextBounds(str, 0, str.length(), this.y);
            if (((float) this.y.width()) > ((float) (((double) getWidth()) * 0.8d))) {
                this.x.setTextSize((float) (((double) getWidth()) * 0.3d));
            }
            canvas.drawText(this.c2, ((float) getWidth()) / 2.0f, (((float) getHeight()) / 2.0f) - ((this.x.ascent() + this.x.descent()) / 2.0f), this.x);
        }
        super.onDraw(canvas);
    }

    public final void setName(String str) {
        setText(c.a(str));
    }

    public final void setSquareness(float f) {
        this.b2 = f;
    }

    public final void setText(String str) {
        i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.c2 = str;
        invalidate();
    }
}
