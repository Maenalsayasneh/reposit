package com.pubnub.api.models.consumer.files;

import i0.d.a.a.a;
import java.util.Objects;
import lombok.NonNull;

public class PNBaseFile implements PNFile {
    @NonNull
    private final String id;
    @NonNull
    private final String name;

    public PNBaseFile(@NonNull String str, @NonNull String str2) {
        Objects.requireNonNull(str, "id is marked @NonNull but is null");
        Objects.requireNonNull(str2, "name is marked @NonNull but is null");
        this.id = str;
        this.name = str2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNBaseFile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNBaseFile)) {
            return false;
        }
        PNBaseFile pNBaseFile = (PNBaseFile) obj;
        if (!pNBaseFile.canEqual(this)) {
            return false;
        }
        String id2 = getId();
        String id3 = pNBaseFile.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String name2 = getName();
        String name3 = pNBaseFile.getName();
        return name2 != null ? name2.equals(name3) : name3 == null;
    }

    @NonNull
    public String getId() {
        return this.id;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        String id2 = getId();
        int i = 43;
        int hashCode = id2 == null ? 43 : id2.hashCode();
        String name2 = getName();
        int i2 = (hashCode + 59) * 59;
        if (name2 != null) {
            i = name2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNBaseFile(id=");
        P0.append(getId());
        P0.append(", name=");
        P0.append(getName());
        P0.append(")");
        return P0.toString();
    }
}
