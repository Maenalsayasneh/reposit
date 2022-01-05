package com.clubhouse.android.ui.hallway.feed;

import i0.e.b.b3.a.a.d.a.a;
import i0.e.b.b3.a.a.d.a.e;
import i0.e.b.g3.p.c0.v;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: FeedFragment.kt */
public final class FeedFragment$showHideOption$1$1 extends Lambda implements l<v, i> {
    public final /* synthetic */ String c;
    public final /* synthetic */ FeedFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedFragment$showHideOption$1$1(String str, FeedFragment feedFragment) {
        super(1);
        this.c = str;
        this.d = feedFragment;
    }

    public Object invoke(Object obj) {
        e eVar;
        Object obj2;
        boolean z;
        v vVar = (v) obj;
        m0.n.b.i.e(vVar, "state");
        String str = this.c;
        List a = vVar.a.a();
        if (a == null) {
            eVar = null;
        } else {
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                e eVar2 = (e) obj2;
                if (!(eVar2 instanceof a) || !m0.n.b.i.a(((a) eVar2).a.a2, str)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            eVar = (e) obj2;
        }
        a aVar = (a) eVar;
        if (aVar == null) {
            return null;
        }
        this.d.R0(aVar.a);
        return i.a;
    }
}
