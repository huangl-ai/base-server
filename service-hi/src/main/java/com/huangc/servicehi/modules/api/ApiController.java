package com.huangc.servicehi.modules.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Auther: huangl
 * @Date: 2019/7/24 14:48
 * @Description:
 */
@RestController
public class ApiController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    @ResponseBody
    public String home(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hi " + name + " ,i am from port:"+ port ;
    }

    @RequestMapping("/him")
    @ResponseBody
    public String homeOther(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return "hescim " + name + " ,i am from port:"+ port ;
    }

    public static void main(String[] args) {

/*        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String pattern = "[" + s2 + "]";
            String result = s1.replaceAll(pattern, "");
            System.out.println(result);
        }*/
        System.out.println(checkDifferent("asdfhkl"));

    }

    public static boolean checkDifferent(String iniString) {
        int iniLength = iniString.length();
        char[] charArray = iniString.toCharArray();
        TreeSet<Character> after = new TreeSet<Character>();
        for(int i = 0;i<charArray.length;i++){
            after.add(charArray[i]);
        }
        int afterLength = after.size();
        if(afterLength==iniLength) {
            return true;
        }
        return false;
    }

}
