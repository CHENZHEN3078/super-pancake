package work;

//接口是这样的吗，感觉写的不对，，，，
public interface CatCafe {
    void buycat(String name, int age, String kind);

    void serve(String name, int rua, int month, int day) throws DateCheckException;

    void xieye(String month, String day);

}
