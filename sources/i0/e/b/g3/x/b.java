package i0.e.b.g3.x;

import com.clubhouse.android.ui.selection.Selection;
import com.clubhouse.android.ui.selection.SelectionFragment;
import com.clubhouse.android.ui.selection.SelectionFragment$handleSelection$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ SelectionFragment c;
    public final /* synthetic */ Selection d;

    public /* synthetic */ b(SelectionFragment selectionFragment, Selection selection) {
        this.c = selectionFragment;
        this.d = selection;
    }

    public final void run() {
        SelectionFragment selectionFragment = this.c;
        Selection selection = this.d;
        i.e(selectionFragment, "this$0");
        i.e(selection, "$item");
        k<Object>[] kVarArr = SelectionFragment.Z1;
        v.v2(selectionFragment.O0(), new SelectionFragment$handleSelection$1(selectionFragment, selection));
    }
}
