package com.example.recyclerviewdemo.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.recyclerviewdemo.data.Product;
import com.example.recyclerviewdemo.databinding.CellBinding;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private CellBinding binding;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = CellBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // TODO: Add for test
        Product product = new Product();
        product.setName("哇哈哈AD钙奶");
        product.setPrice(2);
        binding.name.setText(product.getName());
        binding.price.setText(product.getPrice() + "¥");
        binding.index.setText(String.valueOf(position + 1));
    }

    @Override
    public int getItemCount() {
        // TODO: Add for test
        return 10;
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        private CellBinding binding;

        public MyViewHolder(@NonNull CellBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
