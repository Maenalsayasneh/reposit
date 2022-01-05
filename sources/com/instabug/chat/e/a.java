package com.instabug.chat.e;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.instabug.library.internal.storage.cache.Cacheable;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Attachment */
public class a implements Cacheable, Serializable {
    public boolean Y1 = false;
    public String Z1;
    public String c;
    public String d;
    public String q;
    public String x = "not_available";
    public String y = "not_available";

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String a() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.c);
        if (fileExtensionFromUrl == null || TextUtils.isEmpty(fileExtensionFromUrl)) {
            return this.x;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        return (mimeTypeFromExtension == null || mimeTypeFromExtension.equals("")) ? this.x : mimeTypeFromExtension;
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_PARAMETER_ANNOTATION"})
    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!String.valueOf(aVar.c).equals(String.valueOf(this.c)) || !String.valueOf(aVar.d).equals(String.valueOf(this.d)) || !String.valueOf(aVar.q).equals(String.valueOf(this.q)) || (str = aVar.x) == null || (str2 = this.x) == null || !str.equals(str2) || (str3 = aVar.y) == null || (str4 = this.y) == null || !str3.equals(str4) || aVar.Y1 != this.Y1 || !String.valueOf(aVar.Z1).equals(String.valueOf(this.Z1))) {
            return false;
        }
        return true;
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("name")) {
            this.c = jSONObject.getString("name");
        }
        if (jSONObject.has("local_path")) {
            this.d = jSONObject.getString("local_path");
        }
        if (jSONObject.has("url")) {
            this.q = jSONObject.getString("url");
        }
        if (jSONObject.has("type")) {
            String string = jSONObject.getString("type");
            string.hashCode();
            char c2 = 65535;
            switch (string.hashCode()) {
                case -831439762:
                    if (string.equals("image_gallery")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 93166550:
                    if (string.equals("audio")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 100313435:
                    if (string.equals("image")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 112202875:
                    if (string.equals("video")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1698911340:
                    if (string.equals("extra_image")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1710800780:
                    if (string.equals("extra_video")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1830389646:
                    if (string.equals("video_gallery")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    this.x = "image_gallery";
                    break;
                case 1:
                    this.x = "audio";
                    break;
                case 2:
                    this.x = "image";
                    break;
                case 3:
                    this.x = "video";
                    break;
                case 4:
                    this.x = "extra_image";
                    break;
                case 5:
                    this.x = "extra_video";
                    break;
                case 6:
                    this.x = "video_gallery";
                    break;
                default:
                    this.x = "not_available";
                    break;
            }
        }
        if (jSONObject.has("attachment_state")) {
            String string2 = jSONObject.getString("attachment_state");
            string2.hashCode();
            if (string2.equals("synced")) {
                this.y = "synced";
            } else if (!string2.equals("offline")) {
                this.y = "not_available";
            } else {
                this.y = "offline";
            }
        }
        if (jSONObject.has("video_encoded")) {
            this.Y1 = jSONObject.getBoolean("video_encoded");
        }
        if (jSONObject.has("duration")) {
            this.Z1 = jSONObject.getString("duration");
        }
    }

    public int hashCode() {
        String str = this.c;
        if (str != null) {
            return str.hashCode();
        }
        return -1;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) this.c).put("local_path", (Object) this.d).put("url", (Object) this.q).put("type", (Object) this.x).put("video_encoded", this.Y1).put("duration", (Object) this.Z1);
        String str = this.y;
        if (str != null) {
            jSONObject.put("attachment_state", (Object) str.toString());
        }
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Name: ");
        P0.append(this.c);
        P0.append(", Local Path: ");
        P0.append(this.d);
        P0.append(", Type: ");
        P0.append(this.x);
        P0.append(", Url: ");
        P0.append(this.q);
        P0.append(", Attachment State: ");
        P0.append(this.y);
        return P0.toString();
    }
}
