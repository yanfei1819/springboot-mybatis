package com.example.springbootmybatis.test;

import java.util.*;

/**
 * Created by shiyanfei on 2018-08-07
 */
public class TestGroup {
    public static class User {
        private String username;
        private Integer age;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        //常规方法
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Random r = new Random();
            User u = new User();
            u.setUsername("user" + i);
            u.setAge(r.nextInt(6));
            users.add(u);
        }

        Map<Integer, List<User>> userMap = new HashMap<>();
        for (User u : users) {
            Integer age = u.getAge();
            if (userMap.containsKey(age)) {
                userMap.get(age).add(u);
            } else {
                List<User> userList = new ArrayList<>();
                userList.add(u);
                userMap.put(age, userList);
            }
        }

        for (Integer key : userMap.keySet()) {
            List<User> userLst = userMap.get(key);
            for (User u : userLst) {
                System.out.println("userName: " + u.getUsername() + ", age: " + u.getAge());
            }
        }

        System.out.println("#########################rxJava2 Test##############################");
//        Observable.fromIterable(users).groupBy(new Function<User, Integer>() {
//            @Override
//            public Integer apply(User user) throws Exception {
//                return user.getAge();
//            }
//        }).subscribe(new Consumer<GroupedObservable<Integer, User>>()
//    }
    }
}