package study.datajpa.dto;

import lombok.Data;

@Data
public class MemberDto {
    private Long id;
    private String username;
    private String teamName;
    
    private MemberDto(final Long id, final String username, final String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
