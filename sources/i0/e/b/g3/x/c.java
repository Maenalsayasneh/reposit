package i0.e.b.g3.x;

import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.ui.selection.Selection;
import com.clubhouse.android.ui.selection.SelectionFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ SelectionFragment c;
    public final /* synthetic */ Selection d;

    public /* synthetic */ c(SelectionFragment selectionFragment, Selection selection) {
        this.c = selectionFragment;
        this.d = selection;
    }

    public final void onClick(View view) {
        SelectionFragment selectionFragment = this.c;
        Selection selection = this.d;
        i.e(selectionFragment, "this$0");
        i.e(selection, "$item");
        k<Object>[] kVarArr = SelectionFragment.Z1;
        selectionFragment.O0().p(new d(selection));
        ConstraintLayout constraintLayout = selectionFragment.N0().c;
        b bVar = new b(selectionFragment, selection);
        Resources resources = selectionFragment.getResources();
        i.d(resources, "resources");
        i.e(resources, "<this>");
        constraintLayout.postDelayed(bVar, ((long) resources.getInteger(17694720)) / ((long) 2));
    }
}
