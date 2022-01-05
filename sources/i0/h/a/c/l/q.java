package i0.h.a.c.l;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h0.v.a.p;

/* compiled from: SmoothCalendarLayoutManager */
public class q extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager */
    public class a extends p {
        public a(q qVar, Context context) {
            super(context);
        }

        public float f(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public q(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.a = i;
        startSmoothScroll(aVar);
    }
}
