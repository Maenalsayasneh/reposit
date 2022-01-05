package h0.v.a;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SnapHelper */
public class a0 extends p {
    public final /* synthetic */ z q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0(z zVar, Context context) {
        super(context);
        this.q = zVar;
    }

    public void c(View view, RecyclerView.y yVar, RecyclerView.x.a aVar) {
        z zVar = this.q;
        RecyclerView recyclerView = zVar.a;
        if (recyclerView != null) {
            int[] b = zVar.b(recyclerView.getLayoutManager(), view);
            int i = b[0];
            int i2 = b[1];
            int g = g(Math.max(Math.abs(i), Math.abs(i2)));
            if (g > 0) {
                aVar.b(i, i2, g, this.j);
            }
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }
}
