package com.instabug.bug.model;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.instabug.library.internal.storage.cache.Cacheable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.BaseReport;
import com.instabug.library.model.State;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: Bug */
public class a extends BaseReport implements Cacheable, Serializable {
    public C0094a Y1;
    public String Z1;
    public boolean a2;
    public c b2;
    public String c;
    public transient List<i0.j.b.p.a> c2;
    public String d;
    public ArrayList<String> d2;
    public String e2;
    public String q;
    public String x;
    public List<Attachment> y;

    /* renamed from: com.instabug.bug.model.a$a  reason: collision with other inner class name */
    /* compiled from: Bug */
    public enum C0094a {
        IN_PROGRESS,
        READY_TO_BE_SENT,
        LOGS_READY_TO_BE_UPLOADED,
        ATTACHMENTS_READY_TO_BE_UPLOADED,
        NOT_AVAILABLE
    }

    /* compiled from: Bug */
    public enum c {
        IN_PROGRESS,
        FAILED,
        DONE
    }

    public a() {
        this.Y1 = C0094a.NOT_AVAILABLE;
        this.q = "not-available";
    }

    public a a(Uri uri, Attachment.Type type, boolean z) {
        if (uri == null) {
            InstabugSDKLogger.w("Bug", "Adding attachment with a null Uri, ignored.");
            return this;
        } else if (type == null) {
            InstabugSDKLogger.w("Bug", "Adding attachment with a null Attachment.Type, ignored.");
            return this;
        } else {
            Attachment attachment = new Attachment();
            if (uri.getLastPathSegment() != null) {
                attachment.setName(uri.getLastPathSegment());
            }
            if (uri.getPath() != null) {
                attachment.setLocalPath(uri.getPath());
            }
            attachment.setType(type);
            if (type == Attachment.Type.VISUAL_USER_STEPS) {
                attachment.setEncrypted(z);
                InstabugSDKLogger.i("Bug", "Adding attachment for VISUAL_USER_STEPS will be encrypted ");
            }
            this.y.add(attachment);
            return this;
        }
    }

    public synchronized List<Attachment> b() {
        return this.y;
    }

    public void c(JSONArray jSONArray) throws JSONException {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        this.d2 = arrayList;
    }

    public JSONArray d() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.d2.iterator();
        while (it.hasNext()) {
            jSONArray.put((Object) it.next());
        }
        return jSONArray;
    }

    public int e() {
        int i = 0;
        for (Attachment next : b()) {
            if (next.getType() == Attachment.Type.MAIN_SCREENSHOT || next.getType() == Attachment.Type.EXTRA_IMAGE || next.getType() == Attachment.Type.GALLERY_IMAGE || next.getType() == Attachment.Type.EXTRA_VIDEO || next.getType() == Attachment.Type.GALLERY_VIDEO || next.getType() == Attachment.Type.AUDIO) {
                i++;
            }
        }
        return i;
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_PARAMETER_ANNOTATION"})
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            if (String.valueOf(aVar.c).equals(String.valueOf(this.c)) && String.valueOf(aVar.x).equals(String.valueOf(this.x)) && String.valueOf(aVar.d).equals(String.valueOf(this.d)) && aVar.Y1 == this.Y1 && aVar.getState().equals(getState()) && aVar.q.equals(this.q) && aVar.b() != null && aVar.b().size() == b().size()) {
                for (int i = 0; i < aVar.b().size(); i++) {
                    if (!aVar.b().get(i).equals(b().get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        for (Attachment type : b()) {
            if (type.getType() == Attachment.Type.MAIN_SCREENSHOT) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("id")) {
            this.c = jSONObject.getString("id");
        }
        if (jSONObject.has("temporary_server_token")) {
            this.d = jSONObject.getString("temporary_server_token");
        }
        if (jSONObject.has("type")) {
            String string = jSONObject.getString("type");
            string.hashCode();
            char c3 = 65535;
            String str2 = "feedback";
            switch (string.hashCode()) {
                case -191501435:
                    if (string.equals(str2)) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 97908:
                    if (string.equals("bug")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 1621082316:
                    if (string.equals("ask a question")) {
                        c3 = 2;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                    break;
                case 1:
                    str2 = "bug";
                    break;
                case 2:
                    str2 = "ask a question";
                    break;
                default:
                    str2 = "not-available";
                    break;
            }
            this.q = str2;
        }
        if (jSONObject.has(InstabugDbContract.BugEntry.COLUMN_MESSAGE)) {
            this.x = jSONObject.getString(InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        }
        if (jSONObject.has(InstabugDbContract.BugEntry.COLUMN_BUG_STATE)) {
            this.Y1 = C0094a.valueOf(jSONObject.getString(InstabugDbContract.BugEntry.COLUMN_BUG_STATE));
        }
        if (jSONObject.has("state")) {
            State state = new State();
            state.fromJson(jSONObject.getString("state"));
            this.state = state;
        }
        if (jSONObject.has(InstabugDbContract.AttachmentEntry.TABLE_NAME)) {
            this.y = new CopyOnWriteArrayList(Attachment.fromJson(jSONObject.getJSONArray(InstabugDbContract.AttachmentEntry.TABLE_NAME)));
        }
        if (jSONObject.has(InstabugDbContract.BugEntry.COLUMN_VIEW_HIERARCHY)) {
            this.Z1 = jSONObject.getString(InstabugDbContract.BugEntry.COLUMN_VIEW_HIERARCHY);
        }
        if (jSONObject.has(InstabugDbContract.BugEntry.COLUMN_CATEGORIES_LIST)) {
            c(jSONObject.getJSONArray(InstabugDbContract.BugEntry.COLUMN_CATEGORIES_LIST));
        }
    }

    public String getId() {
        return this.c;
    }

    public int hashCode() {
        String str = this.c;
        if (str != null) {
            return str.hashCode();
        }
        return -1;
    }

    public BaseReport setId(String str) {
        this.c = str;
        return this;
    }

    public BaseReport setState(State state) {
        this.state = state;
        return this;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) this.c).put("temporary_server_token", (Object) this.d).put("type", (Object) this.q.toString()).put(InstabugDbContract.BugEntry.COLUMN_MESSAGE, (Object) this.x).put(InstabugDbContract.BugEntry.COLUMN_BUG_STATE, (Object) this.Y1.toString()).put(InstabugDbContract.AttachmentEntry.TABLE_NAME, (Object) Attachment.toJson(b())).put(InstabugDbContract.BugEntry.COLUMN_VIEW_HIERARCHY, (Object) this.Z1).put(InstabugDbContract.BugEntry.COLUMN_CATEGORIES_LIST, (Object) d());
        if (getState() != null) {
            jSONObject.put("state", (Object) getState().toJson());
        }
        return jSONObject.toString();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("Internal Id: ");
        P0.append(this.c);
        P0.append(", TemporaryServerToken:");
        P0.append(this.d);
        P0.append(", Message:");
        P0.append(this.x);
        P0.append(", Type:");
        P0.append(this.q);
        return P0.toString();
    }

    public a(String str, State state, C0094a aVar) {
        this.c = str;
        this.state = null;
        this.Y1 = aVar;
        this.q = "not-available";
        this.y = new CopyOnWriteArrayList();
        this.d2 = new ArrayList<>();
    }
}
