package ASG;

import java.time.Duration;
import java.time.Instant;

public class FPS {
    private FPS() {}
    private static Duration fpsDeltaTime = Duration.ZERO;
    private static Duration LastTime = Duration.ZERO;
    private static Instant startTime = Instant.now();
    private static double deltaTime = fpsDeltaTime.toMillis() - LastTime.toMillis();

    public static void calcStartTime() {
        startTime = Instant.now();
        fpsDeltaTime = Duration.ZERO;
    }

    public static void calcDeltaTime() {
        fpsDeltaTime = Duration.between(startTime, Instant.now());
        deltaTime = (double)fpsDeltaTime.toMillis() - LastTime.toMillis();
        LastTime = fpsDeltaTime;
    }

    public static double getDeltaTime() {
        return deltaTime / 1000; //returns delta time in seconds
    }

}
