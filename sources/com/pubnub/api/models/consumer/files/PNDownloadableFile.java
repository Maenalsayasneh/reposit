package com.pubnub.api.models.consumer.files;

import i0.d.a.a.a;
import java.util.Objects;
import lombok.NonNull;

public class PNDownloadableFile implements PNFile {
    @NonNull
    private final String id;
    @NonNull
    private final String name;
    @NonNull
    private final String url;

    public PNDownloadableFile(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        Objects.requireNonNull(str, "id is marked @NonNull but is null");
        Objects.requireNonNull(str2, "name is marked @NonNull but is null");
        Objects.requireNonNull(str3, "url is marked @NonNull but is null");
        this.id = str;
        this.name = str2;
        this.url = str3;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNDownloadableFile;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNDownloadableFile)) {
            return false;
        }
        PNDownloadableFile pNDownloadableFile = (PNDownloadableFile) obj;
        if (!pNDownloadableFile.canEqual(this)) {
            return false;
        }
        String id2 = getId();
        String id3 = pNDownloadableFile.getId();
        if (id2 != null ? !id2.equals(id3) : id3 != null) {
            return false;
        }
        String name2 = getName();
        String name3 = pNDownloadableFile.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        String url2 = getUrl();
        String url3 = pNDownloadableFile.getUrl();
        return url2 != null ? url2.equals(url3) : url3 == null;
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
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String id2 = getId();
        int i = 43;
        int hashCode = id2 == null ? 43 : id2.hashCode();
        String name2 = getName();
        int hashCode2 = ((hashCode + 59) * 59) + (name2 == null ? 43 : name2.hashCode());
        String url2 = getUrl();
        int i2 = hashCode2 * 59;
        if (url2 != null) {
            i = url2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNDownloadableFile(id=");
        P0.append(getId());
        P0.append(", name=");
        P0.append(getName());
        P0.append(", url=");
        P0.append(getUrl());
        P0.append(")");
        return P0.toString();
    }
}
