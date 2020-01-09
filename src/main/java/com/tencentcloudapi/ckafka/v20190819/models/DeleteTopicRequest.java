/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteTopicRequest extends AbstractModel{

    /**
    * ckafka 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * ckafka 主题名称
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get ckafka 实例Id 
     * @return InstanceId ckafka 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set ckafka 实例Id
     * @param InstanceId ckafka 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get ckafka 主题名称 
     * @return TopicName ckafka 主题名称
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set ckafka 主题名称
     * @param TopicName ckafka 主题名称
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

