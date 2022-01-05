package com.instabug.survey.e.c;

import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NewFeature */
public class e implements Serializable, Cacheable {
    public long c;
    public String d;
    public String q;
    public String x;

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("id")) {
            this.c = jSONObject.getLong("id");
        } else {
            this.c = -1;
        }
        if (jSONObject.has(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE)) {
            this.d = jSONObject.getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        }
        if (jSONObject.has(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION)) {
            this.q = jSONObject.getString(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION);
        }
        this.x = jSONObject.optString("icon_url", "");
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", this.c).put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, (Object) this.d).put(InstabugDbContract.FeatureRequestEntry.COLUMN_DESCRIPTION, (Object) this.q).put("icon_url", (Object) this.x);
        return jSONObject.toString();
    }
}
