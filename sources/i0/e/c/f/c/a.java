package i0.e.c.f.c;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.backchannel.data.models.remote.request.ArchiveChatRequest;
import com.clubhouse.backchannel.data.models.remote.request.ChatMemberRequest;
import com.clubhouse.backchannel.data.models.remote.request.CreateChatRequest;
import com.clubhouse.backchannel.data.models.remote.request.SendChatMessageRequest;
import com.clubhouse.backchannel.data.models.remote.request.UpdateLastReadMessageRequest;
import com.clubhouse.backchannel.data.models.remote.response.ArchivedChatsResponse;
import com.clubhouse.backchannel.data.models.remote.response.ChatMessagesResponse;
import com.clubhouse.backchannel.data.models.remote.response.ChatRecipientsResponse;
import com.clubhouse.backchannel.data.models.remote.response.ChatsResponse;
import com.clubhouse.pubsub.user.backchannel.models.remote.Chat;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember;
import com.clubhouse.pubsub.user.backchannel.models.remote.ChatMessage;
import kotlin.Metadata;
import m0.l.c;
import t0.c0.f;
import t0.c0.o;
import t0.c0.t;
import t0.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00042\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0011H§@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0014J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u00112\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u001cH§@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020#H§@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H§@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u0010J\u0019\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H§@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0010J#\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@ø\u0001\u0000¢\u0006\u0004\b)\u0010*J#\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020(H§@ø\u0001\u0000¢\u0006\u0004\b+\u0010*J\u0019\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0004H§@ø\u0001\u0000¢\u0006\u0004\b-\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Li0/e/c/f/c/a;", "", "Lcom/clubhouse/backchannel/data/models/remote/request/CreateChatRequest;", "req", "Lt0/v;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/Chat;", "h", "(Lcom/clubhouse/backchannel/data/models/remote/request/CreateChatRequest;Lm0/l/c;)Ljava/lang/Object;", "Lcom/clubhouse/backchannel/data/models/remote/request/ChatMemberRequest;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/ChatMember;", "a", "(Lcom/clubhouse/backchannel/data/models/remote/request/ChatMemberRequest;Lm0/l/c;)Ljava/lang/Object;", "Lcom/clubhouse/android/data/models/remote/response/EmptySuccessResponse;", "d", "Lcom/clubhouse/backchannel/data/models/remote/response/ChatsResponse;", "f", "(Lm0/l/c;)Ljava/lang/Object;", "", "chatId", "e", "(Ljava/lang/String;Lm0/l/c;)Ljava/lang/Object;", "query", "Lcom/clubhouse/backchannel/data/models/remote/response/ChatRecipientsResponse;", "k", "Lcom/clubhouse/backchannel/data/models/remote/request/SendChatMessageRequest;", "Lcom/clubhouse/pubsub/user/backchannel/models/remote/ChatMessage;", "n", "(Lcom/clubhouse/backchannel/data/models/remote/request/SendChatMessageRequest;Lm0/l/c;)Ljava/lang/Object;", "", "startMessageId", "endMessageId", "limit", "Lcom/clubhouse/backchannel/data/models/remote/response/ChatMessagesResponse;", "g", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lm0/l/c;)Ljava/lang/Object;", "Lcom/clubhouse/backchannel/data/models/remote/request/UpdateLastReadMessageRequest;", "j", "(Lcom/clubhouse/backchannel/data/models/remote/request/UpdateLastReadMessageRequest;Lm0/l/c;)Ljava/lang/Object;", "m", "c", "Lcom/clubhouse/backchannel/data/models/remote/request/ArchiveChatRequest;", "l", "(Lcom/clubhouse/backchannel/data/models/remote/request/ArchiveChatRequest;Lm0/l/c;)Ljava/lang/Object;", "b", "Lcom/clubhouse/backchannel/data/models/remote/response/ArchivedChatsResponse;", "i", "backchannel_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: ChatApi.kt */
public interface a {
    @o("add_chat_member")
    Object a(@t0.c0.a ChatMemberRequest chatMemberRequest, c<? super v<ChatMember>> cVar);

    @o("unarchive_chat")
    Object b(@t0.c0.a ArchiveChatRequest archiveChatRequest, c<? super v<EmptySuccessResponse>> cVar);

    @o("disable_message_requests")
    Object c(c<? super v<EmptySuccessResponse>> cVar);

    @o("remove_chat_member")
    Object d(@t0.c0.a ChatMemberRequest chatMemberRequest, c<? super v<EmptySuccessResponse>> cVar);

    @f("get_chat")
    Object e(@t("chat_id") String str, c<? super v<Chat>> cVar);

    @f("get_chats")
    Object f(c<? super v<ChatsResponse>> cVar);

    @f("get_chat_messages")
    Object g(@t("chat_id") String str, @t("start_message_id") Integer num, @t("end_message_id") Integer num2, @t("limit") Integer num3, c<? super v<ChatMessagesResponse>> cVar);

    @o("create_chat")
    Object h(@t0.c0.a CreateChatRequest createChatRequest, c<? super v<Chat>> cVar);

    @f("get_archived_chats")
    Object i(c<? super v<ArchivedChatsResponse>> cVar);

    @o("update_last_read_message")
    Object j(@t0.c0.a UpdateLastReadMessageRequest updateLastReadMessageRequest, c<? super v<EmptySuccessResponse>> cVar);

    @f("search_chat_recipients")
    Object k(@t("query") String str, c<? super v<ChatRecipientsResponse>> cVar);

    @o("archive_chat")
    Object l(@t0.c0.a ArchiveChatRequest archiveChatRequest, c<? super v<EmptySuccessResponse>> cVar);

    @o("enable_message_requests")
    Object m(c<? super v<EmptySuccessResponse>> cVar);

    @o("send_chat_message")
    Object n(@t0.c0.a SendChatMessageRequest sendChatMessageRequest, c<? super v<ChatMessage>> cVar);
}
