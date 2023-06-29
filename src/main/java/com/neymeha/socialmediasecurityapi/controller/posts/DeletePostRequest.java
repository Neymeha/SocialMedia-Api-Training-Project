package com.neymeha.socialmediasecurityapi.controller.posts;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeletePostRequest {
    private long postId;
}
