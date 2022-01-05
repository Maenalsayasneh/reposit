package com.pubnub.api.models.consumer.history;

import com.pubnub.api.models.consumer.PNBoundedPage;
import i0.d.a.a.a;
import java.util.List;
import java.util.Map;

public class PNFetchMessagesResult {
    private final Map<String, List<PNFetchMessageItem>> channels;
    private final PNBoundedPage page;

    public static class PNFetchMessagesResultBuilder {
        private Map<String, List<PNFetchMessageItem>> channels;
        private PNBoundedPage page;

        public PNFetchMessagesResult build() {
            return new PNFetchMessagesResult(this.channels, this.page);
        }

        public PNFetchMessagesResultBuilder channels(Map<String, List<PNFetchMessageItem>> map) {
            this.channels = map;
            return this;
        }

        public PNFetchMessagesResultBuilder page(PNBoundedPage pNBoundedPage) {
            this.page = pNBoundedPage;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNFetchMessagesResult.PNFetchMessagesResultBuilder(channels=");
            P0.append(this.channels);
            P0.append(", page=");
            P0.append(this.page);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNFetchMessagesResult(Map<String, List<PNFetchMessageItem>> map, PNBoundedPage pNBoundedPage) {
        this.channels = map;
        this.page = pNBoundedPage;
    }

    public static PNFetchMessagesResultBuilder builder() {
        return new PNFetchMessagesResultBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNFetchMessagesResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNFetchMessagesResult)) {
            return false;
        }
        PNFetchMessagesResult pNFetchMessagesResult = (PNFetchMessagesResult) obj;
        if (!pNFetchMessagesResult.canEqual(this)) {
            return false;
        }
        Map<String, List<PNFetchMessageItem>> channels2 = getChannels();
        Map<String, List<PNFetchMessageItem>> channels3 = pNFetchMessagesResult.getChannels();
        if (channels2 != null ? !channels2.equals(channels3) : channels3 != null) {
            return false;
        }
        PNBoundedPage page2 = getPage();
        PNBoundedPage page3 = pNFetchMessagesResult.getPage();
        return page2 != null ? page2.equals(page3) : page3 == null;
    }

    public Map<String, List<PNFetchMessageItem>> getChannels() {
        return this.channels;
    }

    public PNBoundedPage getPage() {
        return this.page;
    }

    public int hashCode() {
        Map<String, List<PNFetchMessageItem>> channels2 = getChannels();
        int i = 43;
        int hashCode = channels2 == null ? 43 : channels2.hashCode();
        PNBoundedPage page2 = getPage();
        int i2 = (hashCode + 59) * 59;
        if (page2 != null) {
            i = page2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNFetchMessagesResult(channels=");
        P0.append(getChannels());
        P0.append(", page=");
        P0.append(getPage());
        P0.append(")");
        return P0.toString();
    }
}
