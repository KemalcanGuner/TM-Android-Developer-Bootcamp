package com.example.hw6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw6.databinding.PostLayoutBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class PostsAdapter extends RecyclerView.Adapter<PostsAdapter.VHolder>{
    private Context mContext;
    private List<Posts> postsList;

    public PostsAdapter(Context mContext, List<Posts> postsList) {
        this.mContext = mContext;
        this.postsList = postsList;
    }

    @NonNull
    @Override
    public VHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PostLayoutBinding binding =
                PostLayoutBinding.inflate
                        (LayoutInflater.from(mContext)
                                ,parent,false);

        return new VHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull VHolder holder, int position) {
        Posts post = postsList.get(position);
        PostLayoutBinding b = holder.binding;
        b.imagePost.setImageResource(mContext.getResources()
                .getIdentifier(post.getImgName()
                        , "drawable"
                        , mContext.getPackageName()));
        b.textSubreddit.setText(post.getSubReddit());
        b.textTitle.setText(post.getTitle());
        b.textUpvote.setText(post.getUpvote());
        b.upvote.setOnClickListener(view -> {
            DrawableCompat.setTint(b.upvote.getDrawable(), ContextCompat.getColor(mContext, R.color.purple_200));
        });
        b.downvote.setOnClickListener(view -> {
            DrawableCompat.setTint(b.downvote.getDrawable(), ContextCompat.getColor(mContext,R.color.teal_700));
        });
        b.cardViewPost.setOnClickListener(view -> {
            Intent intent = new Intent(mContext, FullScreenActivity.class);
            intent.putExtra("nesne",post);
            mContext.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return postsList.size();
    }

    public class VHolder extends RecyclerView.ViewHolder {
        private PostLayoutBinding binding;
        public VHolder(PostLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }


}
