import java.util.Scanner;

public class UTS_NO_3 { 
    public static void main(String[] args) {
    int a=0;
    int s=0;
    int u=0;
    int r=0;
    Scanner mau=new Scanner(System.in);
    String[]bot=new String[5];
    String[]top=new String[90];
    String[]mid=new String[30];
    String[]low=new  String[15];
    String bundir="y";
    System.out.println("ABSEN");
    System.out.println("TUR KARYAWAN KFC CINDE - TEGAL");
    while (bundir.equals("Y")||bundir.equals("y")){
        System.out.println("MASUKAN NIK paling depan tiga=");
        String ok=mau.nextLine();
        if (ok.equals("C01")) {
            System.out.println("MASUKAN NIK LENGKAP =");
            String silahkan=mau.nextLine();
            top[a]= silahkan;
            System.out.println("ANDA MASUK KE BUS KELAS ATAS");
            a++;
        }else if (ok.equals("J02")) {
            System.out.println("MASUKAN NIK LENGKAP =");
            String silahkan=mau.nextLine();
            mid[s]= silahkan;
            System.out.println("ANDA MASUK KE BUS KELAS MENENGAH");
            s++;

        } else if (ok.equals("N03")) {
            System.out.println("MASUKAN NIK LENGKAP =");
            String silahkan=mau.nextLine();
            low[u]= silahkan;
            System.out.println("ANDA MASUK KE BUS KELAS BAWAH");
            u++;
        } else if (ok.equals("P04")) {
            System.out.println("MASUKAN NIK LENGKAP =");
            String silahkan=mau.nextLine();
            bot[r]=silahkan;
            System.out.println("ANDA MASUK KE BUS KELAS PALING BAWAH");
            r++;
        }
        System.out.println("APAKAH ANDA INGIN MENGABSEN LAGI Y/T");
        bundir=mau.nextLine();
    }
    System.out.println("JUMLAH KARYAWAN YANG SUDAH HADIR "+(a+u+s+r)+" ORANG" );
    System.out.println("DAFTAR KARYAWAN YANG SUDAH ABSEN UNTUK BUS KELAS ATAS");
    nggak(top);
        System.out.println("TOTAL KARYAWAN"+a+" ORANG");
    System.out.println("DAFTAR KARYAWAN YANG SUDAH ABSEN UNTUK BUS KELAS MENENGAH");
    ada(mid);
        System.out.println("TOTAL KARYAWAN"+s+" ORANG");
    System.out.println("DAFTAR KARYAWAN YANG SUDAH ABSEN UNTUK BUS KELAS MENENGAH");
    yang(low);
        System.out.println("TOTAL KARYAWAN"+u+" ORANG");
    System.out.println("DAFTAR KARYAWAN YANG SUDAH ABSEN UNTUK BUS KELAS BAWAH");
    peduli(bot);
        System.out.println("TOTAL KARYAWAN"+r+" ORANG");
}static void nggak(String[]top){
    for (int q=0;q< top.length;q++){
        System.out.println(top[q]);
    }


}static void ada(String[]mid){
    for (int w=0;w< mid.length;w++){
        System.out.println(mid[w]);
    }

}static void yang(String[]low){
    for (int e=0;e< low.length;e++){
        System.out.println(low[e]);
    }
}static void  peduli(String[]bot){
    for (int t=0;t< bot.length;t++){
        System.out.println(bot[t]);
    }
}
}

