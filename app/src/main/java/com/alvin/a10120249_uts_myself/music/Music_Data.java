/*
 *     Tanggal Pengerjaan : 15/05/2023
 *     Nim : 10120249
 *     Nama : Stanislaus Katska Alvin Parulian Sitanggang
 *     Kelas : IF-6
 */
package com.alvin.a10120249_uts_myself.music;

import java.util.ArrayList;

public class Music_Data {
    private static String[] data_musik = {
            "Mahalini - Kisah Sempurna",
            "Cakra Khan - Kepada Hati",
            "Alan Walker - Faded",
            "The Chainsmokers - All We Know",
            "Martin Garrix - Animals",
            "Charlie Puth - One Call Away",
            "Mahalini - Buru-buru",
            "New Jeans - Ditto",
            "Black Pink - Venom"
    };

    public static ArrayList<Music_Item> getListData() {
        ArrayList<Music_Item> list = new ArrayList<>();
        for (int position = 0; position <data_musik.length; position++) {
            Music_Item mi = new Music_Item();
            mi.setMusicList(data_musik[position]);
            list.add(mi);
        }
        return list;
    }
}
