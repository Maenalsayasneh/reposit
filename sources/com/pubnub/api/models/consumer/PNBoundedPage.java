package com.pubnub.api.models.consumer;

import i0.d.a.a.a;

public class PNBoundedPage {
    private final Long end;
    private final Integer limit;
    private final Long start;

    public PNBoundedPage(Long l, Long l2, Integer num) {
        this.start = l;
        this.end = l2;
        this.limit = num;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNBoundedPage;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNBoundedPage)) {
            return false;
        }
        PNBoundedPage pNBoundedPage = (PNBoundedPage) obj;
        if (!pNBoundedPage.canEqual(this)) {
            return false;
        }
        Long start2 = getStart();
        Long start3 = pNBoundedPage.getStart();
        if (start2 != null ? !start2.equals(start3) : start3 != null) {
            return false;
        }
        Long end2 = getEnd();
        Long end3 = pNBoundedPage.getEnd();
        if (end2 != null ? !end2.equals(end3) : end3 != null) {
            return false;
        }
        Integer limit2 = getLimit();
        Integer limit3 = pNBoundedPage.getLimit();
        return limit2 != null ? limit2.equals(limit3) : limit3 == null;
    }

    public Long getEnd() {
        return this.end;
    }

    public Integer getLimit() {
        return this.limit;
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
        Integer limit2 = getLimit();
        int i2 = hashCode2 * 59;
        if (limit2 != null) {
            i = limit2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNBoundedPage(start=");
        P0.append(getStart());
        P0.append(", end=");
        P0.append(getEnd());
        P0.append(", limit=");
        P0.append(getLimit());
        P0.append(")");
        return P0.toString();
    }
}
