package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseBody<T> {
    //
    private int code;
    private String message;
    private T data;

    public static <T> ResponseBody<T> ok(T data) {
        return new ResponseBody<>(
                200,
                "SUCCESS",
                data
        );
    }

    public static <T> ResponseBody<T> fail(int code, String message, @Nullable T data) {
        return new ResponseBody<>(
            code,
            message,
            data
        );
    }
}
