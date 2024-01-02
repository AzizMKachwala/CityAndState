package com.example.cityandstate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StateAdapter extends RecyclerView.Adapter<StateAdapter.StateViewHolder> {
    List<StateItem> stateList;

    public StateAdapter(List<StateItem> stateList) {
        this.stateList = stateList;
    }

    @NonNull
    @Override
    public StateViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.state_item, parent, false);
        return new StateViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull StateViewHolder holder, int position) {
        StateItem stateItem = stateList.get(position);
        holder.stateNameTextView.setText(stateItem.getStateName());
        holder.cityRecyclerView.setAdapter(new CityAdapter(stateItem.getCities()));
    }

    @Override
    public int getItemCount() {
        return stateList.size();
    }

    public class StateViewHolder extends RecyclerView.ViewHolder {
        TextView stateNameTextView;
        RecyclerView cityRecyclerView;

        public StateViewHolder(@NonNull View itemView) {
            super(itemView);
            stateNameTextView = itemView.findViewById(R.id.stateNameTextView);
            cityRecyclerView = itemView.findViewById(R.id.cityRecyclerView);
            cityRecyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext()));
        }
    }
}
