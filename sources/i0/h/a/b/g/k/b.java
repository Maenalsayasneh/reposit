package i0.h.a.b.g.k;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.i.c;
import i0.h.a.b.c.i.d;
import i0.h.a.b.n.s;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class b extends d<k> {
    public final Context A;
    public final int B;
    public final String C;
    public final int D;
    public final boolean E;

    public b(Context context, Looper looper, c cVar, c.a aVar, c.b bVar, int i, int i2, boolean z) {
        super(context, looper, 4, cVar, aVar, bVar);
        this.A = context;
        this.B = i;
        Account account = cVar.a;
        this.C = account != null ? account.name : null;
        this.D = i2;
        this.E = z;
    }

    public final Bundle C() {
        int i = this.B;
        String packageName = this.A.getPackageName();
        String str = this.C;
        int i2 = this.D;
        boolean z = this.E;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString("androidPackageName", packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }

    public final int j() {
        return 12600000;
    }

    public final /* bridge */ /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        if (queryLocalInterface instanceof k) {
            return (k) queryLocalInterface;
        }
        return new k(iBinder);
    }

    public final Feature[] r() {
        return s.g;
    }

    public final String v() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    public final String w() {
        return "com.google.android.gms.wallet.service.BIND";
    }
}
