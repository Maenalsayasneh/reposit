package com.pubnub.api.services;

import com.google.gson.JsonObject;
import com.pubnub.api.models.server.Envelope;
import com.pubnub.api.models.server.access_manager.AccessManagerGrantPayload;
import java.util.Map;
import t0.c0.a;
import t0.c0.f;
import t0.c0.o;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface AccessManagerService {
    @f("/v2/auth/grant/sub-key/{subKey}")
    d<Envelope<AccessManagerGrantPayload>> grant(@s("subKey") String str, @u Map<String, String> map);

    @o("/v3/pam/{subKey}/grant")
    d<JsonObject> grantToken(@s("subKey") String str, @a Object obj, @u Map<String, String> map);
}
