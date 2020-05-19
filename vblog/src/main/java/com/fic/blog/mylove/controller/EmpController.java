package com.fic.blog.mylove.controller;

import com.fic.blog.mylove.bean.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class EmpController {
    private static List<Employee> list = new ArrayList<>();
    static {
        list.add(new Employee("张三", 18,0, "1994-04-06 15:30"));
        list.add(new Employee("李四", 18,0, "1994-02-06 15:30"));
        list.add(new Employee("王五", 18,0, "1994-08-06 15:30"));
        list.add(new Employee("丽丽", 18,1, "1994-04-16 15:30"));
        list.add(new Employee("内内", 18,1, "1994-09-06 15:30"));
    }

    @GetMapping("/getemp")
    public String getEmp(Map<String,List<Employee>> map) {
        map.put("emp",list);
        return "emp/employee";
    }
}
