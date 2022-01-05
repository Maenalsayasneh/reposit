package i0.h.a.b.k.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.internal.zak;
import h0.b0.v;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.g.j.d0;
import i0.h.a.b.c.g.j.e0;
import i0.h.a.b.c.i.b;
import i0.h.a.b.c.i.c;
import i0.h.a.b.c.i.d;
import i0.h.a.b.k.g;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class a extends d<g> implements g {
    public final boolean A;
    public final c B;
    public final Bundle C;
    public final Integer D;

    public a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, boolean z, @RecentlyNonNull c cVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull c.a aVar, @RecentlyNonNull c.b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.A = z;
        this.B = cVar;
        this.C = bundle;
        this.D = cVar.i;
    }

    public int j() {
        return 12451000;
    }

    public final void m(e eVar) {
        v.A(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.B.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = i0.h.a.b.a.a.d.b.a.a(this.d).b();
            }
            Integer num = this.D;
            Objects.requireNonNull(num, "null reference");
            ((g) u()).Z(new zaj(new zat(account, num.intValue(), googleSignInAccount)), eVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                d0 d0Var = (d0) eVar;
                d0Var.c.post(new e0(d0Var, new zak()));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public boolean n() {
        return this.A;
    }

    public final void o() {
        b.d dVar = new b.d();
        v.A(dVar, "Connection progress callbacks cannot be null.");
        this.j = dVar;
        y(2, null);
    }

    @RecentlyNonNull
    public /* synthetic */ IInterface p(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof g) {
            return (g) queryLocalInterface;
        }
        return new f(iBinder);
    }

    @RecentlyNonNull
    public Bundle s() {
        if (!this.d.getPackageName().equals(this.B.f)) {
            this.C.putString("com.google.android.gms.signin.internal.realClientPackageName", this.B.f);
        }
        return this.C;
    }

    @RecentlyNonNull
    public String v() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @RecentlyNonNull
    public String w() {
        return "com.google.android.gms.signin.service.START";
    }
}
