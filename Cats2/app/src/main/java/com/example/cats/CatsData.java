package com.example.cats;

import java.util.ArrayList;

public class CatsData {
    private static String[] catNames = {
            "1. British Short Hair",
            "2. Persia",
            "3. Anggora",
            "4. Siam",
            "5. Ragdoll",
            "6. Maine Coon",
            "7. Sphynx",
            "8. Russian",
            "9. Sabana",
            "10. Manx",
            "11. Domestik"
    };

    private static String[] catDetails = {
            "Kucing bulu pendek britania adalah salah satu ras kucing tertua yang nenek moyang dipercayai memiliki hubungan dengan bangsa Romawi yang pernah dahulu menguasai Inggris. Kucing ini adalah kucing berbadan sedang dengan bulu yang pendek. Selain itu, kucing ini juga banyak menjadi ikon",
            "Salah satu jenis kucing peliharaan yang paling terkenal dan banyak dicari adalah kucing Persia. Kucing ini memiliki ciri khas rambut yang panjang, lebat, dan berwajah bulat, serta hidungnya yang pesek.",
            "Banyak orang suka dengan jenis kucing Anggora karena bulunya yang putih seperti salju. Sama seperti namanya, asal kucing ini dari Ankara, Turki.",
            "Kucing Siam atau Siamese ini berasal dari Thailand. Dulu kucing ini mulai dikenal saat kemunculan pertama kali di Eropa, yang pada saat itu diberikan pada Duta Besar Inggris di Thailand pada abad 18.",
            "Kucing Ragdoll berasal dari Amerika Serikat. Dinamakan Ragdoll karena memiliki sifat yang jinak. Ketika kamu mengangkat jenis kucing peliharaan ini tampak lemas dan lunglai, sama seperti sebuah boneka kain.",
            "Selain terkenal, kucing Maine Coon juga menjadi salah satu ras kucing terbesar. Pembawaannya yang sangat ramah cocok menjadi hewan peliharaan di rumah. Kucing jenis ini bisa tinggal dengan jenis kucing lain, bahkan anjing sekalipun.",
            "Kucing Spinx memiliki penampilan fisik yang berbeda dari kucing pada umumnya. Kucing Sphynx merupakan kucing hasil persilangan genetik asal Kanada. Kucing ini cukup mencolok karena kucing berjenis keturunan tanpa bulu.",
            "Kucing Biru Rusia atau Russian Blue merupakan kucing yang banyak digemari karena memiliki bulu pendek berwarna abu-abu kebiruan yang terlihat mengkilap.",
            "Kucing Sabana atau Savana merupakan kucing hasil persilangan dari ras kucing Afrika dengn kucing Bengal, Siam, dan Mesir.",
            "Kucing Manx juga dikenal dengan nama rumpy yang merupakan kucing dengan ekor sangat pendek bakhan tidak ada. Hal ini disebabkan karena kelainan genetik yang bersifat dominan sehingga perkembangbiakannya harus dilakukan hati-hati.",
            "Kucing ini begitu mudah dijumpai di Indonesia, biasanya ras ini hanyalah 1 persen dari seluruh kucing di dunia. Sisanya adalah kucing dengan keturunan campuran seperti kucing liar dan kucing kampung."
    };

    private static int[] catImages = {
            R.drawable.kucing1,
            R.drawable.kucing2,
            R.drawable.kucing3,
            R.drawable.kucing4,
            R.drawable.kucing5,
            R.drawable.kucing6,
            R.drawable.kucing7,
            R.drawable.kucing8,
            R.drawable.kucing9,
            R.drawable.kucing10,
            R.drawable.kucing11
    };

    static ArrayList<Cat> getListData(){
        ArrayList<Cat> list = new ArrayList<>();
        for (int position = 0; position < catNames.length; position++) {
            Cat cat = new Cat();
            cat.setName(catNames[position]);
            cat.setDetail(catDetails[position]);
            cat.setPhoto(catImages[position]);
            list.add(cat);
        }
        return list;
    }
}
