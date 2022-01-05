package i0.e.c.i;

import android.view.View;
import com.clubhouse.backchannel.members.BackchannelAddMemberFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ BackchannelAddMemberFragment c;

    public /* synthetic */ b(BackchannelAddMemberFragment backchannelAddMemberFragment) {
        this.c = backchannelAddMemberFragment;
    }

    public final void onClick(View view) {
        BackchannelAddMemberFragment backchannelAddMemberFragment = this.c;
        k<Object>[] kVarArr = BackchannelAddMemberFragment.p2;
        i.e(backchannelAddMemberFragment, "this$0");
        backchannelAddMemberFragment.dismiss();
    }
}
