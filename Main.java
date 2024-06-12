public class Main{
    public static void main(String[] args){
        // Burada class türünde bir dizi oluşturduk ve içine classlar tanımladık.
        BaseCreditManager[] krediManagers = new BaseCreditManager[]{new OgretmenKrediManager(), new TarimKrediManager(),new OgrenciKrediManager()};
        for (BaseCreditManager krediManager : krediManagers) {
            System.out.println(krediManager.hesapla(1000));
        }
    }
}