package com.instabug.library.model;

import android.annotation.SuppressLint;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStep */
public class i implements Cacheable, Serializable {
    public long c;
    public String d;
    public b q;
    public a x;

    /* compiled from: UserStep */
    public static class a implements Cacheable, Serializable {
        public b c;
        public String d;
        public String q;
        public String x;

        public a() {
        }

        public void fromJson(String str) throws JSONException {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("event")) {
                String string = jSONObject.getString("event");
                string.hashCode();
                char c2 = 65535;
                switch (string.hashCode()) {
                    case -1068318794:
                        if (string.equals("motion")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -907680051:
                        if (string.equals("scroll")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 110749:
                        if (string.equals("pan")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 114595:
                        if (string.equals("tap")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 3619493:
                        if (string.equals("view")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 106671290:
                        if (string.equals("pinch")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 109854522:
                        if (string.equals("swipe")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 779098677:
                        if (string.equals("double_tap")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 1554253136:
                        if (string.equals("application")) {
                            c2 = 8;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        this.c = b.MOTION;
                        break;
                    case 1:
                        this.c = b.SCROLL;
                        break;
                    case 2:
                        this.c = b.LONG_PRESS;
                        break;
                    case 3:
                        this.c = b.TAP;
                        break;
                    case 4:
                        this.c = b.VIEW;
                        break;
                    case 5:
                        this.c = b.PINCH;
                        break;
                    case 6:
                        this.c = b.SWIPE;
                        break;
                    case 7:
                        this.c = b.DOUBLE_TAP;
                        break;
                    case 8:
                        this.c = b.APPLICATION;
                        break;
                    default:
                        this.c = b.NOT_AVAILABLE;
                        break;
                }
            }
            if (jSONObject.has("class")) {
                this.q = jSONObject.getString("class");
            }
            if (jSONObject.has("label")) {
                this.d = jSONObject.getString("label");
            }
            if (jSONObject.has("view")) {
                this.x = jSONObject.getString("view");
            }
        }

        @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
        public String toJson() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", (Object) this.c);
            jSONObject.put("label", (Object) this.d);
            jSONObject.put("class", (Object) this.q);
            jSONObject.put("view", (Object) this.x);
            return jSONObject.toString();
        }

        public a(b bVar, String str, String str2, String str3) {
            this.c = bVar;
            this.d = str;
            this.q = str2;
            this.x = str3;
        }
    }

    /* compiled from: UserStep */
    public enum b {
        APPLICATION("application"),
        VIEW("view"),
        MOTION("motion"),
        TAP("tap"),
        PINCH("pinch"),
        LONG_PRESS("long_press"),
        SCROLL("scroll"),
        SWIPE("swipe"),
        DOUBLE_TAP("double_tap"),
        NOT_AVAILABLE("not_available");
        
        private final String name;

        private b(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("timestamp")) {
            if (StringUtility.isNumeric(jSONObject.getString("timestamp"))) {
                this.c = jSONObject.getLong("timestamp");
            } else {
                try {
                    this.c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).parse(jSONObject.getString("timestamp")).getTime();
                } catch (ParseException e) {
                    InstabugSDKLogger.e("UserStep", e.getMessage());
                }
            }
        }
        if (jSONObject.has(InstabugDbContract.BugEntry.COLUMN_MESSAGE)) {
            this.d = jSONObject.getString(InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        }
        if (jSONObject.has("type")) {
            String string = jSONObject.getString("type");
            string.hashCode();
            char c2 = 65535;
            switch (string.hashCode()) {
                case -1068318794:
                    if (string.equals("motion")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -907680051:
                    if (string.equals("scroll")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -326696768:
                    if (string.equals("long_press")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 114595:
                    if (string.equals("tap")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3619493:
                    if (string.equals("view")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 106671290:
                    if (string.equals("pinch")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 109854522:
                    if (string.equals("swipe")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 779098677:
                    if (string.equals("double_tap")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1554253136:
                    if (string.equals("application")) {
                        c2 = 8;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    this.q = b.MOTION;
                    break;
                case 1:
                    this.q = b.SCROLL;
                    break;
                case 2:
                    this.q = b.LONG_PRESS;
                    break;
                case 3:
                    this.q = b.TAP;
                    break;
                case 4:
                    this.q = b.VIEW;
                    break;
                case 5:
                    this.q = b.PINCH;
                    break;
                case 6:
                    this.q = b.SWIPE;
                    break;
                case 7:
                    this.q = b.DOUBLE_TAP;
                    break;
                case 8:
                    this.q = b.APPLICATION;
                    break;
                default:
                    this.q = b.NOT_AVAILABLE;
                    break;
            }
        }
        if (jSONObject.has("args")) {
            a aVar = new a();
            aVar.fromJson(jSONObject.getString("args"));
            this.x = aVar;
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toJson() throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", this.c);
        jSONObject.put(InstabugDbContract.BugEntry.COLUMN_MESSAGE, (Object) this.d);
        b bVar = this.q;
        if (bVar == null) {
            str = null;
        } else {
            str = bVar.toString();
        }
        jSONObject.put("type", (Object) str);
        a aVar = this.x;
        if (aVar != null) {
            jSONObject.put("args", (Object) aVar.toJson());
        }
        return jSONObject.toString();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("UserStep{timeStamp='");
        P0.append(this.c);
        P0.append('\'');
        P0.append(", message='");
        i0.d.a.a.a.r(P0, this.d, '\'', ", type=");
        P0.append(this.q);
        P0.append('}');
        return P0.toString();
    }
}
