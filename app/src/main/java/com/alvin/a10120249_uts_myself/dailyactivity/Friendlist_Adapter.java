/*
 *     Tanggal Pengerjaan : 15/05/2023
 *     Nim : 10120249
 *     Nama : Stanislaus Katska Alvin Parulian Sitanggang
 *     Kelas : IF-6
 */
package com.alvin.a10120249_uts_myself.dailyactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.alvin.a10120249_uts_myself.R;

import java.util.ArrayList;

public class Friendlist_Adapter extends RecyclerView.Adapter<Friendlist_Adapter.ListViewHolder> {

    private ArrayList<Friends> friendsList;

    public Friendlist_Adapter(ArrayList<Friends> list) {this.friendsList = list; }

    @NonNull
    @Override
    public Friendlist_Adapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.friendlist_item, parent, false);
        return new Friendlist_Adapter.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Friendlist_Adapter.ListViewHolder holder, int position){
        Friends friends = friendsList.get(position);
        Glide.with(holder.itemView.getContext()).load(friends.getFoto()).apply(new RequestOptions().override(75, 75))
                .into(holder.imgfoto);
        holder.nama.setText(friends.getNama());
        holder.username.setText(friends.getUsername());
    }

    @Override
    public int getItemCount() {return friendsList.size(); }

    class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgfoto;
        TextView nama, username;

        ListViewHolder(View itemview) {
            super(itemview);
            imgfoto = itemview.findViewById(R.id.friend_img);
            nama = itemview.findViewById(R.id.friend_name);
            username = itemview.findViewById(R.id.friend_username);
        }
    }
}