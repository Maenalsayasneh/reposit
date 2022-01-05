package com.pubnub.api.endpoints.objects_api.uuid;

import com.pubnub.api.PubNub;
import com.pubnub.api.endpoints.objects_api.CompositeParameterEnricher;
import com.pubnub.api.endpoints.objects_api.UUIDEndpoint;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.objects_api.uuid.PNSetUUIDMetadataResult;
import com.pubnub.api.models.consumer.objects_api.uuid.PNUUIDMetadata;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import java.util.Map;

public abstract class SetUUIDMetadata extends UUIDEndpoint<SetUUIDMetadata, EntityEnvelope<PNUUIDMetadata>, PNSetUUIDMetadataResult> implements Include.CustomIncludeAware<SetUUIDMetadata> {
    public SetUUIDMetadata(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, CompositeParameterEnricher compositeParameterEnricher, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, compositeParameterEnricher, tokenManager);
    }

    public static SetUUIDMetadata create(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new SetUUIDMetadataCommand(pubNub, telemetryManager, retrofitManager, CompositeParameterEnricher.createDefault(), tokenManager);
    }

    public abstract SetUUIDMetadata custom(Map<String, Object> map);

    public abstract SetUUIDMetadata email(String str);

    public abstract SetUUIDMetadata externalId(String str);

    public abstract SetUUIDMetadata name(String str);

    public abstract SetUUIDMetadata profileUrl(String str);
}
