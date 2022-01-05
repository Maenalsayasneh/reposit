package com.afollestad.assent.rationale;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import com.afollestad.assent.AssentResult;
import com.afollestad.assent.GrantResult;
import com.afollestad.assent.Permission;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import h0.q.p;
import i0.a.a.c;
import i0.j.f.p.h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.r;
import m0.n.b.m;
import m0.o.a;
import m0.o.d;
import m0.r.k;

/* compiled from: RationaleHandler.kt */
public abstract class RationaleHandler {
    public static final /* synthetic */ k[] a;
    public final Map<Permission, CharSequence> b = new LinkedHashMap();
    public final d c = new a();
    public final d d = new a();
    public final d e = new a();
    public final c f;
    public i0.a.a.f.d g;
    public AssentResult h;
    public AssentResult i;
    public Object j;
    public final Activity k;
    public final r<Permission[], Integer, RationaleHandler, l<? super AssentResult, i>, i> l;

    static {
        Class<RationaleHandler> cls = RationaleHandler.class;
        a = new k[]{m.b(new MutablePropertyReference1Impl(m.a(cls), "requestCode", "getRequestCode()I")), m.b(new MutablePropertyReference1Impl(m.a(cls), "callback", "getCallback()Lkotlin/jvm/functions/Function1;")), m.b(new MutablePropertyReference1Impl(m.a(cls), "remainingRationalePermissions", "getRemainingRationalePermissions()Ljava/util/Set;"))};
    }

    public RationaleHandler(Activity activity, r rVar, i0.a.a.f.d dVar, int i2) {
        int i3 = i2 & 4;
        m0.n.b.i.f(activity, "context");
        m0.n.b.i.f(rVar, "requester");
        this.k = activity;
        this.l = rVar;
        i0.a.a.d dVar2 = new i0.a.a.d(activity);
        this.f = dVar2;
        this.g = new i0.a.a.f.c(activity, dVar2);
        this.j = activity;
    }

    public final l<AssentResult, i> a() {
        return (l) this.d.getValue(this, a[1]);
    }

    public final Set<Permission> b() {
        return (Set) this.e.getValue(this, a[2]);
    }

    public abstract void c();

    public final void d() {
        Permission permission = (Permission) g.v(b());
        if (permission != null) {
            m0.n.b.i.f(this, "$this$log");
            m0.n.b.i.f("Showing rationale for permission %s", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            m0.n.b.i.f(new Object[]{permission}, "args");
            Object obj = this.j;
            Lifecycle.Event[] eventArr = {Lifecycle.Event.ON_DESTROY};
            RationaleHandler$requestRationalePermissions$1 rationaleHandler$requestRationalePermissions$1 = new RationaleHandler$requestRationalePermissions$1(this);
            m0.n.b.i.f(eventArr, "watchFor");
            m0.n.b.i.f(rationaleHandler$requestRationalePermissions$1, "onEvent");
            if (obj instanceof p) {
                new com.afollestad.assent.internal.Lifecycle((p) obj, eventArr, rationaleHandler$requestRationalePermissions$1);
            }
            if (this.g.b(permission)) {
                m0.n.b.i.f(this, "$this$log");
                m0.n.b.i.f("Permission %s is permanently denied.", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                m0.n.b.i.f(new Object[]{permission}, "args");
                this.i = v.p1(this.i, new AssentResult(h.S2(new Pair(permission, GrantResult.PERMANENTLY_DENIED))));
                b().remove(permission);
                d();
                return;
            }
            CharSequence charSequence = this.b.get(permission);
            if (charSequence != null) {
                e(permission, charSequence, new i0.a.a.f.a(new RationaleHandler$requestRationalePermissions$2(this, permission)));
                return;
            }
            throw new IllegalStateException(("No message provided for " + permission).toString());
        }
        m0.n.b.i.f(this, "$this$log");
        m0.n.b.i.f("finish()", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        m0.n.b.i.f(new Object[0], "args");
        AssentResult assentResult = this.h;
        AssentResult assentResult2 = this.i;
        if (assentResult != null && assentResult2 != null) {
            a().invoke(v.p1(assentResult, assentResult2));
        } else if (assentResult != null) {
            a().invoke(assentResult);
        } else if (assentResult2 != null) {
            a().invoke(assentResult2);
        }
    }

    public abstract void e(Permission permission, CharSequence charSequence, i0.a.a.f.a aVar);
}
