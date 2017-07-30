/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.vca.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;

/**
 * Put media request.
 *
 * @author houshunwei
 */
public class PutMediaRequest extends AbstractBceRequest {

    private String mediaId;

    @Override
    public PutMediaRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }

    public PutMediaRequest withMediaId(String mediaId) {
        this.setMediaId(mediaId);
        return this;
    }


    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PutMediaRequest{");
        sb.append("mediaId='").append(mediaId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
