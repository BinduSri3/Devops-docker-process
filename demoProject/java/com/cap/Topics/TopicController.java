package com.cap.Topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getTopics() {
		return Arrays.asList(new Topic("Spring", "Spring Framework", "Spring Framework description"),
				new Topic("Java", "Java Language", "Java description"),
				new Topic("Angular", "Angular front end", "front end description"));

	}
}
