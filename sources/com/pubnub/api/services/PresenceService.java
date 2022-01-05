package com.pubnub.api.services;

import com.google.gson.JsonElement;
import com.pubnub.api.models.server.Envelope;
import com.pubnub.api.models.server.presence.WhereNowPayload;
import java.util.Map;
import t0.c0.f;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface PresenceService {
    @f("v2/presence/sub-key/{subKey}/channel/{channel}/uuid/{uuid}")
    d<Envelope<JsonElement>> getState(@s("subKey") String str, @s("channel") String str2, @s("uuid") String str3, @u Map<String, String> map);

    @f("v2/presence/sub_key/{subKey}")
    d<Envelope<JsonElement>> globalHereNow(@s("subKey") String str, @u Map<String, String> map);

    @f("v2/presence/sub-key/{subKey}/channel/{channel}/heartbeat")
    d<Envelope> heartbeat(@s("subKey") String str, @s("channel") String str2, @u(encoded = true) Map<String, String> map);

    @f("v2/presence/sub_key/{subKey}/channel/{channel}")
    d<Envelope<JsonElement>> hereNow(@s("subKey") String str, @s("channel") String str2, @u Map<String, String> map);

    @f("v2/presence/sub-key/{subKey}/channel/{channel}/leave")
    d<Envelope> leave(@s("subKey") String str, @s("channel") String str2, @u Map<String, String> map);

    @f("v2/presence/sub-key/{subKey}/channel/{channel}/uuid/{uuid}/data")
    d<Envelope<JsonElement>> setState(@s("subKey") String str, @s("channel") String str2, @s("uuid") String str3, @u(encoded = true) Map<String, String> map);

    @f("v2/presence/sub-key/{subKey}/uuid/{uuid}")
    d<Envelope<WhereNowPayload>> whereNow(@s("subKey") String str, @s("uuid") String str2, @u Map<String, String> map);
}
