package com.example.e2e;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*This is the simple controller class
 * which returns object converted by the spring mvc(Dispatchaer Servlet)
 */
@RestController
public class topics {

  @Autowired private TopicService topicService;

  // Return list of topics
  @RequestMapping("/topics")
  public List<topicpojo> topic() {

    return topicService.getTopics();
  }

  // Return base on the name (Single value)
  /*@RequestMapping("/topics/{name}")
  public topicpojo getTopics(@PathVariable String name) {
    return topicService.getTopics(name);
  }*/

  // or
  @RequestMapping("/topics/{first}")
  public topicpojo getTopics(@PathVariable("first") String name) {
    return topicService.getTopics(name);
  }
}
