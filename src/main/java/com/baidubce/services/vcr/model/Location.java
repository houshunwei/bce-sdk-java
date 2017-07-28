/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.vcr.model;

/**
 * Evidence location.
 *
 * @author dingshenglong
 */
public class Location {
    private Integer leftOffsetInPixel;
    private Integer topOffsetInPixel;
    private Integer widthInPixel;
    private Integer heightInPixel;

    public Integer getLeftOffsetInPixel() {
        return leftOffsetInPixel;
    }

    public void setLeftOffsetInPixel(Integer leftOffsetInPixel) {
        this.leftOffsetInPixel = leftOffsetInPixel;
    }

    public Integer getTopOffsetInPixel() {
        return topOffsetInPixel;
    }

    public void setTopOffsetInPixel(Integer topOffsetInPixel) {
        this.topOffsetInPixel = topOffsetInPixel;
    }

    public Integer getWidthInPixel() {
        return widthInPixel;
    }

    public void setWidthInPixel(Integer widthInPixel) {
        this.widthInPixel = widthInPixel;
    }

    public Integer getHeightInPixel() {
        return heightInPixel;
    }

    public void setHeightInPixel(Integer heightInPixel) {
        this.heightInPixel = heightInPixel;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Location{");
        sb.append("leftOffsetInPixel=").append(leftOffsetInPixel);
        sb.append(", topOffsetInPixel=").append(topOffsetInPixel);
        sb.append(", widthInPixel=").append(widthInPixel);
        sb.append(", heightInPixel=").append(heightInPixel);
        sb.append('}');
        return sb.toString();
    }
}
