package com.pubnub.api.models.server.files;

import com.pubnub.api.models.consumer.files.PNUploadedFile;
import i0.d.a.a.a;
import java.util.Collection;
import java.util.Objects;
import lombok.NonNull;

public class ListFilesResult {
    @NonNull
    private final int count;
    @NonNull
    private final Collection<PNUploadedFile> data;
    private final String next;
    @NonNull
    private final int status;

    public ListFilesResult(@NonNull int i, String str, @NonNull int i2, @NonNull Collection<PNUploadedFile> collection) {
        Objects.requireNonNull(collection, "data is marked @NonNull but is null");
        this.count = i;
        this.next = str;
        this.status = i2;
        this.data = collection;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof ListFilesResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListFilesResult)) {
            return false;
        }
        ListFilesResult listFilesResult = (ListFilesResult) obj;
        if (!listFilesResult.canEqual(this) || getCount() != listFilesResult.getCount()) {
            return false;
        }
        String next2 = getNext();
        String next3 = listFilesResult.getNext();
        if (next2 != null ? !next2.equals(next3) : next3 != null) {
            return false;
        }
        if (getStatus() != listFilesResult.getStatus()) {
            return false;
        }
        Collection<PNUploadedFile> data2 = getData();
        Collection<PNUploadedFile> data3 = listFilesResult.getData();
        return data2 != null ? data2.equals(data3) : data3 == null;
    }

    @NonNull
    public int getCount() {
        return this.count;
    }

    @NonNull
    public Collection<PNUploadedFile> getData() {
        return this.data;
    }

    public String getNext() {
        return this.next;
    }

    @NonNull
    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        String next2 = getNext();
        int i = 43;
        int status2 = getStatus() + ((((getCount() + 59) * 59) + (next2 == null ? 43 : next2.hashCode())) * 59);
        Collection<PNUploadedFile> data2 = getData();
        int i2 = status2 * 59;
        if (data2 != null) {
            i = data2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ListFilesResult(count=");
        P0.append(getCount());
        P0.append(", next=");
        P0.append(getNext());
        P0.append(", status=");
        P0.append(getStatus());
        P0.append(", data=");
        P0.append(getData());
        P0.append(")");
        return P0.toString();
    }
}
