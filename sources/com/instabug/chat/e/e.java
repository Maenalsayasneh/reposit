package com.instabug.chat.e;

import android.annotation.SuppressLint;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: MessageAction */
public class e implements Cacheable {
    public a c;
    public String d;
    public String q;

    /* compiled from: MessageAction */
    public enum a {
        BUTTON("button"),
        NOT_AVAILABLE("not-available");
        
        private final String name;

        private a(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_PARAMETER_ANNOTATION"})
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!String.valueOf(eVar.d).equals(String.valueOf(this.d)) || !String.valueOf(eVar.q).equals(String.valueOf(this.q)) || eVar.c != this.c) {
            return false;
        }
        return true;
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("url")) {
            this.q = jSONObject.getString("url");
        }
        if (jSONObject.has(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE)) {
            this.d = jSONObject.getString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE);
        }
        if (jSONObject.has("type")) {
            String string = jSONObject.getString("type");
            string.hashCode();
            if (!string.equals("button")) {
                this.c = a.NOT_AVAILABLE;
            } else {
                this.c = a.BUTTON;
            }
        }
    }

    public int hashCode() {
        if (this.d == null || this.q == null || this.c == null) {
            return -1;
        }
        return (String.valueOf(this.d.hashCode()) + String.valueOf(this.q.hashCode()) + String.valueOf(this.c.toString().hashCode())).hashCode();
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) this.c.toString());
        jSONObject.put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, (Object) this.d);
        jSONObject.put("url", (Object) this.q);
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Type: ");
        P0.append(this.c);
        P0.append(", title: ");
        P0.append(this.d);
        P0.append(", url: ");
        P0.append(this.q);
        return P0.toString();
    }
}
