package com.pubnub.api.services;

import java.util.List;
import java.util.Map;
import t0.c0.f;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface SignalService {
    @f("/signal/{pubKey}/{subKey}/0/{channel}/0/{payload}")
    d<List<Object>> signal(@s("pubKey") String str, @s("subKey") String str2, @s("channel") String str3, @s(encoded = true, value = "payload") String str4, @u(encoded = true) Map<String, String> map);
}
