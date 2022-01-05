package com.pubnub.api.services;

import com.google.gson.JsonElement;
import com.pubnub.api.models.consumer.objects_api.membership.PNMembership;
import com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import com.pubnub.api.models.server.objects_api.PatchMembershipPayload;
import com.pubnub.api.models.server.objects_api.SetUUIDMetadataPayload;
import java.util.Map;
import t0.c0.a;
import t0.c0.b;
import t0.c0.f;
import t0.c0.k;
import t0.c0.n;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface UUIDMetadataService {
    @b("/v2/objects/{subKey}/uuids/{uuid}")
    d<EntityEnvelope<JsonElement>> deleteUUIDMetadata(@s("subKey") String str, @s("uuid") String str2, @u(encoded = true) Map<String, String> map);

    @f("v2/objects/{subKey}/uuids/{uuid}/channels")
    d<EntityArrayEnvelope<PNMembership>> getMemberships(@s("subKey") String str, @s("uuid") String str2, @u(encoded = true) Map<String, String> map);

    @f("v2/objects/{subKey}/uuids/{uuid}")
    d<EntityEnvelope<PNUUIDMetadata>> getUUIDMetadata(@s("subKey") String str, @s("uuid") String str2, @u(encoded = true) Map<String, String> map);

    @f("v2/objects/{subKey}/uuids")
    d<EntityArrayEnvelope<PNUUIDMetadata>> getUUIDMetadata(@s("subKey") String str, @u(encoded = true) Map<String, String> map);

    @n("v2/objects/{subKey}/uuids/{uuid}/channels")
    d<EntityArrayEnvelope<PNMembership>> patchMembership(@s("subKey") String str, @s("uuid") String str2, @a PatchMembershipPayload patchMembershipPayload, @u(encoded = true) Map<String, String> map);

    @k({"Content-Type: application/json; charset=UTF-8"})
    @n("/v2/objects/{subKey}/uuids/{uuid}")
    d<EntityEnvelope<PNUUIDMetadata>> setUUIDsMetadata(@s("subKey") String str, @s("uuid") String str2, @a SetUUIDMetadataPayload setUUIDMetadataPayload, @u(encoded = true) Map<String, String> map);
}
