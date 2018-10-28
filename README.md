1. 使用了@Autowire以及@Service等注解方式实现了Autoconfig
2. 实现了基于spring的测试；自动配置之类以及autwired触发都已经配置完成；主要是注解；注意需要添加@@SpringBootTest以及指定类，否则运行将会出错，该注解支持多个类指定，主要是该测试类中需要用到的开发类即可
3. 关于跳过url，注意需要将依赖中的JAP部分注释掉，另外在main函数所在类上面添加上EnableAutoconfig中exclude
4. springboot默认是扫描当前package以及子package，如果想要在其他范围内搜索，需要在main函数所在类添加@ComponentScan主机；早期DemoApplication类是在com.example.demo包体下面可以默认扫描到com.example.demo.configbean下面的注解，但是如果放到了u2的包体下面就需要声明@ComponentScan来进行手动指定扫描
5. @Autowired对于接口的实例获取，会自动寻找实现类，所以接口不需要添加注解
6. @Configuration代表了一个SpringContext.xml，里面定义了各个bean的获取方式；对应的getbean的方法需要添加@Bean的注解；
7. spring bean的注解，@Componet，@Service，@Repository都是默认singleton模式的；如果想要每次都创建实例，可以在使用这些注解的时候同时添加@Scope("prototype")的注解


