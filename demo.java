package work;

public class demo {
    public static void main(String[] args) {
        //下面这段用一下toString输出信息，证明我写了toString（虽然没用上，，，，
        OrangeCat c1 = new OrangeCat("aa", 1, true);
        System.out.println(c1);
        Customer customer = new Customer("chenzhen", 2, 2021, 12, 1);
        System.out.println(customer);
        System.out.println("--------------------------------------------------");

        //建猫咖
        MyCatCafe cafe = new MyCatCafe(1000);

//buycat买入猫猫，serve招待顾客，xieye就是歇业，name名字，rua是rua的次数，kind是猫的种类
        cafe.buycat("cc", 3, "BlackCat");
        cafe.buycat("dd", 2, "OrangeCat");
        cafe.serve("tom", 5, 12, 2);
        cafe.serve("jerry", 3, 12, 2);
        cafe.xieye("12", "2");

//歇业上的时间和招待顾客不是同一天而出现错误（所以每天结束都必须歇业），猫咖状态(钱、猫）会还原到前一次歇业
        cafe.buycat("ee", 2, "OrangeCat");
        cafe.serve("JOJO", 5, 12, 3);
        cafe.serve("DIO", 3, 12, 3);
        cafe.xieye("11", "4");

//前面的错误对后面不会有影响
        cafe.buycat("ff", 2, "OrangeCat");
        cafe.serve("limin", 1, 12, 4);
        cafe.serve("lihua", 2, 12, 4);
        cafe.xieye("12", "4");

//如果日期写的有问题（如13月32日），会报错
        cafe.buycat("hh", 2, "OrangeCat");
        cafe.serve("****", 1, 13, 32);
        cafe.serve("***", 2, 12, 4);
        cafe.xieye("12", "4");
    }
}

/*没钱买猫和店里没猫都分别会报错，可以把下面两个例子加到日期报错的前面进行检验
没钱
cafe.buycat("hh", 3, "BlackCat");
cafe.buycat("hh", 3, "BlackCat");
没猫
cafe.cat.clear();
cafe.serve("ww",1,1,1)；
 */

//不知道写得符不符合题意啊，，，有些程序写的方法思路感觉不太好，，，，应该有简洁很多的方法吧，，，，然后一些东西还没理解到位感觉，，，但应该没bug吧？菜鸟尽力了