package u0.a.a;

import androidx.recyclerview.widget.RecyclerView;
import ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* compiled from: RecyclerViewAttacher */
public class b extends RecyclerView.s {
    public final /* synthetic */ ScrollingPagerIndicator a;
    public final /* synthetic */ c b;

    public b(c cVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.b = cVar;
        this.a = scrollingPagerIndicator;
    }

    public void a(RecyclerView recyclerView, int i) {
        int a2;
        if (i == 0) {
            if ((this.b.a() != -1) && (a2 = this.b.a()) != -1) {
                this.a.setDotCount(this.b.d.getItemCount());
                if (a2 < this.b.d.getItemCount()) {
                    this.a.setCurrentPosition(a2);
                }
            }
        }
    }

    public void c(RecyclerView recyclerView, int i, int i2) {
        this.b.f();
    }
}
