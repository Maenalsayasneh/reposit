package i0.j.e.d1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.instabug.library.util.InstabugSDKLogger;
import i0.d.a.a.a;
import java.util.Objects;
import k0.b.y.f;

/* compiled from: NetworkUtils */
public class b implements f<T> {
    public final /* synthetic */ c c;

    public b(c cVar) {
        this.c = cVar;
    }

    public boolean test(T t) {
        NetworkInfo activeNetworkInfo;
        c cVar = this.c;
        Objects.requireNonNull(cVar);
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) cVar.a.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) {
                return false;
            }
            return true;
        } catch (SecurityException e) {
            StringBuilder P0 = a.P0("Could not read network state. To enable please add the following line in your AndroidManifest.xml <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\"/>\n");
            P0.append(e.getMessage());
            InstabugSDKLogger.w("NetworkUtils", P0.toString());
        } catch (Exception e2) {
            InstabugSDKLogger.e("NetworkUtils", "Something went wrong while checking network state", e2);
        }
    }
}
