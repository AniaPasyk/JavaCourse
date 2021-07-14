// struktury pozwalające gromadzić większa ilość danych

public class Tablice {
    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Ania";
        imiona[1] = "Przemek";
        imiona[2] = "Chrupek";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        int[] lottoNumbers = new int[]{1,2,3,4,5,6};
       /* System.out.println(lottoNumbers[4]);
        System.out.println(lottoNumbers[2]);

        System.out.println(lottoNumbers.length); */

        for(int i = 0; i<lottoNumbers.length; i++){
            System.out.println(lottoNumbers[i]);
        }

    }
}

