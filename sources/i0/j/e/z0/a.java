package i0.j.e.z0;

import android.net.Uri;
import android.view.View;
import com.instabug.library.Feature;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkInvokedCallback;
import com.instabug.library.Platform;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.invocation.OnInvokeCallback;
import com.instabug.library.model.Report;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: PerSessionSettings */
public class a {
    public static a a;
    public final Collection<View> A = Collections.newSetFromMap(new WeakHashMap());
    public boolean B = true;
    public String C = null;
    @Platform
    public int D = 2;
    public int b = -15893761;
    public int c = -3815737;
    public long d;
    public boolean e;
    public Locale f = Locale.getDefault();
    public ArrayList<String> g = new ArrayList<>();
    public InstabugCustomTextPlaceHolder h;
    public LinkedHashMap<Uri, String> i = new LinkedHashMap<>(3);
    public OnInvokeCallback j;
    public OnSdkDismissCallback k;
    public OnSdkInvokedCallback l;
    public InstabugColorTheme m = InstabugColorTheme.InstabugColorThemeLight;
    public boolean n = true;
    public int o = -2;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public int t = 30000;
    public boolean u = true;
    public boolean v = false;
    public boolean w = false;
    public Report.OnReportCreatedListener x;
    public boolean y = false;
    public Feature.State z = Feature.State.DISABLED;

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            aVar = a;
            if (aVar == null) {
                aVar = new a();
                a = aVar;
            }
        }
        return aVar;
    }

    public void b(Uri uri, String str) {
        if (this.i != null && AttachmentsUtility.validateFileSize(uri, 5.0d)) {
            if (this.i.size() == 3 && !this.i.containsKey(uri)) {
                this.i.remove(this.i.keySet().iterator().next());
            }
            this.i.put(uri, str);
        }
    }
}
