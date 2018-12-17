package com.baizhi;

import com.baizhi.entity.Person;
import com.baizhi.mapper.PersonMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonMapperApplicationTests {
    @Autowired
    private PersonMapper personMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testSelectAll() {
        List<Person> people = personMapper.selectAll();
        for (Person person : people) {
            System.out.println(person + "~~~~~");
        }
    }

    @Test
    public void testDelete() {
        Person t = new Person();
        t.setName("张杰");
        int i = personMapper.delete(t);
        System.out.println("----delete---" + i);
    }

    @Test
    public void testDeleteByPrimaryKey() {
        Person person = new Person();
        person.setId(123);
        int i = personMapper.deleteByPrimaryKey(person);
        System.out.println("~~~~" + i);
    }

    @Test
    public void testInsert() {
        Person person = new Person();
        person.setId(null);
        person.setName("张靓颖");
        person.setCity("四川");
        person.setBirthday(new Date());
        int insert = personMapper.insert(person);
        System.out.println(insert);
    }

    @Test
    public void testSelect() {
        Person t = new Person();
        t.setCity("四川");
        List<Person> select = personMapper.select(t);
        for (Person person : select) {
            System.out.println("----select-----" + person);
        }
    }

    @Test
    public void test() {
       /* Person person = personMapper.selectByPrimaryKey(87);
        System.out.println(person.getId());*/

        /*int i = personMapper.selectCount(new Person());
        System.out.println(i);*/   //查询数据库中的总条数

        Person t = new Person(87, "lhy", "开封", new Date(), "5");

        int i = personMapper.updateByPrimaryKey(t);
        System.out.println(i);
    }

    @Test
    public void test3() {
    }
}
