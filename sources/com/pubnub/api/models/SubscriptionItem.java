package com.pubnub.api.models;

public class SubscriptionItem {
    private String name;
    private Object state;

    public boolean canEqual(Object obj) {
        return obj instanceof SubscriptionItem;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscriptionItem)) {
            return false;
        }
        SubscriptionItem subscriptionItem = (SubscriptionItem) obj;
        if (!subscriptionItem.canEqual(this)) {
            return false;
        }
        String name2 = getName();
        String name3 = subscriptionItem.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        Object state2 = getState();
        Object state3 = subscriptionItem.getState();
        return state2 != null ? state2.equals(state3) : state3 == null;
    }

    public String getName() {
        return this.name;
    }

    public Object getState() {
        return this.state;
    }

    public int hashCode() {
        String name2 = getName();
        int i = 43;
        int hashCode = name2 == null ? 43 : name2.hashCode();
        Object state2 = getState();
        int i2 = (hashCode + 59) * 59;
        if (state2 != null) {
            i = state2.hashCode();
        }
        return i2 + i;
    }

    public SubscriptionItem setName(String str) {
        this.name = str;
        return this;
    }

    public SubscriptionItem setState(Object obj) {
        this.state = obj;
        return this;
    }
}
