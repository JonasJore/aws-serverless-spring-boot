package dev.twoday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/api")
public class RunningOnAwsController {
  @GetMapping("/hello")
  public RunningOnAws run() {
    List<Integer> range = IntStream.rangeClosed(0, 64)
            .boxed().toList();
    return new RunningOnAws("hello from aws!", true, range);
  }
}
