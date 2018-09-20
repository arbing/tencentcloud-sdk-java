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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InitDCDBInstancesResponse  extends AbstractModel{

    /**
    * 异步任务Id，可通过 DescribeFlow 查询任务状态。
    */
    @SerializedName("FlowIds")
    @Expose
    private Integer [] FlowIds;

    /**
    * 透传入参。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取异步任务Id，可通过 DescribeFlow 查询任务状态。
     * @return FlowIds 异步任务Id，可通过 DescribeFlow 查询任务状态。
     */
    public Integer [] getFlowIds() {
        return this.FlowIds;
    }

    /**
     * 设置异步任务Id，可通过 DescribeFlow 查询任务状态。
     * @param FlowIds 异步任务Id，可通过 DescribeFlow 查询任务状态。
     */
    public void setFlowIds(Integer [] FlowIds) {
        this.FlowIds = FlowIds;
    }

    /**
     * 获取透传入参。
     * @return InstanceIds 透传入参。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置透传入参。
     * @param InstanceIds 透传入参。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @return RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     * @param RequestId 唯一请求ID，每次请求都会返回。定位问题时需要提供该次请求的RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FlowIds.", this.FlowIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

