package tekrar;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<MutableUserKey, String> map = new HashMap<>();

        // --- PROBLEM 1: hashCode Override Olunmadıqda ---
        MutableUserKey key1 = new MutableUserKey(1, "Ali");
        map.put(key1, "Senior Developer");

        // Eyni id və name-ə malik YENİ obyekt yaradırıq
        MutableUserKey key2 = new MutableUserKey(1, "Ali");

        System.out.println("1. Axtarış (key2 ilə): " + map.get(key2));
        // ÇIXIŞ: null (Çünki RAM-dakı ünvanları fərqlidir, fərqli bucket-ə baxır)


        // --- PROBLEM 2: Key Mutable (Dəyişdirilə bilən) Olduqda ---
        System.out.println("2. Axtarış (key1 özü ilə): " + map.get(key1));
        // ÇIXIŞ: Senior Developer (Tapıldı, çünki eyni obyektin ünvanıdır)



        System.out.println("3. Dəyişiklikdən sonra (key1 özü ilə): " + map.get(key1));
        // ÇIXIŞ: null !
        // Əsas təhlükə buradadır: Obyekt Map-in içindədir, ama adı dəyişdiyi üçün tapılmır!
    }
}
