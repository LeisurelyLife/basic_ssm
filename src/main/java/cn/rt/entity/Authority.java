package cn.rt.entity;

import javax.persistence.*;

@Table(name = "authority")
public class Authority {
    /**
     * 主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     */
    @Id
    private String auid;

    /**
     * 系统编号(0001审批系统)
     */
    private String sysno;

    /**
     * 父权限ID
     */
    private String aufid;

    /**
     * 权限等级（0校级权限,1院级权限，2公共权限）
     */
    private Long autlevel;

    /**
     * 权限名称
     */
    private String auname;

    /**
     * 权限URL值  多个用|分隔
     */
    private String auurl;

    /**
     * 权限值(不唯一 ,不同系统的可能命名一样)
     */
    private String aukey;

    /**
     * 生效标志(0未启用 1启用 2注销)
     */
    private Long aumark;

    /**
     * 权限描述
     */
    private String audes;

    /**
     * 获取主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     *
     * @return auid - 主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     */
    public String getAuid() {
        return auid;
    }

    /**
     * 设置主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     *
     * @param auid 主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     */
    public void setAuid(String auid) {
        this.auid = auid;
    }

    /**
     * 获取系统编号(0001审批系统)
     *
     * @return sysno - 系统编号(0001审批系统)
     */
    public String getSysno() {
        return sysno;
    }

    /**
     * 设置系统编号(0001审批系统)
     *
     * @param sysno 系统编号(0001审批系统)
     */
    public void setSysno(String sysno) {
        this.sysno = sysno;
    }

    /**
     * 获取父权限ID
     *
     * @return aufid - 父权限ID
     */
    public String getAufid() {
        return aufid;
    }

    /**
     * 设置父权限ID
     *
     * @param aufid 父权限ID
     */
    public void setAufid(String aufid) {
        this.aufid = aufid;
    }

    /**
     * 获取权限等级（0校级权限,1院级权限，2公共权限）
     *
     * @return autlevel - 权限等级（0校级权限,1院级权限，2公共权限）
     */
    public Long getAutlevel() {
        return autlevel;
    }

    /**
     * 设置权限等级（0校级权限,1院级权限，2公共权限）
     *
     * @param autlevel 权限等级（0校级权限,1院级权限，2公共权限）
     */
    public void setAutlevel(Long autlevel) {
        this.autlevel = autlevel;
    }

    /**
     * 获取权限名称
     *
     * @return auname - 权限名称
     */
    public String getAuname() {
        return auname;
    }

    /**
     * 设置权限名称
     *
     * @param auname 权限名称
     */
    public void setAuname(String auname) {
        this.auname = auname;
    }

    /**
     * 获取权限URL值  多个用|分隔
     *
     * @return auurl - 权限URL值  多个用|分隔
     */
    public String getAuurl() {
        return auurl;
    }

    /**
     * 设置权限URL值  多个用|分隔
     *
     * @param auurl 权限URL值  多个用|分隔
     */
    public void setAuurl(String auurl) {
        this.auurl = auurl;
    }

    /**
     * 获取权限值(不唯一 ,不同系统的可能命名一样)
     *
     * @return aukey - 权限值(不唯一 ,不同系统的可能命名一样)
     */
    public String getAukey() {
        return aukey;
    }

    /**
     * 设置权限值(不唯一 ,不同系统的可能命名一样)
     *
     * @param aukey 权限值(不唯一 ,不同系统的可能命名一样)
     */
    public void setAukey(String aukey) {
        this.aukey = aukey;
    }

    /**
     * 获取生效标志(0未启用 1启用 2注销)
     *
     * @return aumark - 生效标志(0未启用 1启用 2注销)
     */
    public Long getAumark() {
        return aumark;
    }

    /**
     * 设置生效标志(0未启用 1启用 2注销)
     *
     * @param aumark 生效标志(0未启用 1启用 2注销)
     */
    public void setAumark(Long aumark) {
        this.aumark = aumark;
    }

    /**
     * 获取权限描述
     *
     * @return audes - 权限描述
     */
    public String getAudes() {
        return audes;
    }

    /**
     * 设置权限描述
     *
     * @param audes 权限描述
     */
    public void setAudes(String audes) {
        this.audes = audes;
    }
}