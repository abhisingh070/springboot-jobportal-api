package com.abhishek.jobportal.repo;


import com.abhishek.jobportal.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer>{

        List<JobPost> findByPostProfileContainingOrPostDescContaining(String PostProfile, String PostDesc);
}



//List<JobPost> jobs = new ArrayList<>(Arrays.asList(
//        new JobPost(1, "Java Backend Developer", "Develop REST APIs using Spring Boot", 2, Arrays.asList("Java", "Spring Boot", "Hibernate", "MySQL")),
//        new JobPost(2, "Frontend Developer", "Build responsive UI applications", 1, Arrays.asList("JavaScript", "HTML5", "CSS3", "React")),
//        new JobPost(3, "Full Stack Developer", "Work on frontend and backend modules", 3, Arrays.asList("Java", "Spring Boot", "Angular", "MySQL")),
//        new JobPost(4, "Android Developer", "Develop Android applications", 2, Arrays.asList("Kotlin", "Java", "Firebase")),
//        new JobPost(5, "DevOps Engineer", "Maintain CI/CD pipelines", 4, Arrays.asList("Docker", "Kubernetes", "AWS", "Linux"))
//
//));
//
//public List<JobPost> getAllJobs() {
//    return jobs;
//}
//
//public void addJobs(JobPost job) {
//    jobs.add(job);
//    System.out.println(jobs);
//}
//
//public JobPost getJob(int postId) {
//    for (JobPost job : jobs) {
//        if (job.getPostId() == postId) {
//            return job;
//        }
//    }
//    return null;
//}
//
//public void updateJob(JobPost jobPost) {
//    for (JobPost jobpost1 : jobs) {
//        if (jobpost1.getPostId() == jobPost.getPostId()) {
//            jobpost1.setPostProfile(jobPost.getPostProfile());
//            jobpost1.setPostDesc(jobPost.getPostDesc());
//            jobpost1.setReqExperience(jobPost.getReqExperience());
//            jobpost1.setPostTechStack(jobPost.getPostTechStack());
//        }
//    }
//}
//
//public void deleteJob(int postId) {
//    for(JobPost jobPost : jobs){
//        if(jobPost.getPostId() == postId){
//            jobs.remove(jobPost);
//        }
//    }
//}
