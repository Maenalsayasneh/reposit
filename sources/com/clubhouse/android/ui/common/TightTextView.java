package com.clubhouse.android.ui.common;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import m0.j.o;
import m0.n.b.i;
import m0.q.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/ui/common/TightTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "widthMeasureSpec", "heightMeasureSpec", "Lm0/i;", "onMeasure", "(II)V", "core-ui_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: TightTextView.kt */
public final class TightTextView extends AppCompatTextView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842884);
        i.e(context, "context");
        i.e(context, "context");
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int lineCount = getLayout().getLineCount();
        if (lineCount > 1) {
            e f = m0.q.i.f(0, lineCount);
            Layout layout = getLayout();
            i.d(layout, "layout");
            Iterator it = f.iterator();
            if (it.hasNext()) {
                o oVar = (o) it;
                float lineWidth = layout.getLineWidth(oVar.a());
                while (it.hasNext()) {
                    lineWidth = Math.max(lineWidth, layout.getLineWidth(oVar.a()));
                }
                int ceil = ((int) ((float) Math.ceil((double) lineWidth))) + getCompoundPaddingRight() + getCompoundPaddingLeft();
                if (ceil < getMeasuredWidth()) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(ceil, Integer.MIN_VALUE), i2);
                    return;
                }
                return;
            }
            throw new NoSuchElementException();
        }
    }
}
