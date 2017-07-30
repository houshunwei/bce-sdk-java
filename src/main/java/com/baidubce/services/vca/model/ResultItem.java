/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.vca.model;

/**
 * Vca ResultItem model.
 *
 * @author houshunwei
 */
public class ResultItem {
    private String attribute;
    private Double confidence;
    private String source;

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResultItem{");
        sb.append(", confidence=").append(confidence);
        sb.append(", label='").append(attribute).append('\'');
        sb.append(", extra='").append(source).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
