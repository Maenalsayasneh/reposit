package i0.j.b.o.b;

import android.app.Activity;
import android.view.View;
import com.instabug.library.util.InstabugSDKLogger;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ActivityViewInspector */
public class h {
    public static k0.b.w.a a;

    /* compiled from: ActivityViewInspector */
    public static class a {
        public int a = 0;

        public a(a aVar) {
        }

        public boolean a() {
            return this.a > 0;
        }
    }

    public static int a(Activity activity) {
        View decorView = activity.getWindow().getDecorView();
        int height = decorView.getHeight() > decorView.getWidth() ? decorView.getHeight() : decorView.getWidth();
        if (height > 640) {
            return height / 640;
        }
        return 1;
    }

    public static JSONObject b(i iVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = iVar.a;
            if (str != null) {
                jSONObject.put("id", (Object) str);
            }
            String str2 = iVar.b;
            if (str2 != null) {
                jSONObject.put("icon", (Object) str2);
            }
            String str3 = iVar.d;
            if (str3 != null) {
                jSONObject.put("type", (Object) str3);
            }
            JSONObject jSONObject2 = iVar.e;
            if (jSONObject2 != null) {
                jSONObject.put("properties", (Object) jSONObject2);
            }
            JSONObject jSONObject3 = iVar.c;
            if (jSONObject3 != null) {
                jSONObject.put("frame", (Object) jSONObject3);
            }
            if (iVar.g != null && iVar.h) {
                JSONArray jSONArray = new JSONArray();
                Iterator<i> it = iVar.g.iterator();
                while (it.hasNext()) {
                    jSONArray.put((Object) b(it.next()));
                }
                jSONObject.put("nodes", (Object) jSONArray);
            }
        } catch (JSONException e) {
            StringBuilder P0 = i0.d.a.a.a.P0("convert seed view hierarchy to json got json exception: ");
            P0.append(e.getMessage());
            P0.append(", time in MS: ");
            P0.append(System.currentTimeMillis());
            InstabugSDKLogger.e("ActivityViewInspector", P0.toString(), e);
        }
        return jSONObject;
    }
}
