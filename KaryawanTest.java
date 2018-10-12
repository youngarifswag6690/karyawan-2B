public class KaryawanTest{
	public static void main(String[] args) {
	System.out.println("  ");
	System.out.println("Jabatan Project Manager");
	Pm p = new Pm();
	p.setNama("Yonglex");
	p.setAlamat("Kalimantan");
	p.setGaji(60);
	System.out.println(" ");

	System.out.println("Jabatan Programer");
	Program pr = new Program();
	pr.setNama("Awkarin");
	p.setAlamat("Tugu");
	p.setGaji(85);
	System.out.println(" ");

	System.out.println("Jabatan Desainer");
	Desain d = new Desain();
	d.setNama("Raja Arap");
	d.setAlamat("Bangkir");
	d.setGaji(50);
	}
}