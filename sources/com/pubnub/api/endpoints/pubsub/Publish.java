package com.pubnub.api.endpoints.pubsub;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.PublishSequenceManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.PNPublishResult;
import java.util.Collections;
import java.util.List;
import t0.v;

public class Publish extends Endpoint<List<Object>, PNPublishResult> {
    private String channel;
    private Object message;
    private Object meta;
    private PublishSequenceManager publishSequenceManager;
    private Boolean replicate = Boolean.TRUE;
    private Boolean shouldStore;
    private Integer ttl;
    private Boolean usePOST;

    public Publish(PubNub pubNub, PublishSequenceManager publishSequenceManager2, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
        this.publishSequenceManager = publishSequenceManager2;
    }

    public Publish channel(String str) {
        this.channel = str;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public t0.d<java.util.List<java.lang.Object>> doWork(java.util.Map<java.lang.String, java.lang.String> r9) throws com.pubnub.api.PubNubException {
        /*
            r8 = this;
            com.pubnub.api.PubNub r0 = r8.getPubnub()
            com.pubnub.api.managers.MapperManager r0 = r0.getMapper()
            java.lang.Object r1 = r8.message
            java.lang.String r1 = r0.toJson(r1)
            java.lang.Object r2 = r8.meta
            if (r2 == 0) goto L_0x001f
            java.lang.String r0 = r0.toJson(r2)
            java.lang.String r0 = com.pubnub.api.PubNubUtil.urlEncode(r0)
            java.lang.String r2 = "meta"
            r9.put(r2, r0)
        L_0x001f:
            java.lang.Boolean r0 = r8.shouldStore
            if (r0 == 0) goto L_0x0036
            boolean r0 = r0.booleanValue()
            java.lang.String r2 = "store"
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "1"
            r9.put(r2, r0)
            goto L_0x0036
        L_0x0031:
            java.lang.String r0 = "0"
            r9.put(r2, r0)
        L_0x0036:
            java.lang.Integer r0 = r8.ttl
            if (r0 == 0) goto L_0x0043
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "ttl"
            r9.put(r2, r0)
        L_0x0043:
            com.pubnub.api.managers.PublishSequenceManager r0 = r8.publishSequenceManager
            int r0 = r0.getNextSequence()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "seqn"
            r9.put(r2, r0)
            java.lang.Boolean r0 = r8.replicate
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0061
            java.lang.String r0 = "norep"
            java.lang.String r2 = "true"
            r9.put(r0, r2)
        L_0x0061:
            com.pubnub.api.PubNub r0 = r8.getPubnub()
            com.pubnub.api.PNConfiguration r0 = r0.getConfiguration()
            java.lang.String r0 = r0.getCipherKey()
            if (r0 == 0) goto L_0x0098
            com.pubnub.api.vendor.Crypto r0 = new com.pubnub.api.vendor.Crypto
            com.pubnub.api.PubNub r2 = r8.getPubnub()
            com.pubnub.api.PNConfiguration r2 = r2.getConfiguration()
            java.lang.String r2 = r2.getCipherKey()
            com.pubnub.api.PubNub r3 = r8.getPubnub()
            com.pubnub.api.PNConfiguration r3 = r3.getConfiguration()
            boolean r3 = r3.isUseRandomInitializationVector()
            r0.<init>((java.lang.String) r2, (boolean) r3)
            java.lang.String r0 = r0.encrypt(r1)
            java.lang.String r1 = "\n"
            java.lang.String r2 = ""
            java.lang.String r1 = r0.replace(r1, r2)
        L_0x0098:
            java.util.Map r0 = r8.encodeParams(r9)
            r9.putAll(r0)
            java.lang.Boolean r0 = r8.usePOST
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00e3
            com.pubnub.api.PubNub r0 = r8.getPubnub()
            com.pubnub.api.PNConfiguration r0 = r0.getConfiguration()
            java.lang.String r0 = r0.getCipherKey()
            if (r0 == 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            java.lang.Object r1 = r8.message
        L_0x00ba:
            r6 = r1
            com.pubnub.api.managers.RetrofitManager r0 = r8.getRetrofit()
            com.pubnub.api.services.PublishService r2 = r0.getPublishService()
            com.pubnub.api.PubNub r0 = r8.getPubnub()
            com.pubnub.api.PNConfiguration r0 = r0.getConfiguration()
            java.lang.String r3 = r0.getPublishKey()
            com.pubnub.api.PubNub r0 = r8.getPubnub()
            com.pubnub.api.PNConfiguration r0 = r0.getConfiguration()
            java.lang.String r4 = r0.getSubscribeKey()
            java.lang.String r5 = r8.channel
            r7 = r9
            t0.d r9 = r2.publishWithPost(r3, r4, r5, r6, r7)
            return r9
        L_0x00e3:
            com.pubnub.api.PubNub r0 = r8.getPubnub()
            com.pubnub.api.PNConfiguration r0 = r0.getConfiguration()
            java.lang.String r0 = r0.getCipherKey()
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = "\""
            java.lang.String r1 = r0.concat(r1)
            java.lang.String r1 = r1.concat(r0)
        L_0x00fb:
            java.lang.String r6 = com.pubnub.api.PubNubUtil.urlEncode(r1)
            com.pubnub.api.managers.RetrofitManager r0 = r8.getRetrofit()
            com.pubnub.api.services.PublishService r2 = r0.getPublishService()
            com.pubnub.api.PubNub r0 = r8.getPubnub()
            com.pubnub.api.PNConfiguration r0 = r0.getConfiguration()
            java.lang.String r3 = r0.getPublishKey()
            com.pubnub.api.PubNub r0 = r8.getPubnub()
            com.pubnub.api.PNConfiguration r0 = r0.getConfiguration()
            java.lang.String r4 = r0.getSubscribeKey()
            java.lang.String r5 = r8.channel
            r7 = r9
            t0.d r9 = r2.publish(r3, r4, r5, r6, r7)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubnub.api.endpoints.pubsub.Publish.doWork(java.util.Map):t0.d");
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return Collections.singletonList(this.channel);
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNPublishOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public Publish message(Object obj) {
        this.message = obj;
        return this;
    }

    public Publish meta(Object obj) {
        this.meta = obj;
        return this;
    }

    public Publish replicate(Boolean bool) {
        this.replicate = bool;
        return this;
    }

    public Publish shouldStore(Boolean bool) {
        this.shouldStore = bool;
        return this;
    }

    public Publish ttl(Integer num) {
        this.ttl = num;
        return this;
    }

    public Publish usePOST(Boolean bool) {
        this.usePOST = bool;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (this.message != null) {
            String str = this.channel;
            if (str == null || str.isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
            } else if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
            } else if (getPubnub().getConfiguration().getPublishKey() == null || getPubnub().getConfiguration().getPublishKey().isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PUBLISH_KEY_MISSING).build();
            }
        } else {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_MESSAGE_MISSING).build();
        }
    }

    public PNPublishResult createResponse(v<List<Object>> vVar) throws PubNubException {
        PNPublishResult.PNPublishResultBuilder builder = PNPublishResult.builder();
        builder.timetoken(Long.valueOf(((List) vVar.b).get(2).toString()));
        return builder.build();
    }
}
