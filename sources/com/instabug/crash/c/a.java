package com.instabug.crash.c;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.State;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Crash */
public class a implements Cacheable {
    public C0101a Y1 = C0101a.NOT_AVAILABLE;
    public boolean Z1;
    public int a2;
    public String c;
    public String d;
    public String q;
    public List<Attachment> x;
    public State y;

    /* renamed from: com.instabug.crash.c.a$a  reason: collision with other inner class name */
    /* compiled from: Crash */
    public enum C0101a {
        READY_TO_BE_SENT,
        LOGS_READY_TO_BE_UPLOADED,
        ATTACHMENTS_READY_TO_BE_UPLOADED,
        NOT_AVAILABLE,
        WAITING_FOR_SCREEN_RECORDING_TO_BE_TRIMMED
    }

    public a a(Uri uri) {
        Attachment.Type type = Attachment.Type.ATTACHMENT_FILE;
        Attachment attachment = new Attachment();
        if (uri.getLastPathSegment() != null) {
            attachment.setName(uri.getLastPathSegment());
        }
        if (uri.getPath() != null) {
            attachment.setLocalPath(uri.getPath());
        }
        attachment.setType(type);
        if (type == Attachment.Type.VISUAL_USER_STEPS) {
            attachment.setEncrypted(true);
        }
        this.x.add(attachment);
        return this;
    }

    public a b(List<Attachment> list) {
        this.x = new CopyOnWriteArrayList(list);
        return this;
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_PARAMETER_ANNOTATION:"})
    public boolean equals(Object obj) {
        List<Attachment> list;
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (String.valueOf(aVar.c).equals(String.valueOf(this.c)) && String.valueOf(aVar.q).equals(String.valueOf(this.q)) && String.valueOf(aVar.d).equals(String.valueOf(this.d)) && aVar.Y1 == this.Y1 && aVar.y.equals(this.y) && aVar.Z1 == this.Z1 && aVar.a2 == this.a2 && (list = aVar.x) != null && list.size() == this.x.size()) {
                for (int i = 0; i < aVar.x.size(); i++) {
                    if (!aVar.x.get(i).equals(this.x.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("id")) {
            this.c = jSONObject.getString("id");
        }
        if (jSONObject.has("temporary_server_token")) {
            this.d = jSONObject.getString("temporary_server_token");
        }
        if (jSONObject.has(InstabugDbContract.CrashEntry.COLUMN_CRASH_MESSAGE)) {
            this.q = jSONObject.getString(InstabugDbContract.CrashEntry.COLUMN_CRASH_MESSAGE);
        }
        if (jSONObject.has(InstabugDbContract.CrashEntry.COLUMN_CRASH_STATE)) {
            this.Y1 = C0101a.valueOf(jSONObject.getString(InstabugDbContract.CrashEntry.COLUMN_CRASH_STATE));
        }
        if (jSONObject.has("state")) {
            State state = new State();
            state.fromJson(jSONObject.getString("state"));
            this.y = state;
        }
        if (jSONObject.has(InstabugDbContract.AttachmentEntry.TABLE_NAME)) {
            b(Attachment.fromJson(jSONObject.getJSONArray(InstabugDbContract.AttachmentEntry.TABLE_NAME)));
        }
        if (jSONObject.has(InstabugDbContract.CrashEntry.COLUMN_HANDLED)) {
            this.Z1 = jSONObject.getBoolean(InstabugDbContract.CrashEntry.COLUMN_HANDLED);
        }
        if (jSONObject.has(InstabugDbContract.CrashEntry.COLUMN_RETRY_COUNT)) {
            this.a2 = jSONObject.getInt(InstabugDbContract.CrashEntry.COLUMN_RETRY_COUNT);
        }
    }

    public int hashCode() {
        String str = this.c;
        if (str != null) {
            return str.hashCode();
        }
        return -1;
    }

    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.c).put("temporary_server_token", (Object) this.d).put(InstabugDbContract.CrashEntry.COLUMN_CRASH_MESSAGE, (Object) this.q).put(InstabugDbContract.CrashEntry.COLUMN_CRASH_STATE, (Object) this.Y1.toString()).put("state", (Object) this.y.toJson()).put(InstabugDbContract.AttachmentEntry.TABLE_NAME, (Object) Attachment.toJson(this.x)).put(InstabugDbContract.CrashEntry.COLUMN_HANDLED, this.Z1).put(InstabugDbContract.CrashEntry.COLUMN_RETRY_COUNT, this.a2);
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Internal Id: ");
        P0.append(this.c);
        P0.append(", TemporaryServerToken:");
        P0.append(this.d);
        P0.append(", crashMessage:");
        P0.append(this.q);
        P0.append(", handled:");
        P0.append(this.Z1);
        P0.append(", retryCount:");
        P0.append(this.a2);
        return P0.toString();
    }
}
