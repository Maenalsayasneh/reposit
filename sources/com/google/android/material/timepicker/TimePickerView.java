package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import h0.g.c.c;
import h0.i.i.q;
import i0.h.a.c.b0.k;
import i0.h.a.c.b0.l;
import i0.h.a.c.b0.m;
import java.util.concurrent.atomic.AtomicInteger;

public class TimePickerView extends ConstraintLayout {
    public final Chip n2;
    public final Chip o2;
    public final ClockHandView p2;
    public final ClockFaceView q2 = ((ClockFaceView) findViewById(R.id.material_clock_face));
    public final MaterialButtonToggleGroup r2;
    public final View.OnClickListener s2;
    public c t2;
    public d u2;
    public b v2;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            d dVar = TimePickerView.this.u2;
            if (dVar != null) {
                dVar.c(((Integer) view.getTag(R.id.selection_type)).intValue());
            }
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
        void c(int i);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.s2 = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.r2 = materialButtonToggleGroup;
        materialButtonToggleGroup.Y1.add(new k(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.n2 = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.o2 = chip2;
        this.p2 = (ClockHandView) findViewById(R.id.material_clock_hand);
        m mVar = new m(this, new GestureDetector(getContext(), new l(this)));
        chip.setOnTouchListener(mVar);
        chip2.setOnTouchListener(mVar);
        int i = R.id.selection_type;
        chip.setTag(i, 12);
        chip2.setTag(i, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            t();
        }
    }

    public final void t() {
        c.a aVar;
        if (this.r2.getVisibility() == 0) {
            h0.g.c.c cVar = new h0.g.c.c();
            cVar.e(this);
            AtomicInteger atomicInteger = q.a;
            char c2 = getLayoutDirection() == 0 ? (char) 2 : 1;
            int i = R.id.material_clock_display;
            if (cVar.i.containsKey(Integer.valueOf(i)) && (aVar = cVar.i.get(Integer.valueOf(i))) != null) {
                switch (c2) {
                    case 1:
                        c.b bVar = aVar.e;
                        bVar.j = -1;
                        bVar.i = -1;
                        bVar.G = -1;
                        bVar.N = Integer.MIN_VALUE;
                        break;
                    case 2:
                        c.b bVar2 = aVar.e;
                        bVar2.l = -1;
                        bVar2.k = -1;
                        bVar2.H = -1;
                        bVar2.P = Integer.MIN_VALUE;
                        break;
                    case 3:
                        c.b bVar3 = aVar.e;
                        bVar3.n = -1;
                        bVar3.m = -1;
                        bVar3.I = 0;
                        bVar3.O = Integer.MIN_VALUE;
                        break;
                    case 4:
                        c.b bVar4 = aVar.e;
                        bVar4.o = -1;
                        bVar4.p = -1;
                        bVar4.J = 0;
                        bVar4.Q = Integer.MIN_VALUE;
                        break;
                    case 5:
                        c.b bVar5 = aVar.e;
                        bVar5.q = -1;
                        bVar5.r = -1;
                        bVar5.s = -1;
                        bVar5.M = 0;
                        bVar5.T = Integer.MIN_VALUE;
                        break;
                    case 6:
                        c.b bVar6 = aVar.e;
                        bVar6.t = -1;
                        bVar6.u = -1;
                        bVar6.L = 0;
                        bVar6.S = Integer.MIN_VALUE;
                        break;
                    case 7:
                        c.b bVar7 = aVar.e;
                        bVar7.v = -1;
                        bVar7.w = -1;
                        bVar7.K = 0;
                        bVar7.R = Integer.MIN_VALUE;
                        break;
                    case 8:
                        c.b bVar8 = aVar.e;
                        bVar8.C = -1.0f;
                        bVar8.B = -1;
                        bVar8.A = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            cVar.c(this, true);
            setConstraintSet((h0.g.c.c) null);
            requestLayout();
        }
    }
}
