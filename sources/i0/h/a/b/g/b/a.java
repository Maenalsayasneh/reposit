package i0.h.a.b.g.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import i0.h.a.b.a.a.b;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.i.c;
import i0.h.a.b.c.i.d;

public final class a extends d<b> {
    public final Bundle A;

    public a(Context context, Looper looper, c cVar, i0.h.a.b.a.a.c cVar2, c.a aVar, c.b bVar) {
        super(context, looper, 16, cVar, aVar, bVar);
        if (cVar2 == null) {
            this.A = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    public final int j() {
        return 12451000;
    }

    public final boolean n() {
        i0.h.a.b.c.i.c cVar = this.x;
        Account account = cVar.a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (cVar.d.get(b.c) != null) {
            throw null;
        } else if (!cVar.b.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof b) {
            return (b) queryLocalInterface;
        }
        return new c(iBinder);
    }

    public final Bundle s() {
        return this.A;
    }

    public final String v() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String w() {
        return "com.google.android.gms.auth.service.START";
    }
}
