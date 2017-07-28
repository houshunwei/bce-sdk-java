/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.vcr.model;

import com.baidubce.model.AbstractBceResponse;

import java.util.List;

/**
 * Vcr get media check result response.
 *
 * @author dingshenglong
 */
public class GetMediaResponse extends AbstractBceResponse {

    private String mediaId;
    private String status;
    private Integer percent;
    private String createTime;
    private String finishTime;
    private String label;
    private List<CheckResult> results;
    private VcrError error;

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

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<CheckResult> getResults() {
        return results;
    }

    public void setResults(List<CheckResult> results) {
        this.results = results;
    }

    public VcrError getError() {
        return error;
    }

    public void setError(VcrError error) {
        this.error = error;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GetMediaResponse{");
        sb.append("mediaId='").append(mediaId).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", percent=").append(percent);
        sb.append(", createTime='").append(createTime).append('\'');
        sb.append(", finishTime='").append(finishTime).append('\'');
        sb.append(", label='").append(label).append('\'');
        sb.append(", results=").append(results);
        sb.append(", error=").append(error);
        sb.append('}');
        return sb.toString();
    }
}
