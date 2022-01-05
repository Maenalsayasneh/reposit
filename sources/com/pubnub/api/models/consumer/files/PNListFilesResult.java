package com.pubnub.api.models.consumer.files;

import com.pubnub.api.models.consumer.PNPage;
import i0.d.a.a.a;
import java.util.Collection;
import java.util.Objects;
import lombok.NonNull;

public class PNListFilesResult {
    @NonNull
    private final int count;
    @NonNull
    private final Collection<PNUploadedFile> data;
    private final PNPage.Next next;
    @NonNull
    private final int status;

    public PNListFilesResult(@NonNull int i, PNPage.Next next2, @NonNull int i2, @NonNull Collection<PNUploadedFile> collection) {
        Objects.requireNonNull(collection, "data is marked @NonNull but is null");
        this.count = i;
        this.next = next2;
        this.status = i2;
        this.data = collection;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNListFilesResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNListFilesResult)) {
            return false;
        }
        PNListFilesResult pNListFilesResult = (PNListFilesResult) obj;
        if (!pNListFilesResult.canEqual(this) || getCount() != pNListFilesResult.getCount()) {
            return false;
        }
        PNPage.Next next2 = getNext();
        PNPage.Next next3 = pNListFilesResult.getNext();
        if (next2 != null ? !next2.equals(next3) : next3 != null) {
            return false;
        }
        if (getStatus() != pNListFilesResult.getStatus()) {
            return false;
        }
        Collection<PNUploadedFile> data2 = getData();
        Collection<PNUploadedFile> data3 = pNListFilesResult.getData();
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

    public PNPage.Next getNext() {
        return this.next;
    }

    @NonNull
    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        PNPage.Next next2 = getNext();
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
        StringBuilder P0 = a.P0("PNListFilesResult(count=");
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
