package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import h0.b0.v;
import i0.e.e.m.c;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class r implements View.OnClickListener {
    public final /* synthetic */ c c;
    public final /* synthetic */ HalfProfileFragment d;
    public final /* synthetic */ int q;

    public /* synthetic */ r(c cVar, HalfProfileFragment halfProfileFragment, int i) {
        this.c = cVar;
        this.d = halfProfileFragment;
        this.q = i;
    }

    public final void onClick(View view) {
        c cVar = this.c;
        HalfProfileFragment halfProfileFragment = this.d;
        int i = this.q;
        HalfProfileFragment.b bVar = HalfProfileFragment.Z1;
        i.e(cVar, "$this_apply");
        i.e(halfProfileFragment, "this$0");
        cVar.a.d(cVar);
        halfProfileFragment.P0();
        i.e(halfProfileFragment, "<this>");
        v.a2(halfProfileFragment, new CreateChatArgs(SourceLocation.PROFILE, Integer.valueOf(i)));
    }
}
