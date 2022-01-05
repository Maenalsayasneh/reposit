package com.pubnub.api.models.server.objects_api;

import com.pubnub.api.models.consumer.objects_api.member.PNUUID;
import java.util.Collection;

public class PatchMemberPayload {
    private Collection<PNUUID> delete;
    private Collection<PNUUID> set;

    public PatchMemberPayload(Collection<PNUUID> collection, Collection<PNUUID> collection2) {
        this.set = collection;
        this.delete = collection2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PatchMemberPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PatchMemberPayload)) {
            return false;
        }
        PatchMemberPayload patchMemberPayload = (PatchMemberPayload) obj;
        if (!patchMemberPayload.canEqual(this)) {
            return false;
        }
        Collection<PNUUID> set2 = getSet();
        Collection<PNUUID> set3 = patchMemberPayload.getSet();
        if (set2 != null ? !set2.equals(set3) : set3 != null) {
            return false;
        }
        Collection<PNUUID> delete2 = getDelete();
        Collection<PNUUID> delete3 = patchMemberPayload.getDelete();
        return delete2 != null ? delete2.equals(delete3) : delete3 == null;
    }

    public Collection<PNUUID> getDelete() {
        return this.delete;
    }

    public Collection<PNUUID> getSet() {
        return this.set;
    }

    public int hashCode() {
        Collection<PNUUID> set2 = getSet();
        int i = 43;
        int hashCode = set2 == null ? 43 : set2.hashCode();
        Collection<PNUUID> delete2 = getDelete();
        int i2 = (hashCode + 59) * 59;
        if (delete2 != null) {
            i = delete2.hashCode();
        }
        return i2 + i;
    }
}
