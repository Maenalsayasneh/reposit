package i0.h.a.c.l;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import h0.i.h.b;
import java.util.Calendar;

/* compiled from: MaterialCalendar */
public class d extends RecyclerView.m {
    public final Calendar a = s.e();
    public final Calendar b = s.e();
    public final /* synthetic */ MaterialCalendar c;

    public d(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        int i;
        int i2;
        if ((recyclerView.getAdapter() instanceof u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            u uVar = (u) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (b next : this.c.x.n()) {
                F f = next.a;
                if (!(f == null || next.b == null)) {
                    this.a.setTimeInMillis(((Long) f).longValue());
                    this.b.setTimeInMillis(((Long) next.b).longValue());
                    int b2 = uVar.b(this.a.get(1));
                    int b3 = uVar.b(this.b.get(1));
                    View findViewByPosition = gridLayoutManager.findViewByPosition(b2);
                    View findViewByPosition2 = gridLayoutManager.findViewByPosition(b3);
                    int i3 = gridLayoutManager.b;
                    int i4 = b2 / i3;
                    int i5 = b3 / i3;
                    for (int i6 = i4; i6 <= i5; i6++) {
                        View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.b * i6);
                        if (findViewByPosition3 != null) {
                            int top = findViewByPosition3.getTop() + this.c.a2.d.a.top;
                            int bottom = findViewByPosition3.getBottom() - this.c.a2.d.a.bottom;
                            if (i6 == i4) {
                                i = (findViewByPosition.getWidth() / 2) + findViewByPosition.getLeft();
                            } else {
                                i = 0;
                            }
                            if (i6 == i5) {
                                i2 = (findViewByPosition2.getWidth() / 2) + findViewByPosition2.getLeft();
                            } else {
                                i2 = recyclerView.getWidth();
                            }
                            canvas.drawRect((float) i, (float) top, (float) i2, (float) bottom, this.c.a2.h);
                        }
                    }
                }
            }
        }
    }
}
