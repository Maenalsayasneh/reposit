package i0.j.f.q;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.model.UserAttributes;
import com.instabug.library.util.InstabugSDKLogger;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: CountryInfo */
public class a implements Cacheable {
    public String c;
    public String d;
    public String q;
    public long x = -1;

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.c = jSONObject.optString(AccountRangeJsonParser.FIELD_COUNTRY);
        this.d = jSONObject.optString("country_code");
        this.q = jSONObject.optString("city");
        this.x = jSONObject.optLong(UserAttributes.KEY_TTL);
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AccountRangeJsonParser.FIELD_COUNTRY, (Object) this.c).put("country_code", (Object) this.d).put("city", (Object) this.q).put(UserAttributes.KEY_TTL, this.x);
        return jSONObject.toString();
    }

    public String toString() {
        try {
            return toJson();
        } catch (JSONException e) {
            InstabugSDKLogger.e("CountryInfo", e.getMessage(), e);
            return super.toString();
        }
    }
}
