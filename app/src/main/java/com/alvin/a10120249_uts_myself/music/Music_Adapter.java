/*
 *     Tanggal Pengerjaan : 15/05/2023
 *     Nim : 10120249
 *     Nama : Stanislaus Katska Alvin Parulian Sitanggang
 *     Kelas : IF-6
 */
package com.alvin.a10120249_uts_myself.music;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.alvin.a10120249_uts_myself.R;

import java.util.ArrayList;

public class Music_Adapter extends RecyclerView.Adapter<Music_Adapter.ListViewHolder> {
    private ArrayList<Music_Item> musicList;

    public Music_Adapter(ArrayList<Music_Item> list) {
        this.musicList = list;
    }

    @NonNull
    @Override
    public Music_Adapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.musiclist_item, parent, false);
        return new Music_Adapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Music_Adapter.ListViewHolder holder, int position) {
        Music_Item music_item = musicList.get(position);
        holder.musiclist.setText(music_item.getMusicList());

    }

    @Override
    public int getItemCount() {
        return musicList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView musiclist;

        ListViewHolder(View itemView) {
            super(itemView);
            musiclist = itemView.findViewById(R.id.musiclist);
        }
    }
}
