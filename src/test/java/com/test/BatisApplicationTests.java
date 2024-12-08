package com.test;

import com.test.mapper.DepartmentsMapper;
import com.test.pojo.Departments;
import com.test.pojo.Employees;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class BatisApplicationTests {

    @Autowired
    DepartmentsMapper dmMapper;

    @Test
    public void testDelete(){
      dmMapper.delete("123");
    }

    @Test
    void testInsert() {
        Departments dm = new Departments();
        dm.setDeptNo("123");
        dm.setDeptName("test");

        dmMapper.insert(dm);
    }

    @Test
    public void testUpdate() {
        Departments dm = new Departments();
        dm.setDeptName("test1234");
        dm.setDeptNo("123");

        dmMapper.update(dm);
    }

    @Test
    public void testSelectByNo(){
        Departments dm = dmMapper.selectByNo("123");
        System.out.println(dm);
    }

    @Test
    public void testSelectAll(){
        List<Departments> list = dmMapper.selectAll();
        System.out.println(list);
    }

    @Test
    public void testSelectByName(){
//        List<Employees> list = dmMapper.selectByName("Valdiodio", LocalDate.of(1990,1,1));
//        List<Employees> list = dmMapper.selectByName("Valdiodio", null);//LocalDate.of(1990,1,1)
        List<Employees> list = dmMapper.selectByName(null, LocalDate.of(2000,1,1));//LocalDate.of(1990,1,1)
        System.out.println(list);
    }

    @Test
    public void testUpdateEmployee(){
        Employees emp = new Employees();
        emp.setEmpNo(10001);
        emp.setFirstName("GeorgiUpdate");
        emp.setLastName("FacelloUpdate");

        dmMapper.updateDynamic(emp);
    }

    @Test
    public void deleteByNo(){
        List<Integer> nos = Arrays.asList(10001,10002,10003);
        dmMapper.deleteByNo(nos);
    }
}
