package com.baizhi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.annotation.KeySql;
import tk.mybatis.mapper.code.ORDER;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Table(name = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable {
    @Id
    @KeySql(sql = "select person_seq.nextval from dual", order = ORDER.BEFORE)
    private Integer id;
    private String name;
    private String city;
    private Date birthday;
    @Transient
    private String age;
}
