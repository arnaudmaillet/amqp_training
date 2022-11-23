package fr.lernejo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;
@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Launcher.class);
        RabbitTemplate template = context.getBean(RabbitTemplate.class);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.next();
            if (input.equals("q")) {
                break;
            } else {
                template.convertAndSend("chat_messages", input);
            }
        }
    }
}
