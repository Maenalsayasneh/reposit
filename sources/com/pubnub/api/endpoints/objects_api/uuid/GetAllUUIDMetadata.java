package com.pubnub.api.endpoints.objects_api.uuid;

import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.ObjectApiEndpoint;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.endpoints.objects_api.utils.ListCapabilities;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.uuid.PNGetAllUUIDMetadataResult;
import com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata;
import com.pubnub.api.models.server.objects_api.EntityArrayEnvelope;

public abstract class GetAllUUIDMetadata extends ObjectApiEndpoint<EntityArrayEnvelope<PNUUIDMetadata>, PNGetAllUUIDMetadataResult> implements Include.CustomIncludeAware<GetAllUUIDMetadata>, ListCapabilities.ListCapabilitiesAware<GetAllUUIDMetadata> {
    public GetAllUUIDMetadata(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static GetAllUUIDMetadata create(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new GetAllUUIDMetadataCommand(pubNub, telemetryManager, retrofitManager, CompositeParameterEnricher.createDefault(), tokenManager);
    }
}
