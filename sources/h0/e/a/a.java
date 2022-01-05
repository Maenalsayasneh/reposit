package h0.e.a;

import android.graphics.Rect;
import androidx.cardview.widget.CardView;

/* compiled from: CardViewApi21Impl */
public class a implements c {
    public final d a(b bVar) {
        return (d) ((CardView.a) bVar).a;
    }

    public void b(b bVar, float f) {
        d a = a(bVar);
        CardView.a aVar = (CardView.a) bVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean a2 = aVar.a();
        if (!(f == a.e && a.f == useCompatPadding && a.g == a2)) {
            a.e = f;
            a.f = useCompatPadding;
            a.g = a2;
            a.c((Rect) null);
            a.invalidateSelf();
        }
        c(bVar);
    }

    public void c(b bVar) {
        CardView.a aVar = (CardView.a) bVar;
        if (!CardView.this.getUseCompatPadding()) {
            aVar.b(0, 0, 0, 0);
            return;
        }
        float f = a(bVar).e;
        float f2 = a(bVar).a;
        int ceil = (int) Math.ceil((double) e.a(f, f2, aVar.a()));
        int ceil2 = (int) Math.ceil((double) e.b(f, f2, aVar.a()));
        aVar.b(ceil, ceil2, ceil, ceil2);
    }
}
