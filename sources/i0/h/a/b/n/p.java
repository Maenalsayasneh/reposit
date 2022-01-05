package i0.h.a.b.n;

import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import i0.h.a.b.m.g;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
public final class p extends Fragment {
    public static final /* synthetic */ int c = 0;
    public int d;
    public o<?> q;
    public boolean x;

    public final void a(g<? extends a> gVar) {
        if (!this.x) {
            int i = 1;
            this.x = true;
            Activity activity = getActivity();
            activity.getFragmentManager().beginTransaction().remove(this).commit();
            if (gVar != null) {
                int i2 = this.d;
                if (!activity.isFinishing()) {
                    Exception i3 = gVar.i();
                    if (i3 instanceof ResolvableApiException) {
                        try {
                            PendingIntent pendingIntent = ((ResolvableApiException) i3).c.c2;
                            if (pendingIntent == null) {
                                i = 0;
                            }
                            if (i != 0) {
                                Objects.requireNonNull(pendingIntent, "null reference");
                                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, (Intent) null, 0, 0, 0);
                            }
                        } catch (IntentSender.SendIntentException e) {
                            if (Log.isLoggable("AutoResolveHelper", 6)) {
                                Log.e("AutoResolveHelper", "Error starting pending intent!", e);
                            }
                        }
                    } else {
                        Intent intent = new Intent();
                        if (gVar.n()) {
                            ((a) gVar.j()).a(intent);
                            i = -1;
                        } else if (i3 instanceof ApiException) {
                            ApiException apiException = (ApiException) i3;
                            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(apiException.c.a2, apiException.getMessage(), (PendingIntent) null));
                        } else {
                            if (Log.isLoggable("AutoResolveHelper", 6)) {
                                Log.e("AutoResolveHelper", "Unexpected non API exception!", i3);
                            }
                            intent.putExtra("com.google.android.gms.common.api.AutoResolveHelper.status", new Status(8, "Unexpected non API exception when trying to deliver the task result to an activity!"));
                        }
                        b.a(activity, i2, i, intent);
                    }
                } else if (Log.isLoggable("AutoResolveHelper", 3)) {
                    Log.d("AutoResolveHelper", "Ignoring task result for, Activity is finishing.");
                }
            } else {
                b.a(activity, this.d, 0, new Intent());
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = getArguments().getInt("requestCode");
        if (b.b != getArguments().getLong("initializationElapsedRealtime")) {
            this.q = null;
        } else {
            this.q = o.d.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.x = z;
    }

    public final void onPause() {
        super.onPause();
        o<?> oVar = this.q;
        if (oVar != null && oVar.y == this) {
            oVar.y = null;
        }
    }

    public final void onResume() {
        super.onResume();
        o<?> oVar = this.q;
        if (oVar != null) {
            oVar.y = this;
            oVar.a();
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        a((g<? extends a>) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.x);
        o<?> oVar = this.q;
        if (oVar != null && oVar.y == this) {
            oVar.y = null;
        }
    }
}
