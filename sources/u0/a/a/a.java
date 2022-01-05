package u0.a.a;

import androidx.recyclerview.widget.RecyclerView;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* compiled from: RecyclerViewAttacher */
public class a extends RecyclerView.h {
    public final /* synthetic */ ScrollingPagerIndicator a;
    public final /* synthetic */ c b;

    public a(c cVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.b = cVar;
        this.a = scrollingPagerIndicator;
    }

    public void a() {
        this.a.setDotCount(this.b.d.getItemCount());
        this.b.f();
    }

    public void b(int i, int i2) {
        a();
    }

    public void c(int i, int i2, Object obj) {
        a();
    }

    public void d(int i, int i2) {
        a();
    }

    public void e(int i, int i2, int i3) {
        a();
    }

    public void f(int i, int i2) {
        a();
    }
}
