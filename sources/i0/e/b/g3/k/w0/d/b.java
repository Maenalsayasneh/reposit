package i0.e.b.g3.k.w0.d;

import androidx.recyclerview.widget.GridLayoutManager;
import com.clubhouse.android.ui.channels.users.search.SearchInRoomFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ SearchInRoomFragment c;

    public /* synthetic */ b(SearchInRoomFragment searchInRoomFragment) {
        this.c = searchInRoomFragment;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.clubhouse.android.shared.ui.AbstractUserFragment, java.lang.Object, com.clubhouse.android.ui.channels.users.search.SearchInRoomFragment, com.clubhouse.android.ui.channels.users.search.Hilt_SearchInRoomFragment] */
    public final void run() {
        ? r02 = this.c;
        k<Object>[] kVarArr = SearchInRoomFragment.r2;
        i.e(r02, "this$0");
        r02.S0().j.setLayoutManager(new GridLayoutManager(r02.getContext(), 12));
        r02.S0().j.requestLayout();
    }
}
