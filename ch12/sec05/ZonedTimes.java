package ch12.sec05;

import java.time.*;

public class ZonedTimes {
    public static void main(String[] args) {
        ZonedDateTime apollo11launch = ZonedDateTime.of(1969, 7, 16, 9, 32, 0, 0, 
            ZoneId.of("America/New_York"));
        // 1969-07-16T09:32-04:00[America/New_York]
        System.out.println("apollo11launch: " + apollo11launch);

        Instant instant = apollo11launch.toInstant();
        System.out.println("instant: " + instant);

        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("UTC"));
        System.out.println("zonedDateTime: " + zonedDateTime);

        ZonedDateTime skipped = ZonedDateTime.of(
            LocalDate.of(2013, 3, 31),
            LocalTime.of(2, 30),
            ZoneId.of("Europe/Berlin"));
        // 3월 31일 3:30을 생성한다.
        System.out.println("skipped: " + skipped);

        ZonedDateTime ambiguous = ZonedDateTime.of(
            LocalDate.of(2013, 10, 27), 
            // 일광 절약 시간 끝
            LocalTime.of(2, 30),
            ZoneId.of("Europe/Berlin"));
        // 2013-10-27T02:30+02:00[Europe/Berlin]
        ZonedDateTime anHourLater = ambiguous.plusHours(1);
        // 2013-10-27T02:30+01:00[Europe/Berlin]
        System.out.println("ambiguous: " + ambiguous);
        System.out.println("anHourLater: " + anHourLater);

        ZonedDateTime meeting = ZonedDateTime.of(
            LocalDate.of(2013, 10, 31),
            LocalTime.of(14, 30),
            ZoneId.of("America/Los_Angeles"));
        System.out.println("meeting: " + meeting);
        ZonedDateTime nextMeeting = meeting.plus(Duration.ofDays(7));
        // 주의! 일광 절약 시간이 적용되면 작동하지 않는다.
        System.out.println("nextMeeting: " + nextMeeting);
        nextMeeting = meeting.plus(Period.ofDays(7)); // OK
        System.out.println("nextMeeting: " + nextMeeting);
    }
}
