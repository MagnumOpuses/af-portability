package se.arbetsformedlingen.matchning.portability.repository;

public class HttpException extends RuntimeException {
    private int statusCode;
    private String url;

    public HttpException(int statusCode, String url) {
        this.statusCode = statusCode;
        this.url = url;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getURL() {
        return url;
    }
}
