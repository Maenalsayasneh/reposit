package h0.i.a;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.graphics.drawable.IconCompat;
import h0.i.b.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder */
public class c implements NotificationBuilderWithBuilderAccessor {
    public final Context a;
    public final Notification.Builder b;
    public final NotificationCompat.Builder c;
    public RemoteViews d;
    public RemoteViews e;
    public final List<Bundle> f = new ArrayList();
    public final Bundle g = new Bundle();
    public int h;
    public RemoteViews i;

    public c(NotificationCompat.Builder builder) {
        List<String> list;
        Bundle bundle;
        NotificationCompat.Builder builder2 = builder;
        this.c = builder2;
        this.a = builder2.mContext;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = new Notification.Builder(builder2.mContext, builder2.mChannelId);
        } else {
            this.b = new Notification.Builder(builder2.mContext);
        }
        Notification notification = builder2.mNotification;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder2.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder2.mContentTitle).setContentText(builder2.mContentText).setContentInfo(builder2.mContentInfo).setContentIntent(builder2.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder2.mFullScreenIntent, (notification.flags & 128) != 0).setLargeIcon(builder2.mLargeIcon).setNumber(builder2.mNumber).setProgress(builder2.mProgressMax, builder2.mProgress, builder2.mProgressIndeterminate);
        this.b.setSubText(builder2.mSubText).setUsesChronometer(builder2.mUseChronometer).setPriority(builder2.mPriority);
        Iterator<NotificationCompat.Action> it = builder2.mActions.iterator();
        while (true) {
            Icon icon = null;
            if (!it.hasNext()) {
                break;
            }
            NotificationCompat.Action next = it.next();
            IconCompat iconCompat = next.getIconCompat();
            Notification.Action.Builder builder3 = new Notification.Action.Builder(iconCompat != null ? iconCompat.n() : icon, next.getTitle(), next.getActionIntent());
            if (next.getRemoteInputs() != null) {
                for (RemoteInput addRemoteInput : androidx.core.app.RemoteInput.fromCompat(next.getRemoteInputs())) {
                    builder3.addRemoteInput(addRemoteInput);
                }
            }
            if (next.getExtras() != null) {
                bundle = new Bundle(next.getExtras());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", next.getAllowGeneratedReplies());
            int i2 = Build.VERSION.SDK_INT;
            builder3.setAllowGeneratedReplies(next.getAllowGeneratedReplies());
            bundle.putInt(NotificationCompat.Action.EXTRA_SEMANTIC_ACTION, next.getSemanticAction());
            if (i2 >= 28) {
                builder3.setSemanticAction(next.getSemanticAction());
            }
            if (i2 >= 29) {
                builder3.setContextual(next.isContextual());
            }
            bundle.putBoolean(NotificationCompat.Action.EXTRA_SHOWS_USER_INTERFACE, next.getShowsUserInterface());
            builder3.addExtras(bundle);
            this.b.addAction(builder3.build());
        }
        Bundle bundle2 = builder2.mExtras;
        if (bundle2 != null) {
            this.g.putAll(bundle2);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.d = builder2.mContentView;
        this.e = builder2.mBigContentView;
        this.b.setShowWhen(builder2.mShowWhen);
        this.b.setLocalOnly(builder2.mLocalOnly).setGroup(builder2.mGroupKey).setGroupSummary(builder2.mGroupSummary).setSortKey(builder2.mSortKey);
        this.h = builder2.mGroupAlertBehavior;
        this.b.setCategory(builder2.mCategory).setColor(builder2.mColor).setVisibility(builder2.mVisibility).setPublicVersion(builder2.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
        if (i3 < 28) {
            list = b(c(builder2.mPersonList), builder2.mPeople);
        } else {
            list = builder2.mPeople;
        }
        if (list != null && !list.isEmpty()) {
            for (String addPerson : list) {
                this.b.addPerson(addPerson);
            }
        }
        this.i = builder2.mHeadsUpContentView;
        if (builder2.mInvisibleActions.size() > 0) {
            Bundle bundle3 = builder.getExtras().getBundle(NotificationCompat.CarExtender.EXTRA_CAR_EXTENDER);
            bundle3 = bundle3 == null ? new Bundle() : bundle3;
            Bundle bundle4 = new Bundle(bundle3);
            Bundle bundle5 = new Bundle();
            for (int i4 = 0; i4 < builder2.mInvisibleActions.size(); i4++) {
                bundle5.putBundle(Integer.toString(i4), d.d(builder2.mInvisibleActions.get(i4)));
            }
            bundle3.putBundle(NotificationCompat.CarExtender.EXTRA_INVISIBLE_ACTIONS, bundle5);
            bundle4.putBundle(NotificationCompat.CarExtender.EXTRA_INVISIBLE_ACTIONS, bundle5);
            builder.getExtras().putBundle(NotificationCompat.CarExtender.EXTRA_CAR_EXTENDER, bundle3);
            this.g.putBundle(NotificationCompat.CarExtender.EXTRA_CAR_EXTENDER, bundle4);
        }
        int i5 = Build.VERSION.SDK_INT;
        Icon icon2 = builder2.mSmallIcon;
        if (icon2 != null) {
            this.b.setSmallIcon(icon2);
        }
        this.b.setExtras(builder2.mExtras).setRemoteInputHistory(builder2.mRemoteInputHistory);
        RemoteViews remoteViews = builder2.mContentView;
        if (remoteViews != null) {
            this.b.setCustomContentView(remoteViews);
        }
        RemoteViews remoteViews2 = builder2.mBigContentView;
        if (remoteViews2 != null) {
            this.b.setCustomBigContentView(remoteViews2);
        }
        RemoteViews remoteViews3 = builder2.mHeadsUpContentView;
        if (remoteViews3 != null) {
            this.b.setCustomHeadsUpContentView(remoteViews3);
        }
        if (i5 >= 26) {
            this.b.setBadgeIconType(builder2.mBadgeIcon).setSettingsText(builder2.mSettingsText).setShortcutId(builder2.mShortcutId).setTimeoutAfter(builder2.mTimeout).setGroupAlertBehavior(builder2.mGroupAlertBehavior);
            if (builder2.mColorizedSet) {
                this.b.setColorized(builder2.mColorized);
            }
            if (!TextUtils.isEmpty(builder2.mChannelId)) {
                this.b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i5 >= 28) {
            Iterator<Person> it2 = builder2.mPersonList.iterator();
            while (it2.hasNext()) {
                this.b.addPerson(it2.next().toAndroidPerson());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(builder2.mAllowSystemGeneratedContextualActions);
            this.b.setBubbleMetadata(NotificationCompat.BubbleMetadata.toPlatform(builder2.mBubbleMetadata));
            b bVar = builder2.mLocusId;
            if (bVar != null) {
                this.b.setLocusId(bVar.b);
            }
        }
        if (builder2.mSilent) {
            if (this.c.mGroupSummary) {
                this.h = 2;
            } else {
                this.h = 1;
            }
            this.b.setVibrate((long[]) null);
            this.b.setSound((Uri) null);
            int i7 = notification.defaults & -2;
            notification.defaults = i7;
            int i8 = i7 & -3;
            notification.defaults = i8;
            this.b.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.c.mGroupKey)) {
                    this.b.setGroup(NotificationCompat.GROUP_KEY_SILENT);
                }
                this.b.setGroupAlertBehavior(this.h);
            }
        }
    }

    public static List<String> b(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        h0.f.c cVar = new h0.f.c(list2.size() + list.size());
        cVar.addAll(list);
        cVar.addAll(list2);
        return new ArrayList(cVar);
    }

    public static List<String> c(List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Person resolveToLegacyUri : list) {
            arrayList.add(resolveToLegacyUri.resolveToLegacyUri());
        }
        return arrayList;
    }

    public Notification a() {
        Notification notification;
        Bundle extras;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        NotificationCompat.Style style = this.c.mStyle;
        if (style != null) {
            style.apply(this);
        }
        RemoteViews makeContentView = style != null ? style.makeContentView(this) : null;
        if (Build.VERSION.SDK_INT >= 26) {
            notification = this.b.build();
        } else {
            notification = this.b.build();
            if (this.h != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || this.h != 2)) {
                    d(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && this.h == 1) {
                    d(notification);
                }
            }
        }
        if (makeContentView != null) {
            notification.contentView = makeContentView;
        } else {
            RemoteViews remoteViews = this.c.mContentView;
            if (remoteViews != null) {
                notification.contentView = remoteViews;
            }
        }
        if (!(style == null || (makeBigContentView = style.makeBigContentView(this)) == null)) {
            notification.bigContentView = makeBigContentView;
        }
        if (!(style == null || (makeHeadsUpContentView = this.c.mStyle.makeHeadsUpContentView(this)) == null)) {
            notification.headsUpContentView = makeHeadsUpContentView;
        }
        if (!(style == null || (extras = NotificationCompat.getExtras(notification)) == null)) {
            style.addCompatExtras(extras);
        }
        return notification;
    }

    public final void d(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & -2;
        notification.defaults = i2;
        notification.defaults = i2 & -3;
    }

    public Notification.Builder getBuilder() {
        return this.b;
    }
}
