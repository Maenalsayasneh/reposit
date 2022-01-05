package io.agora.rtc.video;

import java.util.HashMap;
import java.util.Map;

public class ChannelMediaRelayConfiguration {
    private Map<String, ChannelMediaInfo> destInfos;
    private ChannelMediaInfo srcInfo;

    public ChannelMediaRelayConfiguration() {
        this.srcInfo = null;
        this.destInfos = null;
        this.destInfos = new HashMap();
        this.srcInfo = new ChannelMediaInfo((String) null, (String) null, 0);
    }

    public Map<String, ChannelMediaInfo> getDestChannelMediaInfos() {
        return this.destInfos;
    }

    public ChannelMediaInfo getSrcChannelMediaInfo() {
        return this.srcInfo;
    }

    public void removeDestChannelInfo(String str) {
        this.destInfos.remove(str);
    }

    public void setDestChannelInfo(String str, ChannelMediaInfo channelMediaInfo) {
        this.destInfos.put(str, channelMediaInfo);
    }

    public void setSrcChannelInfo(ChannelMediaInfo channelMediaInfo) {
        this.srcInfo = channelMediaInfo;
    }
}
