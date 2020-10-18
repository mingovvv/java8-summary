package xyz.devyu.java8.stream;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @ToString @AllArgsConstructor
public class OnlineClass {
    private Integer id;
    private String title;
    private boolean closed;
}
