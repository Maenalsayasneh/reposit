package com.pubnub.api.services;

import com.pubnub.api.models.consumer.message_actions.PNGetMessageActionsResult;
import com.pubnub.api.models.consumer.message_actions.PNMessageAction;
import com.pubnub.api.models.server.objects_api.EntityEnvelope;
import java.util.Map;
import t0.c0.a;
import t0.c0.b;
import t0.c0.f;
import t0.c0.k;
import t0.c0.o;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface MessageActionService {
    @k({"Content-Type: application/json; charset=UTF-8"})
    @o("v1/message-actions/{subKey}/channel/{channel}/message/{messageTimetoken}")
    d<EntityEnvelope<PNMessageAction>> addMessageAction(@s("subKey") String str, @s("channel") String str2, @s("messageTimetoken") String str3, @a Object obj, @u(encoded = true) Map<String, String> map);

    @b("v1/message-actions/{subKey}/channel/{channel}/message/{messageTimetoken}/action/{actionTimetoken}")
    d<Object> deleteMessageAction(@s("subKey") String str, @s("channel") String str2, @s("messageTimetoken") String str3, @s("actionTimetoken") String str4, @u(encoded = true) Map<String, String> map);

    @f("v1/message-actions/{subKey}/channel/{channel}")
    d<PNGetMessageActionsResult> getMessageActions(@s("subKey") String str, @s("channel") String str2, @u(encoded = true) Map<String, String> map);
}
