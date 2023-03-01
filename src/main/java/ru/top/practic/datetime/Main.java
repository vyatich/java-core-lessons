package ru.top.practic.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date = simpleDateFormat.parse("2022-03-10");

        LocalDate localDate = LocalDate.parse("2023-03-01", DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.systemDefault());

        System.out.println(date);

        System.out.println(localDate);
        System.out.println(localDateTime);

        System.out.println(instant.plus(1, ChronoUnit.DAYS));

        System.out.println(zonedDateTime);
        System.out.println(ZonedDateTime.ofInstant(instant, ZoneId.of("+01:00")));
    }
}
