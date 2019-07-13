package info.sjd;

import info.sjd.model.User;

import java.util.*;
import java.util.logging.Logger;

public class AppRunner {

    private static Logger logger = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
        User user1 = new User("Alex", "login1", "pass1");
        User user2 = new User("Alex", "login2", "pass2");
        User user3 = new User("Alex", "login3", "pass3");

        Queue<User> userQueue = new PriorityQueue<>();
        userQueue.add(user1);
        userQueue.add(user2);
        userQueue.add(user3);
        userQueue.add(user1);
        userQueue.add(user2);
        userQueue.add(user3);

        logger.info("Queue has size " + userQueue.size());

        Set<User> userSet = new TreeSet<>(userQueue);

        logger.info("Set has size " + userSet.size());

        List<User> userList = new ArrayList<>(userQueue);

        logger.info("List has size " + userList.size());

    }
}
