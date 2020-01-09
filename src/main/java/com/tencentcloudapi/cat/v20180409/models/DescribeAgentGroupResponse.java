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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentGroupResponse extends AbstractModel{

    /**
    * 拨测分组Id
    */
    @SerializedName("GroupId")
    @Expose
    private Long GroupId;

    /**
    * 拨测分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 是否为默认拨测分组
    */
    @SerializedName("IsDefault")
    @Expose
    private Long IsDefault;

    /**
    * 使用本拨测分组的任务数
    */
    @SerializedName("TaskNum")
    @Expose
    private Long TaskNum;

    /**
    * 拨测分组运营商列表
    */
    @SerializedName("Agents")
    @Expose
    private CatAgent [] Agents;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 拨测分组Id 
     * @return GroupId 拨测分组Id
     */
    public Long getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 拨测分组Id
     * @param GroupId 拨测分组Id
     */
    public void setGroupId(Long GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 拨测分组名称 
     * @return GroupName 拨测分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 拨测分组名称
     * @param GroupName 拨测分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 是否为默认拨测分组 
     * @return IsDefault 是否为默认拨测分组
     */
    public Long getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否为默认拨测分组
     * @param IsDefault 是否为默认拨测分组
     */
    public void setIsDefault(Long IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 使用本拨测分组的任务数 
     * @return TaskNum 使用本拨测分组的任务数
     */
    public Long getTaskNum() {
        return this.TaskNum;
    }

    /**
     * Set 使用本拨测分组的任务数
     * @param TaskNum 使用本拨测分组的任务数
     */
    public void setTaskNum(Long TaskNum) {
        this.TaskNum = TaskNum;
    }

    /**
     * Get 拨测分组运营商列表 
     * @return Agents 拨测分组运营商列表
     */
    public CatAgent [] getAgents() {
        return this.Agents;
    }

    /**
     * Set 拨测分组运营商列表
     * @param Agents 拨测分组运营商列表
     */
    public void setAgents(CatAgent [] Agents) {
        this.Agents = Agents;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "TaskNum", this.TaskNum);
        this.setParamArrayObj(map, prefix + "Agents.", this.Agents);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

