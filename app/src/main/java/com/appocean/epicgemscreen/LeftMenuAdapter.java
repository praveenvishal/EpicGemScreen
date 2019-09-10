package com.appocean.epicgemscreen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LeftMenuAdapter extends RecyclerView.Adapter<LeftMenuAdapter.ExhibitLeftMenu> {
    private final Context context;
    private List<ExhibitItem> items;
    private int sSelected = -1;

    public LeftMenuAdapter(List<ExhibitItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public ExhibitLeftMenu onCreateViewHolder(ViewGroup parent,
                                              int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_exihibit, parent, false);
        return new ExhibitLeftMenu(v);
    }

    @Override
    public void onBindViewHolder(ExhibitLeftMenu holder, int position) {
        ExhibitItem item = items.get(position);
        holder.set(item);
    }

    @Override
    public int getItemCount() {
        if (items == null) {
            return 0;
        }
        return items.size();
    }

    public class ExhibitLeftMenu extends RecyclerView.ViewHolder {

        public ExhibitLeftMenu(View itemView) {
            super(itemView);
        }

        public void set(ExhibitItem item) {
            //UI setting code
        }
    }
}