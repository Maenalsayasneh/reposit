package i0.h.a.b.c;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.base.R;
import com.google.android.gms.common.SupportErrorDialogFragment;
import h0.b0.v;
import h0.f.h;
import h0.o.a.k;
import i0.h.a.b.c.i.r;
import i0.h.a.b.c.i.s;
import i0.h.a.b.g.c.e;
import i0.h.a.b.h.f.n;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class b extends c {
    public static final Object b = new Object();
    public static final b c = new b();

    @SuppressLint({"HandlerLeak"})
    /* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
    public class a extends e {
        public final Context a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            PendingIntent pendingIntent;
            int i = message.what;
            boolean z = true;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int c = b.this.c(this.a);
            Objects.requireNonNull(b.this);
            boolean z2 = e.a;
            if (!(c == 1 || c == 2 || c == 3 || c == 9)) {
                z = false;
            }
            if (z) {
                b bVar = b.this;
                Context context = this.a;
                Intent a2 = bVar.a(context, c, n.a);
                if (a2 == null) {
                    pendingIntent = null;
                } else {
                    pendingIntent = PendingIntent.getActivity(context, 0, a2, 134217728);
                }
                bVar.e(context, c, pendingIntent);
            }
        }
    }

    @RecentlyNullable
    public Intent a(Context context, int i, String str) {
        return super.a(context, i, str);
    }

    public int b(@RecentlyNonNull Context context, int i) {
        return super.b(context, i);
    }

    public int c(@RecentlyNonNull Context context) {
        return b(context, c.a);
    }

    public boolean d(@RecentlyNonNull Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialog;
        s sVar = new s(super.a(activity, i, "d"), activity, i2);
        if (i == 0) {
            alertDialog = null;
        } else {
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843529, typedValue, true);
            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
            if (builder == null) {
                builder = new AlertDialog.Builder(activity);
            }
            builder.setMessage(r.e(activity, i));
            builder.setOnCancelListener(onCancelListener);
            String f = r.f(activity, i);
            if (f != null) {
                builder.setPositiveButton(f, sVar);
            }
            String a2 = r.a(activity, i);
            if (a2 != null) {
                builder.setTitle(a2);
            }
            Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
            alertDialog = builder.create();
        }
        if (alertDialog == null) {
            return false;
        }
        if (activity instanceof k) {
            FragmentManager supportFragmentManager = ((k) activity).getSupportFragmentManager();
            SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
            v.A(alertDialog, "Cannot display null dialog");
            alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            supportErrorDialogFragment.j2 = alertDialog;
            supportErrorDialogFragment.k2 = onCancelListener;
            supportErrorDialogFragment.P0(supportFragmentManager, "GooglePlayServicesErrorDialog");
        } else {
            android.app.FragmentManager fragmentManager = activity.getFragmentManager();
            a aVar = new a();
            v.A(alertDialog, "Cannot display null dialog");
            alertDialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            alertDialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            aVar.c = alertDialog;
            aVar.d = onCancelListener;
            aVar.show(fragmentManager, "GooglePlayServicesErrorDialog");
        }
        return true;
    }

    @TargetApi(20)
    public final void e(Context context, int i, PendingIntent pendingIntent) {
        String str;
        String str2;
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            new a(context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i == 6) {
                str = r.b(context, "common_google_play_services_resolution_required_title");
            } else {
                str = r.a(context, i);
            }
            if (str == null) {
                str = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (i == 6 || i == 19) {
                str2 = r.c(context, "common_google_play_services_resolution_required_text", r.d(context));
            } else {
                str2 = r.e(context, i);
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            Objects.requireNonNull(systemService, "null reference");
            NotificationManager notificationManager = (NotificationManager) systemService;
            NotificationCompat.Builder style = new NotificationCompat.Builder(context).setLocalOnly(true).setAutoCancel(true).setContentTitle(str).setStyle(new NotificationCompat.BigTextStyle().bigText(str2));
            if (v.M0(context)) {
                v.B(true);
                style.setSmallIcon(context.getApplicationInfo().icon).setPriority(2);
                if (v.N0(context)) {
                    style.addAction(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent);
                } else {
                    style.setContentIntent(pendingIntent);
                }
            } else {
                style.setSmallIcon(17301642).setTicker(resources.getString(R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setContentIntent(pendingIntent).setContentText(str2);
            }
            if (i0.h.a.b.c.m.b.U()) {
                v.B(i0.h.a.b.c.m.b.U());
                synchronized (b) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                h<String, String> hVar = r.a;
                String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                style.setChannelId("com.google.android.gms.availability");
            }
            Notification build = style.build();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                e.c.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, build);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
