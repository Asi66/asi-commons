package com.asi.commons.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author lw
 * @date 2022-11-16 0:02
 */
@Getter
@RequiredArgsConstructor
public enum BusinessErrorCode {

    /**
     * 通过错误码开头判断不同类型的错误
     *
     * A：业务类
     * B：系统类
     * C：第三方
     */

    /**
     * 成功
     */
    SUCCESS("00000", "成功", 200L),

    /**
     * 失败
     */
    ERROR("99999", "失败", 10001L),

    /**
     * 用户类
     */
    CLIENT_ERROR("A0001", "用户端错误", 0L),

    LOGIN_ERROR("A0100", "用户登陆异常", 0L),

    /**
     *  token异常
     */
    TOKEN_ERROR("A0101", "用户登陆已过期", 403L),

    CAPTCHA_ERROR("A0102", "验证码错误", 10011L),

    CAPTCHA_ERROR_EXCEED_COUNT("A0103", "用户验证码尝试次数超限", 0L),

    USER_NOT_EXISTS("A0104", "用户不存在", 0L),

    USER_CANCELLATION("A0105", "用户已作废", 0L),

    USER_IDENTITY_NO_ERROR("A0106", "身份证格式不对", 30001L),

    REAL_NAME_AUTH_ERROR("A0107", "实名认证失败", 202L),

    PHONE_NOT_SAME("A0108", "手机号不一致", 0L),

    REQ_ARGUMENT_ERROR("A0109", "用户请求参数错误", 0L),

    REQ_ARGUMENTS_BE_NULL ("A0110", "请求必填参数为空", 0L),

    USER_REGISTER_NOT_EXIST_ERROR("A0111", "用户注册关系不存在", 30002L),

    USER_REGISTER_ALLOCATE_ERROR("A0112", "用户已分配", 30003L),

    USER_ID_NULL_ERROR("A0113", "用户id为空", 30004L),

    USER_WECHAT_NOT_EXIST_ERROR("A0114", "用户微信信息不存在", 0L),

    USER_PHONE_FORMAT_ERROR("A0115", "用户手机号格式错误", 0L),

    CAPTCHA_EXPIRE("A0116", "用户验证码过期", 0L),

    LOGIN_GET_LOCK_ERROR("A0117", "会员注册/登录获取分布式锁失败", 0L),

    GRAPH_CAPTCHA_ERROR("A0118", "图形验证失败", 0L),

    FAIL_SING_ERROR("A0119", "请求签名非法", 0L),

    FAIL_DECRYPT_ERROR("A0120","参数解密故障", 0L),

    USER_IDENTITY_EXIST("A0121", "身份证号已存在", 0L),

    PRODUCT_PRICE_NOT_EXIST("A0122", "产品定价不存在", 0L),

    PRODUCT_INFO_NOT_EXIST("A0123", "产品配置不存在", 0L),

    CREDIT_INFO_NOT_EXIST("A0124", "用户授信项不存在", 0L),

    OTHER_FUND_CODE_BANK_CARD("A0125", "用户在其他资方下已绑卡", 0L),

    BIND_CARD_INFO_NOT_EXIST("A0126", "用户银行卡不存在", 0L),

    BIND_CARD_INFO_EXIST("A0127", "用户已绑卡", 0L),

    BIND_CARD_RECORD_NOT_EXIST("A0128", "用户预绑卡记录不存在", 0L),

    BIND_CARD_COUNT_MAX("A0129", "用户当天绑卡次数已达上限", 0L),

    BIND_CARD_ACCOUNT_COUNT_MAX("A0130", "用户当前绑定银行卡当天绑卡次数已达上限", 0L),

    CREDIT_ACCOUNT_INFO_NOT_EXIST("A0131", "额度不存在", 0L),

    BANK_CARD_EXCEPTION("A0132", "银行卡异常", 0L),

    CREDIT_ACCOUNT_FREEZE("A0133", "用户额度已冻结", 0L),

    CREDIT_QUOTA_LACK("A0134", "用户额度不足", 0L),

    BIND_CARD_CODE_ERROR("A0135", "验证码错误或过期等,可以重发短信", 0L),

    BIND_CARD_NOT_SUPPORT_ERROR("A0136", "该银行卡不支持", 0L),

    AGE_LIMIT_ERROR("A0137", "用户年龄受限制", 0L),

    PHONE_BLACK_LIST_ERROR("A0138", "手机号黑名单", 0L),

    IDENTITY_NO_BLACK_LIST_ERROR("A0139", "身份证号黑名单", 0L),

    PHONE_IDENTITY_BLACK_LIST_ERROR("A0140", "手机号和身份证号与黑卡侧不一致", 0L),

    /**
     * 员工类
     */
    STAFF_ERROR("A0300", "员工类错误", 40000L),

    STAFF_NOT_EXIST_PHONE_ERROR("A0301", "手机号员工信息不存在", 40001L),

    STAFF_NOT_EXIST_ERROR("A0302", "员工信息不存在", 40001L),

    STAFF_EXIST_PHONE_ERROR("A0303", "手机号已存在对应员工", 40002L),

    STAFF_EXIST_IDENTITY_NO_ERROR("A0304", "身份证号已存在对应员工", 40002L),

    STAFF_APP_QR_CODE_ERROR("A0305", "二维码生成失败", 40003L),

    STAFF_PERMISSION_ERROR("A0306", "员工权限不足", 40004L),

    STAFF_NOT_EXIST_TEAM_ERROR("A0307", "团队无员工信息", 40005L),

    STAFF_POSITION_STATUS_ERROR("A0308", "员工状态异常（已离职）", 40006L),

    STAFF_OPERATION_ERROR("A0309", "操作异常,只能操作自己的记录", 40007L),

    /**
     * 交易类
     */
    TRADE_PRODUCT_ERROR("A0400", "交易类错误", 20000L),

    TRADE_PRODUCT_LIMIT("A0401", "产品限流", 20001L),

    TRADE_ORDER_STATUS_UPDATE_ERROR("A0402", "订单状态更新失败", 20002L),

    TRADE_ORDER_NOT_EXIST_ERROR("A0403", "订单记录不存在", 20003L),

    TRADE_PRODUCT_CHANNEL_ROUTE_ERROR("A0404", "产品数量申请已满(c)", 20004L),

    TRADE_PRODUCT_LINK_ROUTE_ERROR("A0405", "产品数量申请已满(l)", 20005L),

    TRADE_PAY_STATUS_NOT_UNPAID_ERROR("A0406", "订单支付状态不是待支付状态", 0L),

    TRADE_PAY_TIMEOUT_ERROR("A0407", "订单支付已超时", 0L),

    TRADE_PRODUCT_INVENTORY_ERROR("A0408", "产品库存已满", 0L),

    TRADE_PRODUCT_INVENTORY_LOCK_ERROR("A0409", "产品库存锁定失败", 0L),

    TRADE_COUPON_CODE_USED_ERROR("A0410", "券码已使用", 0L),

    TRADE_PRODUCT_ROUTE_ERROR("A0411", "产品路由异常", 0L),

    TRADE_PRODUCT_STATUS_ERROR("A0412", "产品已下架", 0L),

    TRADE_ORDER_REPEAT_SUBMIT_ERROR("A0413", "请勿重复提交", 0L),

    TRADE_EQUITY_ORDER_ERROR("A0414", "产品购买失败,参数异常", 0L),

    POINT_ACCOUNT_NOT_EXISTS("A0415", "积分账户不存在", 0L),

    CASH_ACCOUNT_NOT_EXISTS("A0416", "现金账户不存在", 0L),

    TRADE_ORDER_FINANCIAL_PRODUCT_AUDIT_ERROR("A0417", "您已经申请过该银行并核卡，建议您选择其他银行申请!", 0L),

    WITHDRAW_AMOUNT_ILLEGAL("A0418", "提现金额非法", 0L),

    ALREADY_EXIST_WITHDRAW_APPLY("A0419", "已经存在已申请、处理中的提现记录", 0L),

    NOT_EXIST_WITHDRAW_APPLY("A0420", "提现申请记录不存在", 0L),

    NOT_MATCH_CONDITION("A0421", "不满足活动条件", 0L),

    APP_VERSION_CONFIG_NOT_EXISTS("A0422", "APP版本配置不存在", 0L),

    USER_CANCEL("A0423", "此账号已注销，请联系客服", 0L),

    POINT_NOT_SUFFICIENT_FUNDS("A0424", "积分余额不足", 0L),

    TRADE_ORDER_DEBIT_PRODUCT_AUDIT_ERROR("A0425", "您已经申请过该银行的借记卡并核卡，建议您选择其他银行申请!", 0L),

    TRADE_ORDER_DEBIT_CARD_NOT_SUPPORTED("A0426", "您申请的借记卡暂不支持联名，请耐心等待我们的支持", 0L),

    ACTIVITIES_LOSE_EFFICACY("A0427", "活动已下架", 0L),

    ACTIVITIES_NOT_IN_TIME_RANGE("A0428", "不在活动时间范围内", 0L),

    ACTIVITIES_LOTTERY_COUNT_USE_UP("A0429", "活动抽奖机会已用完", 0L),

    TRADE_EQUITY_ORDER_EXIST("A0430", "该账号已购买会员", 0L),



    //分销系统使用错误码
    DISTRIBUTION_TRADE_ORDER_FINANCIAL_PRODUCT_AUDIT_ERROR("A0431", "您已经申请过该银行并核卡，建议您联系推荐人告知情况，选择其他银行申请!", 0L),
    DISTRIBUTION_TRADE_PRODUCT_STATUS_ERROR("A0432", "产品已下架", 0L),

    NOT_EXIST_MEMBER_RIGHTS_CONFIG("A0433", "会员权益产品未配置会员等级", 0L),

    TRADE_PRODUCT_COUPON_CODE_INVENTORY_LOCAL_ERROR("A0434", "本地卡券已售罄", 0L),
    /**
     * 页面配置类
     */
    PAGE_SOURCE_NOT_EXISTS("A0501", "请联系管理员配置渠道！", 0L),
    PAGE_SOURCE_CONFIG_NOT_EXISTS("A0502", "请联系管理员配置该渠道页面模型！", 0L),
    PAGE_SOURCE_CONFIG_MIDDLE_PAGE_OPEN("A0503","该产品存在已配置中间宣传页的配置页面，请勿删除中间宣传页图片或按钮图片",0L),

    /**
     * 渠道配置类
     */
    SOURCE_NOT_EXISTS("A0601", "渠道已被删除", 0L),

    /**
     * 银行卡对外对接相关错误码
     */
    PARTNER_REQUEST_PARAM_ERROR("A0700","请求参数异常", 0L),
    PARTNER_CHANNEL_NOT_EXISTS("A0701", "渠道不存在", 0L),
    PARTNER_SERIAL_NUMBER_REPEAT("A0703", "流水号重复", 0L),
    PARTNER_PRODUCT_NOT_EXISTS("A0711", "产品不存在", 0L),
    PARTNER_PRODUCT_NOT_ON_SALE("A0712", "产品已下架", 0L),
    PARTNER_ORDER_NOT_EXISTS("A0721", "订单不存在", 0L),

    /**
     * 系统内部异常
     */
    SERVER_ERROR("B0001", "系统异常", 500L),

    /**
     * 第三方异常
     */

    THIRD_PARTY_ERROR("C0001", "第三方异常", 0L),

    MIDDLEWARE_ERROR("C0100", "中间件服务异常", 0L),

    RPC_SERVER_ERROR("C0101", "rpc服务出错", 0L),

    CACHE_SERVER_ERROR("C0102", "缓存服务出错", 0L),

    DATABASE_SERVER_ERROR("C0103", "数据库服务出错", 0L),

    /**
     * 微信类
     */
    WECHAT_ERROR("C0200", "微信异常", 10000L),
    ACCOUNT_EMPTY_ERROR("C0201", "account参数不能为空", 10012L),
    BUSY_ERROR("C0202", "网络繁忙，请稍后重试", 10099L),

    WECHAT_UNIFIED_ORDER_ERROR("C0203", "微信支付统一下单失败", 0L),

    WECHAT_VERIFY_SIGNATURE_ERROR("C0204", "微信支付验证签名异常", 0L),

    WECHAT_VERIFY_SIGNATURE_FAIL("C0205", "微信支付验证签名不通过", 0L),

    WECHAT_PAY_QUERY_FAIL("C0206", "微信支付订单结果统一查询失败", 0L),

    /**
     * 支付宝类
     */
    ALIPAY_ERROR("C0300", "支付宝异常", 0L),

    ALIPAY_APP_SIGNATURE_ERROR("C0301", "支付宝APP支付请求签名异常", 0L),

    ALIPAY_APP_VERIFY_SIGNATURE_ERROR("C0302", "支付宝APP支付验证签名异常", 0L),

    ALIPAY_APP_VERIFY_SIGNATURE_FAIL("C0303", "支付宝APP支付验证签名不通过", 0L),

    ALIPAY_PAY_STATUS_QUERY_ERROR("C0304", "支付宝查询接口异常", 0L),

    APPLEPAY_IAP_CHECK_STATUS_ERROR("C0305", "苹果内购状态验证接口异常", 0L),

    /**
     * 权益供应商类
     */
    RIGHTS_SUPPLIER_ERROR("C0400", "权益供应商异常", 0L),

    RIGHTS_CHENGQUAN_COUPON_PAY_ERROR("C0401", "橙券卡券购买异常", 0L),

    RIGHTS_CHENGQUAN_QB_PAY_ERROR("C0402", "橙券直充购买异常", 0L),

    RIGHTS_CHENGQUAN_RECHARGE_PAY_ERROR("C0403", "橙券话费直充异常", 0L),

    RIGHTS_CHENGQUAN_VERIFY_SIGNATURE_ERROR("C0404", "橙券异步通知验签异常", 0L),

    RIGHTS_CHENGQUAN_VERIFY_SIGNATURE_FAIL("C0405", "橙券异步通知验签不通过", 0L),

    RIGHTS_CHENGQUAN_QB_QUERY_FAIL("C0406", "橙券卡券订单查询失败", 0L),

    RIGHTS_CHENGQUAN_RECHARGE_QUERY_FAIL("C0406", "橙券直充订单查询失败", 0L),


    RIGHTS_FULU_PLACE_ORDER_ERROR("C0450", "福禄权益下单异常", 0L),

    RIGHTS_FULU_COUPON_PAY_ERROR("C0451", "福禄卡券购买异常", 0L),

    RIGHTS_FULU_QB_PAY_ERROR("C0452", "福禄直充购买异常", 0L),

    RIGHTS_FULU_RECHARGE_PAY_ERROR("C0453", "福禄话费直充异常", 0L),

    RIGHTS_FULU_VERIFY_SIGNATURE_ERROR("C0454", "福禄异步通知验签异常", 0L),

    RIGHTS_FULU_VERIFY_SIGNATURE_FAIL("C0455", "福禄异步通知验签不通过", 0L),

    RIGHTS_FULU_ORDER_QUERY_FAIL("C0456", "福禄订单查询失败", 0L),

    ARTICLE_NOT_EXIST("C0500","文章不存在",10500L),
    ARTICLE_NOT_PUB("C0501","文章未发布",10501L),
    ARTICLE_PUB("C0507","文章已发布",10501L),
    ARTICLE_ID_BLANK("C0502","文章id不存在",10001L),
    ARTICLE_PRODUCT_CONFIG("C0503","文章配置已存在",10001L),
    ARTICLE_PRODUCT_CONFIG_NOT("C0504","文章产品配置不存在",10001L),
    ARTICLE_GROUP_NOT_EXIST("C0505","文章组不存在",10001L),
    ARTICLE_GROUP_ID_NOT_EXIST("C0509","文章组id不能为空",10001L),
    ARTICLE_OPERATE_EX("C0506","操作异常",10001L),
    ARTICLE_KEY_EX("C0508","关键字保存异常",10001L),

    /**
     * 第三方公共服务: 调用第三方个别接口，可以统一放这里，如聚合实名认证
     */
    THIRD_PARTY_COMMON_ERROR("C0900", "第三方公共服务", 0L),

    THIRD_JUHE_AUTH_ERROR("C0901", "聚合实名认证异常", 0L),

    THIRD_JUHE_AUTH_TRANSFORM_RESULT_ERROR("C0902", "聚合实名认证结果转换异常", 0L),

    THIRD_JUHE_AUTH_REQUEST_OFTEN_ERROR("C0903", "同一身份证请求过于频繁", 0L),

    THIRD_JUHE_AUTH_NOT_MATCH_ERROR("C0904", "实名认证姓名与身份证不匹配", 0L),

    THIRD_YONGYUAN_CHECK_BIND_ERROR("C0905", "永源检查兑换码是否已绑定接口转换异常", 0L),

    THIRD_TAOBAO_AUTH_ERROR("C0906", "淘宝授权异常", 0L),

    THIRD_TAOBAOKE_API_ERROR("C0907", "淘宝客API接口异常", 0L),

    THIRD_TAOBAOKE_TRANSFORM_RESULT_ERROR("C0908", "淘宝客查询订单结果转换异常", 0L),

    THIRD_ZHE_TAO_KE_URL_ERROR("C0909", "请求折淘客获取订单查询Url异常", 0L),

    THIRD_JI_XIN_AUTH_ERROR("C0910", "吉信实名认证失败", 0L),

    THIRD_CHANNEL_AUTH_ERROR("C0911", "认证渠道未配置", 0L),

    THIRD_DECODE_ERROR("C0912", "手机号解密失败", 0L),

    THIRD_SIGN_ERROR("C0912", "加签失败", 0L),

    DEVICE_NOT_DEFINED("C0914", "未知设备", 0L),

    ONE_LOGIN_ERROR_ALL("C0915", "亲~ 当前信号弱，请稍后重试！", 0L),

    THIRD_LAKALA_SERIAL_NUMBER_QUERY_FAIL("C0916", "请求获取拉卡拉流水号失败", 0L),

    THREE_SIX_ZERO_ZZL_NOT_ACCESS("C0917", "360周转灵不许准入", 0L),

    ;
    /**
     * 响应码
     */
    private final String code;

    /**
     * 响应消息
     */
    private final String message;

    /**
     * CRM数值异常码
     */
    private final Long thirdCode;

    /**
     *  根据code返回对应响应码枚举，未定义统一返回ERROR枚举
     * @param code code
     * @return BusinessErrorCode
     */
    public static BusinessErrorCode of(String code) {
        BusinessErrorCode[] var1 = values();

        for (BusinessErrorCode respCode : var1) {
            if (respCode.getCode().equals(code)) {
                return respCode;
            }
        }

        return ERROR;
    }
}
