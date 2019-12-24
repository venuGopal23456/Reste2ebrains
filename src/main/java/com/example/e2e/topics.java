package com.example.e2e;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  // add a post method
  @RequestMapping(method = RequestMethod.POST, value = "/topics")
  public void addtopic(@RequestBody topicpojo topic) {
    topicService.addtopic(topic);
  }

  // update a particualar Resource
  @RequestMapping(method = RequestMethod.PUT, value = "/topics/{name}")
  public void updatetopic(@RequestBody topicpojo topic, @PathVariable String name) {
    topicService.updatetopic(topic, name);
  }

  // Delete a particualar Resource
  @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{name}")
  public void deletetopic(@PathVariable String name) {
    topicService.deletetopic(name);
  }
}
