package com.pubnub.api.callbacks;

import com.pubnub.api.models.consumer.PNStatus;

public interface PNCallback<X> {
    void onResponse(X x, PNStatus pNStatus);
}
