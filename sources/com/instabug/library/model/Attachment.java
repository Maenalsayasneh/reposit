package com.instabug.library.model;

import android.annotation.SuppressLint;
import android.webkit.MimeTypeMap;
import com.instabug.library.internal.storage.cache.Cacheable;
import i0.d.a.a.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Attachment implements Cacheable, Serializable {
    public static final String KEY_ATTACHMENT_STATE = "attachment_state";
    public static final String KEY_DURATION = "duration";
    private static final String KEY_ENCRYPTED = "isEncrypted";
    public static final String KEY_LOCALE_PATH = "local_path";
    public static final String KEY_NAME = "name";
    public static final String KEY_TYPE = "type";
    public static final String KEY_URL = "url";
    public static final String KEY_VIDEO_ENCODED = "video_encoded";
    private AttachmentState attachmentState;
    private String duration;
    private long id = -1;
    private boolean isEncrypted = false;
    private boolean isVideoEncoded = false;
    private String localPath;
    private String name;
    private boolean shouldAnimate = true;
    private Type type;
    private String url;

    public enum AttachmentState {
        OFFLINE,
        SYNCED,
        NOT_AVAILABLE
    }

    public enum Type {
        MAIN_SCREENSHOT("main-screenshot"),
        AUDIO("audio"),
        EXTRA_IMAGE("extra_image"),
        EXTRA_VIDEO("extra_video"),
        GALLERY_IMAGE("image_gallery"),
        GALLERY_VIDEO("video_gallery"),
        ATTACHMENT_FILE("attachment-file"),
        VIEW_HIERARCHY("view-hierarchy-v2"),
        NOT_AVAILABLE("not-available"),
        VISUAL_USER_STEPS("user-repro-steps-v2"),
        AUTO_SCREEN_RECORDING_VIDEO("auto-screen-recording-v2");
        
        private static final Map<String, Type> lookup = null;
        private final String name;

        /* access modifiers changed from: public */
        static {
            lookup = new HashMap();
            Type[] values = values();
            for (int i = 0; i < 11; i++) {
                Type type = values[i];
                lookup.put(type.name, type);
            }
        }

        private Type(String str) {
            this.name = str;
        }

        public static Type get(String str) {
            Type type = lookup.get(str);
            return type == null ? NOT_AVAILABLE : type;
        }

        public String toString() {
            return this.name;
        }
    }

    public Attachment() {
        setType(Type.NOT_AVAILABLE);
        setAttachmentState(AttachmentState.NOT_AVAILABLE);
    }

    public static List<Attachment> fromJson(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Attachment attachment = new Attachment();
            attachment.fromJson(jSONArray.getJSONObject(i).toString());
            arrayList.add(attachment);
        }
        return arrayList;
    }

    public static JSONArray toJson(List<Attachment> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put((Object) new JSONObject(list.get(i).toJson()));
        }
        return jSONArray;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public boolean equals(Object obj) {
        if (!(obj instanceof Attachment)) {
            return false;
        }
        Attachment attachment = (Attachment) obj;
        if (!String.valueOf(attachment.getName()).equals(String.valueOf(getName())) || !String.valueOf(attachment.getLocalPath()).equals(String.valueOf(getLocalPath())) || !String.valueOf(attachment.getUrl()).equals(String.valueOf(getUrl())) || attachment.getType() != getType() || attachment.getAttachmentState() != getAttachmentState() || attachment.isVideoEncoded() != isVideoEncoded() || !String.valueOf(attachment.getDuration()).equals(String.valueOf(getDuration()))) {
            return false;
        }
        return true;
    }

    public AttachmentState getAttachmentState() {
        return this.attachmentState;
    }

    public String getDuration() {
        return this.duration;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String getFileType() {
        String mimeTypeFromExtension;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getName());
        String type2 = getType() == null ? "" : getType().toString();
        return (fileExtensionFromUrl == null || fileExtensionFromUrl.equals("") || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) == null || mimeTypeFromExtension.equals("")) ? type2 : mimeTypeFromExtension;
    }

    public long getId() {
        return this.id;
    }

    public String getLocalPath() {
        return this.localPath;
    }

    public String getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        if (getName() != null) {
            return getName().hashCode();
        }
        return -1;
    }

    public boolean isEncrypted() {
        return this.isEncrypted;
    }

    public boolean isVideoEncoded() {
        return this.isVideoEncoded;
    }

    public Attachment setAttachmentState(AttachmentState attachmentState2) {
        this.attachmentState = attachmentState2;
        return this;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setEncrypted(boolean z) {
        this.isEncrypted = z;
    }

    public void setId(long j) {
        this.id = j;
    }

    public Attachment setLocalPath(String str) {
        this.localPath = str;
        return this;
    }

    public Attachment setName(String str) {
        this.name = str;
        return this;
    }

    public void setShouldAnimate(boolean z) {
        this.shouldAnimate = z;
    }

    public Attachment setType(Type type2) {
        this.type = type2;
        return this;
    }

    public Attachment setUrl(String str) {
        this.url = str;
        return this;
    }

    public Attachment setVideoEncoded(boolean z) {
        this.isVideoEncoded = z;
        return this;
    }

    public boolean shouldAnimate() {
        return this.shouldAnimate;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toString() {
        StringBuilder P0 = a.P0("Name: ");
        P0.append(getName());
        P0.append(", Local Path: ");
        P0.append(getLocalPath());
        P0.append(", Type: ");
        P0.append(getType());
        P0.append(", Duration: ");
        P0.append(getDuration());
        P0.append(", Url: ");
        P0.append(getUrl());
        P0.append(", Attachment State: ");
        P0.append(getAttachmentState());
        return P0.toString();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) getName()).put("local_path", (Object) getLocalPath()).put("url", (Object) getUrl()).put("video_encoded", isVideoEncoded()).put(KEY_ENCRYPTED, isEncrypted()).put("duration", (Object) getDuration());
        if (getType() != null) {
            jSONObject.put("type", (Object) getType().toString());
        }
        if (getAttachmentState() != null) {
            jSONObject.put("attachment_state", (Object) getAttachmentState().toString());
        }
        return jSONObject.toString();
    }

    public void fromJson(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("name")) {
            setName(jSONObject.getString("name"));
        }
        if (jSONObject.has("local_path")) {
            setLocalPath(jSONObject.getString("local_path"));
        }
        if (jSONObject.has("url")) {
            setUrl(jSONObject.getString("url"));
        }
        if (jSONObject.has("type")) {
            setType(Type.get(jSONObject.getString("type")));
        }
        if (jSONObject.has("attachment_state")) {
            setAttachmentState(AttachmentState.valueOf(jSONObject.getString("attachment_state")));
        }
        if (jSONObject.has("video_encoded")) {
            setVideoEncoded(jSONObject.getBoolean("video_encoded"));
        }
        if (jSONObject.has("duration")) {
            setDuration(jSONObject.getString("duration"));
        }
        if (jSONObject.has(KEY_ENCRYPTED)) {
            setEncrypted(jSONObject.getBoolean(KEY_ENCRYPTED));
        }
    }
}
