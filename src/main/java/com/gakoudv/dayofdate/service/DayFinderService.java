package com.gakoudv.dayofdate.service;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import org.springframework.stereotype.Service;

public class DayFinderService {

    public String findDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.FRENCH);
    }
}
