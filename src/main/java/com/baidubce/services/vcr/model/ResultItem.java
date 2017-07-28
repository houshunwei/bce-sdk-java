/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.vcr.model;

/**
 * ResultItem model.
 *
 * @author dingshenglong
 */
public class ResultItem {
    private String target;
    private Integer timeInSeconds;
    private Integer startTimeInSeconds;
    private Integer endTimeInSeconds;
    private Double confidence;
    private String label;
    private String extra;
    private Evidence evidence;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getTimeInSeconds() {
        return timeInSeconds;
    }

    public void setTimeInSeconds(Integer timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
    }

    public Integer getStartTimeInSeconds() {
        return startTimeInSeconds;
    }

    public void setStartTimeInSeconds(Integer startTimeInSeconds) {
        this.startTimeInSeconds = startTimeInSeconds;
    }

    public Integer getEndTimeInSeconds() {
        return endTimeInSeconds;
    }

    public void setEndTimeInSeconds(Integer endTimeInSeconds) {
        this.endTimeInSeconds = endTimeInSeconds;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public Evidence getEvidence() {
        return evidence;
    }

    public void setEvidence(Evidence evidence) {
        this.evidence = evidence;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResultItem{");
        sb.append("target='").append(target).append('\'');
        sb.append(", timeInSeconds=").append(timeInSeconds);
        sb.append(", startTimeInSeconds=").append(startTimeInSeconds);
        sb.append(", endTimeInSeconds=").append(endTimeInSeconds);
        sb.append(", confidence=").append(confidence);
        sb.append(", label='").append(label).append('\'');
        sb.append(", extra='").append(extra).append('\'');
        sb.append(", evidence=").append(evidence);
        sb.append('}');
        return sb.toString();
    }
}
