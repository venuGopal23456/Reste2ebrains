package com.example.e2e;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

  private List<topicpojo> topics =
      new ArrayList<>(
          Arrays.asList(
              new topicpojo("venu", 25, 100),
              new topicpojo("gopal", 67, 250),
              new topicpojo("sharma", 87, 90),
              new topicpojo("mani", 56, 96),
              new topicpojo("tilo", 56, 26)));

  public List<topicpojo> getTopics() {
    return topics;
  }

  /// Return only specific object based on name
  public topicpojo getTopics(String name) {
    return topics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
  }

  public void addtopic(topicpojo topic) {
    topics.add(topic);
  }

  public void updatetopic(topicpojo topic, String name) {
    for (int i = 0; i < topics.size(); i++) {
      topicpojo t = topics.get(i);
      if (t.getName().equals(name)) {
        topics.set(i, topic);
        return;
      }
    }
  }
}
