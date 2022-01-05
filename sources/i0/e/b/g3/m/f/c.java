package i0.e.b.g3.m.f;

import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* compiled from: PagingDataEpoxyControllerExtensions.kt */
public final class c extends RecyclerView.h {
    public final /* synthetic */ EpoxyRecyclerView a;

    public c(EpoxyRecyclerView epoxyRecyclerView) {
        this.a = epoxyRecyclerView;
    }

    public void d(int i, int i2) {
        if (i == 0) {
            this.a.scrollToPosition(0);
        }
    }
}
