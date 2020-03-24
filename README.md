# design-patterns
参考资料
http://c.biancheng.net/design_pattern/
  一.七大设计原则
  1.开闭原则
    对扩展开发，对修改关闭
  2.单一职责
   一个类一个方法只承担一个功能或者责任
  3.依赖倒置原则
    高层依赖不应该依赖低层依赖，两者都应该依赖抽象；抽象不应该依赖细节，细节应该依赖抽象
  4.接口隔离原则
    将大的接口拆成小接口，每个接口的功能隔离
    与单一职责不同的是  单一职责强调的是功能和职责，接口隔离强调的是接口依赖的隔离，
    单一职责是对类和实现的要求，接口隔离是抽象层的接口的要求
  5.里氏替换原则
  所有使用父类，可以用子类代替
  6.迪米特法则
  一个类只知道他关联的类或者引用
  7.组合复用原则
  软件复用时尽量使用组合或者聚合关系，最后使用继承
二.23种设计模式
其中分为 5种创建型模式  7种结构型模式 11种行为型模式
创建模式
    1.单例模式(Singleton)：
        定义：指一个类只有一个实例，且该类自行创建这个实例的一种模式
       单例模式有 3 个特点：
         单例类只有一个实例对象
         该单例对象必须由单例类自行创建，（构造函数私有化）
         单例类对外提供一个访问该单例的访问点
    2.工厂方法模式（FactoryMethod）：
        定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体的子工厂类中。满足创建模式中所要求的"创建与使用相分离"的特点
        工厂方法模式的主要优点有：
         用户只需要知道具体工厂的名称就可得到所要的产品，无须知道产品的具体创建过程
         在系统增加新的产品时只需要添加具体产品类和对应的具体工厂类，无须对原工厂进行任何修改，满足开闭原则
         其缺点是：每增加一个产品就要增加一个具体产品类和一个对应的具体工厂类，这增加了系统的复杂度
    3.抽象工厂模式(AbstractFactory)：
        定义：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构
        抽象工厂模式是工厂方法模式的升级版本，工厂模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品
         优点：
             可以在类的内部对产品族中相关联的多等级产品共同管理，而不必专门引入多个新的类来进行管理
             当增加一个新的产品族时不需要要修改原代码，满足开闭原则
         缺点：当产品族中需要增加一个新的产品时，所有工厂类都需要进行修改
        使用条件：
            系统中有多个产品族，每个具体工厂创建同一个族但属于不同等级结构的产品
            系统一次只可能消费其中某一族产品，即同族的产品一起使用
    4.建造者模式（Builder）
        定义：指将一个复杂对象的构造与它的表示分离，使同样的构建的过程可以创建不同的表示，这样的设计模式被称为建造者模式
            它是将一个复杂对象分解为多个简单的对象，然后一步一步构建而成。它将变与不变相分离，即产品部分是不变的，但每一部分是可以灵活选择。
        优点：各个具体的建造者相互独立，有利于系统的扩展
              客户端不必知道产品内部组成细节，便于控制细节风险
        缺点：
             产品的组成部分必须相同，限制了使用范围。
             如果产品的内部变化复杂，该模式会增加很多的建造者类
        建造者模式与工厂模式的关注点不同，建造者模式注重零部件的组装过程，而工厂方法模式更注重零部件的创建过程，但两者可以结合使用
    5.原型模式(Prototype)
       定义： 用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。
        在这里，原型实例指定了要创建的对象的种类，用这种方式创建对象非常高效，根本无须知道对象创建细节
       
结构模式
    1.适配器模式（Adapter）
        定义：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作
             适配器模式分为类结构型模式和对象结构型模式两种，前者类之间的耦合度比后者高，且要求程序程序员了解现有组件库中的相关组件的内部结构，
           所以应用相对较少些
        优点：
            客户端通过适配器可以透明的调用目标接口
            复用了现存的类，程序员不需要修改原有代码而重用现有的适配者类
            将目标类和适配者类解耦，解决了目标类和适配类接口不一致的问题
         缺点：
            对类适配器来说，更换适配器的实现过程比较复杂
    2.装饰器模式
    
    
    3.代理模式
    4.外观模式
    5.桥接模式
    6.组合模式
    7.享元模式
行为模式
    1.策略模式
    2.模板模式
    3.观察者模式
    4.迭代器模式
    5.责任链模式
    6.命令模式
    7.备忘录模式
    8.状态模式
    9.访问者模式
    10.中介模式
    11.解释器模式



