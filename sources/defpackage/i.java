package defpackage;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import i0.e.b.b3.a.a.c.a;
import i0.e.b.b3.a.a.c.d;
import i0.e.b.z2.g.k;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;

/* renamed from: i  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class i extends Lambda implements l<k, k> {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(int i, int i2) {
        super(1);
        this.c = i;
        this.d = i2;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            k kVar = (k) obj;
            k kVar2 = kVar;
            m0.n.b.i.e(kVar, "$this$setState");
            d dVar = kVar.e;
            return k.copy$default(kVar2, (String) null, (Channel) null, (SourceLocation) null, (a) null, d.a(dVar, (Set) null, (Set) null, g.T(dVar.c, Integer.valueOf(this.d)), 3), false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131055, (Object) null);
        } else if (i == 1) {
            k kVar3 = (k) obj;
            m0.n.b.i.e(kVar3, "$this$setState");
            return k.copy$default(kVar3, (String) null, (Channel) null, (SourceLocation) null, (a) null, kVar3.e.b(this.d), false, false, false, false, (HandraisePermission) null, (ClipsPermission) null, (List) null, false, 0, false, false, false, 131055, (Object) null);
        } else {
            throw null;
        }
    }
}
