package chapter7;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User user1 = new User()
                .setId(1001)
                .setName("Alice")
                .setVerified(false);

        User user2 = new User()
                .setId(1001)
                .setEmailAddress("alice@fastcampus.co.kr")
                .setVerified(false);

        String someEmail = "some@Email.com";
        String nullEmail = null;

        Optional<String> maybeEmail = Optional.of(someEmail);
        Optional<String> maybeEmail2 = Optional.empty();
        Optional<String> maybeEmail3 = Optional.ofNullable(someEmail);
        Optional<String> maybeEmail4 = Optional.ofNullable(null);

        String email = maybeEmail.get();
//        System.out.println(email);

//        String eamil2 = maybeEmail2.get();
//        System.out.println(eamil2);

//        System.out.println(maybeEmail3.isPresent());

//        String email2 = maybeEmail2.orElse("onother@email.com");
//        System.out.println(email2);

//        maybeEmail.stream().forEach(System.out::println);

//        maybeEmail2.orElseThrow(RuntimeException::new);
//        maybeEmail.ifPresent(System.out::println);
//        String st = maybeEmail2.or(()-> Optional.of("대체제")).orElseThrow(RuntimeException::new);
//        System.out.println(st);

        String st2 = maybeEmail2.orElse("defaultEamil");
//        System.out.println(st2);

//        Optional<String> test = maybeEmail2.or(() -> Optional.of("Test"));

//        String s = maybeEmail3.orElseThrow();
//        System.out.println(s);




    }


}
