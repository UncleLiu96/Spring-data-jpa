package com.jpa.pojo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_user")
public class TUser implements Serializable {

    private static final long serialVersionUID = 3926276668667517847L;

    /**
     * - TABLE：使用一个特定的数据库表格来保存主键。
     * - SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
     * - IDENTITY：主键由数据库自动生成（主要是自动增长型）
     * - AUTO：主键由程序控制(也是默认的,在指定主键时，如果不指定主键生成策略，默认为AUTO)
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "u_id")
    private Integer UId;

    @Column(name = "u_name")
    private String UName;

    public Integer getUId() {
        return UId;
    }

    public void setUId(Integer UId) {
        this.UId = UId;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "UId=" + UId +
                ", UName='" + UName + '\'' +
                '}';
    }
}
