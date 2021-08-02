public class AppChecker {
    public static void main(String[] args){
        AndroidApp android = new AndroidApp("Samsung");
        android.runAndroidApp();
        android.appInfo();

        IphoneApp iphone = new IphoneApp("Iphone 6s");
        iphone.runIphoneApp();
        iphone.appInfo();


    }
}
