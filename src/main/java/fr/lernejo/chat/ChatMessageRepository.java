package fr.lernejo.chat;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ChatMessageRepository {
    List<String> messages = new ArrayList<>();

    void addChatMessage(String message) {
        messages.add(message);
    }

    List<String> getLastTenMessages() {
        return messages.subList(0, Math.min(messages.size(), 10));
    }
}
