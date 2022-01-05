package com.pubnub.api.models.consumer.files;

import i0.d.a.a.a;
import java.util.Objects;
import lombok.NonNull;

public class PNFileUploadResult {
    @NonNull
    private final PNBaseFile file;
    @NonNull
    private final int status;
    @NonNull
    private final long timetoken;

    public PNFileUploadResult(@NonNull long j, @NonNull int i, @NonNull PNBaseFile pNBaseFile) {
        Objects.requireNonNull(pNBaseFile, "file is marked @NonNull but is null");
        this.timetoken = j;
        this.status = i;
        this.file = pNBaseFile;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNFileUploadResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNFileUploadResult)) {
            return false;
        }
        PNFileUploadResult pNFileUploadResult = (PNFileUploadResult) obj;
        if (!pNFileUploadResult.canEqual(this) || getTimetoken() != pNFileUploadResult.getTimetoken() || getStatus() != pNFileUploadResult.getStatus()) {
            return false;
        }
        PNBaseFile file2 = getFile();
        PNBaseFile file3 = pNFileUploadResult.getFile();
        return file2 != null ? file2.equals(file3) : file3 == null;
    }

    @NonNull
    public PNBaseFile getFile() {
        return this.file;
    }

    @NonNull
    public int getStatus() {
        return this.status;
    }

    @NonNull
    public long getTimetoken() {
        return this.timetoken;
    }

    public int hashCode() {
        long timetoken2 = getTimetoken();
        int status2 = getStatus() + ((((int) (timetoken2 ^ (timetoken2 >>> 32))) + 59) * 59);
        PNBaseFile file2 = getFile();
        return (status2 * 59) + (file2 == null ? 43 : file2.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNFileUploadResult(timetoken=");
        P0.append(getTimetoken());
        P0.append(", status=");
        P0.append(getStatus());
        P0.append(", file=");
        P0.append(getFile());
        P0.append(")");
        return P0.toString();
    }
}
