package com.huangc.servicehi.modules.api;

import com.huangc.servicehi.modules.common.Result;
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

    @RequestMapping("/hime")
    @ResponseBody
    public Result homeOthere(@RequestParam(value = "name", defaultValue = "forezp") String name) {
        return new Result("hescim " + name + " ,i am from port:"+ port).ok();
    }

    public static void main(String[] args) {
        int[] a ={3,2,4};
       a = twoSum(a,6);
        System.out.println(a);




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

    public static int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
        for(int i=0;i<nums.length;i++){

            for(int j=i+1;j<nums.length;j++){

                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }

        }
        return result;

    }

}
