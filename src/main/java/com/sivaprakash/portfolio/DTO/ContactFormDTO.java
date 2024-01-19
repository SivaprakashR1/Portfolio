package com.sivaprakash.portfolio.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactFormDTO {
    private String name;
    private String email;
    private String message;
}
