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
package com.tencentcloudapi.ocr.v20181119;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.ocr.v20181119.models.*;

public class OcrClient extends AbstractClient{
    private static String endpoint = "ocr.tencentcloudapi.com";
    private static String version = "2018-11-19";

    public OcrClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public OcrClient(Credential credential, String region, ClientProfile profile) {
        super(OcrClient.endpoint, OcrClient.version, credential, region, profile);
    }

    /**
     *本接口支持作业算式题目的自动识别，目前覆盖 K12 学力范围内的 14 种题型，包括加减乘除四则运算、分数四则运算、竖式四则运算、脱式计算等。
     * @param req ArithmeticOCRRequest
     * @return ArithmeticOCRResponse
     * @throws TencentCloudSDKException
     */
    public ArithmeticOCRResponse ArithmeticOCR(ArithmeticOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ArithmeticOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ArithmeticOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ArithmeticOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持对中国大陆主流银行卡的卡号、银行信息、有效期等关键字段的检测与识别。
     * @param req BankCardOCRRequest
     * @return BankCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public BankCardOCRResponse BankCardOCR(BankCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BankCardOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BankCardOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BankCardOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持快速精准识别营业执照上的字段，包括统一社会信用代码、公司名称、经营场所、主体类型、法定代表人、注册资金、组成形式、成立日期、营业期限和经营范围等字段。
     * @param req BizLicenseOCRRequest
     * @return BizLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public BizLicenseOCRResponse BizLicenseOCR(BizLicenseOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BizLicenseOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BizLicenseOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BizLicenseOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持识别公路汽车客票的发票代码、发票号码、日期、姓名、票价等字段。
     * @param req BusInvoiceOCRRequest
     * @return BusInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public BusInvoiceOCRResponse BusInvoiceOCR(BusInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BusInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BusInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BusInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持名片各字段的自动定位与识别，包含姓名、电话、手机号、邮箱、公司、部门、职位、网址、地址、QQ、微信、MSN等。
     * @param req BusinessCardOCRRequest
     * @return BusinessCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public BusinessCardOCRResponse BusinessCardOCR(BusinessCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<BusinessCardOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<BusinessCardOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "BusinessCardOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持机动车销售统一发票和二手车销售统一发票的识别，包括发票号码、发票代码、合计金额、合计税额等二十多个字段。
     * @param req CarInvoiceOCRRequest
     * @return CarInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public CarInvoiceOCRResponse CarInvoiceOCR(CarInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CarInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CarInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CarInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *支持身份证、护照、名片、银行卡、行驶证、驾驶证、港澳台通行证、户口本、港澳台来往内地通行证、港澳台居住证、不动产证、营业执照的智能分类。

     * @param req ClassifyDetectOCRRequest
     * @return ClassifyDetectOCRResponse
     * @throws TencentCloudSDKException
     */
    public ClassifyDetectOCRResponse ClassifyDetectOCR(ClassifyDetectOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ClassifyDetectOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ClassifyDetectOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ClassifyDetectOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持驾驶证主页和副页所有字段的自动定位与识别，重点字段的识别准确度达到99%以上。

驾驶证主页：包括证号、姓名、性别、国籍、住址、出生日期、初次领证日期、准驾车型、有效期限。

驾驶证副页：包括证号、姓名、档案编号、记录。

另外，本接口还支持复印件、翻拍和PS告警功能。
     * @param req DriverLicenseOCRRequest
     * @return DriverLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public DriverLicenseOCRResponse DriverLicenseOCR(DriverLicenseOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DriverLicenseOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DriverLicenseOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DriverLicenseOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持对完税证明的税号、纳税人识别号、纳税人名称、金额合计大写、金额合计小写、填发日期、税务机关、填票人等关键字段的识别。
     * @param req DutyPaidProofOCRRequest
     * @return DutyPaidProofOCRResponse
     * @throws TencentCloudSDKException
     */
    public DutyPaidProofOCRResponse DutyPaidProofOCR(DutyPaidProofOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DutyPaidProofOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DutyPaidProofOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DutyPaidProofOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持数学试题内容的识别和结构化输出，包括通用文本解析和小学/初中/高中数学公式解析能力（包括91种题型，180种符号）。
     * @param req EduPaperOCRRequest
     * @return EduPaperOCRResponse
     * @throws TencentCloudSDKException
     */
    public EduPaperOCRResponse EduPaperOCR(EduPaperOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EduPaperOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EduPaperOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EduPaperOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持图像英文文字的检测和识别，返回文字框位置与文字内容。支持多场景、任意版面下的英文、字母、数字和常见字符的识别，同时覆盖英文印刷体和英文手写体识别。
     * @param req EnglishOCRRequest
     * @return EnglishOCRResponse
     * @throws TencentCloudSDKException
     */
    public EnglishOCRResponse EnglishOCR(EnglishOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnglishOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnglishOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnglishOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持智能化识别各类企业登记证书、许可证书、企业执照、三证合一类证书，结构化输出统一社会信用代码、公司名称、法定代表人、公司地址、注册资金、企业类型、经营范围等关键字段。
     * @param req EnterpriseLicenseOCRRequest
     * @return EnterpriseLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public EnterpriseLicenseOCRResponse EnterpriseLicenseOCR(EnterpriseLicenseOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnterpriseLicenseOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnterpriseLicenseOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnterpriseLicenseOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持不动产权证关键字段的识别，包括使用期限、面积、用途、权利性质、权利类型、坐落、共有情况、权利人、权利其他状况等。



     * @param req EstateCertOCRRequest
     * @return EstateCertOCRResponse
     * @throws TencentCloudSDKException
     */
    public EstateCertOCRResponse EstateCertOCR(EstateCertOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EstateCertOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EstateCertOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EstateCertOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持常见银行票据的自动分类和识别。整单识别包括支票（含现金支票、普通支票、转账支票），承兑汇票（含银行承兑汇票、商业承兑汇票）以及进账单等，适用于中国人民银行印发的 2010 版银行票据凭证版式（银发[2010]299 号）。
     * @param req FinanBillOCRRequest
     * @return FinanBillOCRResponse
     * @throws TencentCloudSDKException
     */
    public FinanBillOCRResponse FinanBillOCR(FinanBillOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FinanBillOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<FinanBillOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "FinanBillOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持常见银行票据的自动分类和识别。切片识别包括金融行业常见票据的重要切片字段识别，包括金额、账号、日期、凭证号码等。（金融票据切片：金融票据中待识别字段及其周围局部区域的裁剪图像。）
     * @param req FinanBillSliceOCRRequest
     * @return FinanBillSliceOCRResponse
     * @throws TencentCloudSDKException
     */
    public FinanBillSliceOCRResponse FinanBillSliceOCR(FinanBillSliceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FinanBillSliceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<FinanBillSliceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "FinanBillSliceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持机票行程单关键字段的识别，包括姓名、身份证件号码、航班号、票价 、合计、电子客票号码、填开日期等。
     * @param req FlightInvoiceOCRRequest
     * @return FlightInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public FlightInvoiceOCRResponse FlightInvoiceOCR(FlightInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FlightInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<FlightInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "FlightInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持识别主流初高中数学符号和公式，返回公式的 Latex 格式文本。
     * @param req FormulaOCRRequest
     * @return FormulaOCRResponse
     * @throws TencentCloudSDKException
     */
    public FormulaOCRResponse FormulaOCR(FormulaOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FormulaOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<FormulaOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "FormulaOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持图像整体文字的检测和识别。支持中文、英文、中英文、数字和特殊字符号的识别，并返回文字框位置和文字内容。

适用于文字较多、版式复杂、对识别准召率要求较高的场景，如试卷试题、网络图片、街景店招牌、法律卷宗等场景。

产品优势：与通用印刷体识别相比，提供更高精度的文字识别服务，在文字较多、长串数字、小字、模糊字、倾斜文本等困难场景下，高精度版的准确率和召回率更高。

通用印刷体识别不同版本的差异如下：
<table style="width:715px">
      <thead>
        <tr>
          <th style="width:150px"></th>
          <th >【荐】通用印刷体识别（高精度版）</th>
          <th style="width:200px"><a href="https://cloud.tencent.com/document/product/866/33526">【荐】通用印刷体识别</a></th>
          <th><a href="https://cloud.tencent.com/document/product/866/37831">通用印刷体识别（精简版）</a></th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td> 适用场景</td>
          <td>适用于文字较多、长串数字、小字、模糊字、倾斜文本等困难场景</td>
          <td>适用于所有通用场景的印刷体识别</td>
          <td>适用于快速文本识别场景，准召率有一定损失，价格更优惠</td>
        </tr>
        <tr>
          <td>识别准确率</td>
          <td>99%</td>
          <td>96%</td>
          <td>91%</td>
        </tr>
        <tr>
          <td>价格</td>
          <td>高</td>
          <td>中</td>
          <td>低</td>
        </tr>
        <tr>
          <td>支持的语言</td>
          <td>中文、英文、中英文</td>
          <td>中文、英文、中英文、日语、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语</td>  
          <td>中文、英文、中英文</td>
        </tr>
        <tr>
          <td>自动语言检测</td>
          <td>支持</td>
          <td>支持</td>  
          <td>支持</td>
        </tr>
        <tr>
          <td>返回文本行坐标</td>
          <td>支持</td>
          <td>支持</td>
          <td>支持</td>
        </tr>
        <tr>
          <td>自动旋转纠正</td>
          <td>支持旋转识别，不支持角度返回</td>
          <td>支持旋转识别，返回角度信息</td>
          <td>支持旋转识别，返回角度信息</td>
        </tr>
      </tbody>
    </table>
     * @param req GeneralAccurateOCRRequest
     * @return GeneralAccurateOCRResponse
     * @throws TencentCloudSDKException
     */
    public GeneralAccurateOCRResponse GeneralAccurateOCR(GeneralAccurateOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GeneralAccurateOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GeneralAccurateOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GeneralAccurateOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持图像整体文字的检测和识别。可以识别中文、英文、中英文、日语、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语，阿拉伯语20种语言，且各种语言均支持与英文混合的文字识别。

适用于印刷文档识别、网络图片识别、广告图文字识别、街景店招牌识别、菜单识别、视频标题识别、头像文字识别等场景。

产品优势：支持自动识别语言类型，可返回文本框坐标信息，对于倾斜文本支持自动旋转纠正。

通用印刷体识别不同版本的差异如下：
<table style="width:715px">
      <thead>
        <tr>
          <th style="width:150px"></th>
          <th style="width:200px">【荐】通用印刷体识别</th>
          <th ><a href="https://cloud.tencent.com/document/product/866/34937">【荐】通用印刷体识别（高精度版）</a></th>
          <th><a href="https://cloud.tencent.com/document/product/866/37831">通用印刷体识别（精简版）</a></th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td> 适用场景</td>
          <td>适用于所有通用场景的印刷体识别</td>
          <td>适用于文字较多、长串数字、小字、模糊字、倾斜文本等困难场景</td>
          <td>适用于快速文本识别场景，准召率有一定损失，价格更优惠</td>
        </tr>
        <tr>
          <td>识别准确率</td>
          <td>96%</td>
          <td>99%</td>
          <td>91%</td>
        </tr>
        <tr>
          <td>价格</td>
          <td>中</td>
          <td>高</td>
          <td>低</td>
        </tr>
        <tr>
          <td>支持的语言</td>
          <td>中文、英文、中英文、日语、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语</td>
          <td>中文、英文、中英文</td>
          <td>中文、英文、中英文</td>
        </tr>
        <tr>
          <td>自动语言检测</td>
          <td>支持</td>
          <td>支持</td>
          <td>支持</td>
        </tr>
        <tr>
          <td>返回文本行坐标</td>
          <td>支持</td>
          <td>支持</td>
          <td>支持</td>
        </tr>
        <tr>
          <td>自动旋转纠正</td>
          <td>支持旋转识别，返回角度信息</td>
          <td>支持旋转识别，不支持角度返回</td>
          <td>支持旋转识别，返回角度信息</td>
        </tr>
      </tbody>
    </table>
     * @param req GeneralBasicOCRRequest
     * @return GeneralBasicOCRResponse
     * @throws TencentCloudSDKException
     */
    public GeneralBasicOCRResponse GeneralBasicOCR(GeneralBasicOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GeneralBasicOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GeneralBasicOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GeneralBasicOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持图像整体文字的检测和识别。支持中文、英文、中英文、数字和特殊字符号的识别，并返回文字框位置和文字内容。

适用于快速文本识别场景。

产品优势：与通用印刷体识别接口相比，精简版虽然在准确率和召回率上有一定损失，但价格更加优惠。

通用印刷体识别不同版本的差异如下：
<table style="width:715px">
      <thead>
        <tr>
          <th style="width:150px"></th>
          <th >通用印刷体识别（精简版）</th>
          <th style="width:200px"><a href="https://cloud.tencent.com/document/product/866/33526">【荐】通用印刷体识别</a></th>
          <th><a href="https://cloud.tencent.com/document/product/866/34937">【荐】通用印刷体识别（高精度版）</a></th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td> 适用场景</td>
          <td>适用于快速文本识别场景，准召率有一定损失，价格更优惠</td>
          <td>适用于所有通用场景的印刷体识别</td>
          <td>适用于文字较多、长串数字、小字、模糊字、倾斜文本等困难场景</td>
          
          
        </tr>
        <tr>
          <td>识别准确率</td>
          <td>91%</td>
          <td>96%</td>
          <td>99%</td>
          
          
        </tr>
        <tr>
          <td>价格</td>
          <td>低</td>
          <td>中</td>
          <td>高</td>
          
          
        </tr>
        <tr>
          <td>支持的语言</td>
          <td>中文、英文、中英文</td>
          <td>中文、英文、中英文、日语、韩语、西班牙语、法语、德语、葡萄牙语、越南语、马来语、俄语、意大利语、荷兰语、瑞典语、芬兰语、丹麦语、挪威语、匈牙利语、泰语</td>  
          <td>中文、英文、中英文</td>
          
          
        </tr>
        <tr>
          <td>自动语言检测</td>
          <td>支持</td>
          <td>支持</td>  
          <td>支持</td>
          
          
        </tr>
        <tr>
          <td>返回文本行坐标</td>
          <td>支持</td>
          <td>支持</td>
          <td>支持</td>
          
          
        </tr>
        <tr>
          <td>自动旋转纠正</td>
          <td>支持旋转识别，返回角度信息</td>
          <td>支持旋转识别，返回角度信息</td>
          <td>支持旋转识别，不支持角度返回</td>
          
         
        </tr>
      </tbody>
    </table>
     * @param req GeneralEfficientOCRRequest
     * @return GeneralEfficientOCRResponse
     * @throws TencentCloudSDKException
     */
    public GeneralEfficientOCRResponse GeneralEfficientOCR(GeneralEfficientOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GeneralEfficientOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GeneralEfficientOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GeneralEfficientOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持图片中整体文字的检测和识别，返回文字框位置与文字内容。相比通用印刷体识别接口，识别速度更快、支持的 QPS 更高。
     * @param req GeneralFastOCRRequest
     * @return GeneralFastOCRResponse
     * @throws TencentCloudSDKException
     */
    public GeneralFastOCRResponse GeneralFastOCR(GeneralFastOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GeneralFastOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GeneralFastOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GeneralFastOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持图片内手写体文字的检测和识别，针对手写字体无规则、字迹潦草、模糊等特点进行了识别能力的增强。
     * @param req GeneralHandwritingOCRRequest
     * @return GeneralHandwritingOCRResponse
     * @throws TencentCloudSDKException
     */
    public GeneralHandwritingOCRResponse GeneralHandwritingOCR(GeneralHandwritingOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GeneralHandwritingOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GeneralHandwritingOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GeneralHandwritingOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持中国香港身份证人像面中关键字段的识别，包括中文姓名、英文姓名、姓名电码、出生日期、性别、证件符号、首次签发日期、最近领用日期、身份证号、是否是永久性居民身份证；具备防伪识别、人像照片裁剪等扩展功能。
本接口暂未完全对外开放，如需咨询，请[联系商务](https://cloud.tencent.com/about/connect)

     * @param req HKIDCardOCRRequest
     * @return HKIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public HKIDCardOCRResponse HKIDCardOCR(HKIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HKIDCardOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<HKIDCardOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "HKIDCardOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *港澳台居住证OCR支持港澳台居住证正反面全字段内容检测识别功能，包括姓名、性别、出生日期、地址、身份证ID、签发机关、有效期限、签发次数、通行证号码关键字段识别。可以应用于港澳台居住证信息有效性校验场景，例如银行开户、用户注册等场景。
     * @param req HmtResidentPermitOCRRequest
     * @return HmtResidentPermitOCRResponse
     * @throws TencentCloudSDKException
     */
    public HmtResidentPermitOCRResponse HmtResidentPermitOCR(HmtResidentPermitOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HmtResidentPermitOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<HmtResidentPermitOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "HmtResidentPermitOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持中国大陆居民二代身份证正反面所有字段的识别，包括姓名、性别、民族、出生日期、住址、公民身份证号、签发机关、有效期限，识别准确度达到99%以上。

另外，本接口还支持多种增值能力，满足不同场景的需求。如身份证照片、人像照片的裁剪功能，同时具备9种告警功能，如下表所示。

<table style="width:650px">
      <thead>
        <tr>
       <th width="150">增值能力</th>
          <th width="500">能力项</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td rowspan="2">裁剪功能</td>
          <td>身份证照片裁剪（去掉证件外多余的边缘、自动矫正拍摄角度）</td>
        </tr>
        <tr>
          <td>人像照片裁剪（自动抠取身份证头像区域）</td>
        </tr>
        <tr>
          <td rowspan="9">告警功能</td>
          <td>身份证有效日期不合法告警</td>
        </tr>
        <tr>
          <td>身份证边框不完整告警</td>
        </tr>
        <tr>
          <td>身份证复印件告警</td>
        </tr>
        <tr>
          <td>身份证翻拍告警</td>
        </tr>
          <tr>
          <td>身份证框内遮挡告警</td>
        </tr>
         <tr>
          <td>临时身份证告警</td>
        </tr>
          <tr>
          <td>身份证 PS 告警</td>
        </tr>
          <tr>
          <td>图片模糊告警（可根据图片质量分数判断）</td>
        </tr>
      </tbody>
    </table>
     * @param req IDCardOCRRequest
     * @return IDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public IDCardOCRResponse IDCardOCR(IDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IDCardOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<IDCardOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "IDCardOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持事业单位法人证书关键字段识别，包括注册号、有效期、住所、名称、法定代表人等。
     * @param req InstitutionOCRRequest
     * @return InstitutionOCRResponse
     * @throws TencentCloudSDKException
     */
    public InstitutionOCRResponse InstitutionOCR(InstitutionOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InstitutionOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InstitutionOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InstitutionOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持病案首页、费用清单、结算单、医疗发票四种保险理赔单据的文本识别和结构化输出。
     * @param req InsuranceBillOCRRequest
     * @return InsuranceBillOCRResponse
     * @throws TencentCloudSDKException
     */
    public InsuranceBillOCRResponse InsuranceBillOCR(InsuranceBillOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InsuranceBillOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InsuranceBillOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InsuranceBillOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持对通用机打发票的发票代码、发票号码、日期、购买方识别号、销售方识别号、校验码、小写金额等关键字段的识别。
     * @param req InvoiceGeneralOCRRequest
     * @return InvoiceGeneralOCRResponse
     * @throws TencentCloudSDKException
     */
    public InvoiceGeneralOCRResponse InvoiceGeneralOCR(InvoiceGeneralOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InvoiceGeneralOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<InvoiceGeneralOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "InvoiceGeneralOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持对中国大陆机动车车牌的自动定位和识别，返回地域编号和车牌号信息。
     * @param req LicensePlateOCRRequest
     * @return LicensePlateOCRResponse
     * @throws TencentCloudSDKException
     */
    public LicensePlateOCRResponse LicensePlateOCR(LicensePlateOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<LicensePlateOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<LicensePlateOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "LicensePlateOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持马来西亚身份证识别，识别字段包括身份证号、姓名、性别、地址；具备身份证人像照片的裁剪功能和翻拍、复印件告警功能。
本接口暂未完全对外开放，如需咨询，请[联系商务](https://cloud.tencent.com/about/connect)

     * @param req MLIDCardOCRRequest
     * @return MLIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public MLIDCardOCRResponse MLIDCardOCR(MLIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MLIDCardOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MLIDCardOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MLIDCardOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持中国港澳台地区以及其他国家、地区的护照识别。识别字段包括护照ID、姓名、出生日期、性别、有效期、发行国、国籍，具备护照人像照片的裁剪功能和翻拍、复印件告警功能。

     * @param req MLIDPassportOCRRequest
     * @return MLIDPassportOCRResponse
     * @throws TencentCloudSDKException
     */
    public MLIDPassportOCRResponse MLIDPassportOCR(MLIDPassportOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MLIDPassportOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MLIDPassportOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MLIDPassportOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *智能识别并结构化港澳台居民来往内地通行证正面全部字段，包含中文姓名、英文姓名、性别、出生日期、签发机关、有效期限、证件号、签发地点、签发次数、证件类别。
     * @param req MainlandPermitOCRRequest
     * @return MainlandPermitOCRResponse
     * @throws TencentCloudSDKException
     */
    public MainlandPermitOCRResponse MainlandPermitOCR(MainlandPermitOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MainlandPermitOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MainlandPermitOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MainlandPermitOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持多张、多类型票据的混合检测和自动分类，返回对应票据类型。目前已支持增值税发票、增值税发票（卷票）、定额发票、通用机打发票、购车发票、火车票、出租车发票、机票行程单、汽车票、轮船票、过路过桥费发票、酒店账单、客运限额发票、购物小票、完税证明共15种票据。
     * @param req MixedInvoiceDetectRequest
     * @return MixedInvoiceDetectResponse
     * @throws TencentCloudSDKException
     */
    public MixedInvoiceDetectResponse MixedInvoiceDetect(MixedInvoiceDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MixedInvoiceDetectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MixedInvoiceDetectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MixedInvoiceDetect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持多张、多类型票据的混合识别，系统自动实现分割、分类和识别，同时支持自选需要识别的票据类型。目前已支持增值税发票、增值税发票（卷票）、定额发票、通用机打发票、购车发票、火车票、出租车发票、机票行程单、汽车票、轮船票、过路过桥费发票共11种票据。
     * @param req MixedInvoiceOCRRequest
     * @return MixedInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public MixedInvoiceOCRResponse MixedInvoiceOCR(MixedInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MixedInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<MixedInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "MixedInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持组织机构代码证关键字段的识别，包括代码、有效期、地址、机构名称等。
     * @param req OrgCodeCertOCRRequest
     * @return OrgCodeCertOCRResponse
     * @throws TencentCloudSDKException
     */
    public OrgCodeCertOCRResponse OrgCodeCertOCR(OrgCodeCertOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OrgCodeCertOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OrgCodeCertOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OrgCodeCertOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持中国大陆地区护照个人资料页多个字段的检测与识别。已支持字段包括英文姓名、中文姓名、国家码、护照号、出生地、出生日期、国籍英文、性别英文、有效期、签发地点英文、签发日期、持证人签名、护照机读码（MRZ码）等。
     * @param req PassportOCRRequest
     * @return PassportOCRResponse
     * @throws TencentCloudSDKException
     */
    public PassportOCRResponse PassportOCR(PassportOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PassportOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PassportOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PassportOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持对卡式港澳台通行证的识别，包括签发地点、签发机关、有效期限、性别、出生日期、英文姓名、姓名、证件号等字段。
     * @param req PermitOCRRequest
     * @return PermitOCRResponse
     * @throws TencentCloudSDKException
     */
    public PermitOCRResponse PermitOCR(PermitOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PermitOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PermitOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PermitOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持房产证关键字段的识别，包括房地产权利人、共有情况、登记时间、规划用途、房屋性质、房屋坐落等。
     * @param req PropOwnerCertOCRRequest
     * @return PropOwnerCertOCRResponse
     * @throws TencentCloudSDKException
     */
    public PropOwnerCertOCRResponse PropOwnerCertOCR(PropOwnerCertOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PropOwnerCertOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<PropOwnerCertOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "PropOwnerCertOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持条形码和二维码的识别（包括 DataMatrix 和 PDF417）。
     * @param req QrcodeOCRRequest
     * @return QrcodeOCRResponse
     * @throws TencentCloudSDKException
     */
    public QrcodeOCRResponse QrcodeOCR(QrcodeOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QrcodeOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QrcodeOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QrcodeOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持条形码备案信息查询，返回条形码查询结果的相关信息，包括产品名称、产品英文名称、品牌名称、规格型号、宽度、高度、深度、关键字、产品描述、厂家名称、厂家地址、企业社会信用代码13个字段信息。

产品优势：直联中国物品编码中心，查询结果更加准确、可靠。

本接口目前为内测阶段，如需使用服务，请<a href="https://cloud.tencent.com/act/event/connect-service" target="_blank">联系商务</a>开通。
     * @param req QueryBarCodeRequest
     * @return QueryBarCodeResponse
     * @throws TencentCloudSDKException
     */
    public QueryBarCodeResponse QueryBarCode(QueryBarCodeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QueryBarCodeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QueryBarCodeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QueryBarCode"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持定额发票的发票号码、发票代码、金额(大小写)、发票消费类型、地区及是否有公司印章等关键字段的识别。
     * @param req QuotaInvoiceOCRRequest
     * @return QuotaInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public QuotaInvoiceOCRResponse QuotaInvoiceOCR(QuotaInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<QuotaInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<QuotaInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "QuotaInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持泰国身份证识别，识别字段包括泰文姓名、英文姓名、地址、出生日期、身份证号码。
本接口暂未完全对外开放，如需咨询，请[联系商务](https://cloud.tencent.com/about/connect)

     * @param req RecognizeThaiIDCardOCRRequest
     * @return RecognizeThaiIDCardOCRResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeThaiIDCardOCRResponse RecognizeThaiIDCardOCR(RecognizeThaiIDCardOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeThaiIDCardOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeThaiIDCardOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RecognizeThaiIDCardOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持居民户口簿户主页及成员页关键字段的识别，包括姓名、户别、地址、籍贯、身份证号码等。
     * @param req ResidenceBookletOCRRequest
     * @return ResidenceBookletOCRResponse
     * @throws TencentCloudSDKException
     */
    public ResidenceBookletOCRResponse ResidenceBookletOCR(ResidenceBookletOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResidenceBookletOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResidenceBookletOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ResidenceBookletOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持网约车驾驶证关键字段的识别，包括姓名、证号、起始日期、截止日期、发证日期。
     * @param req RideHailingDriverLicenseOCRRequest
     * @return RideHailingDriverLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public RideHailingDriverLicenseOCRResponse RideHailingDriverLicenseOCR(RideHailingDriverLicenseOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RideHailingDriverLicenseOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RideHailingDriverLicenseOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RideHailingDriverLicenseOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持网约车运输证关键字段的识别，包括交运管许可字号、车辆所有人、车辆号牌、起始日期、截止日期、发证日期。
           
     * @param req RideHailingTransportLicenseOCRRequest
     * @return RideHailingTransportLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public RideHailingTransportLicenseOCRResponse RideHailingTransportLicenseOCR(RideHailingTransportLicenseOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RideHailingTransportLicenseOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RideHailingTransportLicenseOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RideHailingTransportLicenseOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *印章识别已支持各类印章，包括发票章，财务章等，适用于公文，票据等场景。
     * @param req SealOCRRequest
     * @return SealOCRResponse
     * @throws TencentCloudSDKException
     */
    public SealOCRResponse SealOCR(SealOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SealOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SealOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SealOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持识别轮船票的发票代码、发票号码、日期、姓名、票价等字段。
     * @param req ShipInvoiceOCRRequest
     * @return ShipInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public ShipInvoiceOCRResponse ShipInvoiceOCR(ShipInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ShipInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ShipInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ShipInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持图片内表格文档的检测和识别，返回每个单元格的文字内容，支持将识别结果保存为 Excel 格式。
     * @param req TableOCRRequest
     * @return TableOCRResponse
     * @throws TencentCloudSDKException
     */
    public TableOCRResponse TableOCR(TableOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TableOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TableOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TableOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持出租车发票关键字段的识别，包括发票号码、发票代码、金额、日期、上下车时间、里程、车牌号、发票类型及所属地区等字段。
     * @param req TaxiInvoiceOCRRequest
     * @return TaxiInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public TaxiInvoiceOCRResponse TaxiInvoiceOCR(TaxiInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TaxiInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TaxiInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TaxiInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口通过检测图片中的文字信息特征，快速判断图片中有无文字并返回判断结果，帮助用户过滤无文字的图片。
     * @param req TextDetectRequest
     * @return TextDetectResponse
     * @throws TencentCloudSDKException
     */
    public TextDetectResponse TextDetect(TextDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextDetectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TextDetectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TextDetect"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持对过路过桥费发票的发票代码、发票号码、日期、小写金额等关键字段的识别。
     * @param req TollInvoiceOCRRequest
     * @return TollInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public TollInvoiceOCRResponse TollInvoiceOCR(TollInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TollInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TollInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TollInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持火车票全字段的识别，包括编号、票价、姓名、座位号、出发时间、出发站、到达站、车次、席别、发票类型及序列号等。

     * @param req TrainTicketOCRRequest
     * @return TrainTicketOCRResponse
     * @throws TencentCloudSDKException
     */
    public TrainTicketOCRResponse TrainTicketOCR(TrainTicketOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TrainTicketOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TrainTicketOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TrainTicketOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持增值税专用发票、增值税普通发票、增值税电子发票全字段的内容检测和识别，包括发票代码、发票号码、打印发票代码、打印发票号码、开票日期、合计金额、校验码、税率、合计税额、价税合计、购买方识别号、复核、销售方识别号、开票人、密码区1、密码区2、密码区3、密码区4、发票名称、购买方名称、销售方名称、服务名称、备注、规格型号、数量、单价、金额、税额、收款人等字段。
     * @param req VatInvoiceOCRRequest
     * @return VatInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public VatInvoiceOCRResponse VatInvoiceOCR(VatInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VatInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VatInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VatInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持增值税发票的准确性核验，您可以通过输入增值税发票的关键字段提供所需的验证信息，接口返回真实的票面相关信息，包括发票代码、发票号码、开票日期、金额、消费类型、购方名称、购方税号、销方名称、销方税号等多个常用字段。支持多种发票类型核验，包括增值税专用发票、增值税普通发票（含电子普通发票、卷式发票、通行费发票）、机动车销售统一发票、货物运输业增值税专用发票、二手车销售统一发票。
     * @param req VatInvoiceVerifyRequest
     * @return VatInvoiceVerifyResponse
     * @throws TencentCloudSDKException
     */
    public VatInvoiceVerifyResponse VatInvoiceVerify(VatInvoiceVerifyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VatInvoiceVerifyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VatInvoiceVerifyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VatInvoiceVerify"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持对增值税发票（卷票）的发票代码、发票号码、日期、校验码、合计金额（小写）等关键字段的识别。
     * @param req VatRollInvoiceOCRRequest
     * @return VatRollInvoiceOCRResponse
     * @throws TencentCloudSDKException
     */
    public VatRollInvoiceOCRResponse VatRollInvoiceOCR(VatRollInvoiceOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VatRollInvoiceOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VatRollInvoiceOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VatRollInvoiceOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持行驶证主页和副页所有字段的自动定位与识别。

行驶证主页：车牌号码、车辆类型、所有人、住址、使用性质、品牌型号、识别代码、发动机号、注册日期、发证日期、发证单位。

行驶证副页：号牌号码、档案编号、核定载人数、总质量、整备质量、核定载质量、外廓尺寸、准牵引总质量、备注、检验记录。

另外，本接口还支持复印件、翻拍和PS告警功能。
     * @param req VehicleLicenseOCRRequest
     * @return VehicleLicenseOCRResponse
     * @throws TencentCloudSDKException
     */
    public VehicleLicenseOCRResponse VehicleLicenseOCR(VehicleLicenseOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VehicleLicenseOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VehicleLicenseOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VehicleLicenseOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持国内机动车登记证书主要字段的结构化识别，包括机动车所有人、身份证明名称、号码、车辆型号、车辆识别代号、发动机号、制造厂名称等。
     * @param req VehicleRegCertOCRRequest
     * @return VehicleRegCertOCRResponse
     * @throws TencentCloudSDKException
     */
    public VehicleRegCertOCRResponse VehicleRegCertOCR(VehicleRegCertOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VehicleRegCertOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VehicleRegCertOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VehicleRegCertOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持营业执照信息的识别与准确性核验。您可以通过输入营业执照关键字段或传入营业执照图片提供所需的验证信息，接口返回真实的企业工商照面信息及核验结果，包括统一社会信用代码、经营期限、法人姓名、经营状态、经营业务范围、状态信息、原注册号、要核验的工商注册号、工商注册号、要核验的企业名称、企业名称、要核验的注册住址、注册住址、核验结果、注册资本共16个基础字段。
     * @param req VerifyBasicBizLicenseRequest
     * @return VerifyBasicBizLicenseResponse
     * @throws TencentCloudSDKException
     */
    public VerifyBasicBizLicenseResponse VerifyBasicBizLicense(VerifyBasicBizLicenseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyBasicBizLicenseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyBasicBizLicenseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VerifyBasicBizLicense"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持营业执照信息的识别与准确性核验，返回的营业执照信息比营业执照识别及核验（基础版）接口更详细。
您可以通过输入营业执照关键字段或传入营业执照图片提供所需的验证信息，接口返回真实的企业工商照面信息及核验结果，包括统一社会信用代码、组织机构代码、经营期限、法人姓名、经营状态、经营业务范围及方式、注册资金、注册币种、登记机关、开业日期、企业（机构）类型、注销日期、吊销日期、许可经营项目、一般经营项目、核准时间、省、地级市、区/县、住所所在行政区划代码、行业门类代码、行业门类名称、国民经济行业代码、国民经济行业名称、经营（业务）范围、要核验的工商注册号、工商注册号、要核验的企业名称、企业名称、要核验的注册住址、注册住址、核验结果共33个详细字段。
     * @param req VerifyBizLicenseRequest
     * @return VerifyBizLicenseResponse
     * @throws TencentCloudSDKException
     */
    public VerifyBizLicenseResponse VerifyBizLicense(VerifyBizLicenseRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyBizLicenseResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyBizLicenseResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VerifyBizLicense"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持图片内车辆识别代号（VIN）的检测和识别。
     * @param req VinOCRRequest
     * @return VinOCRResponse
     * @throws TencentCloudSDKException
     */
    public VinOCRResponse VinOCR(VinOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VinOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VinOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VinOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持市面上主流版式电子运单的识别，包括收件人和寄件人的姓名、电话、地址以及运单号等字段。
     * @param req WaybillOCRRequest
     * @return WaybillOCRResponse
     * @throws TencentCloudSDKException
     */
    public WaybillOCRResponse WaybillOCR(WaybillOCRRequest req) throws TencentCloudSDKException{
        JsonResponseModel<WaybillOCRResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<WaybillOCRResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "WaybillOCR"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
