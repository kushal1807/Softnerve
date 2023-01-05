package com.example.project.entities;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "Patients")
public class PatientDetails {

    @Id
    private long Pid;
    @Field("Pname")
    private String Pname;
    @Field("Cno")
    private long Cno;

    public PatientDetails()
    {
        super();
    }

    public PatientDetails(long Pid, String Pname, long Cno) {
        super();
        this.Pid = Pid;
        this.Pname = Pname;
        this.Cno = Cno;
    }
    public PatientDetails( String Pname, long Cno) {
        super();
        this.Pname = Pname;
        this.Cno = Cno;
    }

    public long getPid() {
        return Pid;
    }

    public void setPid(long pid) {
        this.Pid = pid;
    }

    public String getPname() {
        return Pname;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public long getCno() {
        return Cno;
    }

    public void setAge(long Cno) {
        this.Cno = Cno;
    }

    @Override
    public String toString() {
        return "Biodata{" +
                "Pid=" + Pid +
                ", Pname='" + Pname + '\'' +
                ", Cno=" + Cno +
                '}';
    }
}

