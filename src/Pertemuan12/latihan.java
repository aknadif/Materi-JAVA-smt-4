package Pertemuan12;

class Member {
    int hari, total;

    double diskon(int hari) {
        System.out.println("Anda Bukan Pengguna MEMBER");
        System.out.println("Sewa mobil selama " + hari + " hari.");
        System.out.println("Anda Tidak mendapatkan diskon");
        total = (hari * 1000000);
        return total;
    }

}

class Platinum extends Member {
    int hari, total;

    double diskon(int hari) {
        System.out.println("Anda Pengguna Member PLATINUM");
        System.out.println("Sewa mobil selama " + hari + " hari.");
        System.out.println("Anda mendapatkan diskon sebesar 15 %");
        total = (hari * 1000000) - (hari * 1000000 * 15 / 100);
        return total;
    }
}

class Gold extends Member {
    int hari, total;

    double diskon(int hari) {
        System.out.println("Anda Pengguna Member GOLD");
        System.out.println("Sewa mobil selama " + hari + " hari.");
        System.out.println("Anda mendapatkan diskon sebesar 10 %");
        total = (hari * 1000000) - (hari * 1000000 * 10 / 100);
        return total;
    }
}

class Silver extends Member {
    int hari, total;

    double diskon(int hari) {
        System.out.println("Anda Pengguna Member SILVER");
        System.out.println("Sewa mobil selama " + hari + " hari.");
        System.out.println("Anda mendapatkan diskon sebesar 5 %");
        total = (hari * 1000000) - (hari * 1000000 * 5 / 100);
        return total;
    }
}

public class latihan {

    public static void main(String[] args) {
        Member sewa0 = new Member();
        Platinum sewa1 = new Platinum();
        Gold sewa2 = new Gold();
        Silver sewa3 = new Silver();
        System.out.println();
        System.out.println("========================================");
        System.out.println("====== Bukan Pengguna Member ===========");
        System.out.println("========================================");
        System.out.println("Total yang harus anda bayar adalah Rp." + sewa0.diskon(5));
        System.out.println();
        System.out.println("========================================");
        System.out.println("====== Pengguna Member PLATINUM ========");
        System.out.println("========================================");
        System.out.println("Total yang harus dibayar pakai Member Platinum adalah Rp." + sewa1.diskon(5));
        System.out.println();
        System.out.println("========================================");
        System.out.println("====== Pengguna Member GOLD ============");
        System.out.println("========================================");
        System.out.println("Total yang harus dibayar pakai Member Gold adalah Rp." + sewa2.diskon(5));
        System.out.println();
        System.out.println("========================================");
        System.out.println("====== Pengguna Member SILVER ==========");
        System.out.println("========================================");
        System.out.println("Total yang harus dibayar pakai Member Silver adalah Rp." + sewa3.diskon(5));

    }
}