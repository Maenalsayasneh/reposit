package com.pubnub.api.models.server.files;

import com.pubnub.api.models.consumer.files.PNBaseFile;
import i0.d.a.a.a;

public class FileUploadNotification {
    private final PNBaseFile file;
    private final Object message;

    public FileUploadNotification(Object obj, PNBaseFile pNBaseFile) {
        this.message = obj;
        this.file = pNBaseFile;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FileUploadNotification;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FileUploadNotification)) {
            return false;
        }
        FileUploadNotification fileUploadNotification = (FileUploadNotification) obj;
        if (!fileUploadNotification.canEqual(this)) {
            return false;
        }
        Object message2 = getMessage();
        Object message3 = fileUploadNotification.getMessage();
        if (message2 != null ? !message2.equals(message3) : message3 != null) {
            return false;
        }
        PNBaseFile file2 = getFile();
        PNBaseFile file3 = fileUploadNotification.getFile();
        return file2 != null ? file2.equals(file3) : file3 == null;
    }

    public PNBaseFile getFile() {
        return this.file;
    }

    public Object getMessage() {
        return this.message;
    }

    public int hashCode() {
        Object message2 = getMessage();
        int i = 43;
        int hashCode = message2 == null ? 43 : message2.hashCode();
        PNBaseFile file2 = getFile();
        int i2 = (hashCode + 59) * 59;
        if (file2 != null) {
            i = file2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("FileUploadNotification(message=");
        P0.append(getMessage());
        P0.append(", file=");
        P0.append(getFile());
        P0.append(")");
        return P0.toString();
    }
}
