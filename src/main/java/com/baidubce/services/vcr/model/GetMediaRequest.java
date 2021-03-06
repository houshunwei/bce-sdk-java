/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.vcr.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;

/**
 * Vcr get media check result request.
 *
 * @author dingshenglong
 */
public class GetMediaRequest extends AbstractBceRequest {
    private String mediaId;

    @Override
    public AbstractBceRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
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
        final StringBuilder sb = new StringBuilder("GetMediaRequest{");
        sb.append("mediaId='").append(mediaId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
