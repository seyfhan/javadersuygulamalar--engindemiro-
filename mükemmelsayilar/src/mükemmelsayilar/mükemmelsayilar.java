package mükemmelsayilar;

public class mükemmelsayilar {

	public static void main(String[] args) {
		
		int sayi = 28;
		int kalan;
		int[] sayılar=new int[100];
		int toplam=0;
			
			for (int i = 0; i < sayi; i++) {
				kalan = sayi%(i+1);
				if(kalan==0) {
				sayılar[i]=i+1;
				toplam = sayılar[i] + toplam;
				
			}}
			
	
			
			if(toplam==2*sayi) {
				System.out.println("sayınız mükemmel bir sayı");
			}else {
				System.out.println("sayınız mükemmel bir sayı değildir.");
			}
			System.out.println("bölenler toplamı:  " + toplam);
			
		
		
		
		
		
		
		
		

	}

}
