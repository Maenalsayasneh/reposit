package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import g0.a.b.a.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static final Object sLock = new Object();
    private static c sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    public static class a implements d {
        public final String a;
        public final int b;
        public final String c;
        public final Notification d;

        public a(String str, int i, String str2, Notification notification) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = notification;
        }

        public void a(g0.a.b.a.a aVar) throws RemoteException {
            aVar.i0(this.a, this.b, this.c, this.d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            return i0.d.a.a.a.y0(sb, this.c, "]");
        }
    }

    public static class b {
        public final ComponentName a;
        public final IBinder b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.b = iBinder;
        }
    }

    public static class c implements Handler.Callback, ServiceConnection {
        public final Context a;
        public final HandlerThread b;
        public final Handler c;
        public final Map<ComponentName, a> d = new HashMap();
        public Set<String> e = new HashSet();

        public static class a {
            public final ComponentName a;
            public boolean b = false;
            public g0.a.b.a.a c;
            public ArrayDeque<d> d = new ArrayDeque<>();
            public int e = 0;

            public a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        public c(Context context) {
            this.a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.b = handlerThread;
            handlerThread.start();
            this.c = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                StringBuilder P0 = i0.d.a.a.a.P0("Processing component ");
                P0.append(aVar.a);
                P0.append(", ");
                P0.append(aVar.d.size());
                P0.append(" queued tasks");
                Log.d(NotificationManagerCompat.TAG, P0.toString());
            }
            if (!aVar.d.isEmpty()) {
                if (aVar.b) {
                    z = true;
                } else {
                    boolean bindService = this.a.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.a), this, 33);
                    aVar.b = bindService;
                    if (bindService) {
                        aVar.e = 0;
                    } else {
                        StringBuilder P02 = i0.d.a.a.a.P0("Unable to bind to listener ");
                        P02.append(aVar.a);
                        Log.w(NotificationManagerCompat.TAG, P02.toString());
                        this.a.unbindService(this);
                    }
                    z = aVar.b;
                }
                if (!z || aVar.c == null) {
                    b(aVar);
                    return;
                }
                while (true) {
                    d peek = aVar.d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Log.d(NotificationManagerCompat.TAG, "Sending task " + peek);
                        }
                        peek.a(aVar.c);
                        aVar.d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            StringBuilder P03 = i0.d.a.a.a.P0("Remote service has died: ");
                            P03.append(aVar.a);
                            Log.d(NotificationManagerCompat.TAG, P03.toString());
                        }
                    } catch (RemoteException e2) {
                        StringBuilder P04 = i0.d.a.a.a.P0("RemoteException communicating with ");
                        P04.append(aVar.a);
                        Log.w(NotificationManagerCompat.TAG, P04.toString(), e2);
                    }
                }
                if (!aVar.d.isEmpty()) {
                    b(aVar);
                }
            }
        }

        public final void b(a aVar) {
            if (!this.c.hasMessages(3, aVar.a)) {
                int i = aVar.e + 1;
                aVar.e = i;
                if (i > 6) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Giving up on delivering ");
                    P0.append(aVar.d.size());
                    P0.append(" tasks to ");
                    P0.append(aVar.a);
                    P0.append(" after ");
                    P0.append(aVar.e);
                    P0.append(" retries");
                    Log.w(NotificationManagerCompat.TAG, P0.toString());
                    aVar.d.clear();
                    return;
                }
                int i2 = (1 << (i - 1)) * 1000;
                if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                    Log.d(NotificationManagerCompat.TAG, "Scheduling retry for " + i2 + " ms");
                }
                this.c.sendMessageDelayed(this.c.obtainMessage(3, aVar.a), (long) i2);
            }
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            g0.a.b.a.a aVar = null;
            if (i == 0) {
                d dVar = (d) message.obj;
                Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.a);
                if (!enabledListenerPackages.equals(this.e)) {
                    this.e = enabledListenerPackages;
                    List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo next : queryIntentServices) {
                        if (enabledListenerPackages.contains(next.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = next.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (next.serviceInfo.permission != null) {
                                Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!this.d.containsKey(componentName2)) {
                            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                                Log.d(NotificationManagerCompat.TAG, "Adding listener record for " + componentName2);
                            }
                            this.d.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator<Map.Entry<ComponentName, a>> it2 = this.d.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry next2 = it2.next();
                        if (!hashSet.contains(next2.getKey())) {
                            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                                StringBuilder P0 = i0.d.a.a.a.P0("Removing listener record for ");
                                P0.append(next2.getKey());
                                Log.d(NotificationManagerCompat.TAG, P0.toString());
                            }
                            a aVar2 = (a) next2.getValue();
                            if (aVar2.b) {
                                this.a.unbindService(this);
                                aVar2.b = false;
                            }
                            aVar2.c = null;
                            it2.remove();
                        }
                    }
                }
                for (a next3 : this.d.values()) {
                    next3.d.add(dVar);
                    a(next3);
                }
                return true;
            } else if (i == 1) {
                b bVar = (b) message.obj;
                ComponentName componentName3 = bVar.a;
                IBinder iBinder = bVar.b;
                a aVar3 = this.d.get(componentName3);
                if (aVar3 != null) {
                    int i2 = a.C0009a.a;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof g0.a.b.a.a)) {
                            aVar = new a.C0009a.C0010a(iBinder);
                        } else {
                            aVar = (g0.a.b.a.a) queryLocalInterface;
                        }
                    }
                    aVar3.c = aVar;
                    aVar3.e = 0;
                    a(aVar3);
                }
                return true;
            } else if (i == 2) {
                a aVar4 = this.d.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    if (aVar4.b) {
                        this.a.unbindService(this);
                        aVar4.b = false;
                    }
                    aVar4.c = null;
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                a aVar5 = this.d.get((ComponentName) message.obj);
                if (aVar5 != null) {
                    a(aVar5);
                }
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Connected to service " + componentName);
            }
            this.c.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Disconnected from service " + componentName);
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface d {
        void a(g0.a.b.a.a aVar) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(d dVar) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new c(this.mContext.getApplicationContext());
            }
            sSideChannelManager.c.obtainMessage(0, dVar).sendToTarget();
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        return this.mNotificationManager.areNotificationsEnabled();
    }

    public void cancel(int i) {
        cancel((String) null, i);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroups(list);
        }
    }

    public void createNotificationChannelGroupsCompat(List<NotificationChannelGroupCompat> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelGroupCompat notificationChannelGroup : list) {
                arrayList.add(notificationChannelGroup.getNotificationChannelGroup());
            }
            this.mNotificationManager.createNotificationChannelGroups(arrayList);
        }
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannels(list);
        }
    }

    public void createNotificationChannelsCompat(List<NotificationChannelCompat> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelCompat notificationChannel : list) {
                arrayList.add(notificationChannel.getNotificationChannel());
            }
            this.mNotificationManager.createNotificationChannels(arrayList);
        }
    }

    public void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannel(str);
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannelGroup(str);
        }
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannel next : this.mNotificationManager.getNotificationChannels()) {
                if (!collection.contains(next.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(next.getParentChannelId()))) {
                    this.mNotificationManager.deleteNotificationChannel(next.getId());
                }
            }
        }
    }

    public int getImportance() {
        return this.mNotificationManager.getImportance();
    }

    public NotificationChannel getNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannel(str);
        }
        return null;
    }

    public NotificationChannelCompat getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return this.mNotificationManager.getNotificationChannelGroup(str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup next : getNotificationChannelGroups()) {
                if (next.getId().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new NotificationChannelGroupCompat(notificationChannelGroup2);
            }
            return null;
        } else if (i < 26 || (notificationChannelGroup = getNotificationChannelGroup(str)) == null) {
            return null;
        } else {
            return new NotificationChannelGroupCompat(notificationChannelGroup, getNotificationChannels());
        }
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannelGroups();
        }
        return Collections.emptyList();
    }

    public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        List<NotificationChannel> list;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                if (i >= 28) {
                    list = Collections.emptyList();
                } else {
                    list = getNotificationChannels();
                }
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                for (NotificationChannelGroup next : notificationChannelGroups) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new NotificationChannelGroupCompat(next));
                    } else {
                        arrayList.add(new NotificationChannelGroupCompat(next, list));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public List<NotificationChannel> getNotificationChannels() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannels();
        }
        return Collections.emptyList();
    }

    public List<NotificationChannelCompat> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                for (NotificationChannel notificationChannelCompat : notificationChannels) {
                    arrayList.add(new NotificationChannelCompat(notificationChannelCompat));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public void notify(int i, Notification notification) {
        notify((String) null, i, notification);
    }

    public void cancel(String str, int i) {
        this.mNotificationManager.cancel(str, i);
    }

    public void notify(String str, int i, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new a(this.mContext.getPackageName(), i, str, notification));
            this.mNotificationManager.cancel(str, i);
            return;
        }
        this.mNotificationManager.notify(str, i, notification);
    }

    public void createNotificationChannel(NotificationChannelCompat notificationChannelCompat) {
        createNotificationChannel(notificationChannelCompat.getNotificationChannel());
    }

    public void createNotificationChannelGroup(NotificationChannelGroupCompat notificationChannelGroupCompat) {
        createNotificationChannelGroup(notificationChannelGroupCompat.getNotificationChannelGroup());
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.mNotificationManager.getNotificationChannel(str, str2);
        }
        return getNotificationChannel(str);
    }

    public NotificationChannelCompat getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new NotificationChannelCompat(notificationChannel);
    }
}
