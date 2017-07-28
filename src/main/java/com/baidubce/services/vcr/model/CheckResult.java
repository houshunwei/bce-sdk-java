/**
 * Copyright (C) 2017 Baidu, Inc. All Rights Reserved.
 */
package com.baidubce.services.vcr.model;

import java.util.List;

/**
 * Vcr check result model.
 *
 * @author dingshenglong
 */
public class CheckResult {
    private String type;
    private List<ResultItem> items;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ResultItem> getItems() {
        return items;
    }

    public void setItems(List<ResultItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CheckResult{");
        sb.append("type='").append(type).append('\'');
        sb.append(", items=").append(items);
        sb.append('}');
        return sb.toString();
    }
}
