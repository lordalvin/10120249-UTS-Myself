/*
 *     Tanggal Pengerjaan : 15/05/2023
 *     Nim : 10120249
 *     Nama : Stanislaus Katska Alvin Parulian Sitanggang
 *     Kelas : IF-6
 */
package com.alvin.a10120249_uts_myself.dailyactivity;

import com.alvin.a10120249_uts_myself.R;

import java.util.ArrayList;

public class Friends_Data {
    private static String[] data_nama = {"@ehh_ardian", "@fahmiiasdk", "@byazid1507", "@guztiart_", "@azizanzulfikar", "@muhammadhasbiarrasid", "@divaputrar", "@duskrbe", "@itsmeaipp", "@maulana_atapukan", "@falentinusk", "@zahranvidian", "@hilmiy_10", "@deritrioktianaa_", "@daffabs", "@alghfri_bhren", "@ariqfdh", "@dion.cahyan", "@royyands_", "@davidsatia_", "@raihankiswah", "@firzajay", "@_rfsnnn", "@pirgidapa", "@abburizal_chilihyat", "@vieryrafsanjani", "@ilham_rico", "@riskyarrd","@inkarthur", "@martinuscelvyn_s", "@apphhrroditt", "_triramdhan"
    };

    private static int[] data_img = {R.drawable.ardian, R.drawable.fahmi, R.drawable.abyan, R.drawable.agus, R.drawable.zulfikar, R.drawable.hasbi, R.drawable.diva, R.drawable.arby, R.drawable.aipganteng, R.drawable.maulana, R.drawable.falen, R.drawable.zahran, R.drawable.hilmiy, R.drawable.deri, R.drawable.daffabs, R.drawable.haikal, R.drawable.ariq, R.drawable.dion, R.drawable.royyan, R.drawable.david, R.drawable.raihan, R.drawable.nadief, R.drawable.ghiyats, R.drawable.firgi, R.drawable.acil, R.drawable.viery, R.drawable.rico, R.drawable.risky, R.drawable.nopal, R.drawable.martinus, R.drawable.adit, R.drawable.tri
    };

    public static ArrayList<Friends> getListData(){
        ArrayList<Friends> list = new ArrayList<>();
        for (int position = 0; position<data_nama.length; position++){
            Friends friends = new Friends();
            friends.setNama(data_nama[position]);
            friends.setFoto(data_img[position]);
            list.add(friends);
        }
        return list;
    }
}
