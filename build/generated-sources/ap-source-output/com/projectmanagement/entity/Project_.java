package com.projectmanagement.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-03-14T14:00:14")
@StaticMetamodel(Project.class)
public class Project_ { 

    public static volatile SingularAttribute<Project, Integer> statusId;
    public static volatile SingularAttribute<Project, Date> endDate;
    public static volatile SingularAttribute<Project, String> description;
    public static volatile SingularAttribute<Project, String> projectName;
    public static volatile SingularAttribute<Project, Integer> projectId;
    public static volatile SingularAttribute<Project, Date> startDate;

}