package com.pubnub.api.models.consumer.objects_api.membership;

import com.pubnub.api.models.consumer.pubsub.BasePubSubResult;
import com.pubnub.api.models.consumer.pubsub.objects.ObjectResult;
import i0.d.a.a.a;

public class PNMembershipResult extends ObjectResult<PNMembership> {
    public PNMembershipResult(BasePubSubResult basePubSubResult, String str, PNMembership pNMembership) {
        super(basePubSubResult, str, pNMembership);
    }

    public String toString() {
        return a.y0(a.P0("PNMembershipResult(super="), super.toString(), ")");
    }
}
