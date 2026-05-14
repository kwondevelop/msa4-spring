package com.msa4spring.requests;

public record PostsFilterRequest(
    String id,
    String categoryId
) {
    public PostsFilterRequest(String id, String categoryId) {
        this.id = id;
        this.categoryId = categoryId;
    }
}
