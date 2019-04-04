package cn.rt.entity;

import javax.persistence.*;

@Table(name = "usercheck")
public class Usercheck {
    /**
     * 主键ID，使用UUID
     */
    @Id
    private String uckid;

    /**
     * 获取主键ID，使用UUID
     *
     * @return uckid - 主键ID，使用UUID
     */
    public String getUckid() {
        return uckid;
    }

    /**
     * 设置主键ID，使用UUID
     *
     * @param uckid 主键ID，使用UUID
     */
    public void setUckid(String uckid) {
        this.uckid = uckid;
    }
}