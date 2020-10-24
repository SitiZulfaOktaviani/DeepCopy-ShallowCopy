public class ShallowCopyMain {
    public static void main(String[] args) {
        Producs p1 = new Producs(2, "Rice Cooker", 1000);
        System.out.println("Original: " + "id:"+ p1.getId_produk()+ " nama:"+ p1.getNama_produk()+ " berat:"+ p1.getBerat());

        Producs p2 = (Producs) p1.clone();
        p2.setNama_produk("panci");
        System.out.println("Hasil Clone: " + "id:"+ p2.getId_produk()+ " nama:"+ p2.getNama_produk()+ " berat:"+ p2.getBerat());
    }
}
