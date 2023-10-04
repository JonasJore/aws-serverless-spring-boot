package dev.twoday.controller;

import java.util.List;

public record RunningOnAws(String greeting, boolean isRunning, List<Integer> count) {
}
