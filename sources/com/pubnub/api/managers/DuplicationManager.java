package com.pubnub.api.managers;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.models.server.SubscribeMessage;
import java.util.ArrayList;

public class DuplicationManager {
    private ArrayList<String> hashHistory = new ArrayList<>();
    private PNConfiguration pnConfiguration;

    public DuplicationManager(PNConfiguration pNConfiguration) {
        this.pnConfiguration = pNConfiguration;
    }

    private String getKey(SubscribeMessage subscribeMessage) {
        return subscribeMessage.getPublishMetaData().getPublishTimetoken().toString().concat("-").concat(Integer.toString(subscribeMessage.getPayload().hashCode()));
    }

    public void addEntry(SubscribeMessage subscribeMessage) {
        if (this.hashHistory.size() >= this.pnConfiguration.getMaximumMessagesCacheSize().intValue()) {
            this.hashHistory.remove(0);
        }
        this.hashHistory.add(getKey(subscribeMessage));
    }

    public void clearHistory() {
        this.hashHistory.clear();
    }

    public boolean isDuplicate(SubscribeMessage subscribeMessage) {
        return this.hashHistory.contains(getKey(subscribeMessage));
    }
}
