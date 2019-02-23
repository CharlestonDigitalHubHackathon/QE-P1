package quality.education.q1.Model;


import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Component
public class ProjectRepository {

    private ArrayList<Project> projects;

    public ProjectRepository() {
        this.projects = new ArrayList<Project>();
        projects.add(new Project(100,"Bobcat", "Biology", "Study of SC Bobcats"));
        projects.add(new Project(101,"Pelicans", "Biology", "Study of SC Pelicans"));
        projects.add(new Project(102,"Turtles", "Biology", "Study of SC Turtles"));
    }

    public void addProject(Project p){
        projects.add(p);
    }

    public void removeProject(Integer id) {
        for (Project project:projects) {
            if (project.getId().equals(id)) {
                projects.remove(project);
            }
        }
    }

    public Project findById(Integer id) {
        for (Project project:projects) {
            if (project.getId().equals(id)) {
                return project;
            }
        }
        return projects.get(0);
    }

    public ArrayList<Project> fidAll() {
        return projects;
    }
}
