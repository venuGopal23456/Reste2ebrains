package com.example.e2e;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/*This is the simple controller class
 * which returns object converted by the spring mvc(Dispatchaer Servlet)
 */
@RestController
public class topics {

  @RequestMapping("/topics")
  public List<topicpojo> topic() {

    return Arrays.asList(
        new topicpojo("venu", 25, 100),
        new topicpojo("gopal", 67, 250),
        new topicpojo("sharma", 87, 90),
        new topicpojo("mani", 56, 96),
        new topicpojo("tilo", 56, 26));
  }
}
