package com.pubnub.api.services;

import java.util.List;
import java.util.Map;
import t0.c0.f;
import t0.c0.u;
import t0.d;

public interface TimeService {
    @f("/time/0")
    d<List<Long>> fetchTime(@u Map<String, String> map);
}
