package com.pubnub.api.interceptors;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubUtil;
import java.io.IOException;
import q0.e0;
import q0.x;

public class SignatureInterceptor implements x {
    private PubNub pubNub;

    public SignatureInterceptor(PubNub pubNub2) {
        this.pubNub = pubNub2;
    }

    public e0 intercept(x.a aVar) throws IOException {
        return aVar.a(PubNubUtil.signRequest(aVar.request(), this.pubNub.getConfiguration(), this.pubNub.getTimestamp()));
    }
}
