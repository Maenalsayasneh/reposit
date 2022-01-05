package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.R;
import h0.i.i.q;
import i0.h.a.c.l.b;
import i0.h.a.c.l.j;
import i0.h.a.c.l.m;
import i0.h.a.c.l.s;
import java.util.Calendar;

public final class MaterialCalendarGridView extends GridView {
    public final Calendar c = s.e();
    public final boolean d;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (MaterialDatePicker.R0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.d = MaterialDatePicker.S0(getContext(), R.attr.nestedScrollable);
        q.p(this, new j(this));
    }

    /* renamed from: a */
    public m getAdapter() {
        return (m) super.getAdapter();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        m a = getAdapter();
        DateSelector<?> dateSelector = a.q;
        b bVar = a.y;
        Long c2 = a.getItem(a.b());
        Long c3 = a.getItem(a.d());
        for (h0.i.h.b next : dateSelector.n()) {
            F f = next.a;
            if (f != null) {
                if (next.b != null) {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.b).longValue();
                    Long valueOf = Long.valueOf(longValue);
                    Long valueOf2 = Long.valueOf(longValue2);
                    boolean z = true;
                    if (!(c2 == null || c3 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > c3.longValue() || valueOf2.longValue() < c2.longValue())) {
                        boolean X = i0.h.a.b.c.m.b.X(this);
                        if (longValue < c2.longValue()) {
                            i2 = a.b();
                            if (i2 % a.d.x == 0) {
                                i = 0;
                            } else if (!X) {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getLeft();
                            }
                        } else {
                            materialCalendarGridView.c.setTimeInMillis(longValue);
                            i2 = a.a(materialCalendarGridView.c.get(5));
                            View childAt = materialCalendarGridView.getChildAt(i2);
                            i = (childAt.getWidth() / 2) + childAt.getLeft();
                        }
                        if (longValue2 > c3.longValue()) {
                            i4 = Math.min(a.d(), getChildCount() - 1);
                            if ((i4 + 1) % a.d.x != 0) {
                                z = false;
                            }
                            if (z) {
                                i3 = getWidth();
                            } else if (!X) {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getLeft();
                            }
                        } else {
                            materialCalendarGridView.c.setTimeInMillis(longValue2);
                            i4 = a.a(materialCalendarGridView.c.get(5));
                            View childAt2 = materialCalendarGridView.getChildAt(i4);
                            i3 = (childAt2.getWidth() / 2) + childAt2.getLeft();
                        }
                        int itemId = (int) a.getItemId(i2);
                        int itemId2 = (int) a.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt3 = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt3.getTop() + bVar.a.a.top;
                            int bottom = childAt3.getBottom() - bVar.a.a.bottom;
                            if (!X) {
                                i6 = numColumns > i2 ? 0 : i;
                                i5 = i4 > numColumns2 ? getWidth() : i3;
                            } else {
                                int i7 = i4 > numColumns2 ? 0 : i3;
                                i5 = numColumns > i2 ? getWidth() : i;
                                i6 = i7;
                            }
                            canvas.drawRect((float) i6, (float) top, (float) i5, (float) bottom, bVar.h);
                            itemId++;
                            materialCalendarGridView = this;
                            a = a;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
            a = a;
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(getAdapter().d());
        } else if (i == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (this.d) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setSelection(int i) {
        if (i < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i);
        }
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof m) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()}));
        }
    }
}
