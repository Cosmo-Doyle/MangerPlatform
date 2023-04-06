package org.acme.domain;

import javax.persistence.*;


@Table(name = "project")
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long project_id;

    private String project_name;

    private String leader_name;

    private String leader_link;

    private String test_unit;
    private String contacter;
    private String review_date;
    private String contacter_link;
    private String start_and_end_time;
    private long total_price;
    private boolean sign_confidentialit;
    private String test_time;
    private String protect_level;
    private String sign_contract;
    private Boolean review;

    public enum Review_status {
        WAIT_REVIEW {
            public String getReview_status() {
                return "待审核";
            }
        },
        COMPLETE_REVIEW {
            public String getReview_status() {
                return "已完成";
            }
        };
        public abstract String getReview_status();
    }
    public enum Test_status {
        WAIT_TEST {
            public String getTest_status() {
                return "测评中";
            }
        },
        COMPLETE_TEST {
            public String getTest_status() {
                return "已完成";
            }
        };
        public abstract String getTest_status();
    }

    public enum System_number {
        LEVER_TWO,
        LEVEL_THREE,
        LEVER_FOUR;
    }

    public long getProject_id() {
        return project_id;
    }

    public void setProject_id(long project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getLeader_name() {
        return leader_name;
    }

    public void setLeader_name(String leader_name) {
        this.leader_name = leader_name;
    }

    public String getLeader_link() {
        return leader_link;
    }

    public void setLeader_link(String leader_link) {
        this.leader_link = leader_link;
    }

    public String getTest_unit() {
        return test_unit;
    }

    public void setTest_unit(String test_unit) {
        this.test_unit = test_unit;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getReview_date() {
        return review_date;
    }

    public void setReview_date(String review_date) {
        this.review_date = review_date;
    }

    public String getContacter_link() {
        return contacter_link;
    }

    public void setContacter_link(String contacter_link) {
        this.contacter_link = contacter_link;
    }

    public String getStart_and_end_time() {
        return start_and_end_time;
    }

    public void setStart_and_end_time(String start_and_end_time) {
        this.start_and_end_time = start_and_end_time;
    }

    public long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(long total_price) {
        this.total_price = total_price;
    }

    public boolean isSign_confidentialit() {
        return sign_confidentialit;
    }

    public void setSign_confidentialit(boolean sign_confidentialit) {
        this.sign_confidentialit = sign_confidentialit;
    }

    public String getTest_time() {
        return test_time;
    }

    public void setTest_time(String test_time) {
        this.test_time = test_time;
    }

    public String getProtect_level() {
        return protect_level;
    }

    public void setProtect_level(String protect_level) {
        this.protect_level = protect_level;
    }

    public String getSign_contract() {
        return sign_contract;
    }

    public void setSign_contract(String sign_contract) {
        this.sign_contract = sign_contract;
    }

    public Boolean getReview() {
        return review;
    }

    public void setReview(Boolean review) {
        this.review = review;
    }

    @Override
    public String toString() {
        return "Project{" +
                "project_id=" + project_id +
                ", project_name='" + project_name + '\'' +
                ", leader_name='" + leader_name + '\'' +
                ", leader_link='" + leader_link + '\'' +
                ", test_unit='" + test_unit + '\'' +
                ", contacter='" + contacter + '\'' +
                ", review_date='" + review_date + '\'' +
                ", contacter_link='" + contacter_link + '\'' +
                ", start_and_end_time='" + start_and_end_time + '\'' +
                ", total_price=" + total_price +
                ", sign_confidentialit=" + sign_confidentialit +
                ", test_time=" + test_time +
                ", protect_level='" + protect_level + '\'' +
                ", sign_contract=" + sign_contract +
                ", review=" + review +
                '}';
    }
}

