package ru.stqa.pft.adressbook;

public class loginDataContact {
  private final String username;
  private final String password;

  public loginDataContact(String username, String password) {
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
