package com.pubnub.api.models.server.objects_api;

import com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership;
import java.util.Collection;

public class PatchMembershipPayload {
    private Collection<PNChannelMembership> delete;
    private Collection<PNChannelMembership> set;

    public PatchMembershipPayload(Collection<PNChannelMembership> collection, Collection<PNChannelMembership> collection2) {
        this.set = collection;
        this.delete = collection2;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PatchMembershipPayload;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PatchMembershipPayload)) {
            return false;
        }
        PatchMembershipPayload patchMembershipPayload = (PatchMembershipPayload) obj;
        if (!patchMembershipPayload.canEqual(this)) {
            return false;
        }
        Collection<PNChannelMembership> set2 = getSet();
        Collection<PNChannelMembership> set3 = patchMembershipPayload.getSet();
        if (set2 != null ? !set2.equals(set3) : set3 != null) {
            return false;
        }
        Collection<PNChannelMembership> delete2 = getDelete();
        Collection<PNChannelMembership> delete3 = patchMembershipPayload.getDelete();
        return delete2 != null ? delete2.equals(delete3) : delete3 == null;
    }

    public Collection<PNChannelMembership> getDelete() {
        return this.delete;
    }

    public Collection<PNChannelMembership> getSet() {
        return this.set;
    }

    public int hashCode() {
        Collection<PNChannelMembership> set2 = getSet();
        int i = 43;
        int hashCode = set2 == null ? 43 : set2.hashCode();
        Collection<PNChannelMembership> delete2 = getDelete();
        int i2 = (hashCode + 59) * 59;
        if (delete2 != null) {
            i = delete2.hashCode();
        }
        return i2 + i;
    }
}
