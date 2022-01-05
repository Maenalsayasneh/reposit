package i0.h.a.a.h;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.instabug.library.model.State;
import com.pubnub.api.vendor.FileEncryptionUtil;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import h0.b0.v;
import i0.h.a.a.h.e.c;
import i0.h.a.a.h.e.f;
import i0.h.a.a.h.e.g;
import i0.h.a.a.h.e.h;
import i0.h.a.a.h.e.i;
import i0.h.a.a.h.e.j;
import i0.h.a.a.h.e.k;
import i0.h.a.a.h.e.l;
import i0.h.a.a.h.e.n;
import i0.h.a.a.h.e.o;
import i0.h.a.a.h.e.p;
import i0.h.a.a.h.e.q;
import i0.h.a.a.i.p.l;
import i0.h.c.m.h.e;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: CctTransportBackend */
public final class d implements l {
    public final i0.h.c.m.a a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d = c(a.a);
    public final i0.h.a.a.i.u.a e;
    public final i0.h.a.a.i.u.a f;
    public final int g;

    /* compiled from: CctTransportBackend */
    public static final class a {
        public final URL a;
        public final o b;
        public final String c;

        public a(URL url, o oVar, String str) {
            this.a = url;
            this.b = oVar;
            this.c = str;
        }
    }

    /* compiled from: CctTransportBackend */
    public static final class b {
        public final int a;
        public final URL b;
        public final long c;

        public b(int i, URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public d(Context context, i0.h.a.a.i.u.a aVar, i0.h.a.a.i.u.a aVar2) {
        e eVar = new e();
        Class<o> cls = o.class;
        c cVar = c.a;
        eVar.b.put(cls, cVar);
        eVar.c.remove(cls);
        Class<i> cls2 = i.class;
        eVar.b.put(cls2, cVar);
        eVar.c.remove(cls2);
        Class<q> cls3 = q.class;
        f fVar = f.a;
        eVar.b.put(cls3, fVar);
        eVar.c.remove(cls3);
        Class<i0.h.a.a.h.e.l> cls4 = i0.h.a.a.h.e.l.class;
        eVar.b.put(cls4, fVar);
        eVar.c.remove(cls4);
        Class<ClientInfo> cls5 = ClientInfo.class;
        i0.h.a.a.h.e.d dVar = i0.h.a.a.h.e.d.a;
        eVar.b.put(cls5, dVar);
        eVar.c.remove(cls5);
        Class<j> cls6 = j.class;
        eVar.b.put(cls6, dVar);
        eVar.c.remove(cls6);
        Class<i0.h.a.a.h.e.a> cls7 = i0.h.a.a.h.e.a.class;
        i0.h.a.a.h.e.b bVar = i0.h.a.a.h.e.b.a;
        eVar.b.put(cls7, bVar);
        eVar.c.remove(cls7);
        Class<h> cls8 = h.class;
        eVar.b.put(cls8, bVar);
        eVar.c.remove(cls8);
        Class<p> cls9 = p.class;
        i0.h.a.a.h.e.e eVar2 = i0.h.a.a.h.e.e.a;
        eVar.b.put(cls9, eVar2);
        eVar.c.remove(cls9);
        Class<k> cls10 = k.class;
        eVar.b.put(cls10, eVar2);
        eVar.c.remove(cls10);
        Class<NetworkConnectionInfo> cls11 = NetworkConnectionInfo.class;
        g gVar = g.a;
        eVar.b.put(cls11, gVar);
        eVar.c.remove(cls11);
        Class<n> cls12 = n.class;
        eVar.b.put(cls12, gVar);
        eVar.c.remove(cls12);
        eVar.e = true;
        this.a = new i0.h.c.m.h.d(eVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.e = aVar2;
        this.f = aVar;
        this.g = 40000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e2) {
            throw new IllegalArgumentException(i0.d.a.a.a.n0("Invalid url: ", str), e2);
        }
    }

    public BackendResponse a(i0.h.a.a.i.p.f fVar) {
        String str;
        Integer num;
        i0.h.a.a.i.p.a aVar;
        k.b bVar;
        HashMap hashMap = new HashMap();
        i0.h.a.a.i.p.a aVar2 = (i0.h.a.a.i.p.a) fVar;
        for (EventInternal next : aVar2.a) {
            String transportName = next.getTransportName();
            if (!hashMap.containsKey(transportName)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                hashMap.put(transportName, arrayList);
            } else {
                ((List) hashMap.get(transportName)).add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            String str2 = null;
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                EventInternal eventInternal = (EventInternal) ((List) entry.getValue()).get(0);
                QosTier qosTier = QosTier.DEFAULT;
                Long valueOf = Long.valueOf(this.f.a());
                Long valueOf2 = Long.valueOf(this.e.a());
                j jVar = new j(ClientInfo.ClientType.ANDROID_FIREBASE, new h(Integer.valueOf(eventInternal.getInteger("sdk-version")), eventInternal.get("model"), eventInternal.get("hardware"), eventInternal.get("device"), eventInternal.get("product"), eventInternal.get("os-uild"), eventInternal.get("manufacturer"), eventInternal.get("fingerprint"), eventInternal.get(State.KEY_LOCALE), eventInternal.get(AccountRangeJsonParser.FIELD_COUNTRY), eventInternal.get("mcc_mnc"), eventInternal.get("application_build"), (h.a) null), (j.a) null);
                try {
                    str = null;
                    num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                } catch (NumberFormatException unused) {
                    num = null;
                    str = (String) entry.getKey();
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    EventInternal eventInternal2 = (EventInternal) it2.next();
                    i0.h.a.a.i.e encodedPayload = eventInternal2.getEncodedPayload();
                    Iterator it3 = it;
                    i0.h.a.a.b bVar2 = encodedPayload.a;
                    Iterator it4 = it2;
                    String str3 = "";
                    if (bVar2.equals(new i0.h.a.a.b("proto"))) {
                        byte[] bArr = encodedPayload.b;
                        bVar = new k.b();
                        bVar.d = bArr;
                    } else if (bVar2.equals(new i0.h.a.a.b("json"))) {
                        String str4 = new String(encodedPayload.b, Charset.forName(FileEncryptionUtil.ENCODING_UTF_8));
                        bVar = new k.b();
                        bVar.e = str4;
                    } else {
                        aVar = aVar2;
                        Log.w(v.s0("CctTransportBackend"), String.format("Received event of unsupported encoding %s. Skipping...", new Object[]{bVar2}));
                        it2 = it4;
                        it = it3;
                        aVar2 = aVar;
                    }
                    bVar.a = Long.valueOf(eventInternal2.getEventMillis());
                    bVar.c = Long.valueOf(eventInternal2.getUptimeMillis());
                    bVar.f = Long.valueOf(eventInternal2.getLong("tz-offset"));
                    aVar = aVar2;
                    bVar.g = new n(NetworkConnectionInfo.NetworkType.forNumber(eventInternal2.getInteger("net-type")), NetworkConnectionInfo.MobileSubtype.forNumber(eventInternal2.getInteger("mobile-subtype")), (n.a) null);
                    if (eventInternal2.getCode() != null) {
                        bVar.b = eventInternal2.getCode();
                    }
                    String str5 = bVar.a == null ? " eventTimeMs" : str3;
                    if (bVar.c == null) {
                        str5 = i0.d.a.a.a.n0(str5, " eventUptimeMs");
                    }
                    if (bVar.f == null) {
                        str5 = i0.d.a.a.a.n0(str5, " timezoneOffsetSeconds");
                    }
                    if (str5.isEmpty()) {
                        arrayList3.add(new k(bVar.a.longValue(), bVar.b, bVar.c.longValue(), bVar.d, bVar.e, bVar.f.longValue(), bVar.g, (k.a) null));
                        it2 = it4;
                        it = it3;
                        aVar2 = aVar;
                    } else {
                        throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", str5));
                    }
                }
                Iterator it5 = it;
                i0.h.a.a.i.p.a aVar3 = aVar2;
                String str6 = valueOf == null ? " requestTimeMs" : "";
                if (valueOf2 == null) {
                    str6 = i0.d.a.a.a.n0(str6, " requestUptimeMs");
                }
                if (str6.isEmpty()) {
                    arrayList2.add(new i0.h.a.a.h.e.l(valueOf.longValue(), valueOf2.longValue(), jVar, num, str, arrayList3, qosTier, (l.a) null));
                    it = it5;
                    aVar2 = aVar3;
                } else {
                    throw new IllegalStateException(i0.d.a.a.a.n0("Missing required properties:", str6));
                }
            } else {
                i0.h.a.a.i.p.a aVar4 = aVar2;
                i iVar = new i(arrayList2);
                URL url = this.d;
                if (aVar4.b != null) {
                    try {
                        a a2 = a.a(((i0.h.a.a.i.p.a) fVar).b);
                        String str7 = a2.g;
                        if (str7 != null) {
                            str2 = str7;
                        }
                        String str8 = a2.f;
                        if (str8 != null) {
                            url = c(str8);
                        }
                    } catch (IllegalArgumentException unused2) {
                        return BackendResponse.a();
                    }
                }
                try {
                    b bVar3 = (b) v.P1(5, new a(url, iVar, str2), new b(this), c.a);
                    int i = bVar3.a;
                    if (i == 200) {
                        return new i0.h.a.a.i.p.b(BackendResponse.Status.OK, bVar3.c);
                    }
                    if (i < 500) {
                        if (i != 404) {
                            return BackendResponse.a();
                        }
                    }
                    return new i0.h.a.a.i.p.b(BackendResponse.Status.TRANSIENT_ERROR, -1);
                } catch (IOException e2) {
                    v.Z("CctTransportBackend", "Could not make request to the backend", e2);
                    return new i0.h.a.a.i.p.b(BackendResponse.Status.TRANSIENT_ERROR, -1);
                }
            }
        }
    }

    public EventInternal b(EventInternal eventInternal) {
        int i;
        int i2;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        EventInternal.a builder = eventInternal.toBuilder();
        builder.c().put("sdk-version", String.valueOf(Build.VERSION.SDK_INT));
        builder.c().put("model", Build.MODEL);
        builder.c().put("hardware", Build.HARDWARE);
        builder.c().put("device", Build.DEVICE);
        builder.c().put("product", Build.PRODUCT);
        builder.c().put("os-uild", Build.ID);
        builder.c().put("manufacturer", Build.MANUFACTURER);
        builder.c().put("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        builder.c().put("tz-offset", String.valueOf((long) (TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000)));
        if (activeNetworkInfo == null) {
            i = NetworkConnectionInfo.NetworkType.NONE.getValue();
        } else {
            i = activeNetworkInfo.getType();
        }
        builder.c().put("net-type", String.valueOf(i));
        int i3 = -1;
        if (activeNetworkInfo == null) {
            i2 = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.getValue();
        } else {
            i2 = activeNetworkInfo.getSubtype();
            if (i2 == -1) {
                i2 = NetworkConnectionInfo.MobileSubtype.COMBINED.getValue();
            } else if (NetworkConnectionInfo.MobileSubtype.forNumber(i2) == null) {
                i2 = 0;
            }
        }
        builder.c().put("mobile-subtype", String.valueOf(i2));
        builder.c().put(AccountRangeJsonParser.FIELD_COUNTRY, Locale.getDefault().getCountry());
        builder.c().put(State.KEY_LOCALE, Locale.getDefault().getLanguage());
        builder.c().put("mcc_mnc", ((TelephonyManager) this.c.getSystemService(PaymentMethod.BillingDetails.PARAM_PHONE)).getSimOperator());
        Context context = this.c;
        try {
            i3 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            v.Z("CctTransportBackend", "Unable to find version code for package", e2);
        }
        builder.c().put("application_build", Integer.toString(i3));
        return builder.b();
    }
}
