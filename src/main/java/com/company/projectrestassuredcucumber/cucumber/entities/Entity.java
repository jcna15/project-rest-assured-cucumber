package com.company.projectrestassuredcucumber.cucumber.entities;

public class Entity {
    private Project project;

    public Entity(){}

    public Entity(Project project){
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
}
