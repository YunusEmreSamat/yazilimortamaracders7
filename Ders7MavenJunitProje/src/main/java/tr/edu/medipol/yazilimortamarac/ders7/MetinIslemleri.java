package tr.edu.medipol.yazilimortamarac.ders7;

public class MetinIslemleri {

	public static void main(String[] args) {

		String ornek = "Merhaba Arkadaslar";
		String sonuc = MetinIslemleri.buyukHarfeCevir(ornek);
		System.out.println(ornek + "->" + sonuc);

	}
	
	static String buyukHarfeCevir(String orjinalMetin) {
		if(orjinalMetin == null) {
			return orjinalMetin;
		}
		return orjinalMetin.toUpperCase();
	}

}
