package io.ansan.authentication.auth;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class AuthenticationResponse {
  private String token;
}
