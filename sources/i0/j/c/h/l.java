package i0.j.c.h;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.instabug.chat.ChatPlugin;
import com.instabug.chat.cache.ReadQueueCacheManager;
import com.instabug.chat.e.d;
import com.instabug.chat.synchronization.SynchronizationManager;
import com.instabug.library.Feature;
import com.instabug.library.PresentationManager;
import com.instabug.library.R;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.InstabugAppData;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.c.c;
import i0.j.c.h.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: NotificationManager */
public class l {
    public static l a;
    public int b;
    public final a c = new a();
    public InstabugAppData d;
    public List<d> e;

    /* compiled from: NotificationManager */
    public class a implements MediaPlayer.OnCompletionListener {
        public final /* synthetic */ MediaPlayer a;

        public a(MediaPlayer mediaPlayer) {
            this.a = mediaPlayer;
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            this.a.release();
        }
    }

    /* compiled from: NotificationManager */
    public class b implements a.e {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ d b;

        public b(Activity activity, d dVar) {
            this.a = activity;
            this.b = dVar;
        }

        public void a() {
            ReadQueueCacheManager.getInstance().markAsRead(this.b);
            if (SynchronizationManager.getInstance() != null) {
                SynchronizationManager.getInstance().sync();
            }
            Objects.requireNonNull(l.this);
            PresentationManager.getInstance().setNotificationShowing(false);
            PresentationManager.getInstance().notifyActivityChanged();
        }
    }

    public static l a() {
        if (a == null) {
            a = new l();
        }
        return a;
    }

    public final String b(int i, String str) {
        if (i != 0) {
            return i != 1 ? "" : c.a();
        }
        StringBuilder S0 = i0.d.a.a.a.S0(str, " (");
        S0.append(c.a());
        S0.append(")");
        return S0.toString();
    }

    public final String c(Context context, int i, List<d> list) {
        if (i == 0) {
            return list.get(list.size() - 1).q;
        }
        if (i != 1) {
            return "";
        }
        Resources resources = context.getResources();
        String str = list.get(list.size() - 1).x;
        if (str == null) {
            return "";
        }
        String[] split = str.split(" ");
        return String.format(resources.getString(R.string.instabug_str_notifications_body), new Object[]{Integer.valueOf(list.size()), split[0]});
    }

    public final void d(Activity activity, List<d> list) {
        i0.j.c.f.b bVar;
        if (InstabugCore.isFeatureEnabled(Feature.REPLIES)) {
            d dVar = list.get(list.size() - 1);
            Context applicationContext = activity.getApplicationContext();
            if (this.b != 1) {
                bVar = new i0.j.c.f.b();
                bVar.a = c(applicationContext, 0, this.e);
                bVar.b = b(0, dVar.x);
                bVar.c = dVar.y;
            } else {
                bVar = new i0.j.c.f.b();
                bVar.a = c(applicationContext, 1, this.e);
                bVar.b = b(1, dVar.x);
                bVar.c = dVar.y;
            }
            this.c.a(activity, bVar, new b(activity, dVar));
            PresentationManager.getInstance().setNotificationShowing(true);
        }
    }

    public void e(Context context) {
        if (InstabugDeviceProperties.checkRingerIsOn(context)) {
            MediaPlayer create = MediaPlayer.create(context, R.raw.ib_core_sound_new_message);
            create.setAudioAttributes(new AudioAttributes.Builder().setUsage(5).setContentType(4).build());
            create.start();
            create.setOnCompletionListener(new a(create));
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public final void f(Context context, Intent intent, CharSequence charSequence) {
        int i = i0.j.c.l.c.a().b.getInt("ibc_push_notification_icon", -1);
        if (i == -1 || i == 0) {
            i = this.d.getAppIcon();
        }
        String str = i0.j.c.l.b.a().e != null ? i0.j.c.l.b.a().e : "ibg-replies-channel";
        if (!i0.j.c.l.a.T()) {
            str = i0.d.a.a.a.n0(str, "-silent");
        }
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 134217728);
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(context, str).setSmallIcon(i).setContentTitle(this.d.getAppName()).setContentText(charSequence).setAutoCancel(true).setContentIntent(activity);
        int i2 = Build.VERSION.SDK_INT;
        contentIntent.setPriority(1);
        contentIntent.setVibrate(new long[0]);
        if (i0.j.c.l.a.T()) {
            contentIntent.setSound(defaultUri);
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            if (i2 >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(str, this.d.getAppName(), 4);
                if (i0.j.c.l.a.T()) {
                    notificationChannel.setSound(defaultUri, (AudioAttributes) null);
                } else {
                    notificationChannel.setSound((Uri) null, (AudioAttributes) null);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            notificationManager.notify(0, contentIntent.build());
        }
    }

    public void g(Context context, List<d> list) {
        Intent intent;
        String str;
        Activity activity;
        this.d = new InstabugAppData(context);
        ArrayList arrayList = new ArrayList(list);
        String str2 = list.get(0).d;
        Collections.sort(arrayList, new d.a(1));
        Iterator it = arrayList.iterator();
        int i = 1;
        while (it.hasNext()) {
            String str3 = ((d) it.next()).d;
            if (str3 != null && !str3.equals(str2)) {
                i++;
                str2 = str3;
            }
        }
        int i2 = i == 1 ? 0 : 1;
        this.b = i2;
        this.e = list;
        if (i2 == 0) {
            String c2 = c(context, 0, list);
            intent = i0.j.c.l.a.f(context, list.get(list.size() - 1).d);
            str = c2;
        } else if (i2 != 1) {
            str = "";
            intent = null;
        } else {
            str = c(context, 1, list);
            intent = i0.j.c.l.a.e(context);
        }
        if (InstabugCore.isAppOnForeground() || intent == null) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = InstabugCore.getTargetActivity();
            }
            if (InstabugCore.isForegroundBusy()) {
                ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
                if (chatPlugin != null && chatPlugin.getState() == 1 && activity != null) {
                    d(activity, list);
                } else if (intent != null) {
                    f(context, intent, str);
                }
            } else if (activity != null) {
                d(activity, list);
            }
        } else {
            f(context, intent, str);
        }
    }

    public boolean h(Bundle bundle) {
        try {
            String string = bundle.getString(InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            if (string == null) {
                return false;
            }
            String string2 = new JSONObject(string).getString("IBGHost");
            InstabugSDKLogger.d(this, "IBGHost: " + string2);
            if (string2 == null || !Boolean.parseBoolean(string2)) {
                return false;
            }
            return true;
        } catch (JSONException e2) {
            InstabugSDKLogger.e(this, "Parsing GCM response failed", e2);
            return false;
        } catch (NullPointerException e3) {
            InstabugSDKLogger.e(this, "Something went wrong while showing notification", e3);
            return false;
        }
    }

    public boolean i(Map<String, String> map) {
        if (!map.containsKey(InstabugDbContract.BugEntry.COLUMN_MESSAGE)) {
            return false;
        }
        try {
            String string = new JSONObject(map.get(InstabugDbContract.BugEntry.COLUMN_MESSAGE)).getString("IBGHost");
            if (string == null || !Boolean.parseBoolean(string)) {
                return false;
            }
            return true;
        } catch (JSONException e2) {
            InstabugSDKLogger.e(this, "Parsing GCM response failed", e2);
            return false;
        } catch (NullPointerException e3) {
            InstabugSDKLogger.e(this, "Something went wrong while showing notification", e3);
            return false;
        }
    }
}
