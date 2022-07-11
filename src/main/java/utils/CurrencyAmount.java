package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CurrencyAmount {

  private final int pounds;
  private final int shillings;
  private final int pennies;
  private int resto;



  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(String.format("%sp %ss %sd", pounds, shillings, pennies));
    if (resto != 0) {
      stringBuilder.append(String.format(" - %sa", resto));
    }
    return stringBuilder.toString();
  }
}
