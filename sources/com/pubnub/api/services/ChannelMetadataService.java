package com.pubnub.api.services;

import com.google.gson.JsonElement;
import com.pubnub.api.models.consumer.objects_api.channel.PNChannelMetadata;
import com.pubnub.api.models.consumer.objects_api.member.PNMembers;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import com.pubnub.api.models.server.objects_api.PatchMemberPayload;
import com.pubnub.api.models.server.objects_api.SetChannelMetadataPayload;
import java.util.Map;
import t0.c0.a;
import t0.c0.b;
import t0.c0.f;
import t0.c0.k;
import t0.c0.n;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface ChannelMetadataService {
    @b("/v2/objects/{subKey}/channels/{channel}")
    d<EntityEnvelope<JsonElement>> deleteChannelMetadata(@s("subKey") String str, @s("channel") String str2, @u(encoded = true) Map<String, String> map);

    @f("v2/objects/{subKey}/channels/{channel}")
    d<EntityEnvelope<PNChannelMetadata>> getChannelMetadata(@s("subKey") String str, @s("channel") String str2, @u(encoded = true) Map<String, String> map);

    @f("v2/objects/{subKey}/channels")
    d<EntityArrayEnvelope<PNChannelMetadata>> getChannelMetadata(@s("subKey") String str, @u(encoded = true) Map<String, String> map);

    @f("v2/objects/{subKey}/channels/{channel}/uuids")
    d<EntityArrayEnvelope<PNMembers>> getMembers(@s("subKey") String str, @s("channel") String str2, @u(encoded = true) Map<String, String> map);

    @n("v2/objects/{subKey}/channels/{channel}/uuids")
    d<EntityArrayEnvelope<PNMembers>> patchMembers(@s("subKey") String str, @s("channel") String str2, @a PatchMemberPayload patchMemberPayload, @u(encoded = true) Map<String, String> map);

    @k({"Content-Type: application/json; charset=UTF-8"})
    @n("/v2/objects/{subKey}/channels/{channel}")
    d<EntityEnvelope<PNChannelMetadata>> setChannelsMetadata(@s("subKey") String str, @s("channel") String str2, @a SetChannelMetadataPayload setChannelMetadataPayload, @u(encoded = true) Map<String, String> map);
}
