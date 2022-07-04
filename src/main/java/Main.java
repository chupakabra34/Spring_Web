/**
 * \* Created with IntelliJ IDEA.
 * \* Author: Prekrasnov Sergei
 * \* Date: 04.07.2022
 * \* ----- group JAVA-27 -----
 * \*
 * \* Description: Домашние задания по курсу «Web, Spring & Spring MVC»
 * \*
 * \* Задача: HTTP и современный Web
 * \
 */
public class Main {
    public static void main(String[] args) {
        Server server = new Server(64);
        server.start(9999);
    }
}