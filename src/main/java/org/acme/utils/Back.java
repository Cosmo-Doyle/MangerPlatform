package org.acme.utils;

import org.acme.domain.Project;

import java.util.ArrayList;
import java.util.List;

public class Back{
    public List<Project> projectSection(List<Project> list){
        List<Project> result=new ArrayList<>();
        if(list!=null && list.size()>0){
            for (Project project : list) {
                Project projectSection = new Project();
                projectSection.setProject_name(project.getProject_name());
                projectSection.setLeader_name(project.getLeader_name());
                projectSection.setTest_unit(project.getTest_unit());
                projectSection.setTest_time(project.getTest_time());
                projectSection.setProtect_level(project.getProtect_level());
                projectSection.setSign_contract(project.getSign_contract());
                //枚举类的审核状态
                result.add(projectSection);
            }
            return result;
        }
        return null;
    }
}
