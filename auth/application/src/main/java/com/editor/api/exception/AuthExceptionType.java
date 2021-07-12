package com.editor.api.exception;

import lombok.Getter;

@Getter
public enum AuthExceptionType {

    WRONG_INFO("AUTH-006", "가입하지 않은 아이디거나, 잘못된 비밀번호 입니다."),
    INVALID_REFRESH("AUTH-007", "Refresh Token이 유효하지 않습니다.");

    private final String code;
    private final String message;

    AuthExceptionType(final String code, final String message) {
        this.code = code;
        this.message = message;
    }

}
