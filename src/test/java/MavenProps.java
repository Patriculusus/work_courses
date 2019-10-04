package test.java;

import org.testng.annotations.Test;

public class MavenProps {
    @Test
    public void propTest(){
        System.out.println(System.getProperty("my.property"));
        System.out.println(System.getProperty("base.url"));
    }
}