package com.pubnub.api.models.consumer.files;

import i0.d.a.a.a;
import java.util.Objects;
import lombok.NonNull;

public class PNUploadedFile implements PNFile {
    @NonNull
    private final String created;
    @NonNull
    private final String id;
    @NonNull
    private final String name;
    @NonNull
    private final Integer size;

    public PNUploadedFile(@NonNull String str, @NonNull String str2, @NonNull Integer num, @NonNull String str3) {
        Objects.requireNonNull(str, "id is marked @NonNull but is null");
        Objects.requireNonNull(str2, "name is marked @NonNull but is null");
        Objects.requireNonNull(num, "size is marked @NonNull but is null");
        Objects.requireNonNull(str3, "created is marked @NonNull but is null");
        this.id = str;
        this.name = str2;
        this.size = num;
        this.created = str3;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNUploadedFile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNUploadedFile)) {
            return false;
        }
        PNUploadedFile pNUploadedFile = (PNUploadedFile) obj;
        if (!pNUploadedFile.canEqual(this)) {
            return false;
        }
        String id2 = getId();
        String id3 = pNUploadedFile.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String name2 = getName();
        String name3 = pNUploadedFile.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        Integer size2 = getSize();
        Integer size3 = pNUploadedFile.getSize();
        if (size2 != null ? !size2.equals(size3) : size3 != null) {
            return false;
        }
        String created2 = getCreated();
        String created3 = pNUploadedFile.getCreated();
        return created2 != null ? created2.equals(created3) : created3 == null;
    }

    @NonNull
    public String getCreated() {
        return this.created;
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    @NonNull
    public Integer getSize() {
        return this.size;
    }

    public int hashCode() {
        String id2 = getId();
        int i = 43;
        int hashCode = id2 == null ? 43 : id2.hashCode();
        String name2 = getName();
        int hashCode2 = ((hashCode + 59) * 59) + (name2 == null ? 43 : name2.hashCode());
        Integer size2 = getSize();
        int hashCode3 = (hashCode2 * 59) + (size2 == null ? 43 : size2.hashCode());
        String created2 = getCreated();
        int i2 = hashCode3 * 59;
        if (created2 != null) {
            i = created2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNUploadedFile(id=");
        P0.append(getId());
        P0.append(", name=");
        P0.append(getName());
        P0.append(", size=");
        P0.append(getSize());
        P0.append(", created=");
        P0.append(getCreated());
        P0.append(")");
        return P0.toString();
    }
}
