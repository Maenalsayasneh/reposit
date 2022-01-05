package i0.c.a;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Identify */
public class p {
    public static final String a = "i0.c.a.p";
    public JSONObject b = new JSONObject();
    public Set<String> c = new HashSet();

    public p a(String str, String str2) {
        if (r.d(str)) {
            k.a.c(a, String.format("Attempting to perform operation %s with a null or empty string property, ignoring", new Object[]{"$set"}));
        } else if (this.b.has("$clearAll")) {
            k.a.c(a, String.format("This Identify already contains a $clearAll operation, ignoring operation %s", new Object[]{"$set"}));
        } else if (this.c.contains(str)) {
            k.a.c(a, String.format("Already used property %s in previous operation, ignoring operation %s", new Object[]{str, "$set"}));
        } else {
            try {
                if (!this.b.has("$set")) {
                    this.b.put("$set", (Object) new JSONObject());
                }
                this.b.getJSONObject("$set").put(str, (Object) str2);
                this.c.add(str);
            } catch (JSONException e) {
                k.a.a(a, e.toString());
            }
        }
        return this;
    }
}
