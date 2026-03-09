package com.abhishek.jobportal.service;


import com.abhishek.jobportal.model.JobPost;
import com.abhishek.jobportal.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Backend Developer", "Develop REST APIs using Spring Boot", 2, Arrays.asList("Java", "Spring Boot", "Hibernate", "MySQL")),
            new JobPost(2, "Frontend Developer", "Build responsive UI applications", 1, Arrays.asList("JavaScript", "HTML5", "CSS3", "React")),
            new JobPost(3, "Full Stack Developer", "Work on frontend and backend modules", 3, Arrays.asList("Java", "Spring Boot", "Angular", "MySQL")),
            new JobPost(4, "Android Developer", "Develop Android applications", 2, Arrays.asList("Kotlin", "Java", "Firebase")),
            new JobPost(5, "DevOps Engineer", "Maintain CI/CD pipelines", 4, Arrays.asList("Docker", "Kubernetes", "AWS", "Linux"))

    ));


    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs(){
        return repo.findAll();
    }

    public JobPost getJob(int postId) {
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        repo.deleteById(postId);
    }

    public void load() {
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword,keyword);
    }
}
