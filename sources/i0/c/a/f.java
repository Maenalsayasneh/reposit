package i0.c.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.util.Log;
import android.util.Pair;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.networking.AnalyticsRequestFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q0.f;

/* compiled from: AmplitudeClient */
public class f {
    public static final String a = "i0.c.a.f";
    public long A;
    public long B;
    public boolean C;
    public int D;
    public String E;
    public String F;
    public AtomicBoolean G;
    public AtomicBoolean H;
    public String I;
    public s J;
    public s K;
    public Context b;
    public f.a c;
    public m d;
    public String e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public q k;
    public q l;
    public JSONObject m;
    public boolean n;
    public String o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public o v;
    public int w;
    public int x;
    public int y;
    public long z;

    /* compiled from: AmplitudeClient */
    public class a implements Runnable {
        public final /* synthetic */ String c;
        public final /* synthetic */ long d;
        public final /* synthetic */ long q;

        public a(String str, long j, long j2) {
            this.c = str;
            this.d = j;
            this.q = j2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x01d1  */
        /* JADX WARNING: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r1 = r18
                i0.c.a.f r8 = i0.c.a.f.this
                q0.f$a r2 = r8.c
                java.lang.String r3 = r1.c
                long r4 = r1.d
                long r6 = r1.q
                java.util.Objects.requireNonNull(r8)
                java.lang.String r9 = "Exception:"
                java.lang.String r10 = "2"
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r11 = ""
                r0.append(r11)
                long r12 = java.lang.System.currentTimeMillis()
                r0.append(r12)
                java.lang.String r12 = r0.toString()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r0.append(r10)     // Catch:{ UnsupportedEncodingException -> 0x007c }
                java.lang.String r13 = r8.e     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r0.append(r13)     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r0.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r0.append(r12)     // Catch:{ UnsupportedEncodingException -> 0x007c }
                java.lang.String r0 = r0.toString()     // Catch:{ UnsupportedEncodingException -> 0x007c }
                i0.c.b.a r13 = new i0.c.b.a     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r13.<init>()     // Catch:{ UnsupportedEncodingException -> 0x007c }
                java.lang.String r14 = "UTF-8"
                byte[] r0 = r0.getBytes(r14)     // Catch:{ UnsupportedEncodingException -> 0x007c }
                byte[] r0 = r13.digest(r0)     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r13 = 16
                char[] r13 = new char[r13]     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r13 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array     // Catch:{ UnsupportedEncodingException -> 0x007c }
                int r14 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x007c }
                int r14 = r14 * 2
                char[] r14 = new char[r14]     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r15 = 0
            L_0x005b:
                int r1 = r0.length     // Catch:{ UnsupportedEncodingException -> 0x007c }
                if (r15 >= r1) goto L_0x0075
                byte r1 = r0[r15]     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r1 = r1 & 255(0xff, float:3.57E-43)
                int r16 = r15 * 2
                int r17 = r1 >>> 4
                char r17 = r13[r17]     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r14[r16] = r17     // Catch:{ UnsupportedEncodingException -> 0x007c }
                int r16 = r16 + 1
                r1 = r1 & 15
                char r1 = r13[r1]     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r14[r16] = r1     // Catch:{ UnsupportedEncodingException -> 0x007c }
                int r15 = r15 + 1
                goto L_0x005b
            L_0x0075:
                java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r0.<init>(r14)     // Catch:{ UnsupportedEncodingException -> 0x007c }
                r11 = r0
                goto L_0x0088
            L_0x007c:
                r0 = move-exception
                i0.c.a.k r1 = i0.c.a.k.a
                java.lang.String r13 = i0.c.a.f.a
                java.lang.String r0 = r0.toString()
                r1.a(r13, r0)
            L_0x0088:
                q0.u$a r0 = new q0.u$a
                r0.<init>()
                java.lang.String r1 = "v"
                r0.a(r1, r10)
                java.lang.String r1 = r8.e
                java.lang.String r10 = "client"
                r0.a(r10, r1)
                java.lang.String r1 = "e"
                r0.a(r1, r3)
                java.lang.String r1 = "upload_time"
                r0.a(r1, r12)
                java.lang.String r1 = "checksum"
                r0.a(r1, r11)
                q0.u r1 = new q0.u
                java.util.List<java.lang.String> r3 = r0.a
                java.util.List<java.lang.String> r0 = r0.b
                r1.<init>(r3, r0)
                q0.b0$a r0 = new q0.b0$a     // Catch:{ IllegalArgumentException -> 0x01d8 }
                r0.<init>()     // Catch:{ IllegalArgumentException -> 0x01d8 }
                java.lang.String r3 = r8.I     // Catch:{ IllegalArgumentException -> 0x01d8 }
                r0.h(r3)     // Catch:{ IllegalArgumentException -> 0x01d8 }
                java.lang.String r3 = "body"
                m0.n.b.i.e(r1, r3)     // Catch:{ IllegalArgumentException -> 0x01d8 }
                java.lang.String r3 = "POST"
                r0.e(r3, r1)     // Catch:{ IllegalArgumentException -> 0x01d8 }
                r1 = 0
                boolean r1 = i0.c.a.r.d(r1)     // Catch:{ IllegalArgumentException -> 0x01d8 }
                if (r1 != 0) goto L_0x00d3
                java.lang.String r1 = "Authorization"
                java.lang.String r3 = "Bearer null"
                r0.a(r1, r3)     // Catch:{ IllegalArgumentException -> 0x01d8 }
            L_0x00d3:
                q0.b0 r0 = r0.b()     // Catch:{ IllegalArgumentException -> 0x01d8 }
                r1 = 1
                q0.f r0 = r2.newCall(r0)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                q0.e0 r0 = r0.execute()     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                q0.f0 r2 = r0.a2     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r2 = r2.string()     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r3 = "success"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                if (r3 == 0) goto L_0x0105
                i0.c.a.s r0 = r8.J     // Catch:{ ConnectException | UnknownHostException -> 0x01cf, IOException -> 0x0102, AssertionError -> 0x00ff, Exception -> 0x00fc }
                i0.c.a.g r10 = new i0.c.a.g     // Catch:{ ConnectException | UnknownHostException -> 0x01cf, IOException -> 0x0102, AssertionError -> 0x00ff, Exception -> 0x00fc }
                r2 = r10
                r3 = r8
                r2.<init>(r3, r4, r6)     // Catch:{ ConnectException | UnknownHostException -> 0x01cf, IOException -> 0x0102, AssertionError -> 0x00ff, Exception -> 0x00fc }
                r0.a(r10)     // Catch:{ ConnectException | UnknownHostException -> 0x01cf, IOException -> 0x0102, AssertionError -> 0x00ff, Exception -> 0x00fc }
                goto L_0x01cf
            L_0x00fc:
                r0 = move-exception
                goto L_0x01ae
            L_0x00ff:
                r0 = move-exception
                goto L_0x01b8
            L_0x0102:
                r0 = move-exception
                goto L_0x01c2
            L_0x0105:
                java.lang.String r3 = "invalid_api_key"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                if (r3 == 0) goto L_0x0118
                i0.c.a.k r0 = i0.c.a.k.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r1 = i0.c.a.f.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r2 = "Invalid API key, make sure your API key is correct in initialize()"
                r0.a(r1, r2)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                goto L_0x01ce
            L_0x0118:
                java.lang.String r3 = "bad_checksum"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                if (r3 == 0) goto L_0x012b
                i0.c.a.k r0 = i0.c.a.k.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r1 = i0.c.a.f.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r2 = "Bad checksum, post request was mangled in transit, will attempt to reupload later"
                r0.c(r1, r2)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                goto L_0x01ce
            L_0x012b:
                java.lang.String r3 = "request_db_write_failed"
                boolean r3 = r2.equals(r3)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                if (r3 == 0) goto L_0x013e
                i0.c.a.k r0 = i0.c.a.k.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r1 = i0.c.a.f.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r2 = "Couldn't write to request database on server, will attempt to reupload later"
                r0.c(r1, r2)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                goto L_0x01ce
            L_0x013e:
                int r0 = r0.y     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r3 = 413(0x19d, float:5.79E-43)
                if (r0 != r3) goto L_0x018e
                boolean r0 = r8.C     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                if (r0 == 0) goto L_0x0160
                int r0 = r8.D     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                if (r0 != r1) goto L_0x0160
                r2 = 0
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x0157
                i0.c.a.m r0 = r8.d     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r0.N(r4)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
            L_0x0157:
                int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r0 < 0) goto L_0x0160
                i0.c.a.m r0 = r8.d     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r0.T(r6)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
            L_0x0160:
                r8.C = r1     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                i0.c.a.m r0 = r8.d     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                long r0 = r0.l()     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                int r0 = (int) r0     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                int r1 = r8.D     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                int r0 = java.lang.Math.min(r0, r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                double r0 = (double) r0     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r2 = 4611686018427387904(0x4000000000000000, double:2.0)
                double r0 = r0 / r2
                double r0 = java.lang.Math.ceil(r0)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                int r0 = (int) r0     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r8.D = r0     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                i0.c.a.k r0 = i0.c.a.k.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r1 = i0.c.a.f.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r2 = "Request too large, will decrease size and attempt to reupload"
                r0.c(r1, r2)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                i0.c.a.s r0 = r8.J     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                i0.c.a.h r1 = new i0.c.a.h     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r1.<init>(r8)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r0.a(r1)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                goto L_0x01ce
            L_0x018e:
                i0.c.a.k r0 = i0.c.a.k.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r1 = i0.c.a.f.a     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r3.<init>()     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r4 = "Upload failed, "
                r3.append(r4)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r3.append(r2)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r2 = ", will attempt to reupload later"
                r3.append(r2)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                java.lang.String r2 = r3.toString()     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                r0.c(r1, r2)     // Catch:{ ConnectException | UnknownHostException -> 0x01ce, IOException -> 0x01c0, AssertionError -> 0x01b6, Exception -> 0x01ac }
                goto L_0x01ce
            L_0x01ac:
                r0 = move-exception
                r1 = 0
            L_0x01ae:
                i0.c.a.k r2 = i0.c.a.k.a
                java.lang.String r3 = i0.c.a.f.a
                r2.b(r3, r9, r0)
                goto L_0x01cf
            L_0x01b6:
                r0 = move-exception
                r1 = 0
            L_0x01b8:
                i0.c.a.k r2 = i0.c.a.k.a
                java.lang.String r3 = i0.c.a.f.a
                r2.b(r3, r9, r0)
                goto L_0x01cf
            L_0x01c0:
                r0 = move-exception
                r1 = 0
            L_0x01c2:
                i0.c.a.k r2 = i0.c.a.k.a
                java.lang.String r3 = i0.c.a.f.a
                java.lang.String r0 = r0.toString()
                r2.a(r3, r0)
                goto L_0x01cf
            L_0x01ce:
                r1 = 0
            L_0x01cf:
                if (r1 != 0) goto L_0x01ea
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.H
                r1 = 0
                r0.set(r1)
                goto L_0x01ea
            L_0x01d8:
                r0 = move-exception
                i0.c.a.k r1 = i0.c.a.k.a
                java.lang.String r2 = i0.c.a.f.a
                java.lang.String r0 = r0.toString()
                r1.a(r2, r0)
                java.util.concurrent.atomic.AtomicBoolean r0 = r8.H
                r1 = 0
                r0.set(r1)
            L_0x01ea:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.c.a.f.a.run():void");
        }
    }

    /* compiled from: AmplitudeClient */
    public class b implements Runnable {
        public final /* synthetic */ JSONObject Y1;
        public final /* synthetic */ long Z1;
        public final /* synthetic */ boolean a2;
        public final /* synthetic */ String c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ JSONObject q;
        public final /* synthetic */ JSONObject x;
        public final /* synthetic */ JSONObject y;

        public b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j, boolean z) {
            this.c = str;
            this.d = jSONObject;
            this.q = jSONObject2;
            this.x = jSONObject3;
            this.y = jSONObject4;
            this.Y1 = jSONObject5;
            this.Z1 = j;
            this.a2 = z;
        }

        public void run() {
            if (!r.d(f.this.e)) {
                f.this.g(this.c, this.d, this.q, this.x, this.y, this.Y1, this.Z1, this.a2);
            }
        }
    }

    public f() {
        this((String) null);
    }

    public static void k(SharedPreferences sharedPreferences, String str, long j2, m mVar, String str2) {
        if (mVar.v(str2) == null) {
            mVar.H(str2, Long.valueOf(sharedPreferences.getLong(str, j2)));
            sharedPreferences.edit().remove(str).apply();
        }
    }

    public static void l(SharedPreferences sharedPreferences, String str, String str2, m mVar, String str3) {
        if (r.d(mVar.C(str3))) {
            String string = sharedPreferences.getString(str, (String) null);
            if (!r.d(string)) {
                mVar.I(str3, string);
                sharedPreferences.edit().remove(str).apply();
            }
        }
    }

    public static boolean u(Context context) {
        String str;
        try {
            str = l.class.getPackage().getName();
        } catch (Exception unused) {
            str = "com.amplitude.api";
        }
        try {
            if ("com.amplitude.api".equals(str)) {
                return false;
            }
            String str2 = str + "." + context.getPackageName();
            SharedPreferences sharedPreferences = context.getSharedPreferences(str2, 0);
            if (sharedPreferences.getAll().size() == 0) {
                return false;
            }
            String str3 = "com.amplitude.api" + "." + context.getPackageName();
            SharedPreferences.Editor edit = context.getSharedPreferences(str3, 0).edit();
            if (sharedPreferences.contains(str + ".previousSessionId")) {
                edit.putLong("com.amplitude.api.previousSessionId", sharedPreferences.getLong(str + ".previousSessionId", -1));
            }
            if (sharedPreferences.contains(str + ".deviceId")) {
                edit.putString("com.amplitude.api.deviceId", sharedPreferences.getString(str + ".deviceId", (String) null));
            }
            if (sharedPreferences.contains(str + ".userId")) {
                edit.putString("com.amplitude.api.userId", sharedPreferences.getString(str + ".userId", (String) null));
            }
            if (sharedPreferences.contains(str + ".optOut")) {
                edit.putBoolean("com.amplitude.api.optOut", sharedPreferences.getBoolean(str + ".optOut", false));
            }
            edit.apply();
            sharedPreferences.edit().clear().apply();
            k kVar = k.a;
            String str4 = a;
            String str5 = "Upgraded shared preferences from " + str2 + " to " + str3;
            if (kVar.b && kVar.c <= 4) {
                Log.i(str4, str5);
            }
            return true;
        } catch (Exception e2) {
            k.a.b(a, "Error upgrading shared preferences", e2);
            return false;
        }
    }

    public static boolean v(Context context) {
        m i2 = m.i(context, (String) null);
        String C2 = i2.C(AnalyticsRequestFactory.FIELD_DEVICE_ID);
        Long v2 = i2.v("previous_session_id");
        Long v3 = i2.v("last_event_time");
        if (!r.d(C2) && v2 != null && v3 != null) {
            return true;
        }
        StringBuilder S0 = i0.d.a.a.a.S0("com.amplitude.api", ".");
        S0.append(context.getPackageName());
        SharedPreferences sharedPreferences = context.getSharedPreferences(S0.toString(), 0);
        l(sharedPreferences, "com.amplitude.api.deviceId", (String) null, i2, AnalyticsRequestFactory.FIELD_DEVICE_ID);
        SharedPreferences sharedPreferences2 = sharedPreferences;
        m mVar = i2;
        k(sharedPreferences2, "com.amplitude.api.lastEventTime", -1, mVar, "last_event_time");
        k(sharedPreferences2, "com.amplitude.api.lastEventId", -1, mVar, "last_event_id");
        k(sharedPreferences2, "com.amplitude.api.lastIdentifyId", -1, mVar, "last_identify_id");
        k(sharedPreferences2, "com.amplitude.api.previousSessionId", -1, mVar, "previous_session_id");
        l(sharedPreferences, "com.amplitude.api.userId", (String) null, i2, "user_id");
        if (i2.v("opt_out") != null) {
            return true;
        }
        i2.H("opt_out", Long.valueOf(sharedPreferences.getBoolean("com.amplitude.api.optOut", false) ? 1 : 0));
        sharedPreferences.edit().remove("com.amplitude.api.optOut").apply();
        return true;
    }

    public synchronized boolean a(String str) {
        if (this.b == null) {
            k kVar = k.a;
            String str2 = a;
            kVar.a(str2, "context cannot be null, set context with initialize() before calling " + str);
            return false;
        } else if (!r.d(this.e)) {
            return true;
        } else {
            k kVar2 = k.a;
            String str3 = a;
            kVar2.a(str3, "apiKey cannot be null or empty, set apiKey with initialize() before calling " + str);
            return false;
        }
    }

    public final long b(String str, long j2) {
        Long v2 = this.d.v(str);
        return v2 == null ? j2 : v2.longValue();
    }

    public void c(p pVar) {
        if (pVar.b.length() != 0 && a("identify()")) {
            i("$identify", (JSONObject) null, (JSONObject) null, pVar.b, (JSONObject) null, (JSONObject) null, System.currentTimeMillis(), false);
        }
    }

    public final boolean d() {
        return this.p >= 0;
    }

    public final String e() {
        HashSet hashSet = new HashSet();
        hashSet.add("");
        hashSet.add("9774d56d682e549c");
        hashSet.add("unknown");
        hashSet.add("000000000000000");
        hashSet.add("Android");
        hashSet.add("DEFACE");
        hashSet.add("00000000-0000-0000-0000-000000000000");
        String C2 = this.d.C(AnalyticsRequestFactory.FIELD_DEVICE_ID);
        String string = r.c(this.b, this.f).getString(AnalyticsRequestFactory.FIELD_DEVICE_ID, (String) null);
        if (!r.d(C2) && !hashSet.contains(C2)) {
            if (!C2.equals(string)) {
                o(C2);
            }
            return C2;
        } else if (r.d(string) || hashSet.contains(string)) {
            StringBuilder sb = new StringBuilder();
            String str = o.a;
            sb.append(UUID.randomUUID().toString());
            sb.append("R");
            String sb2 = sb.toString();
            o(sb2);
            return sb2;
        } else {
            o(string);
            return string;
        }
    }

    public synchronized f f(Context context, String str, String str2, String str3, f.a aVar) {
        if (context == null) {
            k.a.a(a, "Argument context cannot be null in initialize()");
            return this;
        } else if (r.d(str)) {
            k.a.a(a, "Argument apiKey cannot be null or blank in initialize()");
            return this;
        } else {
            Context applicationContext = context.getApplicationContext();
            this.b = applicationContext;
            this.e = str;
            this.d = m.i(applicationContext, this.f);
            if (r.d(str3)) {
                str3 = "Android";
            }
            this.o = str3;
            n(new a(this, context, aVar, str2, this));
            return this;
        }
    }

    public long g(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j2, boolean z2) {
        long j3;
        Object obj;
        long j4;
        JSONObject jSONObject6;
        JSONObject jSONObject7;
        JSONObject jSONObject8;
        Location d2;
        String str2 = str;
        JSONObject jSONObject9 = jSONObject;
        JSONObject jSONObject10 = jSONObject3;
        JSONObject jSONObject11 = jSONObject4;
        JSONObject jSONObject12 = jSONObject5;
        long j5 = j2;
        String str3 = "platform";
        k kVar = k.a;
        String str4 = "language";
        String str5 = a;
        String str6 = AccountRangeJsonParser.FIELD_COUNTRY;
        String n02 = i0.d.a.a.a.n0("Logged event to Amplitude: ", str2);
        String str7 = "carrier";
        if (kVar.b && kVar.c <= 3) {
            Log.d(str5, n02);
        }
        long j6 = -1;
        if (this.j) {
            return -1;
        }
        if (!z2) {
            if (d()) {
                if (j5 - this.t < this.B) {
                    m(j5);
                } else {
                    q(j5);
                    m(j5);
                }
                j6 = -1;
            } else {
                if (j5 - this.t < this.B) {
                    long j7 = this.u;
                    if (j7 == -1) {
                        q(j5);
                        m(j5);
                    } else {
                        q(j7);
                        m(j5);
                    }
                    j6 = -1;
                } else {
                    j6 = -1;
                    q(j5);
                    m(j5);
                }
            }
        }
        JSONObject jSONObject13 = new JSONObject();
        if (str2 == null) {
            try {
                long j8 = j6;
                obj = JSONObject.NULL;
                j3 = j8;
            } catch (JSONException e2) {
                e = e2;
                j3 = j6;
                k.a.a(a, String.format("JSON Serialization of event type %s failed, skipping: %s", new Object[]{str2, e.toString()}));
                return j3;
            }
        } else {
            j3 = j6;
            obj = str2;
        }
        try {
            jSONObject13.put("event_type", obj);
            jSONObject13.put("timestamp", j5);
            Object obj2 = this.g;
            if (obj2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject13.put("user_id", obj2);
            Object obj3 = this.h;
            if (obj3 == null) {
                obj3 = JSONObject.NULL;
            }
            jSONObject13.put(AnalyticsRequestFactory.FIELD_DEVICE_ID, obj3);
            if (z2) {
                j4 = j3;
            } else {
                j4 = this.p;
            }
            jSONObject13.put("session_id", j4);
            jSONObject13.put("uuid", (Object) UUID.randomUUID().toString());
            long j9 = this.q + 1;
            this.q = j9;
            this.d.H("sequence_number", Long.valueOf(j9));
            jSONObject13.put("sequence_number", this.q);
            if (!this.l.c.contains("version_name")) {
                Object obj4 = this.v.b().c;
                if (obj4 == null) {
                    obj4 = JSONObject.NULL;
                }
                jSONObject13.put("version_name", obj4);
            }
            if (!this.l.c.contains(AnalyticsRequestFactory.FIELD_OS_NAME)) {
                Object obj5 = this.v.b().d;
                if (obj5 == null) {
                    obj5 = JSONObject.NULL;
                }
                jSONObject13.put(AnalyticsRequestFactory.FIELD_OS_NAME, obj5);
            }
            if (!this.l.c.contains(AnalyticsRequestFactory.FIELD_OS_VERSION)) {
                Object obj6 = this.v.b().e;
                if (obj6 == null) {
                    obj6 = JSONObject.NULL;
                }
                jSONObject13.put(AnalyticsRequestFactory.FIELD_OS_VERSION, obj6);
            }
            if (!this.l.c.contains("api_level")) {
                Object valueOf = Integer.valueOf(Build.VERSION.SDK_INT);
                if (valueOf == null) {
                    valueOf = JSONObject.NULL;
                }
                jSONObject13.put("api_level", valueOf);
            }
            if (!this.l.c.contains("device_brand")) {
                Object obj7 = this.v.b().f;
                if (obj7 == null) {
                    obj7 = JSONObject.NULL;
                }
                jSONObject13.put("device_brand", obj7);
            }
            if (!this.l.c.contains("device_manufacturer")) {
                Object obj8 = this.v.b().g;
                if (obj8 == null) {
                    obj8 = JSONObject.NULL;
                }
                jSONObject13.put("device_manufacturer", obj8);
            }
            if (!this.l.c.contains("device_model")) {
                Object obj9 = this.v.b().h;
                if (obj9 == null) {
                    obj9 = JSONObject.NULL;
                }
                jSONObject13.put("device_model", obj9);
            }
            String str8 = str7;
            if (!this.l.c.contains(str8)) {
                Object obj10 = this.v.b().i;
                if (obj10 == null) {
                    obj10 = JSONObject.NULL;
                }
                jSONObject13.put(str8, obj10);
            }
            String str9 = str6;
            if (!this.l.c.contains(str9)) {
                Object obj11 = this.v.b().b;
                if (obj11 == null) {
                    obj11 = JSONObject.NULL;
                }
                jSONObject13.put(str9, obj11);
            }
            String str10 = str4;
            if (!this.l.c.contains(str10)) {
                Object obj12 = this.v.b().j;
                if (obj12 == null) {
                    obj12 = JSONObject.NULL;
                }
                jSONObject13.put(str10, obj12);
            }
            String str11 = str3;
            if (!this.l.c.contains(str11)) {
                jSONObject13.put(str11, (Object) this.o);
            }
            JSONObject jSONObject14 = new JSONObject();
            String str12 = this.E;
            if (str12 == null) {
                str12 = "unknown-library";
            }
            jSONObject14.put("name", (Object) str12);
            String str13 = this.F;
            if (str13 == null) {
                str13 = "unknown-version";
            }
            jSONObject14.put("version", (Object) str13);
            jSONObject13.put("library", (Object) jSONObject14);
            JSONObject jSONObject15 = jSONObject2 == null ? new JSONObject() : jSONObject2;
            JSONObject jSONObject16 = this.m;
            if (jSONObject16 != null && jSONObject16.length() > 0) {
                jSONObject15.put("tracking_options", (Object) this.m);
            }
            if ((!this.l.c.contains("lat_lng")) && (d2 = this.v.d()) != null) {
                JSONObject jSONObject17 = new JSONObject();
                jSONObject17.put("lat", d2.getLatitude());
                jSONObject17.put("lng", d2.getLongitude());
                jSONObject15.put("location", (Object) jSONObject17);
            }
            if ((!this.l.c.contains("adid")) && this.v.a() != null) {
                jSONObject15.put("androidADID", (Object) this.v.a());
            }
            jSONObject15.put("limit_ad_tracking", this.v.b().k);
            jSONObject15.put("gps_enabled", this.v.b().l);
            jSONObject13.put("api_properties", (Object) jSONObject15);
            JSONObject jSONObject18 = jSONObject;
            if (jSONObject18 == null) {
                jSONObject6 = new JSONObject();
            } else {
                jSONObject6 = s(jSONObject18);
            }
            jSONObject13.put("event_properties", (Object) jSONObject6);
            JSONObject jSONObject19 = jSONObject3;
            if (jSONObject19 == null) {
                jSONObject7 = new JSONObject();
            } else {
                jSONObject7 = s(jSONObject19);
            }
            jSONObject13.put("user_properties", (Object) jSONObject7);
            JSONObject jSONObject20 = jSONObject4;
            jSONObject13.put("groups", (Object) jSONObject20 == null ? new JSONObject() : s(jSONObject20));
            JSONObject jSONObject21 = jSONObject5;
            if (jSONObject21 == null) {
                jSONObject8 = new JSONObject();
            } else {
                jSONObject8 = s(jSONObject21);
            }
            jSONObject13.put("group_properties", (Object) jSONObject8);
            return p(str2, jSONObject13);
        } catch (JSONException e3) {
            e = e3;
            k.a.a(a, String.format("JSON Serialization of event type %s failed, skipping: %s", new Object[]{str2, e.toString()}));
            return j3;
        }
    }

    public void h(String str, JSONObject jSONObject) {
        boolean z2;
        long currentTimeMillis = System.currentTimeMillis();
        if (r.d(str)) {
            k.a.a(a, "Argument eventType cannot be null or blank in logEvent()");
            z2 = false;
        } else {
            z2 = a("logEvent()");
        }
        if (z2) {
            i(str, jSONObject, (JSONObject) null, (JSONObject) null, (JSONObject) null, (JSONObject) null, currentTimeMillis, false);
        }
    }

    public void i(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5, long j2, boolean z2) {
        n(new b(str, jSONObject != null ? r.b(jSONObject) : jSONObject, (JSONObject) null, jSONObject3 != null ? r.b(jSONObject3) : jSONObject3, jSONObject4 != null ? r.b(jSONObject4) : jSONObject4, (JSONObject) null, j2, z2));
    }

    public Pair<Pair<Long, Long>, JSONArray> j(List<JSONObject> list, List<JSONObject> list2, long j2) throws JSONException {
        long j3;
        long j4;
        JSONArray jSONArray = new JSONArray();
        long j5 = -1;
        long j6 = -1;
        while (true) {
            if (((long) jSONArray.length()) >= j2) {
                break;
            }
            boolean isEmpty = list.isEmpty();
            boolean isEmpty2 = list2.isEmpty();
            if (isEmpty && isEmpty2) {
                k.a.c(a, String.format("mergeEventsAndIdentifys: number of events and identifys less than expected by %d", new Object[]{Long.valueOf(j2 - ((long) jSONArray.length()))}));
                break;
            }
            if (isEmpty2) {
                JSONObject remove = list.remove(0);
                j3 = remove.getLong("event_id");
                jSONArray.put((Object) remove);
            } else {
                if (isEmpty) {
                    JSONObject remove2 = list2.remove(0);
                    j4 = remove2.getLong("event_id");
                    jSONArray.put((Object) remove2);
                } else if (!list.get(0).has("sequence_number") || list.get(0).getLong("sequence_number") < list2.get(0).getLong("sequence_number")) {
                    JSONObject remove3 = list.remove(0);
                    j3 = remove3.getLong("event_id");
                    jSONArray.put((Object) remove3);
                } else {
                    JSONObject remove4 = list2.remove(0);
                    j4 = remove4.getLong("event_id");
                    jSONArray.put((Object) remove4);
                }
                j6 = j4;
            }
            j5 = j3;
        }
        return new Pair<>(new Pair(Long.valueOf(j5), Long.valueOf(j6)), jSONArray);
    }

    public void m(long j2) {
        if (d()) {
            this.t = j2;
            this.d.H("last_event_time", Long.valueOf(j2));
        }
    }

    public void n(Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        s sVar = this.J;
        if (currentThread != sVar) {
            sVar.b();
            sVar.c.post(runnable);
            return;
        }
        runnable.run();
    }

    public final void o(String str) {
        this.d.I(AnalyticsRequestFactory.FIELD_DEVICE_ID, str);
        SharedPreferences.Editor edit = r.c(this.b, this.f).edit();
        edit.putString(AnalyticsRequestFactory.FIELD_DEVICE_ID, str);
        edit.apply();
    }

    public long p(String str, JSONObject jSONObject) {
        long n2;
        long w2;
        long a2;
        long a3;
        String jSONObject2 = jSONObject.toString();
        if (r.d(jSONObject2)) {
            k.a.a(a, String.format("Detected empty event string for event type %s, skipping", new Object[]{str}));
            return -1;
        }
        if (str.equals("$identify") || str.equals("$groupidentify")) {
            m mVar = this.d;
            synchronized (mVar) {
                a2 = mVar.a("identifys", jSONObject2);
            }
            this.s = a2;
            this.s = a2;
            this.d.H("last_identify_id", Long.valueOf(a2));
        } else {
            m mVar2 = this.d;
            synchronized (mVar2) {
                a3 = mVar2.a("events", jSONObject2);
            }
            this.r = a3;
            this.r = a3;
            this.d.H("last_event_id", Long.valueOf(a3));
        }
        int min = Math.min(Math.max(1, this.y / 10), 20);
        if (this.d.l() > ((long) this.y)) {
            m mVar3 = this.d;
            long j2 = (long) min;
            synchronized (mVar3) {
                w2 = mVar3.w("events", j2);
            }
            synchronized (mVar3) {
                mVar3.Q("events", w2);
            }
        }
        m mVar4 = this.d;
        synchronized (mVar4) {
            n2 = mVar4.n("identifys");
        }
        if (n2 > ((long) this.y)) {
            m mVar5 = this.d;
            mVar5.U(mVar5.y((long) min));
        }
        long z2 = this.d.z();
        long j3 = (long) this.w;
        if (z2 % j3 != 0 || z2 < j3) {
            long j4 = this.z;
            if (!this.G.getAndSet(true)) {
                s sVar = this.J;
                e eVar = new e(this);
                sVar.b();
                sVar.c.postDelayed(eVar, j4);
            }
        } else {
            t(false);
        }
        return (str.equals("$identify") || str.equals("$groupidentify")) ? this.s : this.r;
    }

    public final void q(long j2) {
        this.p = j2;
        this.u = j2;
        this.d.H("previous_session_id", Long.valueOf(j2));
    }

    public JSONArray r(JSONArray jSONArray) throws JSONException {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj.getClass().equals(String.class)) {
                String str = (String) obj;
                if (str.length() > 1024) {
                    str = str.substring(0, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE);
                }
                jSONArray.put(i2, (Object) str);
            } else if (obj.getClass().equals(JSONObject.class)) {
                jSONArray.put(i2, (Object) s((JSONObject) obj));
            } else if (obj.getClass().equals(JSONArray.class)) {
                jSONArray.put(i2, (Object) r((JSONArray) obj));
            }
        }
        return jSONArray;
    }

    public JSONObject s(JSONObject jSONObject) {
        if (jSONObject.length() > 1000) {
            k.a.c(a, "Warning: too many properties (more than 1000), ignoring");
            return new JSONObject();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Object obj = jSONObject.get(next);
                if (!next.equals("$receipt")) {
                    if (!next.equals("$receiptSig")) {
                        if (obj.getClass().equals(String.class)) {
                            String str = (String) obj;
                            if (str.length() > 1024) {
                                str = str.substring(0, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE);
                            }
                            jSONObject.put(next, (Object) str);
                        } else if (obj.getClass().equals(JSONObject.class)) {
                            jSONObject.put(next, (Object) s((JSONObject) obj));
                        } else if (obj.getClass().equals(JSONArray.class)) {
                            jSONObject.put(next, (Object) r((JSONArray) obj));
                        }
                    }
                }
                jSONObject.put(next, obj);
            } catch (JSONException e2) {
                k.a.a(a, e2.toString());
            }
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r12.H.set(false);
        i0.c.a.k.a.a(a, java.lang.String.format("Caught Cursor window exception during event upload, deferring upload: %s", new java.lang.Object[]{r13.getMessage()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        r12.H.set(false);
        i0.c.a.k.a.a(a, r13.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t(boolean r13) {
        /*
            r12 = this;
            boolean r0 = r12.j
            if (r0 != 0) goto L_0x00c1
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.H
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 != 0) goto L_0x00c1
            i0.c.a.m r0 = r12.d
            long r2 = r0.z()
            if (r13 == 0) goto L_0x0018
            int r13 = r12.D
            goto L_0x001a
        L_0x0018:
            int r13 = r12.x
        L_0x001a:
            long r4 = (long) r13
            long r2 = java.lang.Math.min(r4, r2)
            r4 = 0
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r0 = 0
            if (r13 > 0) goto L_0x002c
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.H
            r13.set(r0)
            return
        L_0x002c:
            i0.c.a.m r13 = r12.d     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            long r8 = r12.r     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            monitor-enter(r13)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.String r7 = "events"
            r6 = r13
            r10 = r2
            java.util.List r4 = r6.q(r7, r8, r10)     // Catch:{ all -> 0x0091 }
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            i0.c.a.m r13 = r12.d     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            long r8 = r12.s     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            monitor-enter(r13)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.String r7 = "identifys"
            r6 = r13
            r10 = r2
            java.util.List r5 = r6.q(r7, r8, r10)     // Catch:{ all -> 0x008e }
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            android.util.Pair r13 = r12.j(r4, r5, r2)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.Object r2 = r13.second     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            org.json.JSONArray r2 = (org.json.JSONArray) r2     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            int r2 = r2.length()     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            if (r2 != 0) goto L_0x005c
            java.util.concurrent.atomic.AtomicBoolean r13 = r12.H     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            r13.set(r0)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            return
        L_0x005c:
            java.lang.Object r2 = r13.first     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.Object r2 = r2.first     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            long r6 = r2.longValue()     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.Object r2 = r13.first     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.Object r2 = r2.second     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            long r8 = r2.longValue()     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.Object r13 = r13.second     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            org.json.JSONArray r13 = (org.json.JSONArray) r13     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            java.lang.String r5 = r13.toString()     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            i0.c.a.s r13 = r12.K     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            i0.c.a.f$a r2 = new i0.c.a.f$a     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            r3 = r2
            r4 = r12
            r3.<init>(r5, r6, r8)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            r13.b()     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            android.os.Handler r13 = r13.c     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            r13.post(r2)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            goto L_0x00c1
        L_0x008e:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            throw r2     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
        L_0x0091:
            r2 = move-exception
            monitor-exit(r13)     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
            throw r2     // Catch:{ JSONException -> 0x00b0, CursorWindowAllocationException -> 0x0094 }
        L_0x0094:
            r13 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r2 = r12.H
            r2.set(r0)
            i0.c.a.k r2 = i0.c.a.k.a
            java.lang.String r3 = a
            java.lang.String r4 = "Caught Cursor window exception during event upload, deferring upload: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r13 = r13.getMessage()
            r1[r0] = r13
            java.lang.String r13 = java.lang.String.format(r4, r1)
            r2.a(r3, r13)
            goto L_0x00c1
        L_0x00b0:
            r13 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.H
            r1.set(r0)
            i0.c.a.k r0 = i0.c.a.k.a
            java.lang.String r1 = a
            java.lang.String r13 = r13.toString()
            r0.a(r1, r13)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.c.a.f.t(boolean):void");
    }

    public f(String str) {
        this.i = false;
        this.j = false;
        q qVar = new q();
        this.k = qVar;
        q qVar2 = new q();
        for (String add : qVar.c) {
            qVar2.c.add(add);
        }
        this.l = qVar2;
        JSONObject jSONObject = new JSONObject();
        if (!qVar2.c.isEmpty()) {
            for (String str2 : q.b) {
                if (qVar2.c.contains(str2)) {
                    try {
                        jSONObject.put(str2, false);
                    } catch (JSONException e2) {
                        k.a.a(q.a, e2.toString());
                    }
                }
            }
        }
        this.m = jSONObject;
        this.n = true;
        this.p = -1;
        this.q = 0;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.w = 30;
        this.x = 50;
        this.y = 1000;
        this.z = 30000;
        this.A = 300000;
        this.B = 1800000;
        this.C = false;
        this.D = 50;
        this.E = "amplitude-android";
        this.F = "2.31.0";
        this.G = new AtomicBoolean(false);
        this.H = new AtomicBoolean(false);
        this.I = "https://api2.amplitude.com/";
        this.J = new s("logThread");
        this.K = new s("httpThread");
        this.f = r.e(str);
        this.J.start();
        this.K.start();
    }
}
