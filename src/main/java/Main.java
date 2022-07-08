/**
 * \* Created with IntelliJ IDEA.
 * \* Author: Prekrasnov Sergei
 * \* Date: 04.07.2022
 * \* ----- group JAVA-27 -----
 * \*
 * \* Description: Домашнее задание к занятию «1.2. Формы и форматы передачи данных»
 * \*
 * \* Задача: query
 * \
 */
public class Main {
    public static void main(String[] args) {
        Server server = new Server(64);
        server.start(9999);
    }
}