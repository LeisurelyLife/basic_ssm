package cn.rt.entity;

import javax.persistence.*;

@Table(name = "userlable")
public class Userlable {
    @Id
    private String userlid;

    /**
     * @return userlid
     */
    public String getUserlid() {
        return userlid;
    }

    /**
     * @param userlid
     */
    public void setUserlid(String userlid) {
        this.userlid = userlid;
    }
}