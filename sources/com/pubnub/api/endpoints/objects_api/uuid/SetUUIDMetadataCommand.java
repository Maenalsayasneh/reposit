package com.pubnub.api.endpoints.objects_api.uuid;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.uuid.PNSetUUIDMetadataResult;
import com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import com.pubnub.api.models.server.objects_api.SetUUIDMetadataPayload;
import java.util.HashMap;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: SetUUIDMetadata */
public final class SetUUIDMetadataCommand extends SetUUIDMetadata implements Include.HavingCustomInclude<SetUUIDMetadata> {
    private Map<String, Object> custom;
    private String email;
    private String externalId;
    private String name;
    private String profileUrl;

    public SetUUIDMetadataCommand(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public SetUUIDMetadata custom(Map<String, Object> map) {
        this.custom = map;
        return this;
    }

    public SetUUIDMetadata email(String str) {
        this.email = str;
        return this;
    }

    public d<EntityEnvelope<PNUUIDMetadata>> executeCommand(Map<String, String> map) throws PubNubException {
        HashMap hashMap = new HashMap();
        Map<String, Object> map2 = this.custom;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        return getRetrofit().getUuidMetadataService().setUUIDsMetadata(getPubnub().getConfiguration().getSubscribeKey(), effectiveUuid(), new SetUUIDMetadataPayload(this.name, this.email, this.externalId, this.profileUrl, hashMap), map);
    }

    public SetUUIDMetadata externalId(String str) {
        this.externalId = str;
        return this;
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNSetUuidMetadataOperation;
    }

    public SetUUIDMetadata name(String str) {
        this.name = str;
        return this;
    }

    public SetUUIDMetadata profileUrl(String str) {
        this.profileUrl = str;
        return this;
    }

    public PNSetUUIDMetadataResult createResponse(v<EntityEnvelope<PNUUIDMetadata>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNSetUUIDMetadataResult((EntityEnvelope) t);
        }
        return new PNSetUUIDMetadataResult();
    }
}
