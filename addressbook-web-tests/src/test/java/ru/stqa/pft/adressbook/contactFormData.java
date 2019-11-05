package ru.stqa.pft.adressbook;

public class contactFormData {
  private final String name;
  private final String lastname;
  private final String nick;
  private final String company;
  private final String adress;
  private final String mobile;
  private final String email;

  public contactFormData(String name, String lastname, String nick, String company, String adress, String mobile, String email) {
    this.name = name;
    this.lastname = lastname;
    this.nick = nick;
    this.company = company;
    this.adress = adress;
    this.mobile = mobile;
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNick() {
    return nick;
  }

  public String getCompany() {
    return company;
  }

  public String getAdress() {
    return adress;
  }

  public String getMobile() {
    return mobile;
  }

  public String getEmail() {
    return email;
  }
}
