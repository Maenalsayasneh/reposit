package com.pubnub.api.models.server;

import com.pubnub.api.models.consumer.history.PNFetchMessageItem;
import i0.d.a.a.a;
import java.util.List;
import java.util.Map;

public class FetchMessagesEnvelope {
    private Map<String, List<PNFetchMessageItem>> channels;
    private FetchMessagesPage more;

    public static class FetchMessagesPage {
        private Long end;
        private Integer max;
        private Long start;

        public boolean canEqual(Object obj) {
            return obj instanceof FetchMessagesPage;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FetchMessagesPage)) {
                return false;
            }
            FetchMessagesPage fetchMessagesPage = (FetchMessagesPage) obj;
            if (!fetchMessagesPage.canEqual(this)) {
                return false;
            }
            Long start2 = getStart();
            Long start3 = fetchMessagesPage.getStart();
            if (start2 != null ? !start2.equals(start3) : start3 != null) {
                return false;
            }
            Long end2 = getEnd();
            Long end3 = fetchMessagesPage.getEnd();
            if (end2 != null ? !end2.equals(end3) : end3 != null) {
                return false;
            }
            Integer max2 = getMax();
            Integer max3 = fetchMessagesPage.getMax();
            return max2 != null ? max2.equals(max3) : max3 == null;
        }

        public Long getEnd() {
            return this.end;
        }

        public Integer getMax() {
            return this.max;
        }

        public Long getStart() {
            return this.start;
        }

        public int hashCode() {
            Long start2 = getStart();
            int i = 43;
            int hashCode = start2 == null ? 43 : start2.hashCode();
            Long end2 = getEnd();
            int hashCode2 = ((hashCode + 59) * 59) + (end2 == null ? 43 : end2.hashCode());
            Integer max2 = getMax();
            int i2 = hashCode2 * 59;
            if (max2 != null) {
                i = max2.hashCode();
            }
            return i2 + i;
        }

        public void setEnd(Long l) {
            this.end = l;
        }

        public void setMax(Integer num) {
            this.max = num;
        }

        public void setStart(Long l) {
            this.start = l;
        }

        public String toString() {
            StringBuilder P0 = a.P0("FetchMessagesEnvelope.FetchMessagesPage(start=");
            P0.append(getStart());
            P0.append(", end=");
            P0.append(getEnd());
            P0.append(", max=");
            P0.append(getMax());
            P0.append(")");
            return P0.toString();
        }
    }

    public boolean canEqual(Object obj) {
        return obj instanceof FetchMessagesEnvelope;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FetchMessagesEnvelope)) {
            return false;
        }
        FetchMessagesEnvelope fetchMessagesEnvelope = (FetchMessagesEnvelope) obj;
        if (!fetchMessagesEnvelope.canEqual(this)) {
            return false;
        }
        Map<String, List<PNFetchMessageItem>> channels2 = getChannels();
        Map<String, List<PNFetchMessageItem>> channels3 = fetchMessagesEnvelope.getChannels();
        if (channels2 != null ? !channels2.equals(channels3) : channels3 != null) {
            return false;
        }
        FetchMessagesPage more2 = getMore();
        FetchMessagesPage more3 = fetchMessagesEnvelope.getMore();
        return more2 != null ? more2.equals(more3) : more3 == null;
    }

    public Map<String, List<PNFetchMessageItem>> getChannels() {
        return this.channels;
    }

    public FetchMessagesPage getMore() {
        return this.more;
    }

    public int hashCode() {
        Map<String, List<PNFetchMessageItem>> channels2 = getChannels();
        int i = 43;
        int hashCode = channels2 == null ? 43 : channels2.hashCode();
        FetchMessagesPage more2 = getMore();
        int i2 = (hashCode + 59) * 59;
        if (more2 != null) {
            i = more2.hashCode();
        }
        return i2 + i;
    }

    public void setChannels(Map<String, List<PNFetchMessageItem>> map) {
        this.channels = map;
    }

    public void setMore(FetchMessagesPage fetchMessagesPage) {
        this.more = fetchMessagesPage;
    }

    public String toString() {
        StringBuilder P0 = a.P0("FetchMessagesEnvelope(channels=");
        P0.append(getChannels());
        P0.append(", more=");
        P0.append(getMore());
        P0.append(")");
        return P0.toString();
    }
}
