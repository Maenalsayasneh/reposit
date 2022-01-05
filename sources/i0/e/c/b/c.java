package i0.e.c.b;

import android.view.View;
import com.clubhouse.backchannel.archive.BackchannelArchiveFragment;
import com.clubhouse.backchannel.archive.BackchannelArchiveFragment$buildModels$1$1$1$1$2$1;
import h0.b0.v;
import i0.e.c.f.b.a.a;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnLongClickListener {
    public final /* synthetic */ BackchannelArchiveFragment c;
    public final /* synthetic */ a d;

    public /* synthetic */ c(BackchannelArchiveFragment backchannelArchiveFragment, a aVar) {
        this.c = backchannelArchiveFragment;
        this.d = aVar;
    }

    public final boolean onLongClick(View view) {
        BackchannelArchiveFragment backchannelArchiveFragment = this.c;
        a aVar = this.d;
        i.e(backchannelArchiveFragment, "this$0");
        i.e(aVar, "$chat");
        v.e(backchannelArchiveFragment, new BackchannelArchiveFragment$buildModels$1$1$1$1$2$1(backchannelArchiveFragment, aVar));
        return true;
    }
}
