package i0.e.c.i;

import android.view.View;
import com.clubhouse.android.user.model.User;
import com.clubhouse.backchannel.members.BackchannelAddMemberFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ BackchannelAddMemberFragment c;
    public final /* synthetic */ i0.e.b.a3.d.a d;

    public /* synthetic */ a(BackchannelAddMemberFragment backchannelAddMemberFragment, i0.e.b.a3.d.a aVar) {
        this.c = backchannelAddMemberFragment;
        this.d = aVar;
    }

    public final void onClick(View view) {
        BackchannelAddMemberFragment backchannelAddMemberFragment = this.c;
        i0.e.b.a3.d.a aVar = this.d;
        i.e(backchannelAddMemberFragment, "this$0");
        i.e(aVar, "$user");
        k<Object>[] kVarArr = BackchannelAddMemberFragment.p2;
        backchannelAddMemberFragment.V0().p(new l(((User) aVar.a).getId().intValue()));
    }
}
