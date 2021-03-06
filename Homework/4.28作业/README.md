## 第三方 jar
```
.
├── Main.jar
├── lib
│   ├── Cat.jar
│   ├── Dog.jar
│   ├── Main.jar
│   └── Person.jar
├── out
│   └── club
│       └── banyuan
│           ├── animal
│           │   ├── Cat.class
│           │   └── Dog.class
│           ├── human
│           │   └── Person.class
│           └── main
│               └── Main.class
└── src
    └── club
        └── banyuan
            ├── animal
            │   ├── Cat.java
            │   └── Dog.java
            ├── human
            │   └── Person.java
            └── main
                └── Main.java

13 directories, 13 files
```
`edz@edzmatoMacBook-Air Animal$ java -jar Main.jar`
``` 
训练狗狗小强
小强: 汪汪
狗狗小强和猫咪汤姆一起玩
汤姆: 喵..
```
## 继承
1. 
```
class Base {
    public void show() {
       System.out.println("Base::show() called");
    }
}
  
class Derived extends Base {
    public void show() {
       System.out.println("Derived::show() called");
    }
}
  
public class Main {
    public static void main(String[] args) {
        Base b = new Derived();;
        b.show();
    }
}
```
输出结果：Derived::show() called

2. 
```
class A
{
    int i = 10;
}
 
class B extends A
{
    int i = 20;
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        A a = new B(); // 找不到a
 
        System.out.println(a.i);
    }
}
```

3. 
```
class A
{
    {
        System.out.println(1);
    }
}
 
class B extends A
{
    {
        System.out.println(2);
    }
}
 
class C extends B
{
    {
        System.out.println(3);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}
```
输出结果：  
1   
2   
3   
4. 
```
class A
{
    public A()
    {
        System.out.println("Class A Constructor");
    }
}
 
class B extends A
{
    public B()
    {
        System.out.println("Class B Constructor");
    }
}
 
class C extends B
{
    public C()
    {
        System.out.println("Class C Constructor");
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        C c = new C();
    }
}
```
输出结果：  
Class A Constructor     
Class B Constructor     
Class C Constructor     
5. 
```
class X
{
    public X(int i)
    {
        System.out.println(1);
    }
}
 
class Y extends X
{
    public Y()
    {
        System.out.println(2);
    }
}
```
编译错误，类X的构造器中给定int类型，X的继承Y中给定的无参，无法转换。        
6. 
```
public class A
{
    public A()
    {
        System.out.println(1);
 
        super();
 
        System.out.println(2);
    }
}
```
编译失败，super()必须在第一行。         
7. 
```
public class A
{
    public A(int i)
    {
 
    }
}
 
class B extends A
{
 
}

```
不会。
8. 
```
public class A
{
    public A()
    {
        super();
 
        this(10);
    }
 
    public A(int i)
    {
        System.out.println(i);
    }
}
```
编译失败，super跟this指令都必须在第一行，不允许在同一个构造器中.        
9. 
```
class M
{
    int i;
 
    public M(int i)
    {
        this.i = i--;
    }
}
 
class N extends M
{
    public N(int i)
    {
        super(++i);
 
        System.out.println(i);
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
    }
}
```
输出结果：27    
10.
```
class M
{
    int i = 51;
 
    public M(int j)
    {
        System.out.println(i);
 
        this.i = j * 10;
    }
}
 
class N extends M
{
    public N(int j)
    {
        super(j);
 
        System.out.println(i);
 
        this.i = j * 20;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        N n = new N(26);
 
        System.out.println(n.i);
    }
}
```
输出结果：  
51  
260     
520     
11. 
```
class X
{
    private int m = 48;
}
 
class Y extends X
{
    void methodOfY()
    {
        System.out.println(m);
    }
}
```
编译失败，父类的变量是私有，子类无法调用。  
12. 
```
class X
{
    int m = 1111;
 
    {
        m = m++;
 
        System.out.println(m);
    }
}
 
class Y extends X
{
    {
        System.out.println(methodOfY());
    }
 
    int methodOfY()
    {
        return m-- + --m;// 从左往右算 1111+(1110-1)
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        Y y = new Y();
    }
}
```
输出结果：  
1111    
2220    
13.
``` 
class A
{
	void a()//void 有返回值，就是void             
	{
		System.out.println(1);
	}
}

class B extends A
{
	void b()
	{
		a();
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		new B().b();
	}
}
```
输出结果：1     
14. 
```
class A
{
	int i = 1212;
}

class B extends A
{
	A a;

	public B(A a)
	{
		this.a = a;
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		A a = new A();

		B b = new B(a);

		System.out.println(a.i);

		System.out.println(b.i);

		System.out.println(b.a.i);

		b.a.i = 2121;

		System.out.println("--------");

		System.out.println(a.i);

		System.out.println(b.i);
	}
}
```
输出结果：  
```
1212    
1212    
1212    
--------    
2121    
1212 
```   
15. 
```
class A
{
	int methodOfA(int i)
	{
		i /= 10;

		return i;
	}
}

class B extends A
{
	int methodOfB(int i)
	{
		i *= 20;

		return methodOfA(i);
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		B b = new B();

		System.out.println(b.methodOfB(100));
	}
}
```
输出结果：100 * 20 / 10 = 200   
16. 
```
class One
{
	int x = 2121;
}

class Two
{
	int x = 1212;
	
	{
		System.out.println(x);
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		Two two = new Two();
	}
}
```
输出结果：1212