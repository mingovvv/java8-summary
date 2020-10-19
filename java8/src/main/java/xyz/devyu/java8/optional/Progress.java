package xyz.devyu.java8.optional;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Duration;

@Setter @Getter @ToString
public class Progress {
    private Duration duration;

    private boolean finished;
}
