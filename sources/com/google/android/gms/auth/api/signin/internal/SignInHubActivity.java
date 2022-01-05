package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import h0.o.a.k;
import h0.r.a.a;
import h0.r.a.b;
import i0.h.a.b.a.a.d.b.e;
import i0.h.a.b.a.a.d.b.l;
import i0.h.a.b.a.a.d.b.t;
import i0.h.a.b.c.g.c;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;

@KeepName
/* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
public class SignInHubActivity extends k {
    public static boolean c = false;
    public Intent Y1;
    public boolean d = false;
    public SignInConfiguration q;
    public boolean x;
    public int y;

    /* compiled from: com.google.android.gms:play-services-auth@@18.0.0 */
    public class a implements a.C0061a<Void> {
        public a(t tVar) {
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (!this.d) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && (googleSignInAccount = signInAccount.d) != null) {
                        l b = l.b(this);
                        GoogleSignInOptions googleSignInOptions = this.q.d;
                        synchronized (b) {
                            b.b.d(googleSignInAccount, googleSignInOptions);
                        }
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", googleSignInAccount);
                        this.x = true;
                        this.y = i2;
                        this.Y1 = intent;
                        t0();
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        q0(intExtra);
                        return;
                    }
                }
                q0(8);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        Objects.requireNonNull(action);
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            q0(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            Objects.requireNonNull(bundleExtra);
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.q = signInConfiguration;
            if (bundle != null) {
                boolean z = bundle.getBoolean("signingInGoogleApiClients");
                this.x = z;
                if (z) {
                    this.y = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    Objects.requireNonNull(intent2);
                    this.Y1 = intent2;
                    t0();
                }
            } else if (c) {
                setResult(0);
                q0(12502);
            } else {
                c = true;
                Intent intent3 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent3.setPackage("com.google.android.gms");
                } else {
                    intent3.setPackage(getPackageName());
                }
                intent3.putExtra("config", this.q);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.d = true;
                    Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                    q0(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.x);
        if (this.x) {
            bundle.putInt("signInResultCode", this.y);
            bundle.putParcelable("signInResultData", this.Y1);
        }
    }

    public final void q0(int i) {
        Status status = new Status(i, (String) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        c = false;
    }

    public final void t0() {
        h0.r.a.a supportLoaderManager = getSupportLoaderManager();
        a aVar = new a((t) null);
        b bVar = (b) supportLoaderManager;
        if (bVar.b.c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            b.a f = bVar.b.b.f(0, null);
            if (f == null) {
                try {
                    bVar.b.c = true;
                    Set<c> set = c.a;
                    synchronized (set) {
                    }
                    e eVar = new e(this, set);
                    if (eVar.getClass().isMemberClass()) {
                        if (!Modifier.isStatic(eVar.getClass().getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + eVar);
                        }
                    }
                    b.a aVar2 = new b.a(0, (Bundle) null, eVar, (e) null);
                    bVar.b.b.h(0, aVar2);
                    bVar.b.c = false;
                    aVar2.c(bVar.a, aVar);
                } catch (Throwable th) {
                    bVar.b.c = false;
                    throw th;
                }
            } else {
                f.c(bVar.a, aVar);
            }
            c = false;
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }
}
