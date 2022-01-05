package com.pubnub.api.models.consumer.files;

import i0.d.a.a.a;
import java.io.InputStream;
import java.util.Objects;
import lombok.NonNull;

public class PNDownloadFileResult {
    private final InputStream byteStream;
    @NonNull
    private final String fileName;

    public PNDownloadFileResult(@NonNull String str, InputStream inputStream) {
        Objects.requireNonNull(str, "fileName is marked @NonNull but is null");
        this.fileName = str;
        this.byteStream = inputStream;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNDownloadFileResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNDownloadFileResult)) {
            return false;
        }
        PNDownloadFileResult pNDownloadFileResult = (PNDownloadFileResult) obj;
        if (!pNDownloadFileResult.canEqual(this)) {
            return false;
        }
        String fileName2 = getFileName();
        String fileName3 = pNDownloadFileResult.getFileName();
        if (fileName2 != null ? !fileName2.equals(fileName3) : fileName3 != null) {
            return false;
        }
        InputStream byteStream2 = getByteStream();
        InputStream byteStream3 = pNDownloadFileResult.getByteStream();
        return byteStream2 != null ? byteStream2.equals(byteStream3) : byteStream3 == null;
    }

    public InputStream getByteStream() {
        return this.byteStream;
    }

    @NonNull
    public String getFileName() {
        return this.fileName;
    }

    public int hashCode() {
        String fileName2 = getFileName();
        int i = 43;
        int hashCode = fileName2 == null ? 43 : fileName2.hashCode();
        InputStream byteStream2 = getByteStream();
        int i2 = (hashCode + 59) * 59;
        if (byteStream2 != null) {
            i = byteStream2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNDownloadFileResult(fileName=");
        P0.append(getFileName());
        P0.append(", byteStream=");
        P0.append(getByteStream());
        P0.append(")");
        return P0.toString();
    }
}
