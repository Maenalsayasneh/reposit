package com.pubnub.api.endpoints.message_actions;

import com.google.gson.JsonObject;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.message_actions.PNAddMessageActionResult;
import com.pubnub.api.models.consumer.message_actions.PNMessageAction;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class AddMessageAction extends Endpoint<EntityEnvelope<PNMessageAction>, PNAddMessageActionResult> {
    private String channel;
    private PNMessageAction messageAction;

    public AddMessageAction(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public AddMessageAction channel(String str) {
        this.channel = str;
        return this;
    }

    public d<EntityEnvelope<PNMessageAction>> doWork(Map<String, String> map) {
        map.putAll(encodeParams(map));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", this.messageAction.getType());
        jsonObject.addProperty(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, this.messageAction.getValue());
        return getRetrofit().getMessageActionService().addMessageAction(getPubnub().getConfiguration().getSubscribeKey(), this.channel, Long.toString(this.messageAction.getMessageTimetoken().longValue()).toLowerCase(), jsonObject, map);
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return Collections.singletonList(this.channel);
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNAddMessageAction;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public AddMessageAction messageAction(PNMessageAction pNMessageAction) {
        this.messageAction = pNMessageAction;
        return this;
    }

    public void validateParams() throws PubNubException {
        String str = this.channel;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        }
        PNMessageAction pNMessageAction = this.messageAction;
        if (pNMessageAction == null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_MESSAGE_ACTION_MISSING).build();
        } else if (pNMessageAction.getMessageTimetoken() == null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_MESSAGE_TIMETOKEN_MISSING).build();
        } else if (this.messageAction.getType() == null || this.messageAction.getType().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_MESSAGE_ACTION_TYPE_MISSING).build();
        } else if (this.messageAction.getValue() == null || this.messageAction.getValue().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_MESSAGE_ACTION_VALUE_MISSING).build();
        } else if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
    }

    public PNAddMessageActionResult createResponse(v<EntityEnvelope<PNMessageAction>> vVar) throws PubNubException {
        PNAddMessageActionResult.PNAddMessageActionResultBuilder builder = PNAddMessageActionResult.builder();
        T t = vVar.b;
        if (t != null) {
            builder.pnMessageAction((PNMessageAction) ((EntityEnvelope) t).getData());
        }
        return builder.build();
    }
}
