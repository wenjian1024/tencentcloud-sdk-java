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
package com.tencentcloudapi.tmt.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeechTranslateRequest extends AbstractModel{

    /**
    * 一段完整的语音对应一个SessionUuid
    */
    @SerializedName("SessionUuid")
    @Expose
    private String SessionUuid;

    /**
    * 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 翻译目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
    */
    @SerializedName("Target")
    @Expose
    private String Target;

    /**
    * pcm : 146   amr : 33554432   mp3 : 83886080
    */
    @SerializedName("AudioFormat")
    @Expose
    private Integer AudioFormat;

    /**
    * 语音分片的序号，从0开始
    */
    @SerializedName("Seq")
    @Expose
    private Integer Seq;

    /**
    * 是否最后一片语音分片，0-否，1-是
    */
    @SerializedName("IsEnd")
    @Expose
    private Integer IsEnd;

    /**
    * 语音分片内容的base64字符串，音频内容应含有效并可识别的文本
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 识别模式，该参数已废弃
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get 一段完整的语音对应一个SessionUuid 
     * @return SessionUuid 一段完整的语音对应一个SessionUuid
     */
    public String getSessionUuid() {
        return this.SessionUuid;
    }

    /**
     * Set 一段完整的语音对应一个SessionUuid
     * @param SessionUuid 一段完整的语音对应一个SessionUuid
     */
    public void setSessionUuid(String SessionUuid) {
        this.SessionUuid = SessionUuid;
    }

    /**
     * Get 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li> 
     * @return Source 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @param Source 音频中的语言类型，支持语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 翻译目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li> 
     * @return Target 翻译目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public String getTarget() {
        return this.Target;
    }

    /**
     * Set 翻译目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     * @param Target 翻译目标语⾔言类型 ，支持的语言列表<li> zh : 中文 </li> <li> en : 英文 </li>
     */
    public void setTarget(String Target) {
        this.Target = Target;
    }

    /**
     * Get pcm : 146   amr : 33554432   mp3 : 83886080 
     * @return AudioFormat pcm : 146   amr : 33554432   mp3 : 83886080
     */
    public Integer getAudioFormat() {
        return this.AudioFormat;
    }

    /**
     * Set pcm : 146   amr : 33554432   mp3 : 83886080
     * @param AudioFormat pcm : 146   amr : 33554432   mp3 : 83886080
     */
    public void setAudioFormat(Integer AudioFormat) {
        this.AudioFormat = AudioFormat;
    }

    /**
     * Get 语音分片的序号，从0开始 
     * @return Seq 语音分片的序号，从0开始
     */
    public Integer getSeq() {
        return this.Seq;
    }

    /**
     * Set 语音分片的序号，从0开始
     * @param Seq 语音分片的序号，从0开始
     */
    public void setSeq(Integer Seq) {
        this.Seq = Seq;
    }

    /**
     * Get 是否最后一片语音分片，0-否，1-是 
     * @return IsEnd 是否最后一片语音分片，0-否，1-是
     */
    public Integer getIsEnd() {
        return this.IsEnd;
    }

    /**
     * Set 是否最后一片语音分片，0-否，1-是
     * @param IsEnd 是否最后一片语音分片，0-否，1-是
     */
    public void setIsEnd(Integer IsEnd) {
        this.IsEnd = IsEnd;
    }

    /**
     * Get 语音分片内容的base64字符串，音频内容应含有效并可识别的文本 
     * @return Data 语音分片内容的base64字符串，音频内容应含有效并可识别的文本
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 语音分片内容的base64字符串，音频内容应含有效并可识别的文本
     * @param Data 语音分片内容的base64字符串，音频内容应含有效并可识别的文本
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Get 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0 
     * @return ProjectId 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     * @param ProjectId 项目ID，可以根据控制台-账号中心-项目管理中的配置填写，如无配置请填写默认项目ID:0
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 识别模式，该参数已废弃 
     * @return Mode 识别模式，该参数已废弃
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 识别模式，该参数已废弃
     * @param Mode 识别模式，该参数已废弃
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionUuid", this.SessionUuid);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Target", this.Target);
        this.setParamSimple(map, prefix + "AudioFormat", this.AudioFormat);
        this.setParamSimple(map, prefix + "Seq", this.Seq);
        this.setParamSimple(map, prefix + "IsEnd", this.IsEnd);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

