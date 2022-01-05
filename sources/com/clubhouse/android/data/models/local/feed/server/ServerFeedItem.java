package com.clubhouse.android.data.models.local.feed.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import com.clubhouse.android.data.models.local.feed.server.FeedInvitesUpsell;
import com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker;
import com.clubhouse.android.data.models.local.feed.server.FeedTodayView;
import com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell;
import com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;
import n0.c.j.d;
import n0.c.k.v;
import n0.c.k.v0;

@e
/* compiled from: ServerFeedItem.kt */
public final class ServerFeedItem implements Parcelable {
    public static final Parcelable.Creator<ServerFeedItem> CREATOR = new b();
    public static final Companion Companion = new Companion((f) null);
    public final FeedLanguagePicker Y1;
    public final ChannelInFeed c;
    public final FeedTodayView d;
    public final FeedInvitesUpsell q;
    public final FeedTopicsUpsell x;
    public final SuggestionCarousel y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/clubhouse/android/data/models/local/feed/server/ServerFeedItem$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/clubhouse/android/data/models/local/feed/server/ServerFeedItem;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "data_release"}, k = 1, mv = {1, 5, 1})
    /* compiled from: ServerFeedItem.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<ServerFeedItem> serializer() {
            return a.a;
        }

        public Companion(f fVar) {
        }
    }

    /* compiled from: ServerFeedItem.kt */
    public static final class a implements v<ServerFeedItem> {
        public static final a a;
        public static final /* synthetic */ SerialDescriptor b;

        static {
            a aVar = new a();
            a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.clubhouse.android.data.models.local.feed.server.ServerFeedItem", aVar, 6);
            pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CHANNEL_PARAM_VALUE, true);
            pluginGeneratedSerialDescriptor.i("today_view", true);
            pluginGeneratedSerialDescriptor.i("invite_friends_upsell", true);
            pluginGeneratedSerialDescriptor.i("topics_upsell", true);
            pluginGeneratedSerialDescriptor.i("suggestion_carousel", true);
            pluginGeneratedSerialDescriptor.i("language_picker", true);
            b = pluginGeneratedSerialDescriptor;
        }

        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{m0.r.t.a.r.m.a1.a.R1(ChannelInFeed.a.a), m0.r.t.a.r.m.a1.a.R1(FeedTodayView.a.a), m0.r.t.a.r.m.a1.a.R1(FeedInvitesUpsell.a.a), m0.r.t.a.r.m.a1.a.R1(FeedTopicsUpsell.a.a), m0.r.t.a.r.m.a1.a.R1(SuggestionCarousel.a.a), m0.r.t.a.r.m.a1.a.R1(FeedLanguagePicker.a.a)};
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x008b, code lost:
            r14 = r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x009b, code lost:
            r9 = r3;
            r3 = 3;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r17) {
            /*
                r16 = this;
                r0 = r17
                java.lang.String r1 = "decoder"
                m0.n.b.i.e(r0, r1)
                kotlinx.serialization.descriptors.SerialDescriptor r1 = b
                n0.c.j.c r0 = r0.c(r1)
                boolean r2 = r0.y()
                r3 = 3
                r4 = 0
                r5 = 1
                r6 = 2
                r7 = 4
                r8 = 5
                r9 = 0
                if (r2 == 0) goto L_0x0043
                com.clubhouse.android.data.models.local.channel.ChannelInFeed$a r2 = com.clubhouse.android.data.models.local.channel.ChannelInFeed.a.a
                java.lang.Object r2 = r0.v(r1, r9, r2, r4)
                com.clubhouse.android.data.models.local.feed.server.FeedTodayView$a r9 = com.clubhouse.android.data.models.local.feed.server.FeedTodayView.a.a
                java.lang.Object r5 = r0.v(r1, r5, r9, r4)
                com.clubhouse.android.data.models.local.feed.server.FeedInvitesUpsell$a r9 = com.clubhouse.android.data.models.local.feed.server.FeedInvitesUpsell.a.a
                java.lang.Object r6 = r0.v(r1, r6, r9, r4)
                com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell$a r9 = com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell.a.a
                java.lang.Object r3 = r0.v(r1, r3, r9, r4)
                com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel$a r9 = com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel.a.a
                java.lang.Object r7 = r0.v(r1, r7, r9, r4)
                com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker$a r9 = com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker.a.a
                java.lang.Object r4 = r0.v(r1, r8, r9, r4)
                r8 = 63
                r9 = r8
                goto L_0x00a5
            L_0x0043:
                r2 = r4
                r10 = r2
                r11 = r10
                r12 = r11
                r13 = r12
                r15 = r5
                r14 = r9
            L_0x004a:
                if (r15 == 0) goto L_0x009e
                int r9 = r0.x(r1)
                switch(r9) {
                    case -1: goto L_0x0099;
                    case 0: goto L_0x008e;
                    case 1: goto L_0x0083;
                    case 2: goto L_0x007a;
                    case 3: goto L_0x006f;
                    case 4: goto L_0x0064;
                    case 5: goto L_0x0059;
                    default: goto L_0x0053;
                }
            L_0x0053:
                kotlinx.serialization.UnknownFieldException r0 = new kotlinx.serialization.UnknownFieldException
                r0.<init>(r9)
                throw r0
            L_0x0059:
                com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker$a r9 = com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker.a.a
                java.lang.Object r9 = r0.v(r1, r8, r9, r12)
                r12 = r14 | 32
                r14 = r12
                r12 = r9
                goto L_0x008c
            L_0x0064:
                com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel$a r9 = com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel.a.a
                java.lang.Object r9 = r0.v(r1, r7, r9, r11)
                r11 = r14 | 16
                r14 = r11
                r11 = r9
                goto L_0x008c
            L_0x006f:
                com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell$a r9 = com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell.a.a
                java.lang.Object r9 = r0.v(r1, r3, r9, r10)
                r10 = r14 | 8
                r14 = r10
                r10 = r9
                goto L_0x008c
            L_0x007a:
                com.clubhouse.android.data.models.local.feed.server.FeedInvitesUpsell$a r9 = com.clubhouse.android.data.models.local.feed.server.FeedInvitesUpsell.a.a
                java.lang.Object r2 = r0.v(r1, r6, r9, r2)
                r9 = r14 | 4
                goto L_0x008b
            L_0x0083:
                com.clubhouse.android.data.models.local.feed.server.FeedTodayView$a r9 = com.clubhouse.android.data.models.local.feed.server.FeedTodayView.a.a
                java.lang.Object r4 = r0.v(r1, r5, r9, r4)
                r9 = r14 | 2
            L_0x008b:
                r14 = r9
            L_0x008c:
                r9 = 0
                goto L_0x004a
            L_0x008e:
                com.clubhouse.android.data.models.local.channel.ChannelInFeed$a r9 = com.clubhouse.android.data.models.local.channel.ChannelInFeed.a.a
                r3 = 0
                java.lang.Object r9 = r0.v(r1, r3, r9, r13)
                r14 = r14 | 1
                r13 = r9
                goto L_0x009b
            L_0x0099:
                r3 = 0
                r15 = r3
            L_0x009b:
                r9 = r3
                r3 = 3
                goto L_0x004a
            L_0x009e:
                r6 = r2
                r5 = r4
                r3 = r10
                r7 = r11
                r4 = r12
                r2 = r13
                r9 = r14
            L_0x00a5:
                r0.b(r1)
                com.clubhouse.android.data.models.local.feed.server.ServerFeedItem r0 = new com.clubhouse.android.data.models.local.feed.server.ServerFeedItem
                r10 = r2
                com.clubhouse.android.data.models.local.channel.ChannelInFeed r10 = (com.clubhouse.android.data.models.local.channel.ChannelInFeed) r10
                r11 = r5
                com.clubhouse.android.data.models.local.feed.server.FeedTodayView r11 = (com.clubhouse.android.data.models.local.feed.server.FeedTodayView) r11
                r12 = r6
                com.clubhouse.android.data.models.local.feed.server.FeedInvitesUpsell r12 = (com.clubhouse.android.data.models.local.feed.server.FeedInvitesUpsell) r12
                r13 = r3
                com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell r13 = (com.clubhouse.android.data.models.local.feed.server.FeedTopicsUpsell) r13
                r14 = r7
                com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel r14 = (com.clubhouse.android.data.models.local.feed.server.SuggestionCarousel) r14
                r15 = r4
                com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker r15 = (com.clubhouse.android.data.models.local.feed.server.FeedLanguagePicker) r15
                r8 = r0
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.data.models.local.feed.server.ServerFeedItem.a.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
        }

        public SerialDescriptor getDescriptor() {
            return b;
        }

        public void serialize(Encoder encoder, Object obj) {
            ServerFeedItem serverFeedItem = (ServerFeedItem) obj;
            i.e(encoder, "encoder");
            i.e(serverFeedItem, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            SerialDescriptor serialDescriptor = b;
            d c = encoder.c(serialDescriptor);
            i.e(serverFeedItem, "self");
            i.e(c, "output");
            i.e(serialDescriptor, "serialDesc");
            boolean z = false;
            if (c.v(serialDescriptor, 0) || serverFeedItem.c != null) {
                c.l(serialDescriptor, 0, ChannelInFeed.a.a, serverFeedItem.c);
            }
            if (c.v(serialDescriptor, 1) || serverFeedItem.d != null) {
                c.l(serialDescriptor, 1, FeedTodayView.a.a, serverFeedItem.d);
            }
            if (c.v(serialDescriptor, 2) || serverFeedItem.q != null) {
                c.l(serialDescriptor, 2, FeedInvitesUpsell.a.a, serverFeedItem.q);
            }
            if (c.v(serialDescriptor, 3) || serverFeedItem.x != null) {
                c.l(serialDescriptor, 3, FeedTopicsUpsell.a.a, serverFeedItem.x);
            }
            if (c.v(serialDescriptor, 4) || serverFeedItem.y != null) {
                c.l(serialDescriptor, 4, SuggestionCarousel.a.a, serverFeedItem.y);
            }
            if (c.v(serialDescriptor, 5) || serverFeedItem.Y1 != null) {
                z = true;
            }
            if (z) {
                c.l(serialDescriptor, 5, FeedLanguagePicker.a.a, serverFeedItem.Y1);
            }
            c.b(serialDescriptor);
        }

        public KSerializer<?>[] typeParametersSerializers() {
            return v0.a;
        }
    }

    /* compiled from: ServerFeedItem.kt */
    public static final class b implements Parcelable.Creator<ServerFeedItem> {
        public Object createFromParcel(Parcel parcel) {
            i.e(parcel, "parcel");
            FeedLanguagePicker feedLanguagePicker = null;
            ChannelInFeed createFromParcel = parcel.readInt() == 0 ? null : ChannelInFeed.CREATOR.createFromParcel(parcel);
            FeedTodayView createFromParcel2 = parcel.readInt() == 0 ? null : FeedTodayView.CREATOR.createFromParcel(parcel);
            FeedInvitesUpsell createFromParcel3 = parcel.readInt() == 0 ? null : FeedInvitesUpsell.CREATOR.createFromParcel(parcel);
            FeedTopicsUpsell createFromParcel4 = parcel.readInt() == 0 ? null : FeedTopicsUpsell.CREATOR.createFromParcel(parcel);
            SuggestionCarousel createFromParcel5 = parcel.readInt() == 0 ? null : SuggestionCarousel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                feedLanguagePicker = FeedLanguagePicker.CREATOR.createFromParcel(parcel);
            }
            return new ServerFeedItem(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, feedLanguagePicker);
        }

        public Object[] newArray(int i) {
            return new ServerFeedItem[i];
        }
    }

    public ServerFeedItem() {
        this.c = null;
        this.d = null;
        this.q = null;
        this.x = null;
        this.y = null;
        this.Y1 = null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerFeedItem)) {
            return false;
        }
        ServerFeedItem serverFeedItem = (ServerFeedItem) obj;
        return i.a(this.c, serverFeedItem.c) && i.a(this.d, serverFeedItem.d) && i.a(this.q, serverFeedItem.q) && i.a(this.x, serverFeedItem.x) && i.a(this.y, serverFeedItem.y) && i.a(this.Y1, serverFeedItem.Y1);
    }

    public int hashCode() {
        ChannelInFeed channelInFeed = this.c;
        int i = 0;
        int hashCode = (channelInFeed == null ? 0 : channelInFeed.hashCode()) * 31;
        FeedTodayView feedTodayView = this.d;
        int hashCode2 = (hashCode + (feedTodayView == null ? 0 : feedTodayView.hashCode())) * 31;
        FeedInvitesUpsell feedInvitesUpsell = this.q;
        int hashCode3 = (hashCode2 + (feedInvitesUpsell == null ? 0 : feedInvitesUpsell.hashCode())) * 31;
        FeedTopicsUpsell feedTopicsUpsell = this.x;
        int hashCode4 = (hashCode3 + (feedTopicsUpsell == null ? 0 : feedTopicsUpsell.hashCode())) * 31;
        SuggestionCarousel suggestionCarousel = this.y;
        int hashCode5 = (hashCode4 + (suggestionCarousel == null ? 0 : suggestionCarousel.hashCode())) * 31;
        FeedLanguagePicker feedLanguagePicker = this.Y1;
        if (feedLanguagePicker != null) {
            i = feedLanguagePicker.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("ServerFeedItem(channel=");
        P0.append(this.c);
        P0.append(", todayView=");
        P0.append(this.d);
        P0.append(", invitesUpsell=");
        P0.append(this.q);
        P0.append(", topicsUpsell=");
        P0.append(this.x);
        P0.append(", suggestionCarousel=");
        P0.append(this.y);
        P0.append(", languagePicker=");
        P0.append(this.Y1);
        P0.append(')');
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "out");
        ChannelInFeed channelInFeed = this.c;
        if (channelInFeed == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            channelInFeed.writeToParcel(parcel, i);
        }
        FeedTodayView feedTodayView = this.d;
        if (feedTodayView == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedTodayView.writeToParcel(parcel, i);
        }
        FeedInvitesUpsell feedInvitesUpsell = this.q;
        if (feedInvitesUpsell == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedInvitesUpsell.writeToParcel(parcel, i);
        }
        FeedTopicsUpsell feedTopicsUpsell = this.x;
        if (feedTopicsUpsell == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            feedTopicsUpsell.writeToParcel(parcel, i);
        }
        SuggestionCarousel suggestionCarousel = this.y;
        if (suggestionCarousel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            suggestionCarousel.writeToParcel(parcel, i);
        }
        FeedLanguagePicker feedLanguagePicker = this.Y1;
        if (feedLanguagePicker == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        feedLanguagePicker.writeToParcel(parcel, i);
    }

    public ServerFeedItem(int i, ChannelInFeed channelInFeed, FeedTodayView feedTodayView, FeedInvitesUpsell feedInvitesUpsell, FeedTopicsUpsell feedTopicsUpsell, SuggestionCarousel suggestionCarousel, FeedLanguagePicker feedLanguagePicker) {
        if ((i & 0) == 0) {
            if ((i & 1) == 0) {
                this.c = null;
            } else {
                this.c = channelInFeed;
            }
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = feedTodayView;
            }
            if ((i & 4) == 0) {
                this.q = null;
            } else {
                this.q = feedInvitesUpsell;
            }
            if ((i & 8) == 0) {
                this.x = null;
            } else {
                this.x = feedTopicsUpsell;
            }
            if ((i & 16) == 0) {
                this.y = null;
            } else {
                this.y = suggestionCarousel;
            }
            if ((i & 32) == 0) {
                this.Y1 = null;
            } else {
                this.Y1 = feedLanguagePicker;
            }
        } else {
            a aVar = a.a;
            m0.r.t.a.r.m.a1.a.W3(i, 0, a.b);
            throw null;
        }
    }

    public ServerFeedItem(ChannelInFeed channelInFeed, FeedTodayView feedTodayView, FeedInvitesUpsell feedInvitesUpsell, FeedTopicsUpsell feedTopicsUpsell, SuggestionCarousel suggestionCarousel, FeedLanguagePicker feedLanguagePicker) {
        this.c = channelInFeed;
        this.d = feedTodayView;
        this.q = feedInvitesUpsell;
        this.x = feedTopicsUpsell;
        this.y = suggestionCarousel;
        this.Y1 = feedLanguagePicker;
    }
}
