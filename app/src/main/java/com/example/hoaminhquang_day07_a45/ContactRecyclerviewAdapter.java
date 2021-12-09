package com.example.hoaminhquang_day07_a45;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactRecyclerviewAdapter extends RecyclerView.Adapter<ContactRecyclerviewAdapter.Viewoder> {
    List<ContactDemo> contactDemoList;

    public ContactRecyclerviewAdapter(List<ContactDemo> contactDemoList) {
        this.contactDemoList = contactDemoList;
    }



    @NonNull
    @Override
    public ContactRecyclerviewAdapter.Viewoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.icon_recyclerview,parent,false);

        Viewoder viewoder = new Viewoder(view);

        return viewoder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactRecyclerviewAdapter.Viewoder holder, int position) {
        ContactDemo contactDemo = contactDemoList.get(position);

        holder.tvName.setText(contactDemo.getName());

        holder.tvPrice.setText(String.valueOf(contactDemo.getPrice()));
    }

    @Override
    public int getItemCount() {
        return contactDemoList.size();
    }

    public class Viewoder extends RecyclerView.ViewHolder {
        TextView tvName,tvPrice;
        public Viewoder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
        }
    }
}
