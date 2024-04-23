package com.example.JobApp;


import com.example.JobApp.model.JobPost;
import com.example.JobApp.repo.JobRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JobAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JobAppApplication.class, args);
		JobPost post = context.getBean(JobPost.class);
		post.setPostDesc("AI Expert");
		post.setPostProfile("Best in businecc");
		post.setPostId(2);
		post.setReqExperience(200);
		post.setPostTechStack(List.of("expert" , "Seriuoux ","Proect mnangemt"));

		JobRepo repo = context.getBean(JobRepo.class);
		repo.addJobPost(post);

		List<JobPost> list = repo.returnAllJobPosts();
		System.out.println(list.reversed());










	}

}
