package com.pubnub.api.endpoints.objects_api.utils;

import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.models.consumer.objects_api.member.PNUUID;
import com.pubnub.api.models.consumer.objects_api.membership.PNChannelMembership;
import java.util.Collection;

public interface ObjectsBuilderSteps extends BuilderSteps {

    public interface ChannelMembershipsStep<T> {
        T channelMemberships(Collection<PNChannelMembership> collection);
    }

    public interface RemoveOrSetStep<T, E> {

        public interface RemoveStep<T, E> {
            T remove(Collection<E> collection);
        }

        public interface SetStep<T, E> {
            T set(Collection<E> collection);
        }

        SetStep<T, E> remove(Collection<E> collection);

        RemoveStep<T, E> set(Collection<E> collection);
    }

    public interface UUIDsStep<T> {
        T uuids(Collection<PNUUID> collection);
    }
}
