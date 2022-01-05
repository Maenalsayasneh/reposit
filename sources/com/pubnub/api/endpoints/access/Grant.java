package com.pubnub.api.endpoints.access;

import com.google.gson.JsonElement;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.model.UserAttributes;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.access_manager.PNAccessManagerGrantResult;
import com.pubnub.api.models.consumer.access_manager.PNAccessManagerKeyData;
import com.pubnub.api.models.server.Envelope;
import com.pubnub.api.models.server.access_manager.AccessManagerGrantPayload;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class Grant extends Endpoint<Envelope<AccessManagerGrantPayload>, PNAccessManagerGrantResult> {
    private List<String> authKeys = new ArrayList();
    private List<String> channelGroups = new ArrayList();
    private List<String> channels = new ArrayList();
    private boolean delete;
    private boolean get;
    private boolean join;
    private boolean manage;
    private boolean read;
    private Integer ttl;
    private boolean update;
    private List<String> uuids = Collections.emptyList();
    private boolean write;

    public Grant(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    private Map<String, PNAccessManagerKeyData> createKeyMap(JsonElement jsonElement) {
        HashMap hashMap = new HashMap();
        MapperManager mapper = getPubnub().getMapper();
        Iterator<Map.Entry<String, JsonElement>> objectIterator = mapper.getObjectIterator(jsonElement, "auths");
        while (objectIterator.hasNext()) {
            Map.Entry next = objectIterator.next();
            hashMap.put(next.getKey(), PNAccessManagerKeyData.builder().manageEnabled(mapper.getAsBoolean((JsonElement) next.getValue(), "m")).writeEnabled(mapper.getAsBoolean((JsonElement) next.getValue(), "w")).readEnabled(mapper.getAsBoolean((JsonElement) next.getValue(), "r")).deleteEnabled(mapper.getAsBoolean((JsonElement) next.getValue(), "d")).getEnabled(mapper.getAsBoolean((JsonElement) next.getValue(), "g")).updateEnabled(mapper.getAsBoolean((JsonElement) next.getValue(), "u")).joinEnabled(mapper.getAsBoolean((JsonElement) next.getValue(), "j")).build());
        }
        return hashMap;
    }

    public Grant authKeys(List<String> list) {
        this.authKeys = list;
        return this;
    }

    public Grant channelGroups(List<String> list) {
        this.channelGroups = list;
        return this;
    }

    public Grant channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public Grant delete(boolean z) {
        this.delete = z;
        return this;
    }

    public d<Envelope<AccessManagerGrantPayload>> doWork(Map<String, String> map) throws PubNubException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (this.channels.size() > 0) {
            map.put(Include.INCLUDE_CHANNEL_PARAM_VALUE, PubNubUtil.joinString(this.channels, InstabugDbContract.COMMA_SEP));
        }
        if (this.channelGroups.size() > 0) {
            map.put("channel-group", PubNubUtil.joinString(this.channelGroups, InstabugDbContract.COMMA_SEP));
        }
        if (this.uuids.size() > 0) {
            map.put("target-uuid", PubNubUtil.joinString(this.uuids, InstabugDbContract.COMMA_SEP));
        }
        if (this.authKeys.size() > 0) {
            map.put(PubNubUtil.AUTH_QUERY_PARAM_NAME, PubNubUtil.joinString(this.authKeys, InstabugDbContract.COMMA_SEP));
        }
        Integer num = this.ttl;
        if (num != null && num.intValue() >= -1) {
            map.put(UserAttributes.KEY_TTL, String.valueOf(this.ttl));
        }
        String str6 = "1";
        map.put("r", this.read ? str6 : "0");
        if (this.write) {
            str = str6;
        } else {
            str = "0";
        }
        map.put("w", str);
        if (this.manage) {
            str2 = str6;
        } else {
            str2 = "0";
        }
        map.put("m", str2);
        if (this.delete) {
            str3 = str6;
        } else {
            str3 = "0";
        }
        map.put("d", str3);
        if (this.get) {
            str4 = str6;
        } else {
            str4 = "0";
        }
        map.put("g", str4);
        if (this.update) {
            str5 = str6;
        } else {
            str5 = "0";
        }
        map.put("u", str5);
        if (!this.join) {
            str6 = "0";
        }
        map.put("j", str6);
        return getRetrofit().getAccessManagerService().grant(getPubnub().getConfiguration().getSubscribeKey(), map);
    }

    public Grant get(boolean z) {
        this.get = z;
        return this;
    }

    public List<String> getAffectedChannelGroups() {
        return this.channelGroups;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNAccessManagerGrant;
    }

    public boolean isAuthRequired() {
        return false;
    }

    public Grant join(boolean z) {
        this.join = z;
        return this;
    }

    public Grant manage(boolean z) {
        this.manage = z;
        return this;
    }

    public Grant read(boolean z) {
        this.read = z;
        return this;
    }

    public Grant ttl(Integer num) {
        this.ttl = num;
        return this;
    }

    public Grant update(boolean z) {
        this.update = z;
        return this;
    }

    public Grant uuids(List<String> list) {
        this.uuids = list;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSecretKey() == null || getPubnub().getConfiguration().getSecretKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SECRET_KEY_MISSING).build();
        } else if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        } else if (getPubnub().getConfiguration().getPublishKey() == null || getPubnub().getConfiguration().getPublishKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PUBLISH_KEY_MISSING).build();
        } else if ((!this.channels.isEmpty() || !this.channelGroups.isEmpty()) && !this.uuids.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).errormsg("Grants for channels or channelGroups can't be changed together with grants for UUIDs").build();
        } else if (!this.uuids.isEmpty() && this.authKeys.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).errormsg("UUIDs grant management require providing non empty authKeys").build();
        }
    }

    public Grant write(boolean z) {
        this.write = z;
        return this;
    }

    public PNAccessManagerGrantResult createResponse(v<Envelope<AccessManagerGrantPayload>> vVar) throws PubNubException {
        MapperManager mapper = getPubnub().getMapper();
        PNAccessManagerGrantResult.PNAccessManagerGrantResultBuilder builder = PNAccessManagerGrantResult.builder();
        T t = vVar.b;
        if (t == null || ((Envelope) t).getPayload() == null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
        }
        AccessManagerGrantPayload accessManagerGrantPayload = (AccessManagerGrantPayload) ((Envelope) vVar.b).getPayload();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (accessManagerGrantPayload.getChannel() != null) {
            hashMap.put(accessManagerGrantPayload.getChannel(), accessManagerGrantPayload.getAuthKeys());
        }
        List<String> list = this.channelGroups;
        if (list != null) {
            if (list.size() == 1) {
                hashMap2.put(mapper.elementToString(accessManagerGrantPayload.getChannelGroups()), accessManagerGrantPayload.getAuthKeys());
            } else if (this.channelGroups.size() > 1) {
                Iterator<Map.Entry<String, JsonElement>> objectIterator = mapper.getObjectIterator(accessManagerGrantPayload.getChannelGroups());
                while (objectIterator.hasNext()) {
                    Map.Entry next = objectIterator.next();
                    hashMap2.put(next.getKey(), createKeyMap((JsonElement) next.getValue()));
                }
            }
        }
        if (accessManagerGrantPayload.getChannels() != null) {
            for (String next2 : accessManagerGrantPayload.getChannels().keySet()) {
                hashMap.put(next2, accessManagerGrantPayload.getChannels().get(next2).getAuthKeys());
            }
        }
        HashMap hashMap3 = new HashMap();
        if (accessManagerGrantPayload.getUuids() != null) {
            for (String next3 : accessManagerGrantPayload.getUuids().keySet()) {
                hashMap3.put(next3, accessManagerGrantPayload.getUuids().get(next3).getAuthKeys());
            }
        }
        return builder.subscribeKey(accessManagerGrantPayload.getSubscribeKey()).level(accessManagerGrantPayload.getLevel()).ttl(accessManagerGrantPayload.getTtl()).channels(hashMap).channelGroups(hashMap2).uuids(hashMap3).build();
    }
}
