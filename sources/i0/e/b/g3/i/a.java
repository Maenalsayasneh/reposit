package i0.e.b.g3.i;

import android.view.View;
import com.clubhouse.android.ui.actionsheet.ActionSheetFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ ActionSheetFragment c;
    public final /* synthetic */ c d;
    public final /* synthetic */ View q;

    public /* synthetic */ a(ActionSheetFragment actionSheetFragment, c cVar, View view) {
        this.c = actionSheetFragment;
        this.d = cVar;
        this.q = view;
    }

    public final void onClick(View view) {
        ActionSheetFragment actionSheetFragment = this.c;
        c cVar = this.d;
        View view2 = this.q;
        i.e(actionSheetFragment, "this$0");
        i.e(cVar, "$action");
        i.e(view2, "$view");
        k<Object>[] kVarArr = ActionSheetFragment.p2;
        actionSheetFragment.V0().p(new i(cVar));
        cVar.g.invoke();
        view2.postDelayed(new b(actionSheetFragment), 200);
    }
}
