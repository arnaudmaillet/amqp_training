package fr.lernejo.chat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ChatMessageRepository {
    List<String> messages;

    public ChatMessageRepository() {
        messages = new ArrayList<>();
    }

    void addChatMessage(String message) {
        if (messages.size() >= 10) {
            messages.remove(0);
        }
        messages.add(message);
    }

    List<String> getLastTenMessages() {
        return this.messages;
    }
}
