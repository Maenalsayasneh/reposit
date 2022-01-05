package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepName;
import i0.h.a.b.c.b;
import i0.h.a.b.c.g.j.f;
import java.util.Objects;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final /* synthetic */ int c = 0;
    public int d = 0;

    public void onActivityResult(int i, int i2, @RecentlyNonNull Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.d = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                f a = f.a(this);
                if (i2 == -1) {
                    Handler handler = a.q;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    ConnectionResult connectionResult = new ConnectionResult(13, (PendingIntent) null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!a.b(connectionResult, intExtra)) {
                        Handler handler2 = a.q;
                        handler2.sendMessage(handler2.obtainMessage(5, intExtra, 0, connectionResult));
                    }
                }
            }
        } else if (i == 2) {
            this.d = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        this.d = 0;
        setResult(0);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.d = bundle.getInt("resolution");
        }
        if (this.d != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.d = 1;
                } catch (ActivityNotFoundException e) {
                    if (extras.getBoolean("notify_manager", true)) {
                        f a = f.a(this);
                        ConnectionResult connectionResult = new ConnectionResult(22, (PendingIntent) null);
                        int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                        if (!a.b(connectionResult, intExtra)) {
                            Handler handler = a.q;
                            handler.sendMessage(handler.obtainMessage(5, intExtra, 0, connectionResult));
                        }
                    } else {
                        String valueOf = String.valueOf(pendingIntent);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                        sb.append("Activity not found while launching ");
                        sb.append(valueOf);
                        sb.append(".");
                        String sb2 = sb.toString();
                        if (Build.FINGERPRINT.contains("generic")) {
                            sb2 = String.valueOf(sb2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", sb2, e);
                    }
                    this.d = 1;
                    finish();
                } catch (IntentSender.SendIntentException e2) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                    finish();
                }
            } else {
                Objects.requireNonNull(num, "null reference");
                int intValue = num.intValue();
                Object obj = b.b;
                b.c.d(this, intValue, 2, this);
                this.d = 1;
            }
        }
    }

    public void onSaveInstanceState(@RecentlyNonNull Bundle bundle) {
        bundle.putInt("resolution", this.d);
        super.onSaveInstanceState(bundle);
    }
}
