package com.pubnub.api.services;

import com.pubnub.api.models.server.Envelope;
import java.util.Map;
import t0.c0.f;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface ChannelGroupService {
    @f("v1/channel-registration/sub-key/{subKey}/channel-group/{group}")
    d<Envelope> addChannelChannelGroup(@s("subKey") String str, @s("group") String str2, @u Map<String, String> map);

    @f("v1/channel-registration/sub-key/{subKey}/channel-group/{group}")
    d<Envelope<Object>> allChannelsChannelGroup(@s("subKey") String str, @s("group") String str2, @u Map<String, String> map);

    @f("v1/channel-registration/sub-key/{subKey}/channel-group/{group}/remove")
    d<Envelope> deleteChannelGroup(@s("subKey") String str, @s("group") String str2, @u Map<String, String> map);

    @f("v1/channel-registration/sub-key/{subKey}/channel-group")
    d<Envelope<Object>> listAllChannelGroup(@s("subKey") String str, @u Map<String, String> map);

    @f("v1/channel-registration/sub-key/{subKey}/channel-group/{group}")
    d<Envelope> removeChannel(@s("subKey") String str, @s("group") String str2, @u Map<String, String> map);
}
