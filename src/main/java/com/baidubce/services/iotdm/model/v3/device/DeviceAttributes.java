/*
 * Copyright 2017 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.iotdm.model.v3.device;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * Represent the model of device attributes.
 */
public class DeviceAttributes {

    private JsonNode reported;

    private JsonNode desired;

    private int profileVersion;

    private TimeAttributes lastUpdatedTime = new TimeAttributes();

    public JsonNode getReported() {
        return reported;
    }

    public void setReported(JsonNode reported) {
        this.reported = reported;
    }

    public JsonNode getDesired() {
        return desired;
    }

    public void setDesired(JsonNode desired) {
        this.desired = desired;
    }

    public int getProfileVersion() {
        return profileVersion;
    }

    public void setProfileVersion(int profileVersion) {
        this.profileVersion = profileVersion;
    }

    public TimeAttributes getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(TimeAttributes lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    public static class TimeAttributes {

        private JsonNode reported;

        private JsonNode desired;

        public JsonNode getReported() {
            return reported;
        }

        public void setReported(JsonNode reported) {
            this.reported = reported;
        }

        public JsonNode getDesired() {
            return desired;
        }

        public void setDesired(JsonNode desired) {
            this.desired = desired;
        }

    }

}
