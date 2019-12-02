package com.huangc.base.studyservice.modules.java8new;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

/**
 * @Author: huangl
 * @Date: 2019/11/29 15:18
 * @Description:
 */
public class StreamApi {

    private static List<PersonModel> list = null;

    static {
        PersonModel wu = new PersonModel("wu qi", 18, "男");
        PersonModel zhang = new PersonModel("zhang san", 19, "男");
        PersonModel wang = new PersonModel("wang si", 20, "女");
        PersonModel zhao = new PersonModel("zhao wu", 20, "男");
        PersonModel chen = new PersonModel("chen liu", 21, "男");
        list = Arrays.asList(wu, zhang, wang, zhao, chen);
    }

    public static List<PersonModel> getData() {
        return list;
    }

    public static void main(String[] args) {
/*
        List<PersonModel> data = StreamApi.getData();
        */
/**
         * 过滤所有的男性
         *//*

        List<PersonModel> list = data.stream().filter(personModel -> "男".equals(personModel.getSex()))
                .collect(toList());
        list.forEach(personModel -> System.out.println(personModel.getName()));
        System.out.println("====================================================");
        */
/**
         * 过滤所有的男性 并且小于20岁
         *//*

        List<PersonModel> list1 = data.stream().filter(personModel -> "男".equals(personModel.getSex())&&21>personModel.getAge()).collect(toList());

        list1.forEach(personModel -> System.out.println(personModel.getName()));
        System.out.println("====================================================");
        */
/**
         * 取出所有的用户名字
         *//*

        List<String> names = data.stream().map(e->e.getName()).collect(toList());
        System.out.println(names);
        List<String> names1 =data.stream().map(PersonModel::getName).collect(toList());
        System.out.println(names1);

        System.out.println("====================================================");
*/


        List<String> myList =   Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(e->e.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        IntStream.range(1, 4)
                .forEach(System.out::println);


    }
}
