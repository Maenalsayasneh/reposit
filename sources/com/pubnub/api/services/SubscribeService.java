package com.pubnub.api.services;

import com.pubnub.api.models.server.SubscribeEnvelope;
import java.util.Map;
import t0.c0.f;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface SubscribeService {
    @f("v2/subscribe/{subKey}/{channel}/0")
    d<SubscribeEnvelope> subscribe(@s("subKey") String str, @s("channel") String str2, @u(encoded = true) Map<String, String> map);
}
