package i0.j.e.v0.g.a;

import android.annotation.SuppressLint;
import android.util.Base64;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.Header;
import com.pubnub.api.vendor.FileEncryptionUtil;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import io.reactivex.internal.operators.single.SingleObserveOn;
import io.reactivex.internal.operators.single.SingleSubscribeOn;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import k0.b.f;
import k0.b.l;
import k0.b.q;
import k0.b.r;
import k0.b.y.d;
import k0.b.z.e.c.i;
import k0.b.z.e.c.p;

/* compiled from: SyncLogService */
public class e extends i0.j.e.v0.e.i.b {
    public static e d;
    public d e;

    /* compiled from: SyncLogService */
    public class a implements k0.b.y.e<RequestResponse, String> {
        public final /* synthetic */ Request c;

        public a(Request request) {
            this.c = request;
        }

        @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
        public Object apply(Object obj) throws Exception {
            RequestResponse requestResponse = (RequestResponse) obj;
            if (this.c.getFileToUpload() != null) {
                return this.c.getFileToUpload().getFilePath();
            }
            return null;
        }
    }

    /* compiled from: SyncLogService */
    public class b implements d<List<String>> {
        public b() {
        }

        public void b(Object obj) throws Exception {
            List list = (List) obj;
            Request.Callbacks callbacks = e.this.c;
            if (callbacks != null) {
                callbacks.onSucceeded(list);
            }
        }
    }

    /* compiled from: SyncLogService */
    public class c implements d<Throwable> {
        public c() {
        }

        public void b(Object obj) throws Exception {
            Throwable th = (Throwable) obj;
            Request.Callbacks callbacks = e.this.c;
            if (callbacks != null) {
                callbacks.onFailed(th);
            }
        }
    }

    public e(i0.j.e.v0.a aVar, d dVar, Request.Callbacks callbacks, i0.j.e.v0.e.i.a aVar2) {
        super(aVar, aVar2, callbacks);
        this.e = dVar;
    }

    public void a(List<File> list, String str, String str2, String str3) throws UnsupportedEncodingException {
        LinkedList linkedList = new LinkedList();
        for (File next : list) {
            Objects.requireNonNull(this.e);
            Request addParameter = new Request(Request.PRODUCTION_LOGS_URL, NetworkManager.RequestType.MULTI_PART).setRequestMethod(Request.RequestMethod.Post).setFileToUpload(new Request.FileToUpload("log_file", next.getName(), next.getAbsolutePath(), "file")).addParameter(InstabugDbContract.SessionEntry.COLUMN_APP_TOKEN, str3);
            String str4 = "null";
            String str5 = str2 == null ? str4 : str2;
            if (str != null) {
                str4 = str;
            }
            Request addHeader = addParameter.addHeader(new Request.RequestParameter(Header.AUTHORIZATION, Request.BASIC_AUTH_VALUE_PREFIX.concat(Base64.encodeToString(str5.concat(":").concat(str4).getBytes(FileEncryptionUtil.ENCODING_UTF_8), 2))));
            linkedList.add(this.a.doRequest(addHeader).p(new a(addHeader)));
        }
        l onAssembly = RxJavaPlugins.onAssembly(new i(linkedList));
        k0.b.y.e<Object, Object> eVar = k0.b.z.b.a.a;
        Objects.requireNonNull(onAssembly);
        l<Object> k = onAssembly.k(eVar, true, Integer.MAX_VALUE, f.a);
        Objects.requireNonNull(k);
        k0.b.z.b.b.a(16, "capacityHint");
        r onAssembly2 = RxJavaPlugins.onAssembly(new p(k, 16));
        Objects.requireNonNull(this.b);
        q c2 = k0.b.d0.a.c();
        Objects.requireNonNull(onAssembly2);
        Objects.requireNonNull(c2, "scheduler is null");
        r onAssembly3 = RxJavaPlugins.onAssembly(new SingleSubscribeOn(onAssembly2, c2));
        Objects.requireNonNull(this.b);
        q c3 = k0.b.d0.a.c();
        Objects.requireNonNull(onAssembly3);
        Objects.requireNonNull(c3, "scheduler is null");
        r onAssembly4 = RxJavaPlugins.onAssembly(new SingleObserveOn(onAssembly3, c3));
        b bVar = new b();
        c cVar = new c();
        Objects.requireNonNull(onAssembly4);
        onAssembly4.a(new ConsumerSingleObserver(bVar, cVar));
    }
}
