package com.pubnub.api.models.server.objects_api;

import com.pubnub.api.models.consumer.PNPage;
import i0.d.a.a.a;
import java.util.List;

public class EntityArrayEnvelope<T> extends EntityEnvelope<List<T>> {
    public String next;
    public String prev;
    public Integer totalCount;

    public String getNext() {
        return this.next;
    }

    public String getPrev() {
        return this.prev;
    }

    public Integer getTotalCount() {
        return this.totalCount;
    }

    public PNPage nextPage() {
        return PNPage.next(this.next);
    }

    public PNPage previousPage() {
        return PNPage.previous(this.prev);
    }

    public String toString() {
        StringBuilder P0 = a.P0("EntityArrayEnvelope(totalCount=");
        P0.append(getTotalCount());
        P0.append(", next=");
        P0.append(getNext());
        P0.append(", prev=");
        P0.append(getPrev());
        P0.append(")");
        return P0.toString();
    }
}
