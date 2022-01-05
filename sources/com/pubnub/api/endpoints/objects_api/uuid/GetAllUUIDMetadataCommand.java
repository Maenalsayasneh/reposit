package com.pubnub.api.endpoints.objects_api.uuid;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.uuid.PNGetAllUUIDMetadataResult;
import com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;
import java.util.Map;
import t0.d;
import t0.v;

/* compiled from: GetAllUUIDMetadata */
public final class GetAllUUIDMetadataCommand extends GetAllUUIDMetadata implements Include.HavingCustomInclude<GetAllUUIDMetadata>, ListCapabilities.HavingListCapabilites<GetAllUUIDMetadata> {
    public GetAllUUIDMetadataCommand(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public d<EntityArrayEnvelope<PNUUIDMetadata>> executeCommand(Map<String, String> map) throws PubNubException {
        return getRetrofit().getUuidMetadataService().getUUIDMetadata(getPubnub().getConfiguration().getSubscribeKey(), map);
    }

    public CompositeParameterEnricher getCompositeParameterEnricher() {
        return super.getCompositeParameterEnricher();
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNGetAllUuidMetadataOperation;
    }

    public PNGetAllUUIDMetadataResult createResponse(v<EntityArrayEnvelope<PNUUIDMetadata>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNGetAllUUIDMetadataResult((EntityArrayEnvelope) t);
        }
        return new PNGetAllUUIDMetadataResult();
    }
}
