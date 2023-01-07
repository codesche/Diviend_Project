package com.example.dividend.model;

import java.util.List;
import lombok.Data;

public class Auth {

    @Data
    public static class SignIn {
        private String username;
        private String password;
    }

    @Data
    public static class SignUp {
        private String username;
        private String password;
        private List<String> roles;


        // signup 클래스를 멤버엔티티로 만들 수 있도록
        public MemberEntity toEntity() {
            return MemberEntity.builder()
                .username(this.username)
                .password(this.password)
                .roles(this.roles)
                .build();
        }

    }

}
