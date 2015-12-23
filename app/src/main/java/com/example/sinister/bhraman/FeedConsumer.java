package com.example.sinister.bhraman;

import com.example.sinister.bhraman.rss.model.Feed;

public interface FeedConsumer {
    void setFeed(Feed feed);

    void handleError(String message);
}
