package com.example.guest.bookclub.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.example.guest.bookclub.R;
import com.example.guest.bookclub.models.Message;

import org.parceler.Parcel;
import org.parceler.Parcels;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MessageDetailActivity extends AppCompatActivity {
    private Message mMessage;
    @Bind(R.id.titleTextView) TextView mTitleTextView;
    @Bind(R.id.authorTextView) TextView mAuthorTextView;
    @Bind(R.id.dateTextView) TextView mDateTextView;
    @Bind(R.id.topicTextView) TextView mTopicTextView;
    @Bind(R.id.contentTextView) TextView mContentTextView;
    @Bind(R.id.commentsRecyclerView) RecyclerView mCommentsRecyclerView;
    @Bind(R.id.newCommentButton) Button mNewCommentButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_detail);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        mMessage = Parcels.unwrap(intent.getParcelableExtra("message"));
        mTitleTextView.setText(mMessage.getTitle());
        mAuthorTextView.setText(mMessage.getPoster());
        mDateTextView.setText(mMessage.getDatePosted());
        mTopicTextView.setText(mMessage.getCategory());
        mContentTextView.setText(mMessage.getContent());
    }
}
