package i0.j.e.t0;

import android.annotation.SuppressLint;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.model.UserAttributes;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeaturesCache */
public class a implements Cacheable {
    public long c;
    public String d;
    public String q;

    public a(long j, String str, String str2) {
        this.c = j;
        this.d = str;
        this.q = str2;
    }

    public void fromJson(String str) throws JSONException {
        if (str != null) {
            JSONObject jSONObject = new JSONObject(str);
            this.c = (long) jSONObject.optInt(UserAttributes.KEY_TTL, 0);
            this.d = jSONObject.optString("sdk_version", "");
            this.q = jSONObject.optString("hash", "");
            return;
        }
        this.c = 0;
        this.d = "";
        this.q = "";
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(UserAttributes.KEY_TTL, this.c);
        jSONObject.put("sdk_version", (Object) this.d);
        String str = this.q;
        if (str != null) {
            jSONObject.put("hash", (Object) str);
        }
        return jSONObject.toString();
    }

    @SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
    public a() {
    }
}
