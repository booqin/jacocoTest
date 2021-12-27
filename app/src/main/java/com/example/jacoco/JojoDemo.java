package com.example.jacoco;

/**
 * TODO
 * Created by BoQin on 2021/12/24.
 * Modified by BoQin
 *
 * @author BoQin
 * @Version
 */
public class JojoDemo {

    private static final String finalName = "JOJO";
    private static String name = "2KOKO";

    public String getName(){
        return finalName;
    }

    public void dos(){
        String j = getName();
        if(j.equals("1")){
            j = "2";
        }else {
            j = "3";
        }
        System.out.print(j);
    }
}
