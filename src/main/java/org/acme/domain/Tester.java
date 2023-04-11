package org.acme.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tester")
@Entity
public class Tester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tester_id;

    private String tester_name;

    private String tester_id_card;

    private String certificate_level;

    private LocalDate certificate_date;

    private String certificate_number;

    private String tester_phone_number;

    private String project_responsibility;

    public String getProject_responsibility() {
        return project_responsibility;
    }

    public void setProject_responsibility(String project_responsibility) {
        this.project_responsibility = project_responsibility;
    }

    public long getTester_id() {
        return tester_id;
    }

    public void setTester_id(long tester_id) {
        this.tester_id = tester_id;
    }

    public String getTester_name() {
        return tester_name;
    }

    public void setTester_name(String tester_name) {
        this.tester_name = tester_name;
    }

    public String getTester_id_card() {
        return tester_id_card;
    }

    public void setTester_id_card(String tester_id_card) {
        this.tester_id_card = tester_id_card;
    }

    public String getCertificate_level() {
        return certificate_level;
    }

    public void setCertificate_level(String certificate_level) {
        this.certificate_level = certificate_level;
    }

    public LocalDate getCertificate_date() {
        return certificate_date;
    }

    public void setCertificate_date(LocalDate certificate_date) {
        this.certificate_date = certificate_date;
    }

    public String getCertificate_number() {
        return certificate_number;
    }

    public void setCertificate_number(String certificate_number) {
        this.certificate_number = certificate_number;
    }

    public String getTester_phone_number() {
        return tester_phone_number;
    }

    public void setTester_phone_number(String tester_phone_number) {
        this.tester_phone_number = tester_phone_number;
    }
}