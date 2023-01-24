package com.bhut.bhutapi.models;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@NoArgsConstructor
@Data
@Document
public class WebHook implements Serializable {

    @Id
    private String id;
    @Schema(example = "https://webhook.site/82d76200-d166-49a5-9e48-b0929377e9fd")
    @NotBlank
    private String url;

    public WebHook(String url) {
        this.url = url;
    }
}
