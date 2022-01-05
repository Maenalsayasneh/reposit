package com.clubhouse.backchannel.archive;

import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.backchannel.R;
import i0.e.b.g3.i.c;
import i0.e.c.f.b.a.a;
import i0.e.c.h.o;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelArchiveFragment.kt */
public final class BackchannelArchiveFragment$buildModels$1$1$1$1$2$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ BackchannelArchiveFragment c;
    public final /* synthetic */ a d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelArchiveFragment$buildModels$1$1$1$1$2$1(BackchannelArchiveFragment backchannelArchiveFragment, a aVar) {
        super(1);
        this.c = backchannelArchiveFragment;
        this.d = aVar;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        final BackchannelArchiveFragment backchannelArchiveFragment = this.c;
        final a aVar = this.d;
        actionSheetBuilder.a(new l<c, i>() {
            public Object invoke(Object obj) {
                c cVar = (c) obj;
                m0.n.b.i.e(cVar, "$this$action");
                String string = BackchannelArchiveFragment.this.getString(R.string.unarchive);
                m0.n.b.i.d(string, "getString(R.string.unarchive)");
                cVar.b(string);
                int i = R.color.clubhouse_blue;
                cVar.b = Integer.valueOf(i);
                cVar.a = Integer.valueOf(R.drawable.ic_unarchive);
                cVar.c = Integer.valueOf(i);
                final BackchannelArchiveFragment backchannelArchiveFragment = BackchannelArchiveFragment.this;
                final a aVar = aVar;
                cVar.a(new m0.n.a.a<i>() {
                    public Object invoke() {
                        ((BackchannelArchiveViewModel) BackchannelArchiveFragment.this.b2.getValue()).p(new o(aVar.a));
                        return i.a;
                    }
                });
                return i.a;
            }
        });
        return i.a;
    }
}
