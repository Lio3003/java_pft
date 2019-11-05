package ru.stqa.pft.adressbook;

public class loginData {
  private final String username;
  private final String password;

  public loginData(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
