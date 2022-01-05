package i0.e.c.f;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import java.util.Comparator;
import m0.n.b.i;

/* compiled from: BackchannelStoreExtensions.kt */
public final class a implements Comparator<ChatMessage> {
    public static final a c = new a();

    public int compare(Object obj, Object obj2) {
        ChatMessage chatMessage = (ChatMessage) obj;
        ChatMessage chatMessage2 = (ChatMessage) obj2;
        i.e(chatMessage, "first");
        i.e(chatMessage2, "second");
        Integer num = chatMessage.c;
        if (num == null) {
            num = chatMessage.b2;
        }
        Integer num2 = chatMessage2.c;
        if (num2 == null) {
            num2 = chatMessage2.b2;
        }
        if (num == null || num2 == null || i.a(num, num2)) {
            return chatMessage2.Z1.compareTo(chatMessage.Z1);
        }
        return num2.intValue() - num.intValue();
    }
}
