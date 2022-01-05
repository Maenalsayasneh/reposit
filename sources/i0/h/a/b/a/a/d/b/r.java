package i0.h.a.b.a.a.d.b;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import h0.b0.v;
import i0.h.a.b.a.a.d.a;
import i0.h.a.b.c.f;
import i0.h.a.b.c.g.c;
import i0.h.a.b.c.g.e;
import i0.h.a.b.c.g.j.m;
import i0.h.a.b.c.i.a0;
import i0.h.a.b.c.i.l;
import i0.h.a.b.c.i.z;
import i0.h.a.b.g.a.b;
import i0.h.a.b.m.h;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public final class r extends b implements IInterface {
    public final Context a;

    public r(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.a = context;
    }

    public final boolean L(int i, Parcel parcel, Parcel parcel2, int i2) {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        if (i == 1) {
            d0();
            a a2 = a.a(this.a);
            GoogleSignInAccount b = a2.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.y;
            if (b != null) {
                googleSignInOptions = a2.c();
            }
            Context context = this.a;
            Objects.requireNonNull(googleSignInOptions, "null reference");
            a aVar = new a(context, googleSignInOptions);
            if (b != null) {
                c cVar = aVar.h;
                Context context2 = aVar.a;
                boolean z = aVar.d() == 3;
                f.a.a("Revoking access", new Object[0]);
                String g = a.a(context2).g("refreshToken");
                f.a(context2);
                if (z) {
                    i0.h.a.b.c.j.a aVar2 = c.c;
                    if (g == null) {
                        Status status = new Status(4, (String) null);
                        v.A(status, "Result must not be null");
                        v.u(!status.I0(), "Status code must not be SUCCESS");
                        basePendingResult2 = new e((c) null, status);
                        basePendingResult2.e(status);
                    } else {
                        c cVar2 = new c(g);
                        new Thread(cVar2).start();
                        basePendingResult2 = cVar2.q;
                    }
                } else {
                    basePendingResult2 = cVar.b(new k(cVar));
                }
                basePendingResult2.a(new z(basePendingResult2, new h(), new a0(), l.a));
            } else {
                c cVar3 = aVar.h;
                Context context3 = aVar.a;
                boolean z2 = aVar.d() == 3;
                f.a.a("Signing out", new Object[0]);
                f.a(context3);
                if (z2) {
                    Status status2 = Status.c;
                    v.A(status2, "Result must not be null");
                    basePendingResult = new m(cVar3);
                    basePendingResult.e(status2);
                } else {
                    basePendingResult = cVar3.b(new i(cVar3));
                }
                basePendingResult.a(new z(basePendingResult, new h(), new a0(), l.a));
            }
        } else if (i != 2) {
            return false;
        } else {
            d0();
            l.b(this.a).a();
        }
        return true;
    }

    public final void d0() {
        boolean z;
        Context context = this.a;
        int callingUid = Binder.getCallingUid();
        i0.h.a.b.c.n.a a2 = i0.h.a.b.c.n.b.a(context);
        Objects.requireNonNull(a2);
        boolean z2 = true;
        boolean z3 = false;
        try {
            AppOpsManager appOpsManager = (AppOpsManager) a2.a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(callingUid, "com.google.android.gms");
                z = z2;
                if (z) {
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                        f a3 = f.a(context);
                        Objects.requireNonNull(a3);
                        if (packageInfo != null) {
                            if (!f.c(packageInfo, false)) {
                                if (f.c(packageInfo, z2)) {
                                    Context context2 = a3.b;
                                    if (!i0.h.a.b.c.e.b) {
                                        try {
                                            PackageInfo packageInfo2 = i0.h.a.b.c.n.b.a(context2).a.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                            f.a(context2);
                                            if (packageInfo2 == null || f.c(packageInfo2, false) || !f.c(packageInfo2, z2)) {
                                                i0.h.a.b.c.e.a = false;
                                            } else {
                                                i0.h.a.b.c.e.a = z2;
                                            }
                                        } catch (PackageManager.NameNotFoundException e) {
                                            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                                        } finally {
                                            i0.h.a.b.c.e.b = z2;
                                        }
                                    }
                                    if (!((i0.h.a.b.c.e.a || !"user".equals(Build.TYPE)) ? z2 : false)) {
                                        Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                    }
                                }
                            }
                            z3 = z2;
                        }
                        z2 = false;
                        z3 = z2;
                    } catch (PackageManager.NameNotFoundException unused) {
                        if (Log.isLoggable("UidVerifier", 3)) {
                            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                        }
                    }
                }
                if (!z3) {
                    int callingUid2 = Binder.getCallingUid();
                    StringBuilder sb = new StringBuilder(52);
                    sb.append("Calling UID ");
                    sb.append(callingUid2);
                    sb.append(" is not Google Play services.");
                    throw new SecurityException(sb.toString());
                }
                return;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused2) {
            z = false;
        }
    }
}
