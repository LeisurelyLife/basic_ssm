package cn.rt.entity;

import javax.persistence.*;

@Table(name = "petitioncontent")
public class Petitioncontent {
    @Id
    private String petid;

    private String content;

    /**
     * @return petid
     */
    public String getPetid() {
        return petid;
    }

    /**
     * @param petid
     */
    public void setPetid(String petid) {
        this.petid = petid;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}