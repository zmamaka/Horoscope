import java.util.Scanner;

public class horoscope {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ay, gun;

        String str = "Burcunuz => ";

        System.out.print("Doğduğunuz ayı giriniz => ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz günü gürünüz => ");
        gun = input.nextInt();

        if (ay > 0 && gun > 0 && ay < 13) {
            switch (ay) {
                case 1:
                    if (gun <= 31) {
                        if (gun < 22) {
                            System.out.println(str + "Oğlak");
                        } else
                            System.out.println(str + "Kova");
                        break;
                    }

                case 2:
                    if (gun <= 28) {
                        if (gun < 20) {
                            System.out.println(str + "Kova");
                        } else
                            System.out.println(str + "Balık");
                        break;
                    }

                case 3:
                    if (gun <= 31) {
                        if (gun < 21) {
                            System.out.println(str + "Balık");
                        } else
                            System.out.println(str + "Koç");
                        break;
                    }

                case 4:
                    if (gun <= 30) {
                        if (gun < 21) {
                            System.out.println(str + "Koç");
                        } else
                            System.out.println(str + "Boğa");
                        break;
                    }

                case 5:
                    if (gun <= 31) {
                        if (gun < 22) {
                            System.out.println(str + "Boğa");
                        } else
                            System.out.println(str + "İkizler");
                        break;
                    }

                case 6:
                    if (gun <= 30) {
                        if (gun < 23) {
                            System.out.println(str + "İkizler");
                        } else
                            System.out.println(str + "Yengeç");
                        break;
                    }

                case 7:
                    if (gun <= 31) {
                        if (gun < 23) {
                            System.out.println(str + "Yengeç");
                        } else
                            System.out.println(str + "Aslan");
                        break;
                    }

                case 8:
                    if (gun <= 31) {
                        if (gun < 23) {
                            System.out.println(str + "Aslan");
                        } else
                            System.out.println(str + "Başak");
                        break;
                    }

                case 9:
                    if (gun <= 30) {
                        if (gun < 23) {
                            System.out.println(str + "Başak");
                        } else
                            System.out.println(str + "Terazi");
                        break;
                    }

                case 10:
                    if (gun <= 31) {
                        if (gun < 23) {
                            System.out.println(str + "Terazi");
                        } else
                            System.out.println(str + "Akrep");
                        break;
                    }

                case 11:
                    if (gun <= 30)
                    {
                        if (gun < 22) {
                            System.out.println(str + "Akrep");
                        } else
                            System.out.println(str + "Yay");
                        break;
                    }

                case 12:
                    if (gun <= 31){
                        if (gun < 22) {
                            System.out.println(str + "Yay");
                        } else
                            System.out.println(str + "Kova");
                        break;
                    }
            }
        } else {
            System.out.println("Yanlış değer girildi !!!!");
        }

    }
}
