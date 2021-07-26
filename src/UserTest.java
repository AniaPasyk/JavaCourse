public class UserTest {

    public static void main(String[] args){

        //User user = new User();
        User user = new User("Ania", "Hello");

     /*   user.username = "Ania";
        user.password = "qazxsw"; */
        System.out.println(user.username);
        System.out.println(user.password);
        user.sayHello();
    }
}
