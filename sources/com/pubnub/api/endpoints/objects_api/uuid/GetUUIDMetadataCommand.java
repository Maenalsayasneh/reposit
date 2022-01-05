package com.pubnub.api.endpoints.objects_api.uuid;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.uuid.PNGetUUIDMetadataResult;
import com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: GetUUIDMetadata */
public final class GetUUIDMetadataCommand extends GetUUIDMetadata implements Include.HavingCustomInclude<GetUUIDMetadata> {
    public GetUUIDMetadataCommand(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public d<EntityEnvelope<PNUUIDMetadata>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getUuidMetadataService().getUUIDMetadata(getPubnub().getConfiguration().getSubscribeKey(), effectiveUuid(), map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNGetUuidMetadataOperation;
    }

    public PNGetUUIDMetadataResult createResponse(v<EntityEnvelope<PNUUIDMetadata>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNGetUUIDMetadataResult((EntityEnvelope) t);
        }
        return new PNGetUUIDMetadataResult();
    }
}
