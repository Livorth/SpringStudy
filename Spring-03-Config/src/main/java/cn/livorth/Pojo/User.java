package cn.livorth.Pojo;

import java.util.*;

public class User {

    // 对类型注入的一个学习

    // 字符串类型,普通类型一样
    private String str;
    // 数组类型
    private String[] Strings;
    // 链表类型
    private List<String> ListStr;
    // set 类型
    private Set<String> setStr;
    // map类型
    private Map<String,String> mapStr;
    // 类的注入
    private TestClass testClass;
    // 空值注入
    private String theNull;
    // properties注入
    private Properties info;


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String[] getStrings() {
        return Strings;
    }

    public void setStrings(String[] strings) {
        Strings = strings;
    }

    public List<String> getListStr() {
        return ListStr;
    }

    public void setListStr(List<String> listStr) {
        ListStr = listStr;
    }

    public Set<String> getSetStr() {
        return setStr;
    }

    public void setSetStr(Set<String> setStr) {
        this.setStr = setStr;
    }

    public Map<String, String> getMapStr() {
        return mapStr;
    }

    public void setMapStr(Map<String, String> mapStr) {
        this.mapStr = mapStr;
    }

    public TestClass getTestClass() {
        return testClass;
    }

    public void setTestClass(TestClass testClass) {
        this.testClass = testClass;
    }

    public String getTheNull() {
        return theNull;
    }

    public void setTheNull(String theNull) {
        this.theNull = theNull;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }


    @Override
    public String toString() {
        return "User{\n" +
                "str='" + str + '\'' +
                ", \nStrings=" + Arrays.toString(Strings) +
                ", \nListStr=" + ListStr +
                ", \nsetStr=" + setStr +
                ", \nmapStr=" + mapStr +
                ", \ntestClass=" + testClass.toString() +
                ", \ntheNull='" + theNull + '\'' +
                ", \ninfo=" + info +
                '}';
    }
}
