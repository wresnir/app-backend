package wresni.project.app;

public record AbstractResponse<T>(
        boolean success,
        T data) {

    public static <R> AbstractResponse<R> of(R data) {
        return new AbstractResponse<>(true, data);
    }
}
