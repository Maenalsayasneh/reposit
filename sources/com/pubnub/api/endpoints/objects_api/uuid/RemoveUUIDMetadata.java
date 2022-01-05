package com.pubnub.api.endpoints.objects_api.uuid;

import com.google.gson.JsonElement;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.UUIDEndpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.uuid.PNRemoveUUIDMetadataResult;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import java.util.Collections;
import java.util.Map;
import t0.d;
import t0.v;

public class RemoveUUIDMetadata extends UUIDEndpoint<RemoveUUIDMetadata, EntityEnvelope<JsonElement>, PNRemoveUUIDMetadataResult> {
    public RemoveUUIDMetadata(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, CompositeParameterEnricher.createDefault(), tokenManager);
    }

    public d<EntityEnvelope<JsonElement>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getUuidMetadataService().deleteUUIDMetadata(getPubnub().getConfiguration().getSubscribeKey(), effectiveUuid(), Collections.emptyMap());
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNRemoveUuidMetadataOperation;
    }

    public PNRemoveUUIDMetadataResult createResponse(v<EntityEnvelope<JsonElement>> vVar) throws PubNubException {
        return new PNRemoveUUIDMetadataResult((EntityEnvelope) vVar.b);
    }
}
