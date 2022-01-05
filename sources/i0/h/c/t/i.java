package i0.h.c.t;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public final /* synthetic */ class i implements Callable {
    public final Context c;
    public final Intent d;

    public i(Context context, Intent intent) {
        this.c = context;
        this.d = intent;
    }

    public Object call() {
        String str;
        int i;
        ComponentName componentName;
        String str2;
        Context context = this.c;
        Intent intent = this.d;
        k0 a = k0.a();
        Objects.requireNonNull(a);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        a.e.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (a) {
            str = a.b;
            if (str == null) {
                ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                if (resolveService != null) {
                    ServiceInfo serviceInfo = resolveService.serviceInfo;
                    if (serviceInfo != null) {
                        if (context.getPackageName().equals(serviceInfo.packageName)) {
                            String str3 = serviceInfo.name;
                            if (str3 != null) {
                                if (str3.startsWith(".")) {
                                    String valueOf = String.valueOf(context.getPackageName());
                                    String valueOf2 = String.valueOf(serviceInfo.name);
                                    a.b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                                } else {
                                    a.b = serviceInfo.name;
                                }
                                str = a.b;
                            }
                        }
                        String str4 = serviceInfo.packageName;
                        String str5 = serviceInfo.name;
                        StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 94 + String.valueOf(str5).length());
                        sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                        sb.append(str4);
                        sb.append("/");
                        sb.append(str5);
                        Log.e("FirebaseMessaging", sb.toString());
                        str = null;
                    }
                }
                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                str = null;
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                if (str.length() != 0) {
                    str2 = "Restricting intent to a specific service: ".concat(str);
                } else {
                    str2 = new String("Restricting intent to a specific service: ");
                }
                Log.d("FirebaseMessaging", str2);
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (a.c(context)) {
                componentName = u0.a(context, intent2);
            } else {
                componentName = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i = 404;
            } else {
                i = -1;
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e);
            i = 401;
        } catch (IllegalStateException e2) {
            String valueOf3 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(valueOf3.length() + 45);
            sb2.append("Failed to start service while in background: ");
            sb2.append(valueOf3);
            Log.e("FirebaseMessaging", sb2.toString());
            i = 402;
        }
        return Integer.valueOf(i);
    }
}
