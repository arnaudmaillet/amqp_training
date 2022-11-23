package fr.lernejo.chat;
import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    private final ChatMessageRepository chat;

    public ChatMessageListener(ChatMessageRepository chat) {
        this.chat = chat;
    }

    public void onMessage(String message) {
        chat.addChatMessage(message);
    }
}
