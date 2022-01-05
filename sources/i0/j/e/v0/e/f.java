package i0.j.e.v0.e;

import android.annotation.SuppressLint;
import android.content.Context;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;
import io.reactivex.internal.operators.observable.ObservableRange;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.operators.observable.ObservableZip;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Objects;
import k0.b.l;
import k0.b.o;
import k0.b.y.e;
import k0.b.z.b.a;
import org.json.JSONException;

/* compiled from: MigrateUUIDService */
public class f {
    public static f a;
    public NetworkManager b = new NetworkManager();

    /* compiled from: MigrateUUIDService */
    public class a extends k0.b.b0.b<RequestResponse> {
        public final /* synthetic */ Request.Callbacks d;

        public a(Request.Callbacks callbacks) {
            this.d = callbacks;
        }

        @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
        public void b(Object obj) {
            RequestResponse requestResponse = (RequestResponse) obj;
            StringBuilder P0 = i0.d.a.a.a.P0("migrateUUID request onNext, Response code: ");
            P0.append(requestResponse.getResponseCode());
            InstabugSDKLogger.v("MigrateUUIDService", P0.toString());
            InstabugSDKLogger.addVerboseLog("MigrateUUIDService", "Response body: " + requestResponse.getResponseBody());
            this.d.onSucceeded((String) requestResponse.getResponseBody());
        }

        public void c() {
            InstabugSDKLogger.addVerboseLog("MigrateUUIDService", "migrateUUID request started");
        }

        public void onComplete() {
            InstabugSDKLogger.addVerboseLog("MigrateUUIDService", "migrateUUID request completed");
        }

        public void onError(Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("migrateUUID request got error: ");
            P0.append(th.getMessage());
            InstabugSDKLogger.e("MigrateUUIDService", P0.toString(), th);
            this.d.onFailed(th);
        }
    }

    /* compiled from: MigrateUUIDService */
    public class b implements e<l<Throwable>, o<?>> {
        public final /* synthetic */ Request.Callbacks c;

        public b(Request.Callbacks callbacks) {
            this.c = callbacks;
        }

        public Object apply(Object obj) throws Exception {
            l lVar = (l) obj;
            if (((long) 1) + ((long) 14) <= 2147483647L) {
                l onAssembly = RxJavaPlugins.onAssembly(new ObservableRange(1, 15));
                h hVar = new h(this);
                Objects.requireNonNull(lVar);
                Objects.requireNonNull(onAssembly, "other is null");
                a.C0230a aVar = new a.C0230a(hVar);
                int i = k0.b.f.a;
                o[] oVarArr = {lVar, onAssembly};
                k0.b.z.b.b.a(i, "bufferSize");
                return RxJavaPlugins.onAssembly(new ObservableZip(oVarArr, (Iterable) null, aVar, i, false)).j(new g());
            }
            throw new IllegalArgumentException("Integer overflow");
        }
    }

    public void a(Context context, String str, String str2, Request.Callbacks<String, Throwable> callbacks) throws JSONException {
        Request buildRequestWithoutUUID = this.b.buildRequestWithoutUUID(context, Request.Endpoint.MIGRATE_UUID, Request.RequestMethod.put);
        buildRequestWithoutUUID.addRequestBodyParameter("old_uuid", str);
        buildRequestWithoutUUID.addRequestBodyParameter("new_uuid", str2);
        buildRequestWithoutUUID.addRequestBodyParameter("application_token", SettingsManager.getInstance().getAppToken());
        buildRequestWithoutUUID.addRequestBodyParameter("name", i0.j.e.c1.b.y());
        buildRequestWithoutUUID.addRequestBodyParameter("email", i0.j.e.c1.b.v());
        l<RequestResponse> v = this.b.doRequest(buildRequestWithoutUUID).v(k0.b.d0.a.c());
        b bVar = new b(callbacks);
        Objects.requireNonNull(v);
        RxJavaPlugins.onAssembly(new ObservableRetryWhen(v, bVar)).c(new a(callbacks));
    }
}
