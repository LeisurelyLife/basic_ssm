package cn.rt.entity;

import javax.persistence.*;

@Table(name = "topiccontent")
public class Topiccontent {
    @Id
    private String topid;

    private String content;

    /**
     * @return topid
     */
    public String getTopid() {
        return topid;
    }

    /**
     * @param topid
     */
    public void setTopid(String topid) {
        this.topid = topid;
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