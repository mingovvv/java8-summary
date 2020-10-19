package xyz.devyu.java8.optional;

import lombok.*;

@Setter @Getter @ToString @RequiredArgsConstructor @AllArgsConstructor
public class OnlineClass {
    private final Integer id;
    private final String title;
    private final boolean closed;
    public Progress progress;
}
