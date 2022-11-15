package com.asi.commons.code;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author lw
 * @date 2022-11-16 0:02
 */
@Data
public class Response<T> implements Serializable {

    /**
     * 状态码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 消息负载
     */
    private T payload;

    public Response() {
        this(BusinessErrorCode.SUCCESS.getCode(), BusinessErrorCode.SUCCESS.getMessage());
    }

    public Response(String code) {
        this(code, null);
    }

    public Response(T payload) {
        this(BusinessErrorCode.SUCCESS.getCode(), BusinessErrorCode.SUCCESS.getMessage(), payload);
    }

    public Response(String code, String message) {
        this(code, message, null);
    }

    public Response(String code, String message, T payload) {
        this.code = code;
        this.message = message;
        this.payload = payload;
    }

    public static <T> Response<T> succeed() {
        return new Response<>();
    }

    public static <T> Response<T> fail(String code, String message) {
        return new Response<>(code, message, null);
    }

    public static <T> Response<T> succeed(T payload) {
        return new Response<>(payload);
    }

    public static boolean isSuccess(Response<?> response) {
        return Objects.nonNull(response) && BusinessErrorCode.SUCCESS.getCode().equals(response.getCode());
    }

    public static boolean isFail(Response<?> response) {
        return Objects.isNull(response) || !BusinessErrorCode.SUCCESS.getCode().equals(response.getCode());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Response)) {
            return false;
        } else {
            Response<?> other = (Response)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label47;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label47;
                    }

                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                Object this$payload = this.getPayload();
                Object other$payload = other.getPayload();
                if (this$payload == null) {
                    if (other$payload != null) {
                        return false;
                    }
                } else if (!this$payload.equals(other$payload)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Response;
    }

    @Override
    public int hashCode() {

        int result = 1;
        Object code = this.getCode();
        result = result * 59 + (code == null ? 43 : code.hashCode());
        Object message = this.getMessage();
        result = result * 59 + (message == null ? 43 : message.hashCode());
        Object payload = this.getPayload();
        result = result * 59 + (payload == null ? 43 : payload.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Response(code=" + this.getCode() + ", message=" + this.getMessage() + ", payload=" + this.getPayload() + ")";
    }
}
