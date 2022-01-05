package com.clubhouse.android.ui.channels.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.i.b.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/clubhouse/android/ui/channels/views/IndicatorView;", "Landroid/view/View;", "", "w", "h", "oldw", "oldh", "Lm0/i;", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/text/TextPaint;", "c", "Landroid/text/TextPaint;", "ringPaint", "Landroid/graphics/Path;", "d", "Landroid/graphics/Path;", "squirclePath", "", "value", "q", "Z", "getShowRing", "()Z", "setShowRing", "(Z)V", "showRing", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: IndicatorView.kt */
public final class IndicatorView extends View {
    public final TextPaint c;
    public final Path d = new Path();
    public boolean q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.e(context, "context");
        i.e(context, "context");
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        textPaint.setColor(a.getColor(context, R.color.clubhouse_speaker_indicator));
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(getResources().getDimension(R.dimen.speaking_ring_stroke));
    }

    public final boolean getShowRing() {
        return this.q;
    }

    public void onDraw(Canvas canvas) {
        i.e(canvas, "canvas");
        if (this.q) {
            canvas.drawPath(this.d, this.c);
        }
        super.onDraw(canvas);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.d.set(AvatarView.c.b((float) getWidth(), (float) getHeight(), 0.66f, this.c.getStrokeWidth()));
    }

    public final void setShowRing(boolean z) {
        this.q = z;
        invalidate();
    }
}
