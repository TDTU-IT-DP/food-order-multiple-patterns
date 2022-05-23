# food-order-multiple-patterns
<!-- THÔNG TIN VỀ DỰ ÁN -->
<br>
<br>
<br>
<div align="center">
  <a href="https://github.com/TDTU-IT-DP/food-order-multiple-patterns">
    <img src="assets/logo.jpg" alt="Logo" width="80" height="80">
  </a>
  <h1 align="center">BÀI TIỂU LUẬN</h1>
   <h3>Ứng dụng Gọi món ăn áp dụng Design Pattern</h3>
<br>

</div>
    <br>
    <br>
    <br>
    <br>
<p>
        <div >
            <p style="line-height: 1.0" dir ="rtl">
                <i>Giảng viên hướng dẫn:</i>
                <b> Thầy Đặng Huỳnh Trung Tín</b>
            </p>
            <p style="line-height: 1.0" dir ="rtl">
                <i>Người thực hiện:</i>
                    <b>Trần Minh Tài - 51900204</b>
            </p>
            <p style="line-height: 1.0" dir ="rtl">
                    <b>Hoàng Nhật Tân - 51900206</b>
            </p>
        </div>
</p>
<br>

<!-- MỤC LỤC -->
### Mục Lục
  1. [Giới thiệu](#1-giới-thiệu)
  2. [Yêu cầu cài đặt](#2-yêu-cầu-cài-đặt)<br>
    2.1 [Visual Studio Code](#visual-studio-code)<br>
    2.2 [Java 8](#java-8)
  3. [Hướng dẫn thực thi chương trình](#3-hướng-dẫn-thực-thi-chương-trình)
  4. [Các patterns được áp dụng](#4-các-patterns-được-áp-dụng)<br>
        4.1 [Template Method](#template-method)
        - [Giới thiệu](#giới-thiệu-template-method)
        - [Cài đặt pattern](#cài-đặt-template-method)
        - [Lý do áp dụng](#lý-do-áp-dụng-template-method)
        - [Ứng dụng pattern](#ứng-dụng-template-method)
        
        4.2 [Factory Method](#factory-method)
        - [Giới thiệu](#giới-thiệu-factory-method)
        - [Cài đặt pattern](#cài-đặt-factory-method)
        - [Lý do áp dụng](#lý-do-áp-dụng-factory-method)
        - [Ứng dụng pattern](#ứng-dụng-factory-method)

        4.3 [Command Pattern](#command-pattern)
        - [Giới thiệu](#giới-thiệu-command-pattern)
        - [Cài đặt pattern](#cài-đặt-command-pattern)
        - [Lý do áp dụng](#lý-do-áp-dụng-command-pattern)
        - [Ứng dụng pattern](#ứng-dụng-command-pattern)

        4.4 [Decorator Pattern](#decorator-pattern)
        - [Giới thiệu](#giới-thiệu-decorator-pattern)
        - [Cài đặt pattern](#cài-đặt-decorator-pattern)
        - [Lý do áp dụng](#lý-do-áp-dụng-decorator-pattern)
        - [Ứng dụng pattern](#ứng-dụng-decorator-pattern)
  5. [Tài liệu tham khảo](#5-tài-liệu-tham-khảo)


<!-- GIỚI THIỆU -->
# 1. Giới thiệu
![Ảnh ứng dụng](/assets/app.png)<!--  ***************** -->

**Chức năng ứng dụng:**
* Giúp cho việc đặt món ở nhà hàng trở nên thuận tiện và nhanh chóng hơn
* Có thể đặt nhiều món trong một lần đặt
* Hiển thị quy trình thao tác cho từng món ăn giúp cho công việc của các bồi bàn đơn giản và trơn tru

**Những pattern áp dụng** 
* [Template method](https://refactoring.guru/design-patterns/template-method)
* [Factory method pattern](https://refactoring.guru/design-patterns/factory-method)
* [Command pattern](https://refactoring.guru/design-patterns/command)
* [Decorator pattern](https://refactoring.guru/design-patterns/decorator)


<!-- YÊU CẦU CÀI ĐẶT -->
# 2. Yêu cầu cài đặt

#### Visual Studio Code

![Visual Studio Code](/assets/vsc.png)

> Visual Studio Code (VS Code) là một trình soạn thảo mã nguồn nhẹ nhưng mạnh mẽ, chạy trên máy tính và hỗ trợ Windows, macOS và Linux. Nó đi kèm với hỗ trợ tích hợp sẵn cho JavaScript, TypeScript và Node.js và có một hệ sinh thái mở rộng phong phú cho các ngôn ngữ khác (chẳng hạn như C ++, C#, Java, Python, PHP và Go) và thời gian chạy (chẳng hạn như .NET và Unity).

Sử dụng trình soạn thảo mã nguồn `Visual Studio Code` để chạy chương trình.

#### Java 8

![Java 8](/assets/java8.png)

> Java 8 is a revolutionary release of the world’s #1 development platform. It includes a huge upgrade to the Java programming model and a coordinated evolution of the JVM, Java language, and libraries. Java 8 includes features for productivity, ease of use, improved polyglot programming, security and improved performance. 

Project sử dụng phiên bản `Java 8` làm môi trường thực thi mã nguồn.

<!-- HƯỚNG DẪN CHẠY CHƯƠNG TRÌNH -->
# 3. Hướng dẫn thực thi chương trình

- Truy cập đường dẫn đến source code [tại đây](https://github.com/TDTU-IT-DP/food-order-multiple-patterns)
- Click vào `Code` -> Chọn `DOWNLOAD ZIP` 
- Sau khi đã tải tập tin nén có chứa source code ta bấm `chuột phải` vào tập tin -> chọn `Extract file "food-order-multiple-patterns.zip"`
- Sau đó ta sẽ được 1 thư mục có tên **"food-order-multiple-patterns"** click `chuột phải` vào thư mục -> chọn `Open with Visual Studio Code`
- Sau khi đã mở thành công thư mục ta tìm tập tin **Client.java** theo đường dẫn `/src/Client.java` -> Click `Run` để chạy tập tin này.


<!-- CÁC PATTERNS ĐƯỢC ÁP DỤNG -->
# 4. Các patterns được áp dụng

### Template Method

#### Giới thiệu Template Method

- Template Method Pattern là một trong những pattern thuộc nhóm hành vi (Behavior Pattern). Pattern này định nghĩa một bộ khung của một thuật toán trong một chức năng, chuyển giao việc thực hiện nó cho các lớp con. Mẫu Template method cho phép lớp con định nghĩa lại cách thực hiện của một thuật toán, mà không phải thay đổi cấu trúc thuật toán. Điều này giúp cho chúng ta tạo nên một bộ khung (template) cho một vấn đề đang cần giải quyết. Trong đó các đối tượng cụ thể sẽ có cùng các bước thực hiện, nhưng trong mỗi bước thực hiện đó có thể khác nhau. Điều này sẽ tạo nên một cách thức truy cập giống nhau nhưng có hành động và kết quả khác nhau.

- Template method bao gồm 1 Abstract class định nghĩa ra một template method để thực hiện một chức năng nào đó bao gồm những ràng buộc nhất định về thứ tự các bước thực hiện, hay ràng buộc về dữ liệu đầu vào, đầu ra, ... Và một Concrete class Template method này sẽ gọi đến các method khác bên trong Abstract class để tạo dựng nên bộ khung. Nhưng có thể các method đó sẽ không được thực thi bên trong Abstract class, mà sẽ được override và thực thi lại bên trong các Concrete class.

#### Cài đặt Template Method

![Template method](/assets/template.png)

- Để cài đặt Template method đầu tiên ta cần một lớp abstract định nghĩa một khung các bước thực hiện để giải quyết một bài toán (Operation1(), Operation2(), ...) và một phương thức dùng để quy định thứ tự thực hiện của các phương thức đó (templateMethod()). 
- Các phương thức abstract sẽ được các subclass cung cấp việc triển khai các hành động. 
- Các phương thức được định nghĩa trực tiếp trong lớp abstract được khai báo là final để các lớp con không thể override lên nó. Nó có thể được sử dụng trực tiếp trong template method hoặc được sử dụng bởi các lớp con.
- Các Concrete class sẽ phải kế thừa lớp abstract định nghĩa lại các phương thức abstract để phù hợp với yêu cầu của subclass đó. 
- Ngoài ra, lớp cha cũng có thể có các hook được cung cấp một cài đặc mặc định hoặc rỗng. Điều này mang lại cho các lớp con khả năng móc nối vào thuật toán tại các điểm khác nhau. Lớp con có thể bỏ qua hook nếu chúng muốn.

#### Lý do áp dụng Template Method

- Trong một cửa hàng bán thức ăn nhanh, khi nhân viên nhận yêu cầu gọi món của khách hàng, cần phải nhập vào hệ thống và hệ thống sẽ trả lại giá tiền kèm với một quy trình thao tác chuẩn (Standard operating procedure - SOP) thực hiện món ăn đó. Với một cửa hàng có nhiều món ăn như trong dự án này, việc định nghĩa các SOP sẽ tốn khá nhiều thời gian.
- Tuy nhiên, vẫn có cách giải quyết đó là ta có thể hiện thực định nghĩa các tiến trình ở ngay trong object sản phẩm đó. Với mỗi sản phẩm sẽ ứng với một SOP khác nhau và chúng không có mối liên hệ gì với nhau. 
- Cách giải quyết trên tuy có thể giải quyết được vấn đề nhưng vẫn có mặt chưa tối ưu. Nếu như giữa các bước trong quy trình có những bước trùng nhau, thì dự án sẽ bị lặp code khá nhiều. Hơn nữa, giải pháp này cũng không tối ưu cho việc mở rộng dự án, vì khi thêm một món mới vào menu mà có cách chuẩn bị gần giống với những món trước đó nhưng vẫn phải định nghĩa lại từ đầu gây tốn rất nhiều thời gian và công sức.

#### Ứng dụng Template Method
- Vì những vấn đề nêu trên nhóm em quyết định áp dụng Template method vào dự án này nhằm tổ chức lại các quy trình thực hiện của từng món ăn.
- Ví dụ về lớp HotBeverage được khởi tạo là một abstract class

```cs
public abstract class HotBeverage implements Beverage {

	public abstract double cost();
    public abstract String getDescription();

	//template method
    @Override
    public void prepareBeverage(){
        boilWater();
        brew();
        poutInCup();

        if(customerWantsCondiment() == true){
            addCondiment();
        }
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public abstract void brew();

    public void poutInCup(){
        System.out.println("Pouring in cup");
    }

	public abstract void addCondiment();

	public abstract boolean customerWantsCondiment();

}
```

- Lớp HotBeverage có rất nhiều đồ uống và từng loại sẽ có cách pha khác nhau. Vì vậy ta có phương thức brew() sẽ được cung cấp việc triển khai các hành động bởi các lớp con của nó. Đầu tiên ta cần khởi tạo lớp abstract HotBeverage cùng với việc áp dụng hook customerWantsCondiment() để kiểm tra liệu khách hàng có muốn dùng thêm các nguyên liệu đi kèm không.

`public abstract void brew();`

- Phương thức `brew()` được để là abstract để các lớp con có thể override lại
- Các lớp con của HotBeverage sẽ override lại phương thức brew() phù hợp với đồ uống đó. Như ví dụ ở đây là Black Coffee.

```cs
@Override
    public void brew(){
        System.out.println("Dripping coffee through filter");
    }
```

- Và đây là kết quả quy trình thao tác chuẩn khi phụ vụ một tách black coffee.

```cs
   Boiling water
   Dripping coffee through filter
   Pouring in cup
   Would you like extra coffee --- 1.5$  (y/n)
   n
   Black Coffee cost is --> 4.5
```

### Factory Method Pattern

#### Giới thiệu về Factory Method Pattern

>''Factory Method is a creational design pattern that Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses

Factory Method Design Pattern hay gọi ngắn gọn là Factory Pattern là một trong những Pattern thuộc nhóm Creational Design Pattern. Nhiệm vụ của Factory Pattern là quản lý và trả về các đối tượng theo yêu cầu, giúp cho việc khởi tạo đổi tượng một cách linh hoạt hơn.

#### Cài đặt Factory Method
![Factory method](/assets/factory.png)
- Để cài đặt Factory method đầu tiên ta cần một super class (trong sơ đồ là Product). Class này có thể là một interface hoặc abstract class thể hiện tính chất chung cho tất cả các đối tượng được tạo ra bởi Factory class và lớp con của nó.
- Sub class hay có thể gọi là Concrete class là những sự hiện thực khác nhau của super class. Các lớp này sẽ implement các phương thức của super class theo nghiệp vụ riêng của nó
- Factory class (trong sơ đồ gọi là Creator): là class chịu trách nhiệm khởi tạo các đối tượng sub class dựa theo tham số đầu vào. Lớp này có thể là một Singleton hoặc cung cấp một public static method cho việc truy nhập và khởi tạo đối tượng. Class này thường sử dụng các câu lệnh điều kiện như if – else hoặc switch – case để xác định class con đầu ra.

#### Lý do áp dụng Factory Method Pattern
- Khi chạy hệ thống gọi thức ăn của một cửa hàng sẽ có rất nhiều đối tượng món ăn trong menu nhưng khi khởi chạy nếu chưa có yêu cầu của khách hàng thì ta sẽ vẫn chưa biết đối tượng sản phẩm nào cần phải được tạo ra. Ngoài ra chương trình còn phải đảm bảo tính năng mở rộng vì nhà hàng luôn cập nhật các món mới vào thực đơn. 
- Và vì sẽ có rất nhiều đối tượng bên trong menu của nhà hàng nên cứ mỗi đối tượng sản phẩm được thêm vào thực đơn ta sẽ lại phải mở code ra và thêm hoặc xóa ở đoạn này. Có thể thấy cách này vẫn có thể giải quyết được vấn đề nhưng như ta đã được biết thì việc sử dụng toán tử new để tạo ra đối tượng là ta đang tạo ra một object của lớp con do đó ta đang “programming to implements” và việc phụ thuộc việc khởi tạo vào một lớp cấp thấp có thể khá cứng nhắc và kém linh hoạt.
- Ngoài ra, một vấn đề lớn trong việc mở rộng của cách lập trình như thế này là phần lớn code của ta đều có sự phụ thuộc nhất định với class “Doner”. Nếu ta thêm mới một loại thức ăn khác ví dụ như trong project là class Meatball, bắt buộc phải thay đổi hầu như toàn bộ code đã có trước đó.

#### Ứng dụng Pattern
```cs
public interface BeverageFactory {
    public Beverage makeBeverage(String beverageType);
}
```
```cs
public class ColdBeverageFactory implements BeverageFactory {
    @Override
    public Beverage makeBeverage(String beverageType){
        switch(beverageType){
            case "cola":
                return new Cola();
            case "fanta":
                return new Fanta();
            case "fuseTea":
                return new FuseTea();
            case "lemonade":
                return new Lemonade();
            case "sprite":
                return new Sprite();
            case "water":
                return new Water();
            case "orangeJuice":
                return new OrangeJuice();
            default:
                return null;
        }
    }    
}
```
```cs
public class HotBeverageFactory implements BeverageFactory{
    @Override
    public Beverage makeBeverage (String beverageType){
        switch (beverageType){
            case "black":
                return new BlackCoffee();
            case "cappucino":
                return new Cappuccino();
            case "espresso":
                return new Espresso();
            case "hotchocolate":
                return new HotChocolate();
            case "latte":
                return new Latte();
            case "mocha":
                return new Mocha();
            case "nescafe":
                return new Nescafe();
            case "tea":
                return new Tea();
            default:
                return null;
        }
    }
    
}
```
### Command Pattern
#### Giới thiệu về Command Pattern
>''Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

Command Pattern là một trong những Pattern thuộc nhóm hành vi (Behavior Pattern). Nó cho phép chuyển yêu cầu thành đối tượng độc lập, có thể được sử dụng để tham số hóa các đối tượng với các yêu cầu khác nhau như log, queue (undo/redo), transtraction.

#### Cài đặt Command Pattern
![Command](/assets/command.png)
Các thành phần cơ bản tham gia trong Command Pattern:
- Command : là một interface hoặc abstract class, chứa một phương thức trừu tượng thực thi (execute) một hành động (operation). Request sẽ được đóng gói dưới dạng Command.
- ConcreteCommand : là các implementation của Command. Định nghĩa một sự gắn kết giữa một đối tượng Receiver và một hành động. Thực thi execute() bằng việc gọi operation đang hoãn trên Receiver. Mỗi một ConcreteCommand sẽ phục vụ cho một case request riêng.
- Client : tiếp nhận request từ phía người dùng, đóng gói request thành ConcreteCommand thích hợp và thiết lập receiver của nó.
- Invoker : tiếp nhận ConcreteCommand từ Client và gọi execute() của ConcreteCommand để thực thi request.
- Receiver : đây là thành phần thực sự xử lý business logic cho case request. Trong phương execute() của ConcreteCommand chúng ta sẽ gọi method thích hợp trong Receiver.
Như vậy, Client và Invoker sẽ thực hiện việc tiếp nhận request. Còn việc thực thi request sẽ do Command, ConcreteCommand và Receiver đảm nhận.
#### Lý do áp dụng Command Pattern
- Việc đặt tiến hành đặt các loại đồ ăn, thức uống trong nhà hàng tốn nhiều bước để thực hiện, Command Pattern cho phép lưu các lệnh yêu cầu gọi món trong hàng đợi trong lúc khách hàng có thể gọi các món khác
- Mỗi yêu cầu gọi món của từng loại đồ sẽ được đóng gói trong một đối tượng cụ thể dễ dàng chuyển dữ liệu dưới dạng đối tượng đến các thành phần hệ thống và có thể được cập nhật nếu cần thiết

#### Ứng dụng pattern
Client

Command
```cs
public class Waitress {
    
    Command command;

    public void takeOrder(Command command) {
        this.command = command;
        command.orderUp();
    }
}
```
ConcreteCommand
```cs
public class ColdBeverageOrder implements Command{
    Cook cook;
    String order;
    public ColdBeverageOrder(Cook cook, String order){
        this.cook = cook;
        this.order= order;
    }

    @Override
    public void orderUp() {
        cook.coldBeverageType = order;
        cook.getOrder("coldBeverage");
    }
}
```
Receiver
```cs
public class Cook {
    String hotBeverageType, coldBeverageType, donerType, donerSize, meatballType;
    String[] meatBallSaladList, meatBallAppzetierList, meatBallFriesList, meatballSauceList;

    ArrayList<Beverage> beverageList  = new ArrayList<>();
    ArrayList<Doner> donerList = new ArrayList<>();
    ArrayList<Meatball> meatBallList  = new ArrayList<>();
    double totalCost = 0;

    public void getOrder(String factoryType){
        switch (factoryType){
            case "hotBeverage":
                HotBeverageFactory hotBevFactory = new HotBeverageFactory();
                Beverage orderedHotBeverage = hotBevFactory.makeBeverage(hotBeverageType);
                System.out.println(orderedHotBeverage.getDescription() +" order reveived.\n");
                beverageList.add(orderedHotBeverage);
                break;

            case "coldBeverage":
                ColdBeverageFactory coldBevFactory = new ColdBeverageFactory();
                Beverage orderedColdBeverage = coldBevFactory.makeBeverage(coldBeverageType);
                System.out.println(orderedColdBeverage.getDescription() +" order reveived.\n");
                beverageList.add(orderedColdBeverage);
                break;

            case "doner":
                System.out.println(donerSize + " size " + donerType +" doner order reveived.\n");
                DonerFactory donerFactory = new DonerFactory();
                Doner orderedDoner = donerFactory.makeDoner(donerType);
                orderedDoner = decorate(orderedDoner,donerSize);
                donerList.add(orderedDoner);
                break;

            case "meatball":
                MeatballFactory meatballFactory = new MeatballFactory();
                Meatball orderedMeatball = meatballFactory.makeMeatBall(meatballType);
                orderedMeatball = decorate(orderedMeatball,meatBallSaladList,meatBallAppzetierList,meatBallFriesList,meatballSauceList);
                System.out.println(orderedMeatball.getDescription() + " meatball order reveived.\n");
                meatBallList.add(orderedMeatball);
                break;
        }

    }

    public void cookOrder() {
        for (Beverage beverage:beverageList
        ) {
            beverage.prepareBeverage();
            totalCost += beverage.cost();
            System.out.println(beverage.getDescription() + " cost is --> "+ beverage.cost() +"\n\n");
        }

        for (Doner doner:donerList
        ) {
            doner.prepareDough(doner.getDescription());
            doner.cookDough(doner.getDescription());
            doner.dishUp(doner.getDescription());
            System.out.println(doner.getDescription() + " cost is --> "+ doner.cost()+"\n\n");
            totalCost += doner.cost();
        }

        for (Meatball meatball:meatBallList
        ) {
            meatball.prepareDough(meatball.getDescription());
            meatball.cookDough(meatball.getDescription());
            meatball.dishUp(meatball.getDescription());
            System.out.println(meatball.getDescription() + " cost is --> "+ meatball.cost()+"\n\n");
            totalCost += meatball.cost();
        }

        System.err.println("Total cost is " + totalCost);
    }

    public Doner decorate(Doner doner, String typeDecorator){
        switch (typeDecorator) {
            case "iskender":
                 doner = new Iskender(doner);
                 break;
            case "roll":
                 doner = new Roll(doner);
                 break;
            case "sandwich":
                 doner = new Sandwich(doner);
                 break;
            case "kilogram":
                 doner = new Kilogram(doner);
                 break;
            case "hamburger":
                 doner = new Hamburger(doner);
                 break;
            default:
                break;
        }
        return doner;
    }

    public Meatball decorate(Meatball meatball, String[] meatBallSaladList,String[] meatBallAppzetierList, String[]meatBallFriesList, String[]meatballSauceList){
        for (int i = 0; i < meatBallSaladList.length; i++) {
            switch (meatBallSaladList[i].toLowerCase()) {
                case "coban":
                     meatball = new CobanSalad(meatball);
                     break;
                case "gevurdagi":
                     meatball = new GevurdagiSalad(meatball);
                     break;
                case "mediterrian":
                     meatball = new MediterrianSalad(meatball);
                     break;
                case "onion":
                     meatball = new OnlyOnion(meatball);
                case "pepper":
                     meatball = new OnlyPepper(meatball);
                     break;
                case "tomato":
                     meatball = new OnlyTomato(meatball);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < meatBallAppzetierList.length; i++) {
            switch (meatBallAppzetierList[i].toLowerCase()) {
                case "blarney":
                     meatball = new Blarney(meatball);
                     break;
                case "grind":
                     meatball = new Grind(meatball);
                     break;
                case "peppersalad":
                     meatball = new PepperSalad(meatball);
                     break;
                case "pickle":
                     meatball = new Pickle(meatball);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < meatBallFriesList.length; i++) {
            switch (meatBallFriesList[i].toLowerCase()) {
                case "big":
                     meatball = new BigSize(meatball);
                     break;
                case "mid":
                     meatball = new MidSize(meatball);
                     break;
                case "small":
                     meatball = new SmallSize(meatball);
                     break;
                case "mega":
                     meatball = new MegaSize(meatball);
                     break;
                default:
                    break;

            }
        }

        for (int i = 0; i < meatballSauceList.length; i++) {
            switch (meatballSauceList[i].toLowerCase()) {
                case "barbeque":
                     meatball = new Barbeque(meatball);
                     break;
                case "hotsauce":
                     meatball = new HotSauce(meatball);
                     break;
                case "ketchup":
                     meatball = new Ketchup(meatball);
                     break;
                case "mayonnaise":
                     meatball = new Mayonnaise(meatball);
                     break;
                default:
                    break;

            }
        }
        return meatball;
    }

}
```
### Decorator Pattern
#### Giới thiệu về  Decorator Pattern
>''Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

Decorator pattern là một trong những Pattern thuộc nhóm cấu trúc (Structural Pattern). Nó cho phép người dùng thêm chức năng mới vào đối tượng hiện tại mà không muốn ảnh hưởng đến các đối tượng khác. Kiểu thiết kế này có cấu trúc hoạt động như một lớp bao bọc (wrap) cho lớp hiện có. Mỗi khi cần thêm tính năng mới, đối tượng hiện có được wrap trong một đối tượng mới (decorator class).

#### Cài đặt Decorator Pattern
![Decorator](/assets/decorator.png)
Những thành phần trong mẫu thiết kế Decorator:
- Component: giao diện (interface) chung để các đối tượng cần thêm chức năng trong quá trình chạy thì triển khai giao diện này.
- ConcreteComponent : Một cài đặt cho giao diện Component mà nó định nghĩa một đối tượng cần thêm các chức năng trong quá trình chạy.
- Decorator : một lớp trừu tượng dùng để duy trì một tham chiếu của đối tượng thành phần và đồng thời cài đặt các thành phần của giao diện.
- ConcreteDecorator : Một cài đặt của Decorator, nó cài đặt thêm các thành phần vào đầu của các đối tượng thành phần.

#### Lý do áp dụng Decorator Pattern

- Vấn đề gặp phải là trong quá trình đặt các loại đồ ăn, ở mỗi loại đồ ăn có nhiều loại đồ kèm theo, mỗi loại lại có nhiều loại, dẫn đến có rất nhiều trường hợp có thể xảy ra, việc sử dụng phương pháp kế thừa rồi thêm vào các thuộc tính mới không thể bao quát được toàn bộ, Decorator cho phép các thuộc tính có thể được bọc vào đối tượng, tăng khả năng mở rộng hơn của đối tượng.
- Một đối tượng được áp dụng Decorator có thể được bọc bởi nhiều loại thuộc tính khác nhau.
#### Ứng dụng pattern
Component
```cs
public abstract class Doner {
    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareDough(String type) {
        System.out.println("Preparing "+ type + " Doner ");
    }

    public void cookDough(String type) {
        System.out.println("Cooking " + type + " Doner ");
    }

    public void dishUp(String type) {
        System.out.println("Put " + type + " Doner  on the dish");
    }
}
```
Decorator
```cs
public abstract class TypeDecorator extends Doner{
    public abstract String getDescription();
}
```

ConcreteDecorator 
```cs
public class Hamburger extends TypeDecorator {
    Doner doner;

    public Hamburger(Doner doner) {
        this.doner = doner;
    }

    @Override
    public double cost() {
        return doner.cost() * 2.0;
    }

    @Override
    public String getDescription() {
        return doner.getDescription() + ", Hamburger Type ";
    }
}
```
# 5. Tài liệu tham khảo

https://gpcoder.com/4810-huong-dan-java-design-pattern-template-method/

https://gpcoder.com/4574-huong-dan-java-design-pattern-decorator/

https://gpcoder.com/4365-huong-dan-java-design-pattern-abstract-factory/

https://gpcoder.com/4686-huong-dan-java-design-pattern-command/

https://toihocdesignpattern.com/

https://github.com/Scankiran/UstaDonerciDesignPattern?fbclid=IwAR0gToYtdGoni6ME5lOVNsFVfybulFYn5njm2GK_9tlq2csPmvk7flocUUc