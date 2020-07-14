# lambda表达式默认引用对象

首先。在使用lambad表达式的时候，使用  `Classname::function` 会默认传递一个当前类的指针，因此例如我们有类A：

```Java
class A {
    void func(int a){
        
    }
}
```

那么我们在使用`A::func`的时候，默认的函数参数是这样的 `void func(A this, int a)`。`this` 是当前类的一个指针，用来指向当前类的数据部分的地址。因此这个写法可以适用于 `(A, int)-> void` 的函数签名。

对于使用者而言，无需知道当前传入的是对象的函数还是普通函数，直接调用即可。

那么对于一个接口而言，例如B

```java
class B {
    void func(int a);
}
```

如果使用`B::func`也是可以适配 `(A, int)-> void` 的函数签名，然而这个函数没有定义，但是仍然可以运行，那么可以等价于，所以说几即便没有实现方法，也会有默认方式。 

```java
AsyncTask t = (r)->{
	r.run();
}
```


```java
 interface Action0 {
  	void run();
}  
public interface AsyncTask {
  	void call( Action0 a);
    AsyncTask a = Action0::run;
}
```

这种可以使用默认赋值，但是函数列表项必须相同，才能进行直接简化也就是 `Interface::func` 。

```java
	AsyncTask a = (t,a,b,c,d,e) ->{
		// 可以简化
		 t.run(a,b,c,d,e);
	};
	AsyncTask a = (t,a,b,c,d,e) ->{
		// 不能简化
		t.run(3,b,c,d,e);
	};
```