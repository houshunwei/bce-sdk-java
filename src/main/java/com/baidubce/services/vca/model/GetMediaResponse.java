/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.vca.model;

import com.baidubce.model.AbstractBceResponse;

import java.util.List;

/**
 * Vcr get media check result response.
 *
 * @author houshunwei
 */
public class GetMediaResponse extends AbstractBceResponse {

    private String mediaId;
    private String status;
    private Integer durationInSecond;
    private String createTime;

    private String publishTime;
    private List<TagsResult> results;
    private VcaError error;

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<TagsResult> getResults() {
        return results;
    }

    public void setResults(List<TagsResult> results) {
        this.results = results;
    }

    public VcaError getError() {
        return error;
    }

    public void setError(VcaError error) {
        this.error = error;
    }

    public void setDurationInSecond(Integer durationInSecond) {
        this.durationInSecond = durationInSecond;
    }

    public Integer getDurationInSecond() {
        return this.durationInSecond;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getPublishTime() {
        return this.getPublishTime();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMediaResponse{");
        sb.append("mediaId='").append(mediaId).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", durationInSecond=").append(durationInSecond);
        sb.append(", createTime='").append(createTime).append('\'');
        sb.append(", publishTime='").append(publishTime).append('\'');
        sb.append(", results=").append(results);
        sb.append(", error=").append(error);
        sb.append('}');
        return sb.toString();
    }
}
