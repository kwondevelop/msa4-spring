package com.msa4spring.requests;

public record UsersPaginationRequest(
    String page,
    String limit
) {
    public UsersPaginationRequest(String page, String limit) {
        // 앞에서 int로 받으면 "" 필요 없음
        this.page = (page == null || page.isBlank()) ? "1" : page;
        this.limit = (limit == null || limit.isBlank()) ? "10" : limit;   
    }
}
