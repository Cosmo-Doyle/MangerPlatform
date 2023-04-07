package org.acme.domain;

import javax.persistence.*;

@Table(name = "systems")
@Entity
public class System {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long system_id;

    private String system_name;

    private String test_unit;

    private String belong_to_project;

    private String filing_certificate_number;

    private String protect_level;

    private String test_status;

    public long getSystem_id() {
        return system_id;
    }

    public void setSystem_id(long system_id) {
        this.system_id = system_id;
    }

    public String getSystem_name() {
        return system_name;
    }

    public void setSystem_name(String system_name) {
        this.system_name = system_name;
    }

    public String getTest_unit() {
        return test_unit;
    }

    public void setTest_unit(String test_unit) {
        this.test_unit = test_unit;
    }

    public String getBelong_to_project() {
        return belong_to_project;
    }

    public void setBelong_to_project(String belong_to_project) {
        this.belong_to_project = belong_to_project;
    }

    public String getFiling_certificate_number() {
        return filing_certificate_number;
    }

    public void setFiling_certificate_number(String filing_certificate_number) {
        this.filing_certificate_number = filing_certificate_number;
    }

    public String getProtect_level() {
        return protect_level;
    }

    public void setProtect_level(String protect_level) {
        this.protect_level = protect_level;
    }

    public String getTest_status() {
        return test_status;
    }

    public void setTest_status(String test_status) {
        this.test_status = test_status;
    }
}
