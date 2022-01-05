package com.clubhouse.android.notifications;

import android.os.Bundle;
import com.clubhouse.android.data.repos.NotificationRepo;
import com.clubhouse.app.R;
import h0.q.c0;
import i0.e.b.e3.b;
import i0.e.b.e3.d;
import i0.e.b.f3.i.a;
import i0.j.f.p.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.b.i;
import n0.a.f0;
import n0.a.f1;
import n0.a.g2.a0;
import n0.a.g2.q;
import n0.a.m0;
import n0.a.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b?\u0010\nJ'\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/clubhouse/android/notifications/PushListenerService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Landroid/os/Bundle;", "", "", "data", "j", "(Landroid/os/Bundle;Ljava/util/Map;)Landroid/os/Bundle;", "Lm0/i;", "onCreate", "()V", "token", "h", "(Ljava/lang/String;)V", "onDestroy", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "f", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "Li0/e/a/a;", "e2", "Li0/e/a/a;", "getAnalytics", "()Li0/e/a/a;", "setAnalytics", "(Li0/e/a/a;)V", "analytics", "Ln0/a/g2/q;", "h2", "Ln0/a/g2/q;", "activeChatState", "Li0/e/a/b/a;", "d2", "Li0/e/a/b/a;", "getActionTrailRecorder", "()Li0/e/a/b/a;", "setActionTrailRecorder", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "Ln0/a/x;", "i2", "Ln0/a/x;", "serviceJob", "Ln0/a/f0;", "j2", "Ln0/a/f0;", "serviceScope", "", "g2", "Z", "appInForeground", "Li0/e/b/f3/i/a;", "c2", "Li0/e/b/f3/i/a;", "getUserComponentHandler", "()Li0/e/b/f3/i/a;", "setUserComponentHandler", "(Li0/e/b/f3/i/a;)V", "userComponentHandler", "Lcom/clubhouse/android/data/repos/NotificationRepo;", "f2", "Lcom/clubhouse/android/data/repos/NotificationRepo;", "notificationRepo", "<init>", "Sound", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: PushListenerService.kt */
public final class PushListenerService extends b {
    public a c2;
    public i0.e.a.b.a d2;
    public i0.e.a.a e2;
    public NotificationRepo f2;
    public boolean g2;
    public final q<String> h2 = a0.a(null);
    public final x i2;
    public final f0 j2;

    /* compiled from: PushListenerService.kt */
    public enum Sound {
        CHIME_NOTIFICATION(R.raw.chime_notification, "chime_notification.wav");
        
        private final String fileName;
        private final int res;

        private Sound(int i, String str) {
            this.res = i;
            this.fileName = str;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final int getRes() {
            return this.res;
        }
    }

    public PushListenerService() {
        x z = m0.r.t.a.r.m.a1.a.z((f1) null, 1);
        this.i2 = z;
        this.j2 = m0.r.t.a.r.m.a1.a.h(m0.c.plus(z));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0369, code lost:
        if (r10.equals("1") == true) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0381, code lost:
        if (r10.equals("1") == true) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0399, code lost:
        if (r10.equals("1") == true) goto L_0x039d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:263:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(com.google.firebase.messaging.RemoteMessage r32) {
        /*
            r31 = this;
            r1 = r31
            java.lang.String r0 = "remoteMessage"
            r2 = r32
            m0.n.b.i.e(r2, r0)
            java.util.Map r0 = r32.I0()
            java.lang.String r3 = "Notification message received with data: "
            java.lang.String r0 = m0.n.b.i.k(r3, r0)
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            v0.a.a$b r4 = v0.a.a.d
            r4.d(r0, r3)
            i0.e.a.b.a r0 = r1.d2
            if (r0 == 0) goto L_0x0862
            java.util.Map r3 = r32.I0()
            java.lang.String r5 = "remoteMessage.data"
            m0.n.b.i.d(r3, r5)
            boolean r6 = r1.g2
            java.lang.String r7 = "payload"
            m0.n.b.i.e(r3, r7)
            com.clubhouse.analytics.actiontrails.ActionTrailUploader r0 = r0.a
            java.lang.String r7 = "aps"
            java.util.Map r3 = m0.j.g.R(r3, r7)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r8 = "in_foreground"
            r7.<init>(r8, r6)
            java.util.Map r3 = m0.j.g.c0(r3, r7)
            java.lang.String r6 = "notification_delivered"
            r0.a(r6, r3)
            java.util.Map r0 = r32.I0()
            m0.n.b.i.d(r0, r5)
            boolean r0 = r0.isEmpty()
            r3 = 1
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x0861
            java.util.Map r6 = r32.I0()
            m0.n.b.i.d(r6, r5)
            java.lang.String r7 = "action"
            java.lang.Object r0 = r6.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            com.clubhouse.android.notifications.NotificationAction r8 = com.clubhouse.android.notifications.NotificationAction.ExpireChannel
            java.lang.String r9 = r8.getAction()
            boolean r9 = kotlin.text.StringsKt__IndentKt.f(r0, r9, r3)
            java.lang.String r10 = "context"
            if (r9 == 0) goto L_0x0097
            java.lang.String r0 = r8.getDataKey()
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0085
            goto L_0x0861
        L_0x0085:
            i0.e.b.e3.d r2 = i0.e.b.e3.d.a
            int r2 = r8.getNotificationId()
            m0.n.b.i.e(r1, r10)
            androidx.core.app.NotificationManagerCompat r3 = androidx.core.app.NotificationManagerCompat.from(r31)
            r3.cancel(r0, r2)
            goto L_0x0861
        L_0x0097:
            com.clubhouse.android.notifications.NotificationAction r8 = com.clubhouse.android.notifications.NotificationAction.ExpireWaveChannel
            java.lang.String r9 = r8.getAction()
            boolean r9 = kotlin.text.StringsKt__IndentKt.f(r0, r9, r3)
            if (r9 == 0) goto L_0x00c3
            java.lang.String r0 = r8.getDataKey()
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00b1
            goto L_0x0861
        L_0x00b1:
            i0.e.b.e3.d r2 = i0.e.b.e3.d.a
            int r2 = r8.getNotificationId()
            m0.n.b.i.e(r1, r10)
            androidx.core.app.NotificationManagerCompat r3 = androidx.core.app.NotificationManagerCompat.from(r31)
            r3.cancel(r0, r2)
            goto L_0x0861
        L_0x00c3:
            com.clubhouse.android.notifications.NotificationAction r8 = com.clubhouse.android.notifications.NotificationAction.OpenChat
            java.lang.String r8 = r8.getAction()
            boolean r0 = kotlin.text.StringsKt__IndentKt.f(r0, r8, r3)
            java.lang.String r8 = "body"
            java.lang.String r9 = "Error in notification avatar"
            java.lang.String r11 = "notification"
            java.lang.String r12 = "image_url"
            java.lang.String r13 = "android-support-nav:controller:deepLinkExtras"
            java.lang.String r14 = ""
            r15 = 2131362698(0x7f0a038a, float:1.8345184E38)
            r3 = 2131755009(0x7f100001, float:1.9140885E38)
            if (r0 == 0) goto L_0x02c4
            java.lang.String r0 = "chat"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r14 = r0
        L_0x00ed:
            boolean r0 = r1.g2
            if (r0 == 0) goto L_0x00ff
            n0.a.g2.q<java.lang.String> r0 = r1.h2
            java.lang.Object r0 = r0.getValue()
            boolean r0 = m0.n.b.i.a(r14, r0)
            if (r0 == 0) goto L_0x00ff
            goto L_0x0861
        L_0x00ff:
            androidx.core.app.NotificationCompat$Builder r0 = new androidx.core.app.NotificationCompat$Builder
            i0.e.b.e3.a r2 = i0.e.b.e3.a.a
            i0.e.b.e3.c r2 = i0.e.b.e3.a.d
            java.lang.String r2 = r2.a
            r0.<init>((android.content.Context) r1, (java.lang.String) r2)
            r2 = 2131231293(0x7f08023d, float:1.8078663E38)
            androidx.core.app.NotificationCompat$Builder r0 = r0.setSmallIcon((int) r2)
            java.lang.String r2 = "Builder(this, ClubhouseNotifications.MESSAGES.channelId)\n            .setSmallIcon(R.drawable.ic_backchannel_notification)"
            m0.n.b.i.d(r0, r2)
            h0.t.i r2 = new h0.t.i
            r2.<init>(r1)
            r2.e(r3)
            r2.d(r15)
            i0.e.b.g3.p.i r3 = new i0.e.b.g3.p.i
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 29
            r17 = r3
            r19 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23)
            android.os.Bundle r3 = r3.a()
            r1.j(r3, r6)
            r2.e = r3
            android.content.Intent r4 = r2.b
            r4.putExtra(r13, r3)
            android.app.PendingIntent r2 = r2.a()
            r0.setContentIntent(r2)
            r2 = 1
            androidx.core.app.NotificationCompat$Builder r0 = r0.setAutoCancel(r2)
            java.lang.String r2 = "msg"
            androidx.core.app.NotificationCompat$Builder r0 = r0.setCategory(r2)
            r2 = 2
            androidx.core.app.NotificationCompat$Builder r2 = r0.setPriority(r2)
            java.lang.String r0 = "Builder(this, ClubhouseNotifications.MESSAGES.channelId)\n            .setSmallIcon(R.drawable.ic_backchannel_notification)\n            .setDeeplinkForChat(this, chatId, data)\n            .setAutoCancel(true)\n            .setCategory(NotificationCompat.CATEGORY_MESSAGE)\n            .setPriority(NotificationCompat.PRIORITY_MAX)"
            m0.n.b.i.d(r2, r0)
            androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
            r0.<init>()
            java.lang.String r3 = "sender"
            java.lang.Object r3 = r6.get(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            androidx.core.app.Person$Builder r3 = r0.setName(r3)
            java.lang.Object r0 = r6.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0180
            boolean r4 = kotlin.text.StringsKt__IndentKt.o(r0)
            if (r4 == 0) goto L_0x017e
            goto L_0x0180
        L_0x017e:
            r4 = 0
            goto L_0x0181
        L_0x0180:
            r4 = 1
        L_0x0181:
            if (r4 != 0) goto L_0x01a1
            android.graphics.Bitmap r0 = i0.e.b.d3.k.n(r0)     // Catch:{ Exception -> 0x0198 }
            if (r0 != 0) goto L_0x018a
            goto L_0x01a1
        L_0x018a:
            android.graphics.PorterDuff$Mode r4 = androidx.core.graphics.drawable.IconCompat.a     // Catch:{ Exception -> 0x0198 }
            androidx.core.graphics.drawable.IconCompat r4 = new androidx.core.graphics.drawable.IconCompat     // Catch:{ Exception -> 0x0198 }
            r5 = 5
            r4.<init>(r5)     // Catch:{ Exception -> 0x0198 }
            r4.c = r0     // Catch:{ Exception -> 0x0198 }
            r3.setIcon(r4)     // Catch:{ Exception -> 0x0198 }
            goto L_0x01a1
        L_0x0198:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            v0.a.a$b r5 = v0.a.a.d
            r5.w(r0, r9, r4)
        L_0x01a1:
            androidx.core.app.Person r0 = r3.build()
            java.lang.String r3 = "Builder()\n            .setName(data[\"sender\"])\n            .apply {\n                val imageUrl = data[\"image_url\"]\n                if (!imageUrl.isNullOrBlank()) {\n                    try {\n                        val circularLargeIcon = getCircularBitmapFromUrl(imageUrl)\n                        circularLargeIcon?.let {\n                            setIcon(IconCompat.createWithAdaptiveBitmap(it))\n                        }\n                    } catch (e: Exception) {\n                        Timber.w(e, \"Error in notification avatar\")\n                    }\n                }\n            }\n            .build()"
            m0.n.b.i.d(r0, r3)
            java.lang.Object r3 = r1.getSystemService(r11)
            java.lang.String r4 = "null cannot be cast to non-null type android.app.NotificationManager"
            java.util.Objects.requireNonNull(r3, r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            android.service.notification.StatusBarNotification[] r3 = r3.getActiveNotifications()
            java.lang.String r4 = "context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager)\n            .activeNotifications"
            m0.n.b.i.d(r3, r4)
            int r4 = r3.length
            r5 = 0
        L_0x01c0:
            if (r5 >= r4) goto L_0x01de
            r7 = r3[r5]
            if (r7 != 0) goto L_0x01c7
            goto L_0x01d7
        L_0x01c7:
            java.lang.String r9 = r7.getTag()
            if (r9 != 0) goto L_0x01ce
            goto L_0x01d7
        L_0x01ce:
            boolean r9 = r9.equals(r14)
            r10 = 1
            if (r9 != r10) goto L_0x01d7
            r9 = 1
            goto L_0x01d8
        L_0x01d7:
            r9 = 0
        L_0x01d8:
            if (r9 == 0) goto L_0x01db
            goto L_0x01df
        L_0x01db:
            int r5 = r5 + 1
            goto L_0x01c0
        L_0x01de:
            r7 = 0
        L_0x01df:
            if (r7 != 0) goto L_0x01e3
            r3 = 0
            goto L_0x01e7
        L_0x01e3:
            android.app.Notification r3 = r7.getNotification()
        L_0x01e7:
            r4 = 6534(0x1986, float:9.156E-42)
            if (r3 != 0) goto L_0x023a
            androidx.core.app.NotificationCompat$MessagingStyle r3 = new androidx.core.app.NotificationCompat$MessagingStyle
            r3.<init>((androidx.core.app.Person) r0)
            java.lang.Object r5 = r6.get(r8)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            long r7 = r7.getTime()
            androidx.core.app.NotificationCompat$MessagingStyle r0 = r3.addMessage((java.lang.CharSequence) r5, (long) r7, (androidx.core.app.Person) r0)
            java.lang.String r3 = "MessagingStyle(sender).addMessage(data[\"body\"], Date().time, sender)"
            m0.n.b.i.d(r0, r3)
            java.lang.String r3 = "group_title"
            java.lang.Object r3 = r6.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L_0x021b
            boolean r5 = kotlin.text.StringsKt__IndentKt.o(r3)
            if (r5 == 0) goto L_0x0219
            goto L_0x021b
        L_0x0219:
            r5 = 0
            goto L_0x021c
        L_0x021b:
            r5 = 1
        L_0x021c:
            if (r5 != 0) goto L_0x0226
            r0.setConversationTitle(r3)
            r3 = 1
            r0.setGroupConversation(r3)
            goto L_0x022a
        L_0x0226:
            r3 = 0
            r0.setGroupConversation(r3)
        L_0x022a:
            r0.setBuilder(r2)
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r31)
            android.app.Notification r2 = r2.build()
            r0.notify(r14, r4, r2)
            goto L_0x0861
        L_0x023a:
            androidx.core.app.NotificationCompat$MessagingStyle r3 = androidx.core.app.NotificationCompat.MessagingStyle.extractMessagingStyleFromNotification(r3)
            androidx.core.app.NotificationCompat$MessagingStyle r5 = new androidx.core.app.NotificationCompat$MessagingStyle
            r5.<init>((androidx.core.app.Person) r0)
            if (r3 != 0) goto L_0x0247
            r7 = 0
            goto L_0x024b
        L_0x0247:
            java.lang.CharSequence r7 = r3.getConversationTitle()
        L_0x024b:
            r5.setConversationTitle(r7)
            if (r3 != 0) goto L_0x0252
            r7 = 0
            goto L_0x0256
        L_0x0252:
            boolean r7 = r3.isGroupConversation()
        L_0x0256:
            r5.setGroupConversation(r7)
            if (r3 != 0) goto L_0x025c
            goto L_0x0288
        L_0x025c:
            java.util.List r7 = r3.getMessages()
            if (r7 != 0) goto L_0x0263
            goto L_0x0288
        L_0x0263:
            java.util.Iterator r7 = r7.iterator()
        L_0x0267:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0288
            java.lang.Object r9 = r7.next()
            androidx.core.app.NotificationCompat$MessagingStyle$Message r9 = (androidx.core.app.NotificationCompat.MessagingStyle.Message) r9
            androidx.core.app.NotificationCompat$MessagingStyle$Message r10 = new androidx.core.app.NotificationCompat$MessagingStyle$Message
            java.lang.CharSequence r11 = r9.getText()
            long r12 = r9.getTimestamp()
            androidx.core.app.Person r9 = r9.getPerson()
            r10.<init>((java.lang.CharSequence) r11, (long) r12, (androidx.core.app.Person) r9)
            r5.addMessage(r10)
            goto L_0x0267
        L_0x0288:
            androidx.core.app.NotificationCompat$MessagingStyle$Message r7 = new androidx.core.app.NotificationCompat$MessagingStyle$Message
            java.lang.Object r6 = r6.get(r8)
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.util.Date r8 = new java.util.Date
            r8.<init>()
            long r8 = r8.getTime()
            r7.<init>((java.lang.CharSequence) r6, (long) r8, (androidx.core.app.Person) r0)
            r5.addMessage(r7)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setStyle(r5)
            if (r3 != 0) goto L_0x02a6
            goto L_0x02ac
        L_0x02a6:
            java.util.List r3 = r3.getMessages()
            if (r3 != 0) goto L_0x02ae
        L_0x02ac:
            r3 = 0
            goto L_0x02b2
        L_0x02ae:
            int r3 = r3.size()
        L_0x02b2:
            int r3 = r3 + 1
            r0.setNumber(r3)
            androidx.core.app.NotificationManagerCompat r0 = androidx.core.app.NotificationManagerCompat.from(r31)
            android.app.Notification r2 = r2.build()
            r0.notify(r14, r4, r2)
            goto L_0x0861
        L_0x02c4:
            java.util.Map r0 = r32.I0()
            m0.n.b.i.d(r0, r5)
            java.lang.Object r3 = r0.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r15 = "sound"
            java.lang.Object r16 = r0.get(r15)
            java.lang.String r16 = (java.lang.String) r16
            if (r16 != 0) goto L_0x02de
            r16 = 0
            goto L_0x02e8
        L_0x02de:
            boolean r16 = kotlin.text.StringsKt__IndentKt.o(r16)
            r16 = r16 ^ 1
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r16)
        L_0x02e8:
            r2 = r16
            r16 = r14
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            boolean r2 = m0.n.b.i.a(r2, r14)
            if (r2 == 0) goto L_0x0300
            androidx.core.app.NotificationCompat$Builder r2 = new androidx.core.app.NotificationCompat$Builder
            i0.e.b.e3.a r14 = i0.e.b.e3.a.a
            i0.e.b.e3.c r14 = i0.e.b.e3.a.c
            java.lang.String r14 = r14.a
            r2.<init>((android.content.Context) r1, (java.lang.String) r14)
            goto L_0x0315
        L_0x0300:
            androidx.core.app.NotificationCompat$Builder r2 = new androidx.core.app.NotificationCompat$Builder
            i0.e.b.e3.a r14 = i0.e.b.e3.a.a
            i0.e.b.e3.c r14 = i0.e.b.e3.a.e
            java.lang.String r14 = r14.a
            r2.<init>((android.content.Context) r1, (java.lang.String) r14)
            r14 = 1
            androidx.core.app.NotificationCompat$Builder r2 = r2.setSilent(r14)
            java.lang.String r14 = "{\n            NotificationCompat.Builder(this, ClubhouseNotifications.UPDATES_DEFAULT.channelId)\n                .setSilent(true)\n        }"
            m0.n.b.i.d(r2, r14)
        L_0x0315:
            com.clubhouse.android.notifications.NotificationAction r14 = com.clubhouse.android.notifications.NotificationAction.OpenChannel
            r17 = r11
            java.lang.String r11 = r14.getAction()
            r18 = r10
            r10 = 1
            boolean r10 = kotlin.text.StringsKt__IndentKt.f(r3, r11, r10)
            if (r10 == 0) goto L_0x042c
            kotlin.jvm.internal.Ref$BooleanRef r3 = new kotlin.jvm.internal.Ref$BooleanRef
            r3.<init>()
            i0.e.b.f3.i.a r10 = r1.c2
            if (r10 == 0) goto L_0x0425
            i0.e.b.h3.a.b r10 = r10.d
            if (r10 != 0) goto L_0x0334
            goto L_0x0353
        L_0x0334:
            com.clubhouse.android.channels.ChannelComponentHandler r10 = h0.b0.v.s(r10)
            if (r10 != 0) goto L_0x033b
            goto L_0x0353
        L_0x033b:
            i0.e.b.z2.e.a r10 = r10.c
            if (r10 != 0) goto L_0x0340
            goto L_0x0353
        L_0x0340:
            i0.e.b.z2.e.d r10 = h0.b0.v.b0(r10)
            com.clubhouse.android.channels.mvi.ChannelControlModel r10 = r10.d()
            if (r10 != 0) goto L_0x034b
            goto L_0x0353
        L_0x034b:
            com.clubhouse.android.notifications.PushListenerService$channelNotification$1$1 r11 = new com.clubhouse.android.notifications.PushListenerService$channelNotification$1$1
            r11.<init>(r3)
            h0.b0.v.v2(r10, r11)
        L_0x0353:
            java.lang.String r10 = "invite_to_channel"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "1"
            if (r10 != 0) goto L_0x0362
            r19 = r5
            goto L_0x036c
        L_0x0362:
            boolean r10 = r10.equals(r11)
            r19 = r5
            r5 = 1
            if (r10 != r5) goto L_0x036c
            goto L_0x036d
        L_0x036c:
            r5 = 0
        L_0x036d:
            java.lang.String r10 = "is_new_room"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x037a
            r20 = r15
            goto L_0x0384
        L_0x037a:
            boolean r10 = r10.equals(r11)
            r20 = r15
            r15 = 1
            if (r10 != r15) goto L_0x0384
            goto L_0x0385
        L_0x0384:
            r15 = 0
        L_0x0385:
            java.lang.String r10 = "is_welcome_room_for_self"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x0392
            r21 = r9
            goto L_0x039c
        L_0x0392:
            boolean r10 = r10.equals(r11)
            r21 = r9
            r9 = 1
            if (r10 != r9) goto L_0x039c
            goto L_0x039d
        L_0x039c:
            r9 = 0
        L_0x039d:
            java.lang.String r10 = "is_welcome_room_for_others"
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 != 0) goto L_0x03a8
            goto L_0x03b1
        L_0x03a8:
            boolean r10 = r10.equals(r11)
            r11 = 1
            if (r10 != r11) goto L_0x03b1
            r10 = 1
            goto L_0x03b2
        L_0x03b1:
            r10 = 0
        L_0x03b2:
            if (r15 != 0) goto L_0x03bc
            if (r5 != 0) goto L_0x03bc
            if (r9 != 0) goto L_0x03bc
            if (r10 != 0) goto L_0x03bc
            goto L_0x0694
        L_0x03bc:
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x03c6
            if (r9 != 0) goto L_0x03c6
            if (r5 != 0) goto L_0x03c6
            goto L_0x0694
        L_0x03c6:
            java.lang.String r3 = r14.getDataKey()
            java.lang.Object r3 = r0.get(r3)
            r23 = r3
            java.lang.String r23 = (java.lang.String) r23
            if (r23 != 0) goto L_0x03e2
            java.lang.String r2 = "Unhandled push notification with action: open_channel and data: "
            java.lang.String r0 = m0.n.b.i.k(r2, r0)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4.d(r0, r2)
            goto L_0x0694
        L_0x03e2:
            h0.t.i r3 = new h0.t.i
            r3.<init>(r1)
            r4 = 2131755009(0x7f100001, float:1.9140885E38)
            r3.e(r4)
            r4 = 2131362698(0x7f0a038a, float:1.8345184E38)
            r3.d(r4)
            i0.e.b.g3.p.i r4 = new i0.e.b.g3.p.i
            r24 = 0
            r25 = 0
            r26 = 0
            com.clubhouse.android.data.models.local.user.SourceLocation r5 = com.clubhouse.android.data.models.local.user.SourceLocation.REMOTE_NOTIFICATION
            int r27 = r5.getCode()
            r28 = 14
            r22 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28)
            android.os.Bundle r4 = r4.a()
            r1.j(r4, r0)
            r3.e = r4
            android.content.Intent r0 = r3.b
            r0.putExtra(r13, r4)
            android.app.PendingIntent r0 = r3.a()
            java.lang.String r3 = "NavDeepLinkBuilder(this)\n                .setGraph(R.navigation.main_graph)\n                .setDestination(R.id.hallwayFragment)\n                .setArguments(\n                    HallwayFragmentArgs(\n                        channelId = channel,\n                        sourceLocation = SourceLocation.REMOTE_NOTIFICATION.code\n                    ).toBundle()\n                        .addNotificationDataExtra(data)\n                )\n                .createPendingIntent()"
            m0.n.b.i.d(r0, r3)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            goto L_0x0695
        L_0x0425:
            java.lang.String r0 = "userComponentHandler"
            m0.n.b.i.m(r0)
            r0 = 0
            throw r0
        L_0x042c:
            r19 = r5
            r21 = r9
            r20 = r15
            com.clubhouse.android.notifications.NotificationAction r5 = com.clubhouse.android.notifications.NotificationAction.OpenWaveChannel
            java.lang.String r9 = r5.getAction()
            r10 = 1
            boolean r9 = kotlin.text.StringsKt__IndentKt.f(r3, r9, r10)
            if (r9 == 0) goto L_0x04bf
            boolean r3 = r1.g2
            if (r3 == 0) goto L_0x0445
            goto L_0x0694
        L_0x0445:
            java.lang.String r3 = "from_user_profile_id"
            java.lang.Object r3 = r0.get(r3)
            r25 = r3
            java.lang.String r25 = (java.lang.String) r25
            if (r25 != 0) goto L_0x0472
            java.lang.String r2 = "Unhandled push notification with action: "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            java.lang.String r3 = r5.getAction()
            r2.append(r3)
            java.lang.String r3 = " and data: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4.d(r0, r2)
            goto L_0x0694
        L_0x0472:
            h0.t.i r3 = new h0.t.i
            r3.<init>(r1)
            r4 = 2131755009(0x7f100001, float:1.9140885E38)
            r3.e(r4)
            r4 = 2131362698(0x7f0a038a, float:1.8345184E38)
            r3.d(r4)
            i0.e.b.g3.p.i r4 = new i0.e.b.g3.p.i
            r23 = 0
            r24 = 0
            java.lang.String r5 = r5.getDataKey()
            java.lang.Object r5 = r0.get(r5)
            r26 = r5
            java.lang.String r26 = (java.lang.String) r26
            com.clubhouse.android.data.models.local.user.SourceLocation r5 = com.clubhouse.android.data.models.local.user.SourceLocation.REMOTE_NOTIFICATION
            int r27 = r5.getCode()
            r28 = 3
            r22 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28)
            android.os.Bundle r4 = r4.a()
            r1.j(r4, r0)
            r3.e = r4
            android.content.Intent r0 = r3.b
            r0.putExtra(r13, r4)
            android.app.PendingIntent r0 = r3.a()
            java.lang.String r3 = "NavDeepLinkBuilder(this)\n                .setGraph(R.navigation.main_graph)\n                .setDestination(R.id.hallwayFragment)\n                .setArguments(\n                    HallwayFragmentArgs(\n                        waveUserId = waveUserId,\n                        waveId = data[OpenWaveChannel.dataKey],\n                        sourceLocation = SourceLocation.REMOTE_NOTIFICATION.code\n                    ).toBundle()\n                        .addNotificationDataExtra(data)\n                )\n                .createPendingIntent()"
            m0.n.b.i.d(r0, r3)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            goto L_0x0695
        L_0x04bf:
            com.clubhouse.android.notifications.NotificationAction r5 = com.clubhouse.android.notifications.NotificationAction.OpenClub
            java.lang.String r9 = r5.getAction()
            r10 = 1
            boolean r9 = kotlin.text.StringsKt__IndentKt.f(r3, r9, r10)
            java.lang.String r10 = "mavericks:arg"
            java.lang.String r11 = "arg"
            java.lang.String r14 = "builder.setContentIntent(launchIntent)"
            if (r9 == 0) goto L_0x0531
            java.lang.String r3 = r5.getDataKey()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x04e0
            goto L_0x0694
        L_0x04e0:
            h0.t.i r4 = new h0.t.i
            r4.<init>(r1)
            r5 = 2131755009(0x7f100001, float:1.9140885E38)
            r4.e(r5)
            r5 = 2131362330(0x7f0a021a, float:1.8344438E38)
            r4.d(r5)
            com.clubhouse.android.ui.clubs.ClubArgs r5 = new com.clubhouse.android.ui.clubs.ClubArgs
            java.lang.Integer r23 = kotlin.text.StringsKt__IndentKt.S(r3)
            com.clubhouse.android.data.models.local.user.SourceLocation r28 = com.clubhouse.android.data.models.local.user.SourceLocation.REMOTE_NOTIFICATION
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 94
            r22 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            m0.n.b.i.e(r5, r11)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putParcelable(r10, r5)
            r1.j(r3, r0)
            r4.e = r3
            android.content.Intent r0 = r4.b
            r0.putExtra(r13, r3)
            android.app.PendingIntent r0 = r4.a()
            java.lang.String r3 = "NavDeepLinkBuilder(this)\n            .setGraph(R.navigation.main_graph)\n            .setDestination(R.id.clubFragment)\n            .setArguments(\n                mvArgs(\n                    ClubArgs(\n                        clubId = clubId.toIntOrNull(),\n                        source = SourceLocation.REMOTE_NOTIFICATION))\n                    .addNotificationDataExtra(data)\n            )\n            .createPendingIntent()"
            m0.n.b.i.d(r0, r3)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            m0.n.b.i.d(r0, r14)
            goto L_0x0695
        L_0x0531:
            com.clubhouse.android.notifications.NotificationAction r5 = com.clubhouse.android.notifications.NotificationAction.OpenInvites
            java.lang.String r5 = r5.getAction()
            r9 = 1
            boolean r5 = kotlin.text.StringsKt__IndentKt.f(r3, r5, r9)
            if (r5 == 0) goto L_0x0570
            h0.t.i r3 = new h0.t.i
            r3.<init>(r1)
            r4 = 2131755009(0x7f100001, float:1.9140885E38)
            r3.e(r4)
            r4 = 2131363003(0x7f0a04bb, float:1.8345803E38)
            r3.d(r4)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r1.j(r4, r0)
            r3.e = r4
            android.content.Intent r0 = r3.b
            r0.putExtra(r13, r4)
            android.app.PendingIntent r0 = r3.a()
            java.lang.String r3 = "NavDeepLinkBuilder(this)\n            .setGraph(R.navigation.main_graph)\n            .setDestination(R.id.invitesFragment)\n            .setArguments(Bundle().addNotificationDataExtra(data))\n            .createPendingIntent()"
            m0.n.b.i.d(r0, r3)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            m0.n.b.i.d(r0, r14)
            goto L_0x0695
        L_0x0570:
            com.clubhouse.android.notifications.NotificationAction r5 = com.clubhouse.android.notifications.NotificationAction.OpenEvent
            java.lang.String r9 = r5.getAction()
            r15 = 1
            boolean r9 = kotlin.text.StringsKt__IndentKt.f(r3, r9, r15)
            if (r9 == 0) goto L_0x05dc
            java.lang.String r3 = r5.getDataKey()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x058b
            goto L_0x0694
        L_0x058b:
            h0.t.i r4 = new h0.t.i
            r4.<init>(r1)
            r5 = 2131755009(0x7f100001, float:1.9140885E38)
            r4.e(r5)
            r5 = 2131362578(0x7f0a0312, float:1.834494E38)
            r4.d(r5)
            com.clubhouse.android.ui.events.HalfEventArgs r5 = new com.clubhouse.android.ui.events.HalfEventArgs
            java.lang.Integer r24 = kotlin.text.StringsKt__IndentKt.S(r3)
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 125(0x7d, float:1.75E-43)
            r22 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            m0.n.b.i.e(r5, r11)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putParcelable(r10, r5)
            r1.j(r3, r0)
            r4.e = r3
            android.content.Intent r0 = r4.b
            r0.putExtra(r13, r3)
            android.app.PendingIntent r0 = r4.a()
            java.lang.String r3 = "NavDeepLinkBuilder(this)\n            .setGraph(R.navigation.main_graph)\n            .setDestination(R.id.eventsFragment)\n            .setArguments(\n                mvArgs(HalfEventArgs(eventId = eventId.toIntOrNull()))\n                    .addNotificationDataExtra(data)\n            )\n            .createPendingIntent()"
            m0.n.b.i.d(r0, r3)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            m0.n.b.i.d(r0, r14)
            goto L_0x0695
        L_0x05dc:
            com.clubhouse.android.notifications.NotificationAction r5 = com.clubhouse.android.notifications.NotificationAction.OpenProfile
            java.lang.String r9 = r5.getAction()
            r15 = 1
            boolean r9 = kotlin.text.StringsKt__IndentKt.f(r3, r9, r15)
            if (r9 == 0) goto L_0x0647
            java.lang.String r3 = r5.getDataKey()
            java.lang.Object r3 = r0.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x05f7
            goto L_0x0694
        L_0x05f7:
            h0.t.i r4 = new h0.t.i
            r4.<init>(r1)
            r5 = 2131755009(0x7f100001, float:1.9140885E38)
            r4.e(r5)
            r5 = 2131363306(0x7f0a05ea, float:1.8346417E38)
            r4.d(r5)
            com.clubhouse.android.ui.profile.ProfileArgs r5 = new com.clubhouse.android.ui.profile.ProfileArgs
            java.lang.Integer r23 = kotlin.text.StringsKt__IndentKt.S(r3)
            com.clubhouse.android.data.models.local.user.SourceLocation r28 = com.clubhouse.android.data.models.local.user.SourceLocation.REMOTE_NOTIFICATION
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 94
            r22 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            m0.n.b.i.e(r5, r11)
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putParcelable(r10, r5)
            r1.j(r3, r0)
            r4.e = r3
            android.content.Intent r0 = r4.b
            r0.putExtra(r13, r3)
            android.app.PendingIntent r0 = r4.a()
            java.lang.String r3 = "NavDeepLinkBuilder(this)\n            .setGraph(R.navigation.main_graph)\n            .setDestination(R.id.profileFragment)\n            .setArguments(\n                mvArgs(ProfileArgs(userId = userId.toIntOrNull(),\n                    source = SourceLocation.REMOTE_NOTIFICATION))\n                    .addNotificationDataExtra(data)\n            )\n            .createPendingIntent()"
            m0.n.b.i.d(r0, r3)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            m0.n.b.i.d(r0, r14)
            goto L_0x0695
        L_0x0647:
            com.clubhouse.android.notifications.NotificationAction r5 = com.clubhouse.android.notifications.NotificationAction.OpenUrl
            java.lang.String r9 = r5.getAction()
            r10 = 1
            boolean r9 = kotlin.text.StringsKt__IndentKt.f(r3, r9, r10)
            if (r9 == 0) goto L_0x067b
            java.lang.String r3 = r5.getDataKey()
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0661
            goto L_0x0694
        L_0x0661:
            android.content.Intent r3 = new android.content.Intent
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r4 = "android.intent.action.VIEW"
            r3.<init>(r4, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r4, r3, r0)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            m0.n.b.i.d(r0, r14)
            goto L_0x0695
        L_0x067b:
            com.clubhouse.android.notifications.NotificationAction r5 = com.clubhouse.android.notifications.NotificationAction.OpenRecentPayments
            java.lang.String r9 = r5.getAction()
            r10 = 1
            boolean r9 = kotlin.text.StringsKt__IndentKt.f(r3, r9, r10)
            if (r9 == 0) goto L_0x06ba
            java.lang.String r3 = r5.getDataKey()
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0698
        L_0x0694:
            r0 = 0
        L_0x0695:
            r2 = r0
            goto L_0x0755
        L_0x0698:
            h0.t.i r0 = new h0.t.i
            r0.<init>(r1)
            r3 = 2131755009(0x7f100001, float:1.9140885E38)
            r0.e(r3)
            r3 = 2131363329(0x7f0a0601, float:1.8346464E38)
            r0.d(r3)
            android.app.PendingIntent r0 = r0.a()
            java.lang.String r3 = "NavDeepLinkBuilder(this)\n            .setGraph(R.navigation.main_graph)\n            .setDestination(R.id.recentPaymentsFragment)\n            .createPendingIntent()"
            m0.n.b.i.d(r0, r3)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            m0.n.b.i.d(r0, r14)
            goto L_0x0695
        L_0x06ba:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "Unrecognized push notification action: "
            r5.append(r9)
            r5.append(r3)
            java.lang.String r9 = " with data:"
            r5.append(r9)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r4.d(r5, r9)
            boolean r4 = r1.g2
            java.lang.String r5 = "analytics"
            if (r4 == 0) goto L_0x06f9
            i0.e.a.a r4 = r1.e2
            if (r4 == 0) goto L_0x06f4
            if (r3 == 0) goto L_0x06e6
            goto L_0x06e8
        L_0x06e6:
            r3 = r16
        L_0x06e8:
            java.util.Map r3 = i0.d.a.a.a.n1(r7, r3)
            com.clubhouse.analytics.AmplitudeAnalytics r4 = (com.clubhouse.analytics.AmplitudeAnalytics) r4
            java.lang.String r5 = "PushNotification-Foreground-UnhandledAction"
            r4.b(r5, r3)
            goto L_0x070d
        L_0x06f4:
            m0.n.b.i.m(r5)
            r0 = 0
            throw r0
        L_0x06f9:
            i0.e.a.a r4 = r1.e2
            if (r4 == 0) goto L_0x085c
            if (r3 == 0) goto L_0x0700
            goto L_0x0702
        L_0x0700:
            r3 = r16
        L_0x0702:
            java.util.Map r3 = i0.d.a.a.a.n1(r7, r3)
            com.clubhouse.analytics.AmplitudeAnalytics r4 = (com.clubhouse.analytics.AmplitudeAnalytics) r4
            java.lang.String r5 = "PushNotification-Response-UnhandledAction"
            r4.b(r5, r3)
        L_0x070d:
            h0.t.i r3 = new h0.t.i
            r3.<init>(r1)
            r4 = 2131755009(0x7f100001, float:1.9140885E38)
            r3.e(r4)
            r4 = 2131362698(0x7f0a038a, float:1.8345184E38)
            r3.d(r4)
            i0.e.b.g3.p.i r4 = new i0.e.b.g3.p.i
            com.clubhouse.android.data.models.local.user.SourceLocation r5 = com.clubhouse.android.data.models.local.user.SourceLocation.REMOTE_NOTIFICATION
            int r27 = r5.getCode()
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 15
            r22 = r4
            r22.<init>(r23, r24, r25, r26, r27, r28)
            android.os.Bundle r4 = r4.a()
            r1.j(r4, r0)
            r3.e = r4
            android.content.Intent r0 = r3.b
            r0.putExtra(r13, r4)
            android.app.PendingIntent r0 = r3.a()
            java.lang.String r3 = "NavDeepLinkBuilder(this)\n            .setGraph(R.navigation.main_graph)\n            .setDestination(R.id.hallwayFragment)\n            .setArguments(\n                HallwayFragmentArgs(\n                    sourceLocation = SourceLocation.REMOTE_NOTIFICATION.code\n                )\n                    .toBundle()\n                    .addNotificationDataExtra(data)\n            )\n            .createPendingIntent()"
            m0.n.b.i.d(r0, r3)
            androidx.core.app.NotificationCompat$Builder r0 = r2.setContentIntent(r0)
            m0.n.b.i.d(r0, r14)
            goto L_0x0695
        L_0x0755:
            if (r2 != 0) goto L_0x0759
            goto L_0x0861
        L_0x0759:
            java.lang.Object r0 = r6.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0763
            r14 = r0
            goto L_0x0765
        L_0x0763:
            r14 = r16
        L_0x0765:
            java.lang.String r0 = "title"
            java.lang.Object r0 = r6.get(r0)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r0 = r6.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            r2.setContentText(r14)
            if (r3 != 0) goto L_0x077a
            goto L_0x077d
        L_0x077a:
            r2.setContentTitle(r3)
        L_0x077d:
            if (r0 == 0) goto L_0x0788
            boolean r4 = kotlin.text.StringsKt__IndentKt.o(r0)
            if (r4 == 0) goto L_0x0786
            goto L_0x0788
        L_0x0786:
            r4 = 0
            goto L_0x0789
        L_0x0788:
            r4 = 1
        L_0x0789:
            if (r4 != 0) goto L_0x07a1
            android.graphics.Bitmap r0 = i0.e.b.d3.k.n(r0)     // Catch:{ Exception -> 0x0796 }
            if (r0 != 0) goto L_0x0792
            goto L_0x07a1
        L_0x0792:
            r2.setLargeIcon(r0)     // Catch:{ Exception -> 0x0796 }
            goto L_0x07a1
        L_0x0796:
            r0 = move-exception
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            v0.a.a$b r5 = v0.a.a.d
            r8 = r21
            r5.w(r0, r8, r4)
        L_0x07a1:
            r0 = 2131231334(0x7f080266, float:1.8078746E38)
            r2.setSmallIcon((int) r0)
            r0 = 1
            r2.setAutoCancel(r0)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            androidx.core.app.NotificationCompat$BigTextStyle r0 = r0.bigText(r14)
            if (r3 != 0) goto L_0x07b7
            goto L_0x07ba
        L_0x07b7:
            r2.setContentTitle(r3)
        L_0x07ba:
            r2.setStyle(r0)
            r3 = r20
            java.lang.Object r0 = r6.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            com.clubhouse.android.notifications.PushListenerService$Sound r3 = com.clubhouse.android.notifications.PushListenerService.Sound.CHIME_NOTIFICATION
            java.lang.String r4 = r3.getFileName()
            r5 = 1
            boolean r0 = kotlin.text.StringsKt__IndentKt.f(r0, r4, r5)
            if (r0 == 0) goto L_0x07f4
            java.lang.String r0 = "android.resource://"
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            java.lang.String r4 = r31.getPackageName()
            r0.append(r4)
            r4 = 47
            r0.append(r4)
            int r3 = r3.getRes()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x07f5
        L_0x07f4:
            r0 = 0
        L_0x07f5:
            if (r0 != 0) goto L_0x07f8
            goto L_0x07fb
        L_0x07f8:
            r2.setSound(r0)
        L_0x07fb:
            r0 = 0
            r2.setPriority(r0)
            java.util.Map r3 = r32.I0()
            r4 = r19
            m0.n.b.i.d(r3, r4)
            java.lang.Object r4 = r3.get(r7)
            java.lang.String r4 = (java.lang.String) r4
            com.clubhouse.android.notifications.NotificationAction[] r5 = com.clubhouse.android.notifications.NotificationAction.values()
        L_0x0812:
            r6 = 11
            if (r0 >= r6) goto L_0x0827
            r6 = r5[r0]
            java.lang.String r7 = r6.getAction()
            r8 = 1
            boolean r7 = kotlin.text.StringsKt__IndentKt.f(r4, r7, r8)
            if (r7 == 0) goto L_0x0824
            goto L_0x0828
        L_0x0824:
            int r0 = r0 + 1
            goto L_0x0812
        L_0x0827:
            r6 = 0
        L_0x0828:
            if (r6 != 0) goto L_0x082c
            r0 = 0
            goto L_0x0830
        L_0x082c:
            java.lang.String r0 = r6.getDataKey()
        L_0x0830:
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r6 != 0) goto L_0x083b
            r3 = 3310(0xcee, float:4.638E-42)
            goto L_0x083f
        L_0x083b:
            int r3 = r6.getNotificationId()
        L_0x083f:
            i0.e.b.e3.d r4 = i0.e.b.e3.d.a
            android.app.Notification r2 = r2.build()
            java.lang.String r4 = "builder.build()"
            m0.n.b.i.d(r2, r4)
            r4 = r18
            m0.n.b.i.e(r1, r4)
            r4 = r17
            m0.n.b.i.e(r2, r4)
            androidx.core.app.NotificationManagerCompat r4 = androidx.core.app.NotificationManagerCompat.from(r31)
            r4.notify(r0, r3, r2)
            goto L_0x0861
        L_0x085c:
            m0.n.b.i.m(r5)
            r0 = 0
            throw r0
        L_0x0861:
            return
        L_0x0862:
            r0 = 0
            java.lang.String r2 = "actionTrailRecorder"
            m0.n.b.i.m(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.notifications.PushListenerService.f(com.google.firebase.messaging.RemoteMessage):void");
    }

    public void h(String str) {
        i.e(str, "token");
        v0.a.a.d.d(i.k("Notification token refreshed: ", str), new Object[0]);
        NotificationRepo notificationRepo = this.f2;
        if (notificationRepo != null) {
            m0.r.t.a.r.m.a1.a.E2(this.j2, d.c, (CoroutineStart) null, new PushListenerService$onNewToken$1$1(notificationRepo, d.a.a(this), str, (c<? super PushListenerService$onNewToken$1$1>) null), 2, (Object) null);
        }
    }

    public final Bundle j(Bundle bundle, Map<String, String> map) {
        HashMap hashMap = new HashMap(map);
        hashMap.putAll(map);
        bundle.putSerializable("notification_data", hashMap);
        return bundle;
    }

    public void onCreate() {
        super.onCreate();
        a aVar = this.c2;
        if (aVar != null) {
            i0.e.b.h3.a.b bVar = aVar.d;
            if (bVar != null) {
                this.f2 = ((i0.e.b.c3.i.a) h.L0(bVar, i0.e.b.c3.i.a.class)).j();
                m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((i0.e.c.g.a) h.L0(bVar, i0.e.c.g.a.class)).k().a, new PushListenerService$onCreate$1$1(this, (c<? super PushListenerService$onCreate$1$1>) null)), this.j2);
            }
            c0 c0Var = c0.c;
            c0Var.Z1.a(new PushListenerService$onCreate$$inlined$observeForeground$1(this));
            c0Var.Z1.a(new PushListenerService$onCreate$$inlined$observeBackground$1(this));
            return;
        }
        i.m("userComponentHandler");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        m0.r.t.a.r.m.a1.a.o0(this.i2, (CancellationException) null, 1, (Object) null);
    }
}
