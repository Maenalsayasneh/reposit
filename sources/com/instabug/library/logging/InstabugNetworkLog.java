package com.instabug.library.logging;

import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.model.NetworkLog;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.pubnub.api.vendor.FileEncryptionUtil;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressFBWarnings({"NM_METHOD_NAMING_CONVENTION"})
public class InstabugNetworkLog {
    public static final String TAG = "InstabugNetworkLog";
    /* access modifiers changed from: private */
    public NetworkLog networkLog = new NetworkLog();

    public class a implements VoidRunnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;

        public a(int i, String str, String str2, String str3, String str4) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
        }

        public void run() throws Exception {
            Class<String> cls = String.class;
            AnalyticsWrapper.getInstance().catchApiUsage("NetworkLog.log", i0.d.a.a.a.O("connection", HttpURLConnection.class), i0.d.a.a.a.O("requestBody", cls), i0.d.a.a.a.O("responseBody", cls));
            if (InstabugNetworkLog.this.networkLog == null) {
                NetworkLog unused = InstabugNetworkLog.this.networkLog = new NetworkLog();
            }
            InstabugNetworkLog.this.networkLog.setResponseCode(this.a);
            NetworkLog access$000 = InstabugNetworkLog.this.networkLog;
            access$000.setDate(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds() + "");
            InstabugNetworkLog.this.networkLog.setMethod(this.b);
            InstabugNetworkLog.this.networkLog.setUrl(this.c);
            try {
                InstabugNetworkLog.this.networkLog.setRequest(InstabugNetworkLog.this.validateBody(this.d));
                InstabugNetworkLog.this.networkLog.setResponse(InstabugNetworkLog.this.validateBody(this.e));
                InstabugNetworkLog.this.insert();
                InstabugSDKLogger.d(InstabugNetworkLog.TAG, "adding network log: " + InstabugNetworkLog.this.networkLog.toString());
            } catch (IllegalArgumentException unused2) {
                InstabugSDKLogger.d(InstabugNetworkLog.TAG, "Content-type is not allowed to be logged");
                NetworkLog unused3 = InstabugNetworkLog.this.networkLog = null;
            }
        }
    }

    public class b implements VoidRunnable {
        public final /* synthetic */ HttpURLConnection a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public b(HttpURLConnection httpURLConnection, String str, String str2) {
            this.a = httpURLConnection;
            this.b = str;
            this.c = str2;
        }

        public void run() throws Exception {
            Class<String> cls = String.class;
            AnalyticsWrapper.getInstance().catchApiUsage("NetworkLog.log", i0.d.a.a.a.O("connection", HttpURLConnection.class), i0.d.a.a.a.O("requestBody", cls), i0.d.a.a.a.O("responseBody", cls));
            if (InstabugNetworkLog.this.networkLog == null) {
                NetworkLog unused = InstabugNetworkLog.this.networkLog = new NetworkLog();
            }
            InstabugNetworkLog.this.networkLog.setResponseCode(this.a.getResponseCode());
            NetworkLog access$000 = InstabugNetworkLog.this.networkLog;
            access$000.setDate(InstabugDateFormatter.getCurrentUTCTimeStampInMiliSeconds() + "");
            InstabugNetworkLog.this.networkLog.setMethod(this.a.getRequestMethod());
            InstabugNetworkLog.this.networkLog.setUrl(this.a.getURL().toString());
            try {
                InstabugNetworkLog.this.addHeaders(this.a);
                InstabugNetworkLog.this.networkLog.setRequest(InstabugNetworkLog.this.validateBody(this.b));
                InstabugNetworkLog.this.networkLog.setResponse(InstabugNetworkLog.this.validateBody(this.c));
            } catch (JSONException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException unused2) {
                InstabugSDKLogger.d(InstabugNetworkLog.TAG, "Content-type is not allowed to be logged");
                NetworkLog unused3 = InstabugNetworkLog.this.networkLog = null;
                return;
            }
            InstabugNetworkLog.this.insert();
            InstabugSDKLogger.d(InstabugNetworkLog.TAG, "adding network log: " + InstabugNetworkLog.this.networkLog.toString());
        }
    }

    /* access modifiers changed from: private */
    public void addHeaders(HttpURLConnection httpURLConnection) throws JSONException, IllegalArgumentException {
        List<String> list;
        JSONObject jSONObject = new JSONObject();
        for (String str : httpURLConnection.getHeaderFields().keySet()) {
            if (!(str == null || (list = (List) httpURLConnection.getHeaderFields().get(str)) == null || list.isEmpty())) {
                for (String str2 : list) {
                    if (!str.equalsIgnoreCase(NetworkLog.CONTENT_TYPE) || str2.contains(NetworkLog.JSON) || str2.contains(NetworkLog.XML_1) || str2.contains(NetworkLog.XML_2) || str2.contains(NetworkLog.PROTOBUF) || str2.contains(NetworkLog.HTML) || str2.contains(NetworkLog.PLAIN_TEXT)) {
                        jSONObject.put(str, (Object) str2);
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                continue;
            }
        }
        if (this.networkLog == null) {
            this.networkLog = new NetworkLog();
        }
        this.networkLog.setRequestHeaders(jSONObject.toString());
    }

    /* access modifiers changed from: private */
    public void insert() {
        NetworkLog networkLog2 = this.networkLog;
        if (networkLog2 != null) {
            networkLog2.insert();
        }
    }

    /* access modifiers changed from: private */
    public String validateBody(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(Charset.forName(FileEncryptionUtil.ENCODING_UTF_8)).length > 500000 ? NetworkLog.LIMIT_ERROR : str;
    }

    @Deprecated
    public void log(String str, String str2, String str3, String str4, int i) throws IOException {
        APIChecker.checkAndRun("NetworkLog.log", new a(i, str2, str, str3, str4));
    }

    public void log(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        APIChecker.checkAndRun("NetworkLog.log", new b(httpURLConnection, str, str2));
    }
}
