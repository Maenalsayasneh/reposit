package com.pubnub.api.endpoints.access;

import com.google.gson.JsonObject;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.access_manager.v3.ChannelGrant;
import com.pubnub.api.models.consumer.access_manager.v3.ChannelGroupGrant;
import com.pubnub.api.models.consumer.access_manager.v3.PNGrantTokenResult;
import com.pubnub.api.models.consumer.access_manager.v3.UUIDGrant;
import com.pubnub.api.models.server.access_manager.v3.GrantTokenRequestBody;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class GrantToken extends Endpoint<JsonObject, PNGrantTokenResult> {
    private String authorizedUUID;
    private List<ChannelGroupGrant> channelGroups = Collections.emptyList();
    private List<ChannelGrant> channels = Collections.emptyList();
    private Object meta;
    private Integer ttl;
    private List<UUIDGrant> uuids = Collections.emptyList();

    public GrantToken(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public GrantToken authorizedUUID(String str) {
        this.authorizedUUID = str;
        return this;
    }

    public GrantToken channelGroups(List<ChannelGroupGrant> list) {
        this.channelGroups = list;
        return this;
    }

    public GrantToken channels(List<ChannelGrant> list) {
        this.channels = list;
        return this;
    }

    public d<JsonObject> doWork(Map<String, String> map) throws PubNubException {
        return getRetrofit().getAccessManagerService().grantToken(getPubnub().getConfiguration().getSubscribeKey(), GrantTokenRequestBody.builder().ttl(this.ttl).channels(this.channels).groups(this.channelGroups).uuids(this.uuids).meta(this.meta).uuid(this.authorizedUUID).build(), map);
    }

    public List<String> getAffectedChannelGroups() {
        ArrayList arrayList = new ArrayList();
        for (ChannelGroupGrant id : this.channelGroups) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }

    public List<String> getAffectedChannels() {
        ArrayList arrayList = new ArrayList();
        for (ChannelGrant id : this.channels) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNAccessManagerGrantToken;
    }

    public boolean isAuthRequired() {
        return false;
    }

    public GrantToken meta(Object obj) {
        this.meta = obj;
        return this;
    }

    public GrantToken ttl(Integer num) {
        this.ttl = num;
        return this;
    }

    public GrantToken uuids(List<UUIDGrant> list) {
        this.uuids = list;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSecretKey() == null || getPubnub().getConfiguration().getSecretKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SECRET_KEY_MISSING).build();
        } else if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        } else if (PubNubUtil.isNullOrEmpty(this.channels) && PubNubUtil.isNullOrEmpty(this.channelGroups) && PubNubUtil.isNullOrEmpty(this.uuids)) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_RESOURCES_MISSING).build();
        } else if (this.ttl == null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_TTL_MISSING).build();
        }
    }

    public PNGrantTokenResult createResponse(v<JsonObject> vVar) throws PubNubException {
        T t = vVar.b;
        if (t == null) {
            return null;
        }
        return new PNGrantTokenResult(((JsonObject) t).getAsJsonObject(MessageExtension.FIELD_DATA).get("token").getAsString());
    }
}
