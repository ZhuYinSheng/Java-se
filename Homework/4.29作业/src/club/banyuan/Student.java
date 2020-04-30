//编程练习
//        使用java类描述一个学生类和其子类(小学生类、 中学生类， 高中生类)。
//        •	学生都具备名字成员和对应的get和set方法，get和set方法不能够被子类重写// overwide。 学生具备一个传入String名字的构造方法。
//        •	都具备学习的方法。调用学习的方法
//        •	编写一个main方法测试编写的类，依次创建小学生、中学生、高中生对象，分别调用学习的方法。
package club.banyuan;

import javax.xml.namespace.QName;

public class Student {
    protected String name;
    public Student(String name){
        this.name = name;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }
    public void study(){
        System.out.println(name + "学习");
    }
}

class ElementarySchoolStudent extends Student{
    public ElementarySchoolStudent (String name){
        super(name);
    }
}

class MiddleSchoolStudent extends Student{
    public MiddleSchoolStudent (String name){
        super(name);
    }
}

class HighSchoolStudent extends Student{
    public HighSchoolStudent (String name){
        super(name);
    }
}
class Main{
    public static void main(String[] args) {
    ElementarySchoolStudent elementaryschoolstudent = new ElementarySchoolStudent("小学生");
    MiddleSchoolStudent middleschoolstudent = new MiddleSchoolStudent("中学生");
    HighSchoolStudent highschoolstudent = new HighSchoolStudent("高中生");
    elementaryschoolstudent.study();
    middleschoolstudent.study();
    highschoolstudent.study();
    }
}