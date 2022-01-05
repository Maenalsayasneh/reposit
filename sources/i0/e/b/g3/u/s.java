package i0.e.b.g3.u;

import android.view.View;
import com.clubhouse.android.ui.profile.HalfProfileFragment;
import i0.e.e.m.c;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ c c;
    public final /* synthetic */ HalfProfileFragment d;
    public final /* synthetic */ int q;
    public final /* synthetic */ String x;

    public /* synthetic */ s(c cVar, HalfProfileFragment halfProfileFragment, int i, String str) {
        this.c = cVar;
        this.d = halfProfileFragment;
        this.q = i;
        this.x = str;
    }

    public final void onClick(View view) {
        c cVar = this.c;
        HalfProfileFragment halfProfileFragment = this.d;
        int i = this.q;
        String str = this.x;
        HalfProfileFragment.b bVar = HalfProfileFragment.Z1;
        i.e(cVar, "$this_apply");
        i.e(halfProfileFragment, "this$0");
        i.e(str, "$waveId");
        cVar.a.d(cVar);
        halfProfileFragment.U0().p(new s3(i, str));
    }
}
