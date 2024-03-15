public class PersegiPanjang extends BangunDatar{
    
    PersegiPanjang(int p, int l) {
        super(p, l);
        //TODO Auto-generated constructor stub
    }

    int hitungluas(){
        int p = super.getP();
        int l = super.getL();
        return p * l;
    }

    int hitungKeliling(){
        int p = super.getP();
        int l = super.getL();
        return 2 * (p + l);
    }

    public String toString(){
        return "Luas persegi panjag" + hitungluas() + "\n" +
            "Keliling persegi panjang : " + hitungKeliling();
    }

        
    }
    
    

