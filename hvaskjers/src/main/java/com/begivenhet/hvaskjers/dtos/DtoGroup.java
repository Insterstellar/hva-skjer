package com.begivenhet.hvaskjers.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoGroup {
    private String groupName;
    private String groupPicture;
    private String userName;
    private String userPicture;
}
